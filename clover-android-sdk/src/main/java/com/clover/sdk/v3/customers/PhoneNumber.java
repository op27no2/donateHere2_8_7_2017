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
public final class PhoneNumber implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
  public String getPhoneNumber() {
    return genClient.cacheGet(CacheKey.phoneNumber);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PhoneNumber> {
    id {
      @Override
      public Object extractValue(PhoneNumber instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    phoneNumber {
      @Override
      public Object extractValue(PhoneNumber instance) {
        return instance.genClient.extractOther("phoneNumber", String.class);
      }
    },
    ;
  }

  private GenericClient<PhoneNumber> genClient = new GenericClient<PhoneNumber>(this);

  /**
   * Constructs a new empty instance.
   */
  public PhoneNumber() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PhoneNumber(String json) throws IllegalArgumentException {
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
  public PhoneNumber(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PhoneNumber(PhoneNumber src) {
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

    genClient.validateNull(getPhoneNumber(), "phoneNumber");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'phoneNumber' field is set and is not null */
  public boolean isNotNullPhoneNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.phoneNumber);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'phoneNumber' field has been set, however the value could be null */
  public boolean hasPhoneNumber() {
    return genClient.cacheHasKey(CacheKey.phoneNumber);
  }


  /**
   * Sets the field 'id'.
   */
  public PhoneNumber setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'phoneNumber'.
   */
  public PhoneNumber setPhoneNumber(String phoneNumber) {
    return genClient.setOther(phoneNumber, CacheKey.phoneNumber);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'phoneNumber' field, the 'has' method for this field will now return false */
  public void clearPhoneNumber() {
    genClient.clear(CacheKey.phoneNumber);
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
  public PhoneNumber copyChanges() {
    PhoneNumber copy = new PhoneNumber();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PhoneNumber src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PhoneNumber(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<PhoneNumber> CREATOR = new android.os.Parcelable.Creator<PhoneNumber>() {
    @Override
    public PhoneNumber createFromParcel(android.os.Parcel in) {
      PhoneNumber instance = new PhoneNumber(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PhoneNumber[] newArray(int size) {
      return new PhoneNumber[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PhoneNumber> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PhoneNumber>() {
    @Override
    public PhoneNumber create(org.json.JSONObject jsonObject) {
      return new PhoneNumber(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;

    public static final boolean PHONENUMBER_IS_REQUIRED = true;

  }

}
