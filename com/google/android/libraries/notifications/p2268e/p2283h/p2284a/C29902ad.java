package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;

/* renamed from: com.google.android.libraries.notifications.e.h.a.ad */
/* compiled from: PG */
public final class C29902ad extends C29899aa {

    /* renamed from: c */
    private final C29893d f81023c;

    public C29902ad(C29893d dVar) {
        this.f81023c = dVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_STORE_TARGET";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        if (kVar == null) {
            return m55364i();
        }
        return this.f81023c.mo35193h(kVar, C55540at.m87704a(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", C55540at.REGISTRATION_REASON_UNSPECIFIED.f146563m)), awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "StoreTargetCallback";
    }
}
