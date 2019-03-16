#
<!-- HTML CODE-->

<div>
	<h1>Healty Snack Machine</h1>
	<h2>Requirements</h2>
	<p>TenThousandsSteps.org have recently embarked on releasing a new range of healthy low fat/salt and sugar snack machines in universities across London. You have recently started an apprenticeship with them to develop the software for this new range snack machines. The company pays £0.45 for each snack. This software will provide both the user interface for the user and business logic for dispensing a snack to the user.The current snacks and prices on offer are:</p><ul>
				<li>Crisps - £0.75</li>
				<li>Mars Bar - £0.70</li>
				<li>Coca Cola - £1.0</li>
				<li>Eugenia - £0.50</li>
				<li>Water - £0.85</li>
			</ul>
	<h3>User interface</h3>
	<p>The user interface will be menu driven prompting the user to select a choice, quantity and subsequently to pay by inserting the money. The menu could look something like:</p>

<h3>********** Healty Snack Machine **********</h3>
<h4>SNACK-------------PRICE-------------QTY</h4>
<ul>
	<li>Crisps------------------------£0.75-----------------------10</li>
	<li>Mars Bar--------------------£0.70-----------------------10</li>
	<li>Coca Cola------------------£1.00-----------------------10</li>
	<li>Eugenia---------------------£0.50-----------------------10</li>
	<li>Water-------------------------£0.85-----------------------10</li>
</ul>
	<p>Depending on the option selected from the main menu, sub menus should branch out offering the user different options e.g. if option 1 from the main menu is selected, a sub menu should appear offering the user the choice select a quantity.</p>

<h3>Data capture</h3>
	<p>The snack option selected i.e. from the menu option 1,2,3,4,5 or 6 and then a separate submenu asking for quantity.</p>
	<p>The machine should accept the following coin denominations : </p>
	<ul>
		<li>£0.05</li>
		<li>£0.10</li>
		<li>£0.20</li>
		<li>£0.50</li>
		<li>£1.00</li>
	</ul>
		
<h3>What the system should be able to do:</h3>
	<ul>
				<li>Decline a transaction if the money for the snack is not paid.</li>
				<li>Decline the transaction if the snack is out of stock.</li>
				<li>Reject a denomination not listed above.</li>
				<li>Dispense a snack if it is in stock and the price has been paid.</li>
				<li>DisplCoins should be inserted one at a time for example if the price is £2.75, coins in the stated denominations above should be entered one at a time until either the price is met or exceeded.£0.05</li>
				<li>Dispense the change if the user has entered more money than the price of the snack.</li>
				<li>Display an ***out of stock*** message if a snack is unavailable.</li>
				<li>Change should be dispensed using the current stock of change available in the machine.</li>
				<li>The machine should start with a change pool of:
					<ul>
						<li>10 * £1.00</li>
						<li>20 * £0.50</li>
						<li>20 * £0.20</li>
						<li>20 * £0.10</li>
						<li>20 * £0.05</li>
					</ul>
				</li>
				<li>Additionally, recently inserted money may also be used to top up the change pool but change should not be made out of thin air but should come from the change pool available.
					<ul>
						<li>A power user feature which can be entered when the power user enters from the main menu the option 10976 and then prompting for a password taking him/her to a submenu where they can view the total amount of money in the machine and the total profit or losses.</li>
					</ul>
				</li>
			</ul>
			</div>



			
