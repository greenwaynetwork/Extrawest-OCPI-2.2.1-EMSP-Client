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
 * CdrToken
 */
@JsonPropertyOrder({
        CdrToken.JSON_PROPERTY_COUNTRY_CODE,
        CdrToken.JSON_PROPERTY_PARTY_ID,
        CdrToken.JSON_PROPERTY_UID,
        CdrToken.JSON_PROPERTY_TYPE,
        CdrToken.JSON_PROPERTY_CONTRACT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-30T00:02:35.798322+03:00[Europe/Kiev]")
public class CdrToken {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    AD_HOC_USER("AD_HOC_USER"),
    
    APP_USER("APP_USER"),
    
    OTHER("OTHER"),
    
    RFID("RFID");

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

  public static final String JSON_PROPERTY_CONTRACT_ID = "contract_id";
  private String contractId;

  public CdrToken() {
  }

  public CdrToken countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
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


  public CdrToken partyId(String partyId) {
    
    this.partyId = partyId;
    return this;
  }

   /**
   * Get partyId
   * @return partyId
  **/
  @javax.annotation.Nullable
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


  public CdrToken uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public CdrToken type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
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


  public CdrToken contractId(String contractId) {
    
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractId() {
    return contractId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdrToken cdrToken = (CdrToken) o;
    return Objects.equals(this.countryCode, cdrToken.countryCode) &&
        Objects.equals(this.partyId, cdrToken.partyId) &&
        Objects.equals(this.uid, cdrToken.uid) &&
        Objects.equals(this.type, cdrToken.type) &&
        Objects.equals(this.contractId, cdrToken.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, partyId, uid, type, contractId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdrToken {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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

