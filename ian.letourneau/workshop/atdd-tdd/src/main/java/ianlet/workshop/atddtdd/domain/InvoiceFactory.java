package ianlet.workshop.atddtdd.domain;

import ianlet.workshop.atddtdd.app.ItemDto;

import java.util.List;

public class InvoiceFactory
{

    public Invoice create(List<ItemDto> items)
    {
        return new Invoice();
    }
}
