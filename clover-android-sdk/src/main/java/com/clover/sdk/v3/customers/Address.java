/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.customers;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Address implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
  public String getAddress1() {
    return genClient.cacheGet(CacheKey.address1);
  }
  public String getAddress2() {
    return genClient.cacheGet(CacheKey.address2);
  }
  public String getAddress3() {
    return genClient.cacheGet(CacheKey.address3);
  }
  public String getCity() {
    return genClient.cacheGet(CacheKey.city);
  }
  public String getCountry() {
    return genClient.cacheGet(CacheKey.country);
  }
  public String getState() {
    return genClient.cacheGet(CacheKey.state);
  }
  public String getZip() {
    return genClient.cacheGet(CacheKey.zip);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Address> {
    id {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    address1 {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("address1", String.class);
      }
    },
    address2 {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("address2", String.class);
      }
    },
    address3 {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("address3", String.class);
      }
    },
    city {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("city", String.class);
      }
    },
    country {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("country", String.class);
      }
    },
    state {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("state", String.class);
      }
    },
    zip {
      @Override
      public Object extractValue(Address instance) {
        return instance.genClient.extractOther("zip", String.class);
      }
    },
    ;
  }

  private GenericClient<Address> genClient = new GenericClient<Address>(this);

  /**
   * Constructs a new empty instance.
   */
  public Address() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Address(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Address(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Address(Address src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {

    genClient.validateNull(getAddress1(), "address1");
    genClient.validateLength(getAddress1(), 255);

    genClient.validateLength(getAddress2(), 255);

    genClient.validateLength(getAddress3(), 255);

    genClient.validateNull(getCity(), "city");
    genClient.validateLength(getCity(), 127);

    genClient.validateNull(getCountry(), "country");
    genClient.validateLength(getCountry(), 2);

    genClient.validateNull(getState(), "state");
    genClient.validateLength(getState(), 127);

    genClient.validateNull(getZip(), "zip");
    genClient.validateLength(getZip(), 10);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'address1' field is set and is not null */
  public boolean isNotNullAddress1() {
    return genClient.cacheValueIsNotNull(CacheKey.address1);
  }

  /** Checks whether the 'address2' field is set and is not null */
  public boolean isNotNullAddress2() {
    return genClient.cacheValueIsNotNull(CacheKey.address2);
  }

  /** Checks whether the 'address3' field is set and is not null */
  public boolean isNotNullAddress3() {
    return genClient.cacheValueIsNotNull(CacheKey.address3);
  }

  /** Checks whether the 'city' field is set and is not null */
  public boolean isNotNullCity() {
    return genClient.cacheValueIsNotNull(CacheKey.city);
  }

  /** Checks whether the 'country' field is set and is not null */
  public boolean isNotNullCountry() {
    return genClient.cacheValueIsNotNull(CacheKey.country);
  }

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return genClient.cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'zip' field is set and is not null */
  public boolean isNotNullZip() {
    return genClient.cacheValueIsNotNull(CacheKey.zip);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'address1' field has been set, however the value could be null */
  public boolean hasAddress1() {
    return genClient.cacheHasKey(CacheKey.address1);
  }

  /** Checks whether the 'address2' field has been set, however the value could be null */
  public boolean hasAddress2() {
    return genClient.cacheHasKey(CacheKey.address2);
  }

  /** Checks whether the 'address3' field has been set, however the value could be null */
  public boolean hasAddress3() {
    return genClient.cacheHasKey(CacheKey.address3);
  }

  /** Checks whether the 'city' field has been set, however the value could be null */
  public boolean hasCity() {
    return genClient.cacheHasKey(CacheKey.city);
  }

  /** Checks whether the 'country' field has been set, however the value could be null */
  public boolean hasCountry() {
    return genClient.cacheHasKey(CacheKey.country);
  }

  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return genClient.cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'zip' field has been set, however the value could be null */
  public boolean hasZip() {
    return genClient.cacheHasKey(CacheKey.zip);
  }


  /**
   * Sets the field 'id'.
   */
  public Address setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'address1'.
   */
  public Address setAddress1(String address1) {
    return genClient.setOther(address1, CacheKey.address1);
  }

  /**
   * Sets the field 'address2'.
   */
  public Address setAddress2(String address2) {
    return genClient.setOther(address2, CacheKey.address2);
  }

  /**
   * Sets the field 'address3'.
   */
  public Address setAddress3(String address3) {
    return genClient.setOther(address3, CacheKey.address3);
  }

  /**
   * Sets the field 'city'.
   */
  public Address setCity(String city) {
    return genClient.setOther(city, CacheKey.city);
  }

  /**
   * Sets the field 'country'.
   */
  public Address setCountry(String country) {
    return genClient.setOther(country, CacheKey.country);
  }

  /**
   * Sets the field 'state'.
   */
  public Address setState(String state) {
    return genClient.setOther(state, CacheKey.state);
  }

  /**
   * Sets the field 'zip'.
   */
  public Address setZip(String zip) {
    return genClient.setOther(zip, CacheKey.zip);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'address1' field, the 'has' method for this field will now return false */
  public void clearAddress1() {
    genClient.clear(CacheKey.address1);
  }
  /** Clears the 'address2' field, the 'has' method for this field will now return false */
  public void clearAddress2() {
    genClient.clear(CacheKey.address2);
  }
  /** Clears the 'address3' field, the 'has' method for this field will now return false */
  public void clearAddress3() {
    genClient.clear(CacheKey.address3);
  }
  /** Clears the 'city' field, the 'has' method for this field will now return false */
  public void clearCity() {
    genClient.clear(CacheKey.city);
  }
  /** Clears the 'country' field, the 'has' method for this field will now return false */
  public void clearCountry() {
    genClient.clear(CacheKey.country);
  }
  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    genClient.clear(CacheKey.state);
  }
  /** Clears the 'zip' field, the 'has' method for this field will now return false */
  public void clearZip() {
    genClient.clear(CacheKey.zip);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Address copyChanges() {
    Address copy = new Address();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Address src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Address(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<Address> CREATOR = new android.os.Parcelable.Creator<Address>() {
    @Override
    public Address createFromParcel(android.os.Parcel in) {
      Address instance = new Address(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Address[] newArray(int size) {
      return new Address[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Address> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Address>() {
    @Override
    public Address create(org.json.JSONObject jsonObject) {
      return new Address(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;

    public static final boolean ADDRESS1_IS_REQUIRED = true;
    public static final long ADDRESS1_MAX_LEN = 255;

    public static final boolean ADDRESS2_IS_REQUIRED = false;
    public static final long ADDRESS2_MAX_LEN = 255;

    public static final boolean ADDRESS3_IS_REQUIRED = false;
    public static final long ADDRESS3_MAX_LEN = 255;

    public static final boolean CITY_IS_REQUIRED = true;
    public static final long CITY_MAX_LEN = 127;

    public static final boolean COUNTRY_IS_REQUIRED = true;
    public static final long COUNTRY_MAX_LEN = 2;

    public static final boolean STATE_IS_REQUIRED = true;
    public static final long STATE_MAX_LEN = 127;

    public static final boolean ZIP_IS_REQUIRED = true;
    public static final long ZIP_MAX_LEN = 10;

  }

}
