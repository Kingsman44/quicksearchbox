package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class SystemParcelableWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C84201ab();

    /* renamed from: a */
    public final Parcelable f229193a;

    public SystemParcelableWrapper(Parcelable parcelable) {
        if (m134237a(parcelable)) {
            this.f229193a = parcelable;
            return;
        }
        throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
    }

    /* renamed from: a */
    static boolean m134237a(Parcelable parcelable) {
        String name = parcelable.getClass().getName();
        return name.startsWith("android.os.") || name.equals("android.content.Intent") || name.equals("android.app.PendingIntent");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f229193a, i);
    }
}
