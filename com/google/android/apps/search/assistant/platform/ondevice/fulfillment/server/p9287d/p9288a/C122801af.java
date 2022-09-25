package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4580v.C60950i;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.af */
/* compiled from: PG */
public final class C122801af {

    /* renamed from: a */
    public final int f340158a;

    /* renamed from: b */
    public final Instant f340159b;

    /* renamed from: c */
    private final Map f340160c = new HashMap();

    public C122801af(C122812l lVar, C60950i iVar) {
        this.f340158a = lVar.f340182a.incrementAndGet();
        this.f340159b = iVar.mo57444a();
    }

    /* renamed from: a */
    public final synchronized C58495hd mo105745a() {
        return C58495hd.m89898l(this.f340160c);
    }

    /* renamed from: b */
    public final synchronized void mo105746b(String str, String str2) {
        this.f340160c.put(str, str2);
    }
}
