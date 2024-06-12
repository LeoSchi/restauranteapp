package br.edu.up.controller;

import br.edu.up.dao.ReservaDAO;
import br.edu.up.model.Reserva;

public class ReservaController {
    private ReservaDAO reservaDAO = new ReservaDAO();

    public void adicionarReserva(Reserva reserva) {
        reservaDAO.adicionar(reserva);
    }

    // Implementa los métodos restantes según sea necesario
}