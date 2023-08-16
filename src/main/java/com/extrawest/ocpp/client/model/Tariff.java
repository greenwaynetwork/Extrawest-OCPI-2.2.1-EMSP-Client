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


package com.extrawest.ocpp.client.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tariff
 */
@JsonPropertyOrder({
  Tariff.JSON_PROPERTY_COUNTRY_CODE,
  Tariff.JSON_PROPERTY_PARTY_ID,
  Tariff.JSON_PROPERTY_ID,
  Tariff.JSON_PROPERTY_CURRENCY,
  Tariff.JSON_PROPERTY_TYPE,
  Tariff.JSON_PROPERTY_TARIFF_ALT_TEXT,
  Tariff.JSON_PROPERTY_TARIFF_ALT_URL,
  Tariff.JSON_PROPERTY_MIN_PRICE,
  Tariff.JSON_PROPERTY_MAX_PRICE,
  Tariff.JSON_PROPERTY_ELEMENTS,
  Tariff.JSON_PROPERTY_START_DATE_TIME,
  Tariff.JSON_PROPERTY_END_DATE_TIME,
  Tariff.JSON_PROPERTY_ENERGY_MIX,
  Tariff.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T22:04:36.538444+03:00[Europe/Kiev]")
public class Tariff {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    AD_HOC_PAYMENT("AD_HOC_PAYMENT"),
    
    PROFILE_CHEAP("PROFILE_CHEAP"),
    
    PROFILE_FAST("PROFILE_FAST"),
    
    REGULAR("REGULAR"),
    
    PROFILE_GREEN("PROFILE_GREEN");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TARIFF_ALT_TEXT = "tariff_alt_text";
  private List<DisplayText> tariffAltText = null;

  public static final String JSON_PROPERTY_TARIFF_ALT_URL = "tariff_alt_url";
  private String tariffAltUrl;

  public static final String JSON_PROPERTY_MIN_PRICE = "min_price";
  private Price minPrice;

  public static final String JSON_PROPERTY_MAX_PRICE = "max_price";
  private Price maxPrice;

  public static final String JSON_PROPERTY_ELEMENTS = "elements";
  private List<TariffElement> elements = null;

  public static final String JSON_PROPERTY_START_DATE_TIME = "start_date_time";
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_END_DATE_TIME = "end_date_time";
  private OffsetDateTime endDateTime;

  public static final String JSON_PROPERTY_ENERGY_MIX = "energy_mix";
  private EnergyMix energyMix;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public Tariff() {
  }

  public Tariff countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Tariff partyId(String partyId) {
    
    this.partyId = partyId;
    return this;
  }

   /**
   * Get partyId
   * @return partyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPartyId() {
    return partyId;
  }


  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }


  public Tariff id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Tariff currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Tariff type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Tariff tariffAltText(List<DisplayText> tariffAltText) {
    
    this.tariffAltText = tariffAltText;
    return this;
  }

  public Tariff addTariffAltTextItem(DisplayText tariffAltTextItem) {
    if (this.tariffAltText == null) {
      this.tariffAltText = new ArrayList<>();
    }
    this.tariffAltText.add(tariffAltTextItem);
    return this;
  }

   /**
   * Get tariffAltText
   * @return tariffAltText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARIFF_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DisplayText> getTariffAltText() {
    return tariffAltText;
  }


  @JsonProperty(JSON_PROPERTY_TARIFF_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTariffAltText(List<DisplayText> tariffAltText) {
    this.tariffAltText = tariffAltText;
  }


  public Tariff tariffAltUrl(String tariffAltUrl) {
    
    this.tariffAltUrl = tariffAltUrl;
    return this;
  }

   /**
   * Get tariffAltUrl
   * @return tariffAltUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARIFF_ALT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTariffAltUrl() {
    return tariffAltUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARIFF_ALT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTariffAltUrl(String tariffAltUrl) {
    this.tariffAltUrl = tariffAltUrl;
  }


  public Tariff minPrice(Price minPrice) {
    
    this.minPrice = minPrice;
    return this;
  }

   /**
   * Get minPrice
   * @return minPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getMinPrice() {
    return minPrice;
  }


  @JsonProperty(JSON_PROPERTY_MIN_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinPrice(Price minPrice) {
    this.minPrice = minPrice;
  }


  public Tariff maxPrice(Price maxPrice) {
    
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * Get maxPrice
   * @return maxPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getMaxPrice() {
    return maxPrice;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPrice(Price maxPrice) {
    this.maxPrice = maxPrice;
  }


  public Tariff elements(List<TariffElement> elements) {
    
    this.elements = elements;
    return this;
  }

  public Tariff addElementsItem(TariffElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TariffElement> getElements() {
    return elements;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElements(List<TariffElement> elements) {
    this.elements = elements;
  }


  public Tariff startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public Tariff endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public Tariff energyMix(EnergyMix energyMix) {
    
    this.energyMix = energyMix;
    return this;
  }

   /**
   * Get energyMix
   * @return energyMix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENERGY_MIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnergyMix getEnergyMix() {
    return energyMix;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_MIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnergyMix(EnergyMix energyMix) {
    this.energyMix = energyMix;
  }


  public Tariff lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tariff tariff = (Tariff) o;
    return Objects.equals(this.countryCode, tariff.countryCode) &&
        Objects.equals(this.partyId, tariff.partyId) &&
        Objects.equals(this.id, tariff.id) &&
        Objects.equals(this.currency, tariff.currency) &&
        Objects.equals(this.type, tariff.type) &&
        Objects.equals(this.tariffAltText, tariff.tariffAltText) &&
        Objects.equals(this.tariffAltUrl, tariff.tariffAltUrl) &&
        Objects.equals(this.minPrice, tariff.minPrice) &&
        Objects.equals(this.maxPrice, tariff.maxPrice) &&
        Objects.equals(this.elements, tariff.elements) &&
        Objects.equals(this.startDateTime, tariff.startDateTime) &&
        Objects.equals(this.endDateTime, tariff.endDateTime) &&
        Objects.equals(this.energyMix, tariff.energyMix) &&
        Objects.equals(this.lastUpdated, tariff.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, partyId, id, currency, type, tariffAltText, tariffAltUrl, minPrice, maxPrice, elements, startDateTime, endDateTime, energyMix, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tariff {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tariffAltText: ").append(toIndentedString(tariffAltText)).append("\n");
    sb.append("    tariffAltUrl: ").append(toIndentedString(tariffAltUrl)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    energyMix: ").append(toIndentedString(energyMix)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

