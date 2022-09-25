package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143300o;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.j */
/* compiled from: PG */
public final /* synthetic */ class C143319j implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f388547a;

    public /* synthetic */ C143319j(C143784ce ceVar) {
        this.f388547a = ceVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143784ce ceVar = this.f388547a;
        C143301p pVar = (C143301p) obj;
        int i = C143339x.f388564c;
        C143782cc ccVar = ceVar.f389806b;
        if (ccVar != null) {
            synchronized (pVar.f388527a) {
                C143300o oVar = (C143300o) pVar.f388527a.get(ccVar);
                if (oVar == null || !oVar.f388526a.mo119236b()) {
                    oVar = new C143300o(ceVar);
                    pVar.f388527a.put(ceVar.f389806b, oVar);
                }
                C143141by byVar = (C143141by) pVar.mo119451G();
                Parcel gA = byVar.mo17260gA();
                C8850c.m23499h(gA, oVar);
                Parcel gT = byVar.mo17261gT(7, gA);
                C8850c.m23500i(gT);
                gT.recycle();
            }
        }
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
