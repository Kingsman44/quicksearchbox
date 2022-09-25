package com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public enum TrainCommunicationOperation implements Parcelable {
    REGISTER_TRAINING,
    REGISTER_TRAINING_WITH_OPTIONS,
    UNREGISTER_TRAINING,
    PERFORM_CACHE_MAINTENANCE,
    CLEAR_TRAINING_DATA,
    LOG_TRAINING_CACHE_STATS;
    
    public static final Parcelable.Creator CREATOR = null;

    static {
        CREATOR = new C100972g();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
