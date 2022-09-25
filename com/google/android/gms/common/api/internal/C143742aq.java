package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C145996b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.aq */
/* compiled from: PG */
final class C143742aq extends C145996b {

    /* renamed from: a */
    private final WeakReference f389670a;

    public C143742aq(C143745at atVar) {
        this.f389670a = new WeakReference(atVar);
    }

    /* renamed from: a */
    public final void mo119147a(SignInResponse signInResponse) {
        C143745at atVar = (C143745at) this.f389670a.get();
        if (atVar != null) {
            atVar.f389673a.mo119183j(new C143741ap(atVar, atVar, signInResponse));
        }
    }
}
