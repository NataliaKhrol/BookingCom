package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SearchTest extends BaseTest{

    @Test
    public void searchForHotel(){
        searchPage.open();
        searchPage.searchForHotel("Dubai");
        assertEquals(searchPage.actualName(), "IntercityHotel Dubai Jaddaf Waterfront");


    }
}
