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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TariffElement
 */
@JsonPropertyOrder({
        TariffElement.JSON_PROPERTY_PRICE_COMPONENTS,
        TariffElement.JSON_PROPERTY_RESTRICTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-30T00:02:35.798322+03:00[Europe/Kiev]")
public class TariffElement {
  public static final String JSON_PROPERTY_PRICE_COMPONENTS = "price_components";
  private List<PriceComponent> priceComponents;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private TariffRestrictions restrictions;

  public TariffElement() {
  }

  public TariffElement priceComponents(List<PriceComponent> priceComponents) {
    
    this.priceComponents = priceComponents;
    return this;
  }

  public TariffElement addPriceComponentsItem(PriceComponent priceComponentsItem) {
    if (this.priceComponents == null) {
      this.priceComponents = new ArrayList<>();
    }
    this.priceComponents.add(priceComponentsItem);
    return this;
  }

   /**
   * Get priceComponents
   * @return priceComponents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PriceComponent> getPriceComponents() {
    return priceComponents;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceComponents(List<PriceComponent> priceComponents) {
    this.priceComponents = priceComponents;
  }


  public TariffElement restrictions(TariffRestrictions restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TariffRestrictions getRestrictions() {
    return restrictions;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictions(TariffRestrictions restrictions) {
    this.restrictions = restrictions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffElement tariffElement = (TariffElement) o;
    return Objects.equals(this.priceComponents, tariffElement.priceComponents) &&
        Objects.equals(this.restrictions, tariffElement.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceComponents, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffElement {\n");
    sb.append("    priceComponents: ").append(toIndentedString(priceComponents)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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

