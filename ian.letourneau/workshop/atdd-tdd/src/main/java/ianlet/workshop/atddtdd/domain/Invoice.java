package ianlet.workshop.atddtdd.domain;

import java.util.List;

public class Invoice
{
    private List<InvoiceItem> items;

    public List<InvoiceItem> getItems()
    {
        return items;
    }
}
