package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C142869x implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ GetAccountsRequest f387672a;

    public /* synthetic */ C142869x(GetAccountsRequest getAccountsRequest) {
        this.f387672a = getAccountsRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        GetAccountsRequest getAccountsRequest = this.f387672a;
        C142858m mVar = (C142858m) ((C142848c) obj).mo119451G();
        C142844ac acVar = new C142844ac((C146010af) obj2);
        Parcel gA = mVar.mo17260gA();
        C8850c.m23499h(gA, acVar);
        C8850c.m23497f(gA, getAccountsRequest);
        mVar.mo17262he(5, gA);
    }
}
