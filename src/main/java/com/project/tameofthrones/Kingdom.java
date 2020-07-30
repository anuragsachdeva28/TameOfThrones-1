package com.project.tameofthrones;

import java.util.HashMap;
import java.util.Map;

public class Kingdom {

  private Map<String, String> rulerWithAnimal = new HashMap<>();

  private void getInfoOfAllRulers() {
    rulerWithAnimal.put("SPACE", "GORILLA");
    rulerWithAnimal.put("LAND","PANDA");
    rulerWithAnimal.put("WATER","OCTOPUS");
    rulerWithAnimal.put("ICE","MAMMOTH");
    rulerWithAnimal.put("AIR","OWL");
    rulerWithAnimal.put("FIRE","DRAGON");
  }

  public Map<String, Ruler> generateAllRulers() {
    getInfoOfAllRulers();
    Map<String, Ruler> rulers = new HashMap<>();
    for (String emblem : rulerWithAnimal.keySet()) {
      Ruler ruler = new Ruler(emblem, rulerWithAnimal.get(emblem));
      ruler.makeCipher();
      rulers.put(emblem, ruler);
    }
    return rulers;
  }

}
