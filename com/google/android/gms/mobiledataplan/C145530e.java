package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.mobiledataplan.consent.C145527h;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.p10849a.C145514c;
import com.google.android.gms.mobiledataplan.p10849a.C145515d;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobiledataplan.e */
/* compiled from: PG */
public final /* synthetic */ class C145530e implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145527h f393571a;

    public /* synthetic */ C145530e(C145527h hVar) {
        this.f393571a = hVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145527h hVar = this.f393571a;
        C145535j jVar = new C145535j((C146010af) obj2);
        C145514c cVar = (C145514c) ((C145515d) obj).mo119451G();
        SetConsentStatusRequest setConsentStatusRequest = hVar.f393569a;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23497f(gA, setConsentStatusRequest);
        cVar.mo17262he(7, gA);
    }
}
