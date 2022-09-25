package com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.g */
/* compiled from: PG */
final class C100972g implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return TrainCommunicationOperation.values()[parcel.readInt()];
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TrainCommunicationOperation[i];
    }
}
