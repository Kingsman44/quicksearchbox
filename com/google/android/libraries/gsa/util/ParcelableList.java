package com.google.android.libraries.gsa.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class ParcelableList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23340e();

    /* renamed from: a */
    public final C58485gu f63871a;

    public ParcelableList(C58485gu guVar) {
        this.f63871a = guVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f63871a);
    }
}
