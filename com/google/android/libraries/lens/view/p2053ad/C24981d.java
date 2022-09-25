package com.google.android.libraries.lens.view.p2053ad;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.ad.d */
/* compiled from: PG */
public final class C24981d {

    /* renamed from: a */
    public final Set f68139a = EnumSet.noneOf(C24980c.class);

    /* renamed from: b */
    public final Map f68140b = new EnumMap(C24980c.class);

    /* renamed from: c */
    private final Executor f68141c;

    static {
        C58974d.m91135i("LazyLoadController");
    }

    public C24981d(Executor executor) {
        this.f68141c = executor;
    }

    /* renamed from: c */
    private final void m46236c(Runnable runnable) {
        this.f68141c.execute(C47810es.m84977q(runnable));
    }

    /* renamed from: a */
    public final void mo30198a(C24980c cVar) {
        m46236c(new C24978a(this, cVar));
    }

    /* renamed from: b */
    public final void mo30199b(Runnable runnable, C24980c cVar) {
        m46236c(new C24979b(this, cVar, runnable));
    }
}
