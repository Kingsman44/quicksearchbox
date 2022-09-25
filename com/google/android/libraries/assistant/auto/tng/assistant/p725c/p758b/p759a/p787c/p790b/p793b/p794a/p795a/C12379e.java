package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.e */
/* compiled from: PG */
final class C12379e implements C57981b {

    /* renamed from: a */
    public final List f39210a;

    /* renamed from: b */
    public final Set f39211b;

    /* renamed from: c */
    public final Executor f39212c;

    /* renamed from: d */
    public final C15481g f39213d;

    /* renamed from: e */
    public boolean f39214e;

    /* renamed from: f */
    private final Executor f39215f;

    public C12379e(Set set, Executor executor, C15481g gVar) {
        this.f39211b = set;
        this.f39210a = new ArrayList(set.size());
        this.f39212c = executor;
        this.f39215f = new C60904dr(executor);
        this.f39213d = gVar;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C12376b bVar = new C12376b(this, aVar);
        return C60856cj.m92905n(C47810es.m84965e(bVar), this.f39215f);
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        C12377c cVar = new C12377c(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(cVar), this.f39215f), "Failed to close Source", new Object[0]);
    }
}
