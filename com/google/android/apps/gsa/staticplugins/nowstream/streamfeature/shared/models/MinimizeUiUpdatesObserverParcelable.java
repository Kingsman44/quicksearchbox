package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class MinimizeUiUpdatesObserverParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C105768f();

    /* renamed from: a */
    public final C105767e f295116a;

    public MinimizeUiUpdatesObserverParcelable(C105767e eVar) {
        this.f295116a = eVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f295116a.asBinder());
    }
}
