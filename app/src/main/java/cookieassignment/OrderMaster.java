package cookieassignment;

import java.util.ArrayList;
import java.util.List;

public class OrderMaster {
    List<Order> cookies = new ArrayList<>();
    int quantity = 0;
    public void addOrder(Order cookiesToPurchase) {
        cookies.add(cookiesToPurchase);
    }
    public void removeVariety(String varietyToRemove) {
        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getVariety().equals(varietyToRemove)) {
                cookies.remove(i);
                break;
            }
        }
    }
    public int getTotalBoxes() {
        int count = 0;
        for (Order orderTotal : cookies) {
            count += orderTotal.getQuantity();
        }
        return count;
    }
    public void showAllCookies() {
        for (Order cookie : cookies) {
            String outputStr = "";
            outputStr = "Variety: " + cookie.getVariety();
            outputStr += " Quantity: " + cookie.getQuantity();

            System.out.println(outputStr);
        }
    }
}