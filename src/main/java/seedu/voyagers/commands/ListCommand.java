package seedu.voyagers.commands;

import seedu.voyagers.Storage;
import seedu.voyagers.TripList;
import seedu.voyagers.Ui;


public class ListCommand extends Command{


    public void execute(TripList trips, Ui ui, Storage storage){

        if (trips.size() == 0){
            ui.echo("You have no trips in your list.");
            return;
        }

        ui.echo("Here are the trips in your list:");
        for (int i = 0; i < trips.size(); i++){
            ui.echo((i + 1) + ". " + trips.get(i));
        }
    }
}