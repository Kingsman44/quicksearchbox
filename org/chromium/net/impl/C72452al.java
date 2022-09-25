package org.chromium.net.impl;

import p000J.C0000N;

/* renamed from: org.chromium.net.impl.al */
/* compiled from: PG */
final class C72452al implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequestContext f192800a;

    public C72452al(CronetUrlRequestContext cronetUrlRequestContext) {
        this.f192800a = cronetUrlRequestContext;
    }

    public final void run() {
        CronetLibraryLoader.m107131b();
        synchronized (this.f192800a.f192747b) {
            CronetUrlRequestContext cronetUrlRequestContext = this.f192800a;
            C0000N.M6Dz0nZ5(cronetUrlRequestContext.f192749d, cronetUrlRequestContext);
        }
    }
}
