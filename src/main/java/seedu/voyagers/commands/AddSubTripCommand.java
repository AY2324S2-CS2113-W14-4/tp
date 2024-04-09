package seedu.voyagers.commands;

import seedu.voyagers.classes.TripList;
import seedu.voyagers.utils.Ui;
import seedu.voyagers.utils.TripStorage;
import seedu.voyagers.classes.Trip;

//TODO: check dates make sense with main trip
public class AddSubTripCommand extends Command{

    public AddSubTripCommand(String[] args){
        super(args);
    }

    public void execute(TripList trips, Ui ui, TripStorage tripStorage){
        Trip mainTrip = null;
        String[] newArgs = new String[args.length - 1];
        System.arraycopy(args, 1, newArgs, 0, args.length - 1);

        try{
            mainTrip = trips.getTrip(newArgs[0]);
        } catch (Exception e){
            ui.echo(e.getMessage());
            return;
        }

        try{
            Trip trip = new Trip(newArgs);
            trip.setTripType("sub");
            mainTrip.addSubTrip(trip);
            ui.echo("Got it. I've added this trip as a subtrip of :" + mainTrip.getName() + "\n" + trip
                    + "\nNow you have " + mainTrip.getSubTripsSize() +
                    " subtrips.");
            trips.add(trip);
        } catch (Exception e){
            ui.echo(e.getMessage());
        }

        String currentDir = System.getProperty("user.dir");
        final String TRIPS_FILE_NAME = "local-voyagers.txt";
        TripStorage.writeTripFile(trips.getTrips(), trips.size(),currentDir, TRIPS_FILE_NAME);
    }
}
