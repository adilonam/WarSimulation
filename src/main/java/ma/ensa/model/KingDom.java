package ma.ensa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class KingDom {
    private String king;
    private List<String> countries = new ArrayList<>();
    private int power;
    private int soldiersOnEdges;

    public void setKing(String king) {
        this.king = king;
    }

    public void addCountry(String name, String... details) {
        // logic to add country
        countries.add(name + ":" + String.join("-", details));
        for (String detail : details) {
            power += Integer.parseInt(detail);
        }
    }

    public void addSoldiersOnEdges(String soldiers) {
        this.soldiersOnEdges = Integer.parseInt(soldiers);
        power += this.soldiersOnEdges;
    }

 
    
    public String report() {
        Map<String, String> countryCodes = new HashMap<>();
        countryCodes.put("France", "F");
        countryCodes.put("Spain", "S");
        // Add other countries and their codes as needed
        
        StringBuilder report = new StringBuilder(king + ":|");
        
        for (String country : countries) {
            String[] parts = country.split(":");
            String countryName = parts[0];
            String[] cityDetails = parts[1].split("-");
    
            report.append(countryCodes.get(countryName)).append(":<");
    
            for (int i = 0; i < cityDetails.length; i += 2) {
                report.append(countryName.charAt(0)).append("c").append(i/2 + 1)
                      .append(":").append(cityDetails[i]).append("-").append(cityDetails[i + 1]).append(",");
            }
    
            // Remove the trailing comma and close the angle bracket
            report.setLength(report.length() - 1);
            report.append(">, ");
        }
        
        // Remove the trailing comma and space, then add the closing characters
        report.setLength(report.length() - 2);
        report.append("|");
        
        return report.toString();
    }
    
    

    public int currentPower() {
        return power;
    }
}
