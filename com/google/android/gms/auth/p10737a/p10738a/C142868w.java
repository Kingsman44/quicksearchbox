package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C142868w implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ ClearTokenRequest f387671a;

    public /* synthetic */ C142868w(ClearTokenRequest clearTokenRequest) {
        this.f387671a = clearTokenRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        ClearTokenRequest clearTokenRequest = this.f387671a;
        C142858m mVar = (C142858m) ((C142848c) obj).mo119451G();
        C142842aa aaVar = new C142842aa((C146010af) obj2);
        Parcel gA = mVar.mo17260gA();
        C8850c.m23499h(gA, aaVar);
        C8850c.m23497f(gA, clearTokenRequest);
        mVar.mo17262he(2, gA);
    }
}
