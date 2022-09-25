package com.google.android.gms.kids.p10817a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.kids.a.d */
/* compiled from: PG */
public final /* synthetic */ class C144425d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ GetParentVerificationIntentRequest f391033a;

    public /* synthetic */ C144425d(GetParentVerificationIntentRequest getParentVerificationIntentRequest) {
        this.f391033a = getParentVerificationIntentRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        GetParentVerificationIntentRequest getParentVerificationIntentRequest = this.f391033a;
        C144424c cVar = (C144424c) ((C144429h) obj).mo119451G();
        C144427f fVar = new C144427f((C146010af) obj2);
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, getParentVerificationIntentRequest);
        C8850c.m23499h(gA, fVar);
        cVar.mo17262he(3005, gA);
    }
}
