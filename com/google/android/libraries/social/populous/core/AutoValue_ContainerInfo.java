package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57878d;

/* compiled from: PG */
public final class AutoValue_ContainerInfo extends C$AutoValue_ContainerInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42360u();

    /* renamed from: d */
    private static final ClassLoader f110681d = AutoValue_ContainerInfo.class.getClassLoader();

    public AutoValue_ContainerInfo(Parcel parcel) {
        super(C57878d.m88555a(parcel.readInt()), parcel.readString(), ((Boolean) parcel.readValue(f110681d)).booleanValue());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110617c - 1);
        parcel.writeString(this.f110615a);
        parcel.writeValue(Boolean.valueOf(this.f110616b));
    }

    public AutoValue_ContainerInfo(int i, String str, boolean z) {
        super(i, str, z);
    }
}
