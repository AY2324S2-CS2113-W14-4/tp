# Voyagers

Voyagers is a Java application designed to manage trips efficiently through a command-line interface.

## Introduction

Voyagers is a Java application designed to simplify trip management. It provides users with a command-line interface to manage their trips efficiently, including adding main trips, setting trip details, listing all trips, and more.

## Features

- **Add Main Trip**: Add a new main trip with specified details such as name, dates, location, and description.
- **Delete Main Trip**: Remove an existing main trip from the list.
- **Set Trip Details**: Modify trip details such as name, dates, location, and description for existing trips.
- **List All Trips**: View a comprehensive list of all trips along with their details.
- **Add a subtrip**: Add a new subtrip to an existing main trip.
- **Add bills**: Add a new bill to an existing trip.
- **Review a trip**: Review a trip with a scale of 1-10 'score' and your open-ended 'reflection'.
- **Settle up bills**: Simplify the number of transactions for settling up bills.
## Usage

### Adding a Main Trip

To add a new main trip, use the `addmaintrip` command followed by the trip details.

```bash
addmaintrip /n <Name> /start <Start Date> /end <End Date> /location <Location> /d <Description>
```

### Setting Trip Details

You can modify the details of an existing trip using the following commands:

- `setname`: Set the name of a trip.
- `setdates`: Set the dates of a trip.
- `setlocation`: Set the location of a trip.
- `setdescription`: Set the description of a trip.

Example:

```bash
setname /old Europe Trip /new European Adventure
```

```bash
setdates /n Europe Trip /start 2024/05/01 /end 2024/07/31
```

### Deleting a Main Trip
To delete an existing main trip, use the `deletemaintrip` command followed by the trip name.

```bash
deletemaintrip /n Europe Trip
```
### Listing All Trips
To view a list of all trips along with their details, use the listall command.

```bash 
listall
```

### Reviewing Trips

To review a trip with a scale of 1-10 'score' and your open-ended 'reflection', use the review command.

```bash
review Trip1 /s 10 /r Trip1 was fantastic, I made 3 new friends.
```

### Reading Trip Reviews

To read previously reviewed trip, use the readreview command with the name of the trip.

```bash
readreview Trip1
```

### Enter "exit" to exit the application.

```bash 
exit
```

### Settling up bills

TO be implemented