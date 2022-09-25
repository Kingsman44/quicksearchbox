package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.m */
/* compiled from: PG */
public final /* synthetic */ class C143979m implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ ApiFeatureRequest f390211a;

    public /* synthetic */ C143979m(ApiFeatureRequest apiFeatureRequest) {
        this.f390211a = apiFeatureRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        ApiFeatureRequest apiFeatureRequest = this.f390211a;
        C143981o oVar = new C143981o((C146010af) obj2);
        C143972f fVar = (C143972f) ((C143986t) obj).mo119451G();
        Parcel gA = fVar.mo17260gA();
        C8850c.m23499h(gA, oVar);
        C8850c.m23497f(gA, apiFeatureRequest);
        fVar.mo17262he(1, gA);
    }
}
