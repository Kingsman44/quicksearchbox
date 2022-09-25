package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class AppFlowEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24866a();

    /* renamed from: a */
    public static final C58974d f67919a = C58974d.m91135i("AppFlowEvent");

    /* renamed from: b */
    public C24886u f67920b;

    public AppFlowEvent(C24886u uVar) {
        this.f67920b = uVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f67920b.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
