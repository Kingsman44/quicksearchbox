package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bs */
/* compiled from: PG */
final class C95368bs implements AutoCloseable {

    /* renamed from: a */
    public final C95355bf f266831a;

    /* renamed from: b */
    public final int f266832b;

    /* renamed from: c */
    public final byte[] f266833c;

    /* renamed from: d */
    public final SettableFuture f266834d = new SettableFuture();

    /* renamed from: e */
    public final int f266835e;

    public C95368bs(C95355bf bfVar, int i, int i2, byte[] bArr) {
        this.f266831a = bfVar;
        this.f266835e = i;
        this.f266832b = i2;
        this.f266833c = bArr;
    }

    public final void close() {
        this.f266834d.cancel(false);
    }
}
