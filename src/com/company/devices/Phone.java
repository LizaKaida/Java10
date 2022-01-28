package com.company.devices;

import com.company.Applications;
import com.company.creatures.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Phone  extends Device implements Saleable {

    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "appstore.wsb.com";
    public final static String DEFAULT_SERVER_ADDRESS = "192.168.1.10";
    public final static String DEFAULT_PROTOCOL = "https";
    Integer ramSize;
    String ramText;
    Integer totalStorage;
    public List<Applications> appsList;


    public Phone(String producer, String model, Integer yearOfProduction, String colour, Integer ramSize, Integer totalStorage) {
        super(producer, model, yearOfProduction, colour);
        this.ramSize = ramSize;
        this.totalStorage = totalStorage;
        this.ramText = ramSize + "GB";
        this.appsList = new ArrayList<>();


    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model=' " + model + '\'' +
                ", yearOfProduction=' " + yearOfProduction + '\'' +
                ", ramText=' " + ramText + '\'' +
                ", totalStorage=' " + totalStorage +
                '}';
    }

    public void turnOn() {
        System.out.println("wciskam guzik");
        System.out.println("czekam");
        System.out.println("o jest");

    }

    public boolean isTurnedOn() {
        return true;
    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("nie masz $");
        } else if (seller.mobile != this) {
            System.out.println("nie masz telefonu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("udalo sie sprzedac telefon za" + price + "pln");
        }
    }


    public void installAnApp(String appName) {
        System.out.println("instalowanie aplikacji wg nazwy" + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);

    }

    public void installAnApp(String appName, String version) {
        System.out.println("instalowanie aplikacji wg nazwy:" + appName + "i wersji" + version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);

    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("instalowanie aplikacji wg nazwy" + appName + "wersji");
        try {
            URL url = new URL("https", server, 443, appName + " - " + version);
        } catch (MalformedURLException e) {
            System.out.println("nie udalo sie zainstalowac" + appName);
        }

    }

    public void installAnApp(List<String> appNames) {
        System.out.println("instalowanie aplikacji z listy");
        for (String appName : appNames) {
            this.installAnApp(appName);
        }

    }

    public void installAnApp(URL url) {
        System.out.println("sprawdzanie adresu docelowego");
        System.out.println("sprawdzaie miejsca na telefonie");
        System.out.println("obsluga platnosci");
        System.out.println("instalacja");

    }

    public void installAnApp(Human human, Applications appName) {
        if (human.cash > appName.price) {
            if (appsList.contains(appName)) {
                System.out.println("Ta aplikacja byla wczesniej zainstalowana" + appName.name);
            } else {
                appsList.add(appName);
                human.cash -= appName.price;
                System.out.println("Instalacja apki");
                appName.appIsInstalled = true;
            }


        }
    }



    public boolean appIsInstalled(Applications appName) {
        return appName.appIsInstalled;
    }

    public boolean appIsInstalled(String appName) {
        for (Applications app : appsList) {
            if (Objects.equals(app.name, appName) && app.appIsInstalled) {
                return true;
            }
        }
        return false;
    }

    public void allFreeApps() {
        System.out.println("wypisanie wszystkich bezpłatnych aplikacji");
        int counter = 0;
        for (Applications app : appsList) {
            if (app.price == 0.0) {
                System.out.println("Appka za free" + app);
                counter += 1;
            }
        }
        if (counter == 0) {
            System.out.println("Nie mamy appek za free");
        }


    }

    public Double valueInstalledApps() {
        double value = 0.0;
        for (Applications app : appsList) {
            if (app.appIsInstalled) {
                value += app.price;
            }
        }
        return value;

    }

    public void allInstalledAppNames() {
        System.out.println("Kolejnosc alfabetyczna: ");
        String[] tempNames = new String[appsList.size()];
        int counter = 0;
        for (Applications app : appsList) {
            if (app.appIsInstalled) {
                tempNames[counter] = app.name;
                counter += 1;
            }
        }
        Arrays.sort(tempNames);
        for (int i = 0; i < tempNames.length; i++) {
            System.out.println(i + 1 + ") " + tempNames[i]);
        }
    }

    public void allInstalledAppCheapest() {
        Double[] tempPrices = new Double[appsList.size()];
        System.out.println("Od najtanszej ");
        int counter = 0;
        for (Applications app : appsList) {
            if (app.appIsInstalled) {
                tempPrices[counter] = app.price;
                counter += 1;
            }
        }
        Arrays.sort(tempPrices);
        for (int i = 0; i < tempPrices.length; i++) {
            System.out.println(i + 1 + ") " + tempPrices[i]);
        }


    }
}


