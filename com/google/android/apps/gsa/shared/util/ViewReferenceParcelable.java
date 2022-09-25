package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
public class ViewReferenceParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90774br();

    /* renamed from: a */
    public final View f253768a;

    public ViewReferenceParcelable() {
        this.f253768a = null;
    }

    public ViewReferenceParcelable(View view) {
        this.f253768a = view;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
