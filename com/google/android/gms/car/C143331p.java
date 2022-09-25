package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.p */
/* compiled from: PG */
public final /* synthetic */ class C143331p implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ CarCall f388554a;

    public /* synthetic */ C143331p(CarCall carCall) {
        this.f388554a = carCall;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        CarCall carCall = this.f388554a;
        int i = C143339x.f388564c;
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gA = byVar.mo17260gA();
        C8850c.m23497f(gA, carCall);
        C8850c.m23495d(gA, false);
        gA.writeString((String) null);
        byVar.mo17262he(10, gA);
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
