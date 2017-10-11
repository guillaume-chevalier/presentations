package ianlet.workshop.atddtdd.app;

import ianlet.workshop.atddtdd.domain.Invoice;
import ianlet.workshop.atddtdd.domain.InvoiceFactory;

import java.util.List;

public class InvoiceProducer
{

    private InvoiceFactory factory;

    public InvoiceProducer(InvoiceFactory invoiceFactory)
    {
        factory = invoiceFactory;
    }

    public Invoice produce(List<ItemDto> items)
    {
        return factory.create(items);
    }
}
