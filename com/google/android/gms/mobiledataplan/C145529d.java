package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.mobiledataplan.p10849a.C145514c;
import com.google.android.gms.mobiledataplan.p10849a.C145515d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobiledataplan.d */
/* compiled from: PG */
public final /* synthetic */ class C145529d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145538m f393570a;

    public /* synthetic */ C145529d(C145538m mVar) {
        this.f393570a = mVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145538m mVar = this.f393570a;
        C145533h hVar = new C145533h((C146010af) obj2);
        C145514c cVar = (C145514c) ((C145515d) obj).mo119451G();
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = mVar.f393582a;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, hVar);
        C8850c.m23497f(gA, mdpCarrierPlanIdRequest);
        cVar.mo17262he(1, gA);
    }
}
