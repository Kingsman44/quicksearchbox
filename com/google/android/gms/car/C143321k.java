package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143300o;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.k */
/* compiled from: PG */
public final /* synthetic */ class C143321k implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f388548a;

    public /* synthetic */ C143321k(C143784ce ceVar) {
        this.f388548a = ceVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143301p pVar = (C143301p) obj;
        C143782cc ccVar = this.f388548a.f389806b;
        synchronized (pVar.f388527a) {
            C143300o oVar = (C143300o) pVar.f388527a.remove(ccVar);
            if (oVar != null) {
                C143141by byVar = (C143141by) pVar.mo119451G();
                Parcel gA = byVar.mo17260gA();
                C8850c.m23499h(gA, oVar);
                Parcel gT = byVar.mo17261gT(8, gA);
                C8850c.m23500i(gT);
                gT.recycle();
            } else {
                C143316a.m232514d(5, "CAR.TEL.CLIENT", (Throwable) null, "Tried to unregister nonexistent listener", new Object[0]);
            }
        }
        ((C146010af) obj2).f394698a.mo122508v(true);
    }
}
