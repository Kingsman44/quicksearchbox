package com.google.android.gms.credential.manager.p10787b.p10788a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.p10786a.C144088c;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.credential.manager.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C144090a implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ CredentialManagerAccount f390362a;

    /* renamed from: b */
    public final /* synthetic */ CallerInfo f390363b;

    public /* synthetic */ C144090a(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        this.f390362a = credentialManagerAccount;
        this.f390363b = callerInfo;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        CredentialManagerAccount credentialManagerAccount = this.f390362a;
        CallerInfo callerInfo = this.f390363b;
        int i = C144092c.f390364a;
        C144094e eVar = (C144094e) ((C144093d) obj).mo119451G();
        C144088c cVar = new C144088c((C146010af) obj2);
        CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(credentialManagerAccount, callerInfo);
        Parcel gA = eVar.mo17260gA();
        C8850c.m23499h(gA, cVar);
        C8850c.m23497f(gA, credentialManagerInvocationParams);
        eVar.mo17262he(1, gA);
    }
}
