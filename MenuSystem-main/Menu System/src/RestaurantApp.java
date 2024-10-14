public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening Dishes");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Sweet dishes");

        MenuComponent specialMenu = new Menu("Special Menu", "Chef's specials");

        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with veggies", 30));
        dinnerMenu.add(new MenuItem("Salmon", "Pan-seared salmon with lemon butter", 10));

        specialMenu.add(new MenuItem("Lobster", "Fresh lobster with garlic butter", 40));
        specialMenu.add(new MenuItem("Truffle Pasta", "Pasta with black truffles", 1000));

        dinnerMenu.add(specialMenu);

        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York-style cheesecake", 653));
        dessertMenu.add(new MenuItem("Tiramisu", "Italian coffee-flavored dessert", 3512));

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(dinnerMenu);
        allMenus.add(dessertMenu);

        allMenus.print();
    }
}
