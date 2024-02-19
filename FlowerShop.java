
/**
 * Program description:Implement the FlowerShop Class
 *
 * Programmer:Nur Athirah
 * Date:19 February 2024
 */
import javax.swing.JOptionPane;

public class FlowerShop {
    public static void main(String[] args) {
        Flower[] inventory = new Flower[10];

        // Prompt the user to enter data for each flower and store the objects in the array
        for (int i = 0; i < inventory.length; i++) {
            String name = JOptionPane.showInputDialog(null, "Enter name for flower " + (i + 1) + ":");
            String color = JOptionPane.showInputDialog(null, "Enter color for flower " + (i + 1) + ":");
            double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price for flower " + (i + 1) + ":"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity for flower " + (i + 1) + ":"));
            inventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        StringBuilder inventoryDetails = new StringBuilder("Flower Inventory:\n");
        for (Flower flower : inventory) {
            inventoryDetails.append(flower).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventoryDetails.toString());

        // Calculate and display the total values of the flower inventory
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        JOptionPane.showMessageDialog(null, "Total value of the flower inventory: " + totalValue);

        // Allow the user to search for a flower by name and display its details
        String searchName = JOptionPane.showInputDialog(null, "Enter the name of the flower to search:");
        boolean found = false;
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Flower found:\n" + flower);
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Flower not found.");
        }

        // Implement a method to restock a specific flower in the inventory
        String restockName = JOptionPane.showInputDialog(null, "Enter the name of the flower to restock:");
        int restockQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity to restock:"));
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                flower.setQuantity(flower.getQuantity() + restockQuantity);
                JOptionPane.showMessageDialog(null, "Restock successful.\nUpdated details:\n" + flower);
                break;
            }
        }
    }
}