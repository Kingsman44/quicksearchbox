package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.t */
/* compiled from: PG */
final class C79390t {

    /* renamed from: a */
    final C79370ac f218015a;

    /* renamed from: b */
    final IBinder f218016b;

    /* renamed from: c */
    final Bundle f218017c;

    /* renamed from: d */
    final int f218018d;

    public C79390t(C79370ac acVar, IBinder iBinder, Bundle bundle, int i) {
        this.f218015a = acVar;
        this.f218016b = iBinder;
        this.f218017c = bundle;
        this.f218018d = i;
    }

    /* renamed from: a */
    public final void mo74006a(C79374d dVar, boolean z) {
        try {
            Bundle bundle = this.f218017c;
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                bundle.putString("PLATFORM_PREFERRED_SESSION_VARIANCE", ((C79366a) this.f218015a).f217980a.name());
            }
            bundle.putBoolean("EXTRA_REMOTE_APA_SESSION_REQUESTED", C79369ab.m127349b(((C79366a) this.f218015a).f217981b));
            bundle.putBinder("EXTRA_SESSION_TOKEN", this.f218016b);
            dVar.mo73945a(this.f218016b, bundle, this.f218018d);
        } catch (RemoteException e) {
            C59104x c = NgaVoiceInteractionSessionService.f217951a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaViss");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(5558)).mo56386p("newSession RPC failed");
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(hashCode());
        String obj = this.f218015a.toString();
        String valueOf = String.valueOf(this.f218016b);
        return "NewSessionInvocation{id=@" + hexString + ", sessionConfiguration=" + obj + ", token=" + valueOf + "}";
    }
}
