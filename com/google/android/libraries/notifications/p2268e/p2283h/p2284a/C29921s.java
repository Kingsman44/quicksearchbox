package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;

/* renamed from: com.google.android.libraries.notifications.e.h.a.s */
/* compiled from: PG */
public final class C29921s extends C29899aa {

    /* renamed from: c */
    private final C29893d f81047c;

    public C29921s(C29893d dVar) {
        this.f81047c = dVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_FETCH_LATEST_THREADS";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        if (kVar == null) {
            return m55364i();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        return this.f81047c.mo35189d(kVar, Long.valueOf(j), C55522ab.m87701a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", C55522ab.FETCH_REASON_UNSPECIFIED.f146514k)), awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "FetchLatestThreadsCallback";
    }
}
