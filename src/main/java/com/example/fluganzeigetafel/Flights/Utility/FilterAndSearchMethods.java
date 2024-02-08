package com.example.fluganzeigetafel.Flights.Utility;

import com.example.fluganzeigetafel.DataInterface;
import com.example.fluganzeigetafel.Flights.Data.Flight;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;


/**
 * This class provides a function for filtering the flights table.
 */

public class FilterAndSearchMethods {
    static int counter = 0;


    /**
     * This method filters the table after specific search key
     * @param filterTextField The filter to be applied
     */
    public static void filterFlights(TextField filterTextField) {
        filterTextField.textProperty().addListener((observable, oldValue, newValue) -> {


                String filter = newValue.trim().toUpperCase();

                // Make a copy of the original tree structure

                FilteredList<TreeItem<Flight>> filteredFlights = new FilteredList<>(DataInterface.getInstance().getItemsCopy());

                filteredFlights.setPredicate(pred ->
                        (pred.getValue().getFnr().toUpperCase().startsWith(filter) || pred.getValue().getKnr().toUpperCase().startsWith(filter)) &&
                                (!"Order".equals(pred.getValue().getKnr()) && !"Suborder".equals(pred.getValue().getKnr()))
                );

                // Clear existing items and add filtered ones
                DataInterface.flightsTable.getRoot().getChildren().setAll(filteredFlights);
                DataInterface.flightsTable.refresh();

                if (newValue.isBlank()) {
                    // If the filter is blank, reset the table to display all flights
                    DataInterface.getFlightsTable().populateTable(DataInterface.getInstance().getItemsCopy());
                    DataInterface.flightsTable.refresh();
                }





        });


    }}
