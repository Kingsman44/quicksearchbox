package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarCollections;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.c.d */
/* compiled from: PG */
public final class C13436d {

    /* renamed from: a */
    public static final C59071e f41265a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.c.c.d");

    /* renamed from: b */
    public final Map f41266b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final C60888db f41267c;

    /* renamed from: d */
    private final C69464a f41268d;

    public C13436d(C60888db dbVar, C69464a aVar) {
        this.f41267c = dbVar;
        this.f41268d = aVar;
    }

    /* renamed from: a */
    public final long mo21090a(C13435c cVar) {
        long nextLong = C58851bo.f156649a.nextLong();
        this.f41266b.put(Long.valueOf(nextLong), cVar);
        C46459k.m82829b(this.f41267c.mo29164d(C47810es.m84977q(new C13434b(this, nextLong)), ((Long) this.f41268d.mo17428b()).longValue(), TimeUnit.SECONDS), "Failed to schedule eviction task", new Object[0]);
        return nextLong;
    }
}
