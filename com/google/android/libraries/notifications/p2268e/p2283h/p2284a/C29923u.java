package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.impl.C29806k;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;

/* renamed from: com.google.android.libraries.notifications.e.h.a.u */
/* compiled from: PG */
public final class C29923u extends C29899aa {

    /* renamed from: c */
    private final C29893d f81048c;

    /* renamed from: d */
    private final C29806k f81049d;

    public C29923u(C29893d dVar, C29806k kVar) {
        this.f81048c = dVar;
        this.f81049d = kVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_FETCH_UPDATED_THREADS";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        if (kVar == null) {
            return m55364i();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        C55522ab a = C55522ab.m87701a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", C55522ab.FETCH_REASON_UNSPECIFIED.f146514k));
        C29806k kVar2 = this.f81049d;
        C147767c cVar = new C147767c();
        cVar.f398712a.append("last_updated__version");
        cVar.mo124446b(">?", Long.valueOf(j));
        return this.f81048c.mo35190e(kVar, j, C29827r.m55148u(kVar2.f80821a.mo35106a(kVar, C58485gu.m89846n(cVar.mo124445a()))), a, awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "FetchUpdatedThreadsCallback";
    }
}
