package com.google.android.apps.gsa.search.shared.common.util;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class EventReminder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87509a();

    /* renamed from: a */
    public static final EventReminder f236347a = new EventReminder(15, 0);

    /* renamed from: b */
    public final int f236348b;

    /* renamed from: c */
    public final int f236349c;

    public EventReminder(int i, int i2) {
        this.f236348b = i;
        this.f236349c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f236348b);
        parcel.writeInt(this.f236349c);
    }
}
