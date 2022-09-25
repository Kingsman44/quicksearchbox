package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class StartActivityForResultEventCompoundParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87688ap();

    /* renamed from: a */
    public final Parcelable f236963a;

    /* renamed from: b */
    private final Parcelable f236964b;

    public StartActivityForResultEventCompoundParcelable(Parcelable parcelable, Parcelable parcelable2) {
        this.f236963a = parcelable;
        this.f236964b = parcelable2;
    }

    /* renamed from: b */
    public final boolean mo81922b(Class cls) {
        Parcelable parcelable = this.f236964b;
        if (parcelable == null) {
            return false;
        }
        return cls.isInstance(parcelable);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236963a, 0);
        parcel.writeParcelable(this.f236964b, 0);
    }

    /* renamed from: a */
    public final Parcelable mo81921a(Class cls) {
        Parcelable parcelable = this.f236964b;
        parcelable.getClass();
        return (Parcelable) cls.cast(parcelable);
    }
}
