package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.n */
/* compiled from: PG */
public final class C120406n implements Closeable {

    /* renamed from: a */
    public final C60870cx f334912a;

    /* renamed from: b */
    public final AtomicBoolean f334913b = new AtomicBoolean();

    /* renamed from: c */
    private final C37325aa f334914c;

    public C120406n(C37325aa aaVar) {
        this.f334914c = aaVar;
        C60870cx cxVar = ((C37488j) aaVar).f99525e;
        C120403k kVar = new C120403k(this);
        this.f334912a = C60922j.m93044g(cxVar, C47810es.m84963c(kVar), C60826bg.f164896a);
    }

    public final void close() {
        if (!this.f334913b.getAndSet(true)) {
            this.f334914c.mo40883b();
        }
    }
}
