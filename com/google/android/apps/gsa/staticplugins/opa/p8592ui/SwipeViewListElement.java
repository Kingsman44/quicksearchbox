package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.assistant.p3897e.p3921j.p3926e.C51916dw;
import com.google.assistant.p3897e.p3921j.p3926e.C51917dx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.SwipeViewListElement */
/* compiled from: PG */
public class SwipeViewListElement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C113722j();

    /* renamed from: a */
    public final String f314921a;

    /* renamed from: b */
    public final String f314922b;

    /* renamed from: c */
    public final String f314923c;

    public SwipeViewListElement(Parcel parcel) {
        this.f314921a = parcel.readString();
        this.f314922b = parcel.readString();
        this.f314923c = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f314921a);
        parcel.writeString(this.f314922b);
        parcel.writeString(this.f314923c);
    }

    public SwipeViewListElement(C51917dx dxVar) {
        String str;
        if ((dxVar.f136189a & 4) != 0) {
            C51916dw dwVar = dxVar.f136192d;
            str = (dwVar == null ? C51916dw.f136183b : dwVar).f136185a;
        } else {
            str = null;
        }
        this.f314921a = str;
        this.f314922b = dxVar.f136190b;
        this.f314923c = dxVar.f136191c;
    }
}
