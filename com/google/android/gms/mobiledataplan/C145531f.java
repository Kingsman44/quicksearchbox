package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.mobiledataplan.consent.C145523d;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.p10849a.C145514c;
import com.google.android.gms.mobiledataplan.p10849a.C145515d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobiledataplan.f */
/* compiled from: PG */
public final /* synthetic */ class C145531f implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145523d f393572a;

    public /* synthetic */ C145531f(C145523d dVar) {
        this.f393572a = dVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145523d dVar = this.f393572a;
        C145534i iVar = new C145534i((C146010af) obj2);
        C145514c cVar = (C145514c) ((C145515d) obj).mo119451G();
        GetConsentInformationRequest getConsentInformationRequest = dVar.f393568a;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        C8850c.m23497f(gA, getConsentInformationRequest);
        cVar.mo17262he(6, gA);
    }
}
