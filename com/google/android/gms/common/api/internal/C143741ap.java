package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C143899ao;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: com.google.android.gms.common.api.internal.ap */
/* compiled from: PG */
final class C143741ap extends C143753ba {

    /* renamed from: a */
    final /* synthetic */ C143745at f389668a;

    /* renamed from: b */
    final /* synthetic */ SignInResponse f389669b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143741ap(C143751az azVar, C143745at atVar, SignInResponse signInResponse) {
        super(azVar);
        this.f389668a = atVar;
        this.f389669b = signInResponse;
    }

    /* renamed from: a */
    public final void mo119135a() {
        C143745at atVar = this.f389668a;
        SignInResponse signInResponse = this.f389669b;
        if (atVar.mo119153m(0)) {
            ConnectionResult connectionResult = signInResponse.f394688b;
            if (connectionResult.mo119068b()) {
                ResolveAccountResponse resolveAccountResponse = signInResponse.f394689c;
                C143919bh.m233958a(resolveAccountResponse);
                ConnectionResult connectionResult2 = resolveAccountResponse.f390043c;
                if (!connectionResult2.mo119068b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                    atVar.mo119150j(connectionResult2);
                    return;
                }
                atVar.f389679g = true;
                C143899ao a = resolveAccountResponse.mo119383a();
                C143919bh.m233958a(a);
                atVar.f389683k = a;
                atVar.f389680h = resolveAccountResponse.f390044d;
                atVar.f389681i = resolveAccountResponse.f390045e;
                atVar.mo119152l();
            } else if (atVar.mo119155o(connectionResult)) {
                atVar.mo119149i();
                atVar.mo119152l();
            } else {
                atVar.mo119150j(connectionResult);
            }
        }
    }
}
