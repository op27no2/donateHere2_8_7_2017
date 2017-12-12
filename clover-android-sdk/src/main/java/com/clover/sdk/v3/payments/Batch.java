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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Batch implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * The number of transactions being batched
  */
  public Long getTxCount() {
    return genClient.cacheGet(CacheKey.txCount);
  }
 /**
  * Total amount closed
  */
  public Long getTotalBatchAmount() {
    return genClient.cacheGet(CacheKey.totalBatchAmount);
  }
 /**
  * List of devices in batch
  */
  public String getDevices() {
    return genClient.cacheGet(CacheKey.devices);
  }
  public com.clover.sdk.v3.payments.BatchState getState() {
    return genClient.cacheGet(CacheKey.state);
  }
  public com.clover.sdk.v3.payments.BatchType getBatchType() {
    return genClient.cacheGet(CacheKey.batchType);
  }
 /**
  * Created time of batch
  */
  public Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }
 /**
  * Modified time of batch
  */
  public Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }
 /**
  * Details split based on card / employees
  */
  public com.clover.sdk.v3.payments.BatchDetail getBatchDetails() {
    return genClient.cacheGet(CacheKey.batchDetails);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Batch> {
    id {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    txCount {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("txCount", Long.class);
      }
    },
    totalBatchAmount {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("totalBatchAmount", Long.class);
      }
    },
    devices {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("devices", String.class);
      }
    },
    state {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractEnum("state", com.clover.sdk.v3.payments.BatchState.class);
      }
    },
    batchType {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractEnum("batchType", com.clover.sdk.v3.payments.BatchType.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("createdTime", Long.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractOther("modifiedTime", Long.class);
      }
    },
    batchDetails {
      @Override
      public Object extractValue(Batch instance) {
        return instance.genClient.extractRecord("batchDetails", com.clover.sdk.v3.payments.BatchDetail.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Batch> genClient = new GenericClient<Batch>(this);

  /**
   * Constructs a new empty instance.
   */
  public Batch() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Batch(String json) throws IllegalArgumentException {
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
  public Batch(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Batch(Batch src) {
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
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'txCount' field is set and is not null */
  public boolean isNotNullTxCount() {
    return genClient.cacheValueIsNotNull(CacheKey.txCount);
  }

  /** Checks whether the 'totalBatchAmount' field is set and is not null */
  public boolean isNotNullTotalBatchAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.totalBatchAmount);
  }

  /** Checks whether the 'devices' field is set and is not null */
  public boolean isNotNullDevices() {
    return genClient.cacheValueIsNotNull(CacheKey.devices);
  }

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return genClient.cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'batchType' field is set and is not null */
  public boolean isNotNullBatchType() {
    return genClient.cacheValueIsNotNull(CacheKey.batchType);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'batchDetails' field is set and is not null */
  public boolean isNotNullBatchDetails() {
    return genClient.cacheValueIsNotNull(CacheKey.batchDetails);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'txCount' field has been set, however the value could be null */
  public boolean hasTxCount() {
    return genClient.cacheHasKey(CacheKey.txCount);
  }

  /** Checks whether the 'totalBatchAmount' field has been set, however the value could be null */
  public boolean hasTotalBatchAmount() {
    return genClient.cacheHasKey(CacheKey.totalBatchAmount);
  }

  /** Checks whether the 'devices' field has been set, however the value could be null */
  public boolean hasDevices() {
    return genClient.cacheHasKey(CacheKey.devices);
  }

  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return genClient.cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'batchType' field has been set, however the value could be null */
  public boolean hasBatchType() {
    return genClient.cacheHasKey(CacheKey.batchType);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'batchDetails' field has been set, however the value could be null */
  public boolean hasBatchDetails() {
    return genClient.cacheHasKey(CacheKey.batchDetails);
  }


  /**
   * Sets the field 'id'.
   */
  public Batch setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'txCount'.
   */
  public Batch setTxCount(Long txCount) {
    return genClient.setOther(txCount, CacheKey.txCount);
  }

  /**
   * Sets the field 'totalBatchAmount'.
   */
  public Batch setTotalBatchAmount(Long totalBatchAmount) {
    return genClient.setOther(totalBatchAmount, CacheKey.totalBatchAmount);
  }

  /**
   * Sets the field 'devices'.
   */
  public Batch setDevices(String devices) {
    return genClient.setOther(devices, CacheKey.devices);
  }

  /**
   * Sets the field 'state'.
   */
  public Batch setState(com.clover.sdk.v3.payments.BatchState state) {
    return genClient.setOther(state, CacheKey.state);
  }

  /**
   * Sets the field 'batchType'.
   */
  public Batch setBatchType(com.clover.sdk.v3.payments.BatchType batchType) {
    return genClient.setOther(batchType, CacheKey.batchType);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public Batch setCreatedTime(Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public Batch setModifiedTime(Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'batchDetails'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Batch setBatchDetails(com.clover.sdk.v3.payments.BatchDetail batchDetails) {
    return genClient.setRecord(batchDetails, CacheKey.batchDetails);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'txCount' field, the 'has' method for this field will now return false */
  public void clearTxCount() {
    genClient.clear(CacheKey.txCount);
  }
  /** Clears the 'totalBatchAmount' field, the 'has' method for this field will now return false */
  public void clearTotalBatchAmount() {
    genClient.clear(CacheKey.totalBatchAmount);
  }
  /** Clears the 'devices' field, the 'has' method for this field will now return false */
  public void clearDevices() {
    genClient.clear(CacheKey.devices);
  }
  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    genClient.clear(CacheKey.state);
  }
  /** Clears the 'batchType' field, the 'has' method for this field will now return false */
  public void clearBatchType() {
    genClient.clear(CacheKey.batchType);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'batchDetails' field, the 'has' method for this field will now return false */
  public void clearBatchDetails() {
    genClient.clear(CacheKey.batchDetails);
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
  public Batch copyChanges() {
    Batch copy = new Batch();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Batch src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Batch(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Batch> CREATOR = new android.os.Parcelable.Creator<Batch>() {
    @Override
    public Batch createFromParcel(android.os.Parcel in) {
      Batch instance = new Batch(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Batch[] newArray(int size) {
      return new Batch[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Batch> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Batch>() {
    @Override
    public Batch create(org.json.JSONObject jsonObject) {
      return new Batch(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean TXCOUNT_IS_REQUIRED = false;

    public static final boolean TOTALBATCHAMOUNT_IS_REQUIRED = false;

    public static final boolean DEVICES_IS_REQUIRED = false;

    public static final boolean STATE_IS_REQUIRED = false;

    public static final boolean BATCHTYPE_IS_REQUIRED = false;

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;

    public static final boolean BATCHDETAILS_IS_REQUIRED = false;

  }

}