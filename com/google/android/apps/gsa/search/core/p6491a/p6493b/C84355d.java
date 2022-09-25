package com.google.android.apps.gsa.search.core.p6491a.p6493b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.core.a.b.d */
/* compiled from: PG */
final class C84355d implements C85386a {

    /* renamed from: a */
    public final SettableFuture f229575a = new SettableFuture();

    /* renamed from: b */
    private final C85386a f229576b;

    public C84355d(C85386a aVar) {
        this.f229576b = aVar;
    }

    /* renamed from: a */
    public final void mo77892a() {
        if (!this.f229575a.isDone()) {
            this.f229575a.mo57356n(C118826c.f331422a);
        }
        this.f229576b.mo77892a();
    }

    /* renamed from: b */
    public final void mo77893b(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229576b.mo77893b(str);
    }
}
