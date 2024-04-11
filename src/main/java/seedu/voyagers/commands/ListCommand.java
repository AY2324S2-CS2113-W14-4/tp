package seedu.voyagers.commands;

import seedu.voyagers.classes.TripList;
import seedu.voyagers.utils.Status;
import seedu.voyagers.utils.Ui;
import seedu.voyagers.utils.TripStorage;

public class ListCommand extends Command {

    public ListCommand() {
        String[] defaultListArgs = new String[]{"list", "blank"};
        this.args = defaultListArgs;
    }

    public ListCommand(String[] args) {
        super(args);
    }

    public void execute(TripList trips, Ui ui, TripStorage tripStorage) {
        if(args.length == 1) {
            args = padArgs(args);
        }
        switch (args[1]) {
        case "ongoing":
            printOngoing(trips, ui);
            break;
        case "completed":
            printCompleted(trips, ui);
            break;
        case "upcoming":
            printUpcoming(trips, ui);
            break;
        case "blank":
            printAll(trips, ui);
            break;
        default:
            ui.echo("Invalid list type");
        }
    }

    private void printOngoing(TripList trips, Ui ui) {
        int numberTrips = 0;
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.ONGOING) {
                numberTrips += 1;
            }
        }
        ui.echo("You have " + numberTrips + " ongoing trips.");
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.ONGOING) {
                ui.echo((i + 1) + ". " + trips.get(i));
            }
        }
    }

    private void printCompleted(TripList trips, Ui ui) {
        int numberTrips = 0;
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.COMPLETED) {
                numberTrips += 1;
            }
        }
        ui.echo("You have " + numberTrips + " completed trips.");
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.COMPLETED) {
                ui.echo((i + 1) + ". " + trips.get(i));
            }
        }
    }

    private void printUpcoming(TripList trips, Ui ui) {
        int numberTrips = 0;
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.UPCOMING) {
                numberTrips += 1;
            }
        }
        ui.echo("You have " + numberTrips + " upcoming trips.");
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.UPCOMING) {
                ui.echo((i + 1) + ". " + trips.get(i));
            }
        }
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getStatus() == Status.UPCOMING) {
                ui.echo((i + 1) + ". " + trips.get(i));
            }
        }
    }

    private void printAll(TripList trips, Ui ui) {
        for (int i = 0; i < trips.size(); i++) {
            ui.echo((i + 1) + ". " + trips.get(i));
        }
    }

    private String[] padArgs(String[] args){
        String[] blank= new String[1];
        blank[0] = "blank";
        String[] newArgs = new String[args.length + 1];
        System.arraycopy(args, 0, newArgs, 0, args.length);
        System.arraycopy(blank, 0, newArgs, 1, args.length);
        return newArgs;
    }
}
