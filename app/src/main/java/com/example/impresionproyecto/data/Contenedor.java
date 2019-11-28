package com.example.impresionproyecto.data;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    private Factura invoice;
    private List<CommandDetail> commandDetailList;
    private List<Contenedor> containerList;

    public Contenedor() {
        containerList = new ArrayList<>();
    }

    public Contenedor(Factura invoice, List<CommandDetail> commandDetailList) {
        this.invoice = invoice;
        this.commandDetailList = commandDetailList;
    }

    public Factura getInvoice() {
        return invoice;
    }

    public Contenedor setInvoice(Factura invoice) {
        this.invoice = invoice;
        return this;
    }

    public List<CommandDetail> getCommandDetail() {
        return commandDetailList;
    }

    public Contenedor setCommandDetail(List<CommandDetail> commandDetailList) {
        this.commandDetailList = commandDetailList;
        return this;
    }

    public List<Contenedor> getContainerList() {
        return containerList;
    }

    public Contenedor setContainerList(List<Contenedor> containerList) {
        this.containerList = containerList;
        return this;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "invoice=" + invoice +
                ", commandDetail=" + commandDetailList +
                ", containerList=" + containerList +
                '}';
    }

    public static class CommandDetail {
        private Comanda command;
        private Producto product;

        public CommandDetail() {

        }

        public CommandDetail(Comanda command, Producto product) {
            this.command = command;
            this.product = product;
        }

        public Comanda getCommand() {
            return command;
        }

        public CommandDetail setCommand(Comanda command) {
            this.command = command;
            return this;
        }

        public Producto getProductList() {
            return product;
        }

        public CommandDetail setProductList(Producto product) {
            this.product = product;
            return this;
        }

        @Override
        public String toString() {
            return "CommandDetail{" +
                    "command=" + command.toString() +
                    ", productList=" + product.toString() +
                    '}';
        }
    }
}
