/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_.batchourine;

/**
 *
 * @author sachabatchourine
 */
public class Convertisseur {

    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur sans paramètre qui initialise nbConversions à 0
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode pour convertir Celsius en Kelvin
    public double CelsiusVersKelvin(double tempCelsius) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return tempCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public double KelvinVersCelsius(double tempKelvin) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return tempKelvin - 273.15;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public double CelsiusVersFahrenheit(double tempCelsius) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return tempCelsius * 9 / 5 + 32;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public double FahrenheitVersCelsius(double tempFahrenheit) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return (tempFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public double KelvinVersFahrenheit(double tempKelvin) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return (tempKelvin - 273.15) * 9 / 5 + 32;
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public double FahrenheitVersKelvin(double tempFahrenheit) {
        nbConversions++;  // Incrémentation du compteur de conversions
        return (tempFahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Méthode toString qui retourne le nombre de conversions effectuées
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
}    
