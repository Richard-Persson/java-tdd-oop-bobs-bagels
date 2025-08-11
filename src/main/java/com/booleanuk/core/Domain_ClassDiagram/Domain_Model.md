

| Classes   | Methods                                 | Scenario                | Outputs       |
| --------- | --------------------------------------- | ----------------------- | ------------- |
|           |                                         |                         |               |
| Person    | boolean addToBasket(String ID)          | id exists               | true          |
|           |                                         | id dosen't exist        | false         |
|           |                                         | id is null              | false         |
| Person    | boolean removeFromBasket(String ID)     | id exists               | true          |
|           |                                         | id dosen't exist        | false         |
|           |                                         | id is null              | false         |
| Person    | boolean isBasketFull()                  | basket is full          | true          |
|           |                                         | basket is not full      | false         |
| Customer  | double getTotalCost()                   | items in basket         | total cost    |
|           |                                         | no items in basket      | 0             |
| Customer  | double getCostOfBagel(String ID)        | ID exists               | cost of bagel |
|           |                                         | ID dosen't exist        | 0             |
|           |                                         | ID is null              | 0             |
| Customer  | boolean chooseFilling(String ID)        | ID exists               | true          |
|           |                                         | ID dosen't exist        | false         |
|           |                                         | ID is null              | null          |
| Manager   | boolean ChangeCapacity(int newCapacity) | newCapacity is positive | true          |
|           |                                         | newCapacity is negative | false         |
| Manager   | boolean addItemToStore(Item i)          | item is valid type      | true          |
|           |                                         | item is null            | false         |
| Basket    | double getCostOfBagel(String ID)        | ID is valid             | cost of bagel |
|           |                                         | ID dosen't exist        | 0             |
| Basket    | double sum()                            | basket has items        | total cost    |
|           |                                         | basket is empty         | 0             |
| Inventory | Item getSpecificItem(String ID)         | ID is valid             | Item          |
|           |                                         | ID dosen't exist        | null          |
|           |                                         | ID is null              | null          |
|           |                                         |                         |               |
|           |                                         |                         |               |

