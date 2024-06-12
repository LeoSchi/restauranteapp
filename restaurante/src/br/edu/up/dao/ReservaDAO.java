package br.edu.up.dao;

import br.edu.up.model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO implements DAO<Reserva> {
    private List<Reserva> reservas = new ArrayList<>();

    @Override
    public void adicionar(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public Reserva buscar(String nomeCliente) {
        for (Reserva r : reservas) {
            if (r.getNomeCliente().equals(nomeCliente)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public List<Reserva> listar() {
        return new ArrayList<>(reservas);
    }

    @Override
    public void atualizar(Reserva reserva) {
        Reserva existente = buscar(reserva.getNomeCliente());
        if (existente != null) {
            existente.setData(reserva.getData());
            existente.setNomeCliente(reserva.getNomeCliente());
            existente.setNumeroPessoas(reserva.getNumeroPessoas());
        }
    }

    @Override
    public void remover(String nomeCliente) {
        Reserva reserva = buscar(nomeCliente);
        if (reserva != null) {
            reservas.remove(reserva);
        }
    }
}