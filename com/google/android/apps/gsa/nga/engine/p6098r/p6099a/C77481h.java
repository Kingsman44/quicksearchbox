package com.google.android.apps.gsa.nga.engine.p6098r.p6099a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.r.a.h */
/* compiled from: PG */
public final class C77481h {

    /* renamed from: a */
    public static final C59071e f213527a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.r.a.h");

    /* renamed from: b */
    public final Executor f213528b;

    /* renamed from: c */
    public final AtomicBoolean f213529c = new AtomicBoolean(false);

    /* renamed from: d */
    public final ArrayList f213530d = new ArrayList();

    public C77481h(Executor executor) {
        this.f213528b = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo72586a() {
        C77475b bVar = new C77475b(this);
        return C60856cj.m92905n(C47810es.m84965e(bVar), this.f213528b);
    }

    /* renamed from: b */
    public final void mo72587b(boolean z) {
        C77473a aVar = new C77473a(this, z);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), this.f213528b);
        C77476c cVar = new C77476c();
        C60856cj.m92911t(m, C47810es.m84974n(cVar), this.f213528b);
    }
}
