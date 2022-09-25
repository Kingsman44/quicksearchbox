package com.google.android.gms.car.p10750a.p10751a;

import android.os.Parcel;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.p10758a.C143185b;
import com.google.android.gms.car.p10768k.p10770b.C143324a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.a.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C143036cf implements C143324a {

    /* renamed from: a */
    public final /* synthetic */ C143038ch f388103a;

    public /* synthetic */ C143036cf(C143038ch chVar) {
        this.f388103a = chVar;
    }

    public final Object call() {
        C143185b a = this.f388103a.f388108d.mo117923a();
        a.getClass();
        Parcel gT = a.mo17261gT(3, a.mo17260gA());
        CarUiInfo carUiInfo = (CarUiInfo) C8850c.m23492a(gT, CarUiInfo.CREATOR);
        gT.recycle();
        return carUiInfo;
    }
}
