package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.p2703l.C34798l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.d.k */
/* compiled from: PG */
public final class C119692k {

    /* renamed from: a */
    public static final C59071e f333497a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.a.b.a.d.k");

    /* renamed from: b */
    public final C34798l f333498b;

    /* renamed from: c */
    public final Executor f333499c;

    /* renamed from: d */
    public final Executor f333500d;

    /* renamed from: e */
    public final Object f333501e = new Object();

    /* renamed from: f */
    public final Map f333502f = new HashMap();

    /* renamed from: g */
    public C34793g f333503g;

    /* renamed from: h */
    public boolean f333504h = false;

    /* renamed from: i */
    public final C33447g f333505i;

    public C119692k(C33447g gVar, C34798l lVar, Executor executor) {
        this.f333505i = gVar;
        this.f333498b = lVar;
        this.f333499c = executor;
        this.f333500d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C32534ai mo104481a(String str) {
        return (C32534ai) Map.EL.computeIfAbsent(this.f333502f, str, new C119687f(this));
    }

    /* renamed from: b */
    public final void mo104482b(Throwable th) {
        this.f333500d.execute(C47810es.m84977q(new C119685d(this, th)));
    }
}
