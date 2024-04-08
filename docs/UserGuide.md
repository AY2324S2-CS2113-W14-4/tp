# Voyagers

Voyagers is a Java application designed to manage trips efficiently through a command-line interface.

## Introduction

Voyagers is a Java application designed to simplify trip management. It provides users with a command-line interface to manage their trips efficiently, including adding main trips, setting trip details, listing all trips, and more.

## Features

- **Add Main Trip**: Add a new main trip with specified details such as name, dates, location, and description.
- **Delete Main Trip**: Remove an existing main trip from the list.
- **Set Trip Details**: Modify trip details such as name, dates, location, and description for existing trips.
- **List All Trips**: View a comprehensive list of all trips along with their details.
- **Add Bill**: Add a bill to a certain trip, along with who paid, people who owe, and what percentage of the bill 
each person owes.
- **Pay Bill** Mark a bill as paid.
- **Add Review**: Review a trip by providing a score and reflection.
- **Read Review**: Read the review of a specific trip.
- **Update Status**: Update the status of a trip to 'Ongoing', 'Upcoming' or 'Completed'.
- **Cancel Trip**: Cancel a trip and remove it from the list.
- **Save Data**: Save the trip data to a file for future reference.
- **Exit Application**: Exit the application.

## Usage

The core of Voyagers is to allow users to manage their trips efficiently. Especially adding a new main trip by typing a
single line.

### Adding a Main Trip

To add a new main trip, use the `addmaintrip` command followed by the trip details.

```bash
addmaintrip /n <Name> /start <yyyy-MM-dd> /end <yyyy-MM-dd> /location <Location> /d <Description>
```

### Setting Trip Details

You can also modify the details of an existing trip using the following commands:

- `setname`: Set the name of a trip.
- `setdates`: Set the dates of a trip.
- `setlocation`: Set the location of a trip.
- `setdescription`: Set the description of a trip.

Example:

### Change the Name of a Trip
```bash
setname Europe Trip /n European Adventure
```

### Change the Date of a Trip

```bash
setdates Europe /start 2024-05-01 /end 2024-07-31
```

### Cancel a Trip

```bash
setstatus Europe /status cancel
```

### Uncancel a Trip

```bash
setstatus Europe /status uncancel
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

### Creating a Bill
To add a bill to a trip, use the `addBill` command followed by the following information
```bash
addBill /trip China /n dinner /payer Alice /others Bob Carol /amount 50 /percentages 33.3 33.3 33.3
```

### Paying a Bill
To mark a bill as paid, use the `payBill` command followed by the name of the bill.
```bash
payBill /n dinner
```

### Listing all Bills
To list all bills in Voyagers, use the `listBills` command.
```bash
listBills
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