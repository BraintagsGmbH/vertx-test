package de.braintags.testpackage.json;

public class SubSettings {
  private String subSettingsName;
  private Class anyClass;

  public SubSettings() {
  }

  public SubSettings(String subSettingsName, Class anyClass) {
    this.anyClass = anyClass;
    this.subSettingsName = subSettingsName;
  }

  /**
   * @return the subSettingsName
   */
  public final String getSubSettingsName() {
    return subSettingsName;
  }

  /**
   * @param subSettingsName
   *          the subSettingsName to set
   */
  public final void setSubSettingsName(String subSettingsName) {
    this.subSettingsName = subSettingsName;
  }

  /**
   * @return the anyClass
   */
  public final Class getAnyClass() {
    return anyClass;
  }

  /**
   * @param anyClass
   *          the anyClass to set
   */
  public final void setAnyClass(Class anyClass) {
    this.anyClass = anyClass;
  }

}
