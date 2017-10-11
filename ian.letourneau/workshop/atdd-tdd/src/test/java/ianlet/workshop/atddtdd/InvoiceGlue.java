package ianlet.workshop.atddtdd;

import ianlet.workshop.atddtdd.app.InvoiceProducer;
import ianlet.workshop.atddtdd.app.ItemDto;
import cucumber.api.DataTable;
import cucumber.api.java8.En;
import ianlet.workshop.atddtdd.domain.Invoice;
import ianlet.workshop.atddtdd.domain.InvoiceFactory;
import ianlet.workshop.atddtdd.domain.InvoiceItem;

import java.util.List;

public class InvoiceGlue implements En
{

    InvoiceFactory factory;
    private final InvoiceProducer invoiceProducer = new InvoiceProducer(factory);
    private Invoice producedInvoice;

    public InvoiceGlue()
    {
        When("^the invoice is produced with these items:$", (DataTable itemsTable) ->
        {
            List<ItemDto> items = itemsTable.asList(ItemDto.class);

            producedInvoice = invoiceProducer.produce(items);
        });
        When("^the invoice contains those items:$", (DataTable itemsTable) ->
        {
            List<InvoiceItem> items = producedInvoice.getItems();
        });
        And("^the invoice subtotal is 9.24\\$$", () ->
        {

        });
        And("^a total is present on the invoice$", () ->
        {

        });
    }
}
