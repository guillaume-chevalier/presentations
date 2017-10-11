package ianlet.workshop.atddtdd.app;

import ianlet.workshop.atddtdd.app.InvoiceProducer;
import ianlet.workshop.atddtdd.app.ItemDto;
import ianlet.workshop.atddtdd.domain.InvoiceFactory;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;

public class InvoiceProducerTest
{

    @Mock
    private InvoiceFactory invoiceFactory;

    @Test
    public void itShouldProduceAnInvoiceWithTheItems() throws Exception
    {
        InvoiceProducer invoiceProducer = new InvoiceProducer(invoiceFactory);

        List<ItemDto> items = Arrays.asList(new ItemDto("Milk", 3.99d));
        invoiceProducer.produce(items);

        verify(invoiceFactory).create(items);
    }
}