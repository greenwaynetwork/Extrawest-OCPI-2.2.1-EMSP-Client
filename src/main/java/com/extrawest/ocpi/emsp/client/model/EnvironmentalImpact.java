/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpi.emsp.client.model;

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

/**
 * EnvironmentalImpact
 */
@JsonPropertyOrder({
  EnvironmentalImpact.JSON_PROPERTY_CATEGORY,
  EnvironmentalImpact.JSON_PROPERTY_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T11:17:51.079281+03:00[Europe/Kiev]")
public class EnvironmentalImpact {
  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    NUCLEAR_WASTE("NUCLEAR_WASTE"),
    
    CARBON_DIOXIDE("CARBON_DIOXIDE");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Float amount;

  public EnvironmentalImpact() {
  }

  public EnvironmentalImpact category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CategoryEnum getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public EnvironmentalImpact amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Float amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentalImpact environmentalImpact = (EnvironmentalImpact) o;
    return Objects.equals(this.category, environmentalImpact.category) &&
        Objects.equals(this.amount, environmentalImpact.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentalImpact {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

