package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.shared.aa.ac */
/* compiled from: PG */
final class C89005ac implements C89068x {

    /* renamed from: a */
    private final Object f241195a = new Object();

    /* renamed from: b */
    private final ByteBuffer f241196b;

    /* renamed from: c */
    private final C89052h f241197c;

    public C89005ac(ByteBuffer byteBuffer, C89052h hVar) {
        this.f241196b = byteBuffer;
        this.f241197c = hVar;
    }

    /* renamed from: a */
    public final int mo27471a() {
        int limit;
        synchronized (this.f241195a) {
            limit = this.f241196b.limit();
        }
        return limit;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        C89051g gVar;
        synchronized (this.f241195a) {
            if (this.f241196b.hasRemaining()) {
                ByteBuffer b = this.f241197c.mo83029b();
                C89049e.m144833a(this.f241196b, b);
                gVar = this.f241197c.mo83028a(b);
            } else {
                gVar = C89051g.f241328a;
            }
        }
        return C60856cj.m92900i(gVar);
    }

    /* renamed from: d */
    public final void mo27475d() {
    }

    /* renamed from: e */
    public final C89068x clone() {
        ByteBuffer duplicate;
        synchronized (this.f241195a) {
            duplicate = this.f241196b.duplicate();
            duplicate.rewind();
        }
        return new C89005ac(duplicate, this.f241197c);
    }

    /* renamed from: f */
    public final boolean mo27477f() {
        return true;
    }
}
