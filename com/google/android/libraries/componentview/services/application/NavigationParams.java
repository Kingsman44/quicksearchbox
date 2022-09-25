package com.google.android.libraries.componentview.services.application;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class NavigationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C20607cg();

    /* renamed from: c */
    public static C20608ch m38563c() {
        C20617h hVar = new C20617h();
        hVar.mo25556b(false);
        return hVar;
    }

    /* renamed from: a */
    public abstract Long mo25467a();

    /* renamed from: b */
    public abstract boolean mo25468b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(mo25468b()));
        parcel.writeValue(mo25467a());
    }
}
