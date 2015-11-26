package de.braintags.testpackage.json;

import java.util.ArrayList;
import java.util.List;

public class Settings {
  private String name;
  private List<SubSettings> subSettingsLlist = new ArrayList<>();
  private SubSettings[] ssArray = new SubSettings[2];
  private SubSettings sset;

  public Settings() {
  }

  public Settings(String name) {
    this.name = name;
    subSettingsLlist.add(new SubSettings(name + "1 List", String.class));
    subSettingsLlist.add(new SubSettings(name + "2 List", String.class));

    ssArray[0] = new SubSettings(name + "1 Array", List.class);
    ssArray[1] = new SubSettings(name + "2 Array", ArrayList.class);

    sset = new SubSettings(name + " 1", IllegalAccessError.class);
  }

  /**
   * @return the name
   */
  public final String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public final void setName(String name) {
    this.name = name;
  }

  /**
   * @return the subSettingsLlist
   */
  public final List<SubSettings> getSubSettingsLlist() {
    return subSettingsLlist;
  }

  /**
   * @param subSettingsLlist
   *          the subSettingsLlist to set
   */
  public final void setSubSettingsLlist(List<SubSettings> subSettingsLlist) {
    this.subSettingsLlist = subSettingsLlist;
  }

  /**
   * @return the ssArray
   */
  public final SubSettings[] getSsArray() {
    return ssArray;
  }

  /**
   * @param ssArray
   *          the ssArray to set
   */
  public final void setSsArray(SubSettings[] ssArray) {
    this.ssArray = ssArray;
  }

  /**
   * @return the sset
   */
  public final SubSettings getSset() {
    return sset;
  }

  /**
   * @param sset
   *          the sset to set
   */
  public final void setSset(SubSettings sset) {
    this.sset = sset;
  }

}
