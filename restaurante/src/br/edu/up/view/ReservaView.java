package br.edu.up.view;

import br.edu.up.controller.ReservaController;
import br.edu.up.model.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservaView {
    private Scanner scanner = new Scanner(System.in);
    private ReservaController reservaController = new ReservaController();

    public void adicionarReserva() {
        System.out.println("Digite a data da reserva (dd/MM/yyyy):");
        String dataStr = scanner.nextLine();
        Date data;
        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido.");
            return;
        }

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Reserva reserva = new Reserva(data, nomeCliente, numeroPessoas);
        reservaController.adicionarReserva(reserva);
        System.out.println("Reserva adicionada com sucesso!");
    }

    // Implementa métodos adicionales según sea necesario
}

//commit fix