# **Make Change Project - Skill Distillery Week 1 Homework**

### **Description**

This program is designed to take in two inputs from the user:

- *Item Price*

- *Money Tendered*

Once the price of item and amount tendered are entered, if statements are used to compare the item cost versus the amount tendered.

If the amount tendered covers no more and no less than the exact cost of the item, the user is notified and the program is transaction is complete.

If the amount tendered is less than the item cost, the user is notified via an error message that details how much money is still owed.

If the amount tendered exceeds the item cost, the user is told the total amount of money to be given back in change, and this change is then converted to exact number of dollars and cents.

### **Lessons Learned**

This being the largest, most sophisticated program that I have built up to this point, I quickly learned how important it is to think ahead and not only determine what variables will be needed in any given scope, but also mapping out, step-by-step, how to reach the end result.

I found that it is more beneficial to keep things as simple as possible. Early on I had far too many if/else statements. The complexity quickly exceeded my current debugging ability, so I made the decision to dial it back and tell myself that not every if statement required else if/else. Simplifying this aspect of the code greatly improved readability. Another aspect that added unnecessary headache were my stubborn attempts to implement while loops at every given opportunity.

Another lesson learned was simply how powerful the correct use of methods can be. I was genuinely surprised at how much of my code was ultimately refactored into a method. In the end this again made the readability skyrocket. Especially in the final String that incorporated nearly every method I had created thus far to output the total amount of dollars and cents to be returned to the customer based on total amount owed.

I also picked up a couple new skills:

1. How to replace certain characters in an index by extracting a substring and concatenating that into another String.

2. Practice using the *Math.round()* method and *DecimalFormat* to alleviate the issue with floating point number imprecision.

Overall I was surprised by the amount of time it took to build a program which on paper I thought should be very simple, but slowly revealed a few extra layers of complexity. I was also reassured by the fact that nearly all of the problems I encountered during the building process were addressed at some point in the material we learned this past week. I found myself referencing many of the exercises I had previously completed when I forgot certain syntax.

### **Technologies Used**

- ***Java***

- ***Eclipse***

- ***Git/GitHub***

- ***Atom***
