package com.google.android.apps.gsa.staticplugins.p7402ap;

import com.google.android.apps.gsa.search.core.p6814o.p6815a.C86186a;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4125ay.C54646d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.ap.c */
/* compiled from: PG */
public final class C94038c implements C86186a {

    /* renamed from: a */
    public final SettableFuture f262675a = new SettableFuture();

    /* renamed from: b */
    private final C22871g f262676b;

    /* renamed from: c */
    private final AtomicBoolean f262677c = new AtomicBoolean(false);

    /* renamed from: d */
    private final C22870f f262678d;

    public C94038c(C22871g gVar) {
        C94030a aVar = new C94030a();
        this.f262676b = gVar;
        this.f262678d = aVar;
        C54646d.m87517d(C94037b.f262674a);
    }

    /* renamed from: a */
    public final void mo79826a() {
        if (!this.f262677c.getAndSet(true)) {
            this.f262675a.mo57358p(this.f262676b.mo28207g("Load library in background", this.f262678d));
        }
    }
}
