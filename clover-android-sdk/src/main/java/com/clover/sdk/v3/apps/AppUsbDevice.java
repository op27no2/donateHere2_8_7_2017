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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AppUsbDevice implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public String getPackageName() {
    return genClient.cacheGet(CacheKey.packageName);
  }
  public Integer getVendorId() {
    return genClient.cacheGet(CacheKey.vendorId);
  }
  public Integer getProductId() {
    return genClient.cacheGet(CacheKey.productId);
  }
  public com.clover.sdk.v3.base.Reference getApp() {
    return genClient.cacheGet(CacheKey.app);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppUsbDevice> {
    packageName {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.genClient.extractOther("packageName", String.class);
      }
    },
    vendorId {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.genClient.extractOther("vendorId", Integer.class);
      }
    },
    productId {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.genClient.extractOther("productId", Integer.class);
      }
    },
    app {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.genClient.extractRecord("app", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<AppUsbDevice> genClient = new GenericClient<AppUsbDevice>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppUsbDevice() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppUsbDevice(String json) throws IllegalArgumentException {
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
  public AppUsbDevice(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppUsbDevice(AppUsbDevice src) {
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
    genClient.validateLength(getPackageName(), 255);

    if (getVendorId() != null && ( getVendorId() < 0)) throw new IllegalArgumentException("Invalid value for 'getVendorId()'");

    if (getProductId() != null && ( getProductId() < 0)) throw new IllegalArgumentException("Invalid value for 'getProductId()'");
  }

  /** Checks whether the 'packageName' field is set and is not null */
  public boolean isNotNullPackageName() {
    return genClient.cacheValueIsNotNull(CacheKey.packageName);
  }

  /** Checks whether the 'vendorId' field is set and is not null */
  public boolean isNotNullVendorId() {
    return genClient.cacheValueIsNotNull(CacheKey.vendorId);
  }

  /** Checks whether the 'productId' field is set and is not null */
  public boolean isNotNullProductId() {
    return genClient.cacheValueIsNotNull(CacheKey.productId);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }


  /** Checks whether the 'packageName' field has been set, however the value could be null */
  public boolean hasPackageName() {
    return genClient.cacheHasKey(CacheKey.packageName);
  }

  /** Checks whether the 'vendorId' field has been set, however the value could be null */
  public boolean hasVendorId() {
    return genClient.cacheHasKey(CacheKey.vendorId);
  }

  /** Checks whether the 'productId' field has been set, however the value could be null */
  public boolean hasProductId() {
    return genClient.cacheHasKey(CacheKey.productId);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }


  /**
   * Sets the field 'packageName'.
   */
  public AppUsbDevice setPackageName(String packageName) {
    return genClient.setOther(packageName, CacheKey.packageName);
  }

  /**
   * Sets the field 'vendorId'.
   */
  public AppUsbDevice setVendorId(Integer vendorId) {
    return genClient.setOther(vendorId, CacheKey.vendorId);
  }

  /**
   * Sets the field 'productId'.
   */
  public AppUsbDevice setProductId(Integer productId) {
    return genClient.setOther(productId, CacheKey.productId);
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppUsbDevice setApp(com.clover.sdk.v3.base.Reference app) {
    return genClient.setRecord(app, CacheKey.app);
  }


  /** Clears the 'packageName' field, the 'has' method for this field will now return false */
  public void clearPackageName() {
    genClient.clear(CacheKey.packageName);
  }
  /** Clears the 'vendorId' field, the 'has' method for this field will now return false */
  public void clearVendorId() {
    genClient.clear(CacheKey.vendorId);
  }
  /** Clears the 'productId' field, the 'has' method for this field will now return false */
  public void clearProductId() {
    genClient.clear(CacheKey.productId);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
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
  public AppUsbDevice copyChanges() {
    AppUsbDevice copy = new AppUsbDevice();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppUsbDevice src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppUsbDevice(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<AppUsbDevice> CREATOR = new android.os.Parcelable.Creator<AppUsbDevice>() {
    @Override
    public AppUsbDevice createFromParcel(android.os.Parcel in) {
      AppUsbDevice instance = new AppUsbDevice(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppUsbDevice[] newArray(int size) {
      return new AppUsbDevice[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppUsbDevice> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppUsbDevice>() {
    @Override
    public AppUsbDevice create(org.json.JSONObject jsonObject) {
      return new AppUsbDevice(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean PACKAGENAME_IS_REQUIRED = false;
    public static final long PACKAGENAME_MAX_LEN = 255;

    public static final boolean VENDORID_IS_REQUIRED = false;
    public static final long VENDORID_MIN = 0;

    public static final boolean PRODUCTID_IS_REQUIRED = false;
    public static final long PRODUCTID_MIN = 0;

    public static final boolean APP_IS_REQUIRED = false;

  }

}
