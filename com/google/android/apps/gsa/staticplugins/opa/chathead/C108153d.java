package com.google.android.apps.gsa.staticplugins.opa.chathead;

import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.d */
/* compiled from: PG */
public final class C108153d {

    /* renamed from: a */
    public final C83363m f300800a = new C83363m();

    /* renamed from: b */
    public final C108135a f300801b;

    /* renamed from: c */
    private final C22871g f300802c;

    /* renamed from: d */
    private boolean f300803d = false;

    public C108153d(C108135a aVar, C22871g gVar) {
        this.f300801b = aVar;
        this.f300802c = gVar;
    }

    /* renamed from: a */
    public final synchronized void mo96490a(Runnable runnable) {
        this.f300800a.mo76661a();
        this.f300803d = true;
        this.f300802c.mo28212l("subscribe", new C108152c(this, new C108151b(runnable)));
    }

    /* renamed from: b */
    public final synchronized void mo96491b() {
        this.f300803d = false;
        this.f300800a.mo76661a();
    }

    /* renamed from: c */
    public final synchronized boolean mo96492c() {
        return this.f300803d;
    }
}
