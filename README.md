# Healthy Snack Machine

<h1>Requirements</h1>

TenThousandsSteps.org have recently embarked on releasing a new range of healthy low fat/salt and sugar snack machines in universities across London. You have recently started an apprenticeship with them to develop the software for this new range snack machines. The company pays £0.45 for each snack. This software will provide both the user interface for the user and business logic for dispensing a snack to the user. The current snacks and prices on offer are:
    • Crisps - £0.75
    • Mars Bar -  £0.70
    • Coca Cola – £1
    • Eugenia - £0.50
    • Water - £0.85

The machine is capable of holding 10 of each snack.

The user interface will be menu driven prompting the user to select a choice, quantity and subsequently to pay by inserting the money. The menu could look something like:


Depending on the option selected from the main menu, sub menus should branch out offering the user different options e.g. if option 1 from the main menu is selected, a sub menu should appear offering the user the choice select a quantity.




The machine should accept the following coin denominations :  
    • £0.05
    • £0.10
    • £0.20
    • £0.50
    • £1.00

Data capture
The snack option selected i.e. from the menu option 1,2,3,4,5 or 6 and then a separate submenu asking for quantity.
The machine should accept the following coin denominations:  
    • £0.05
    • £0.10
    • £0.20
    • £0.50
    • £1.00
What the system should be able to do:
    • Decline a transaction if the money for the snack is not paid.
    • Decline the transaction if the snack is out of stock.
    • Reject a denomination not listed above.
    • Dispense a snack if it is in stock and the price has been paid.
    • Display the new quantity of the snacks after each purchase.
    • Coins should be inserted one at a time for example if the price is £2.75, coins in the stated denominations above should be entered one at a time until either the price is met or exceeded.
    • Dispense the change if the user has entered more money than the price of the snack.
    • Display an ***out of stock*** message if a snack is unavailable.
    • Change should be dispensed using the current stock of change available in the machine. 
        ◦ The machine should start with a change pool of:
        ◦ 10 * £1
        ◦ 20 * £0.50
        ◦ 20 * £0.20
        ◦ 20 *£0.10
        ◦ 20 * £0.05
Additionally, recently inserted money may also be used to top up the change pool but change should not be made out of thin air but should come from the change pool available.
    • A power user feature which can be entered when the power user enters from the main menu the option 10976 and then prompting for a password taking him/her to a submenu where they can view the total amount of money in the machine and the total profit or losses.
