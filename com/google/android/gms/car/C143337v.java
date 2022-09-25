package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.v */
/* compiled from: PG */
public final /* synthetic */ class C143337v implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ CarCall f388560a;

    /* renamed from: b */
    public final /* synthetic */ char f388561b;

    public /* synthetic */ C143337v(CarCall carCall, char c) {
        this.f388560a = carCall;
        this.f388561b = c;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        CarCall carCall = this.f388560a;
        char c = this.f388561b;
        int i = C143339x.f388564c;
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gA = byVar.mo17260gA();
        C8850c.m23497f(gA, carCall);
        gA.writeInt(c);
        byVar.mo17262he(14, gA);
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
