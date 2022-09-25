package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C143899ao;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.cv */
/* compiled from: PG */
final class C143801cv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SignInResponse f389842a;

    /* renamed from: b */
    final /* synthetic */ C143802cw f389843b;

    public C143801cv(C143802cw cwVar, SignInResponse signInResponse) {
        this.f389843b = cwVar;
        this.f389842a = signInResponse;
    }

    public final void run() {
        C143802cw cwVar = this.f389843b;
        SignInResponse signInResponse = this.f389842a;
        ConnectionResult connectionResult = signInResponse.f394688b;
        if (connectionResult.mo119068b()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.f394689c;
            C143919bh.m233958a(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.f390043c;
            if (!connectionResult2.mo119068b()) {
                String valueOf = String.valueOf(connectionResult2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                cwVar.f389849f.mo119205b(connectionResult2);
                cwVar.f389848e.mo118925n();
                return;
            }
            C143766bn bnVar = cwVar.f389849f;
            C143899ao a = resolveAccountResponse.mo119383a();
            Set set = cwVar.f389846c;
            if (a == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                bnVar.mo119205b(new ConnectionResult(1, 4, (PendingIntent) null, (String) null));
            } else {
                bnVar.f389769f = a;
                bnVar.f389766c = set;
                bnVar.mo119206c();
            }
        } else {
            cwVar.f389849f.mo119205b(connectionResult);
        }
        cwVar.f389848e.mo118925n();
    }
}
