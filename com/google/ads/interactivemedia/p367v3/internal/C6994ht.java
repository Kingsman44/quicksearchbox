package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ht */
/* compiled from: PG */
public abstract class C6994ht implements C6971gx {

    /* renamed from: b */
    protected C6969gv f22313b;

    /* renamed from: c */
    protected C6969gv f22314c;

    /* renamed from: d */
    private C6969gv f22315d = C6969gv.f22231a;

    /* renamed from: e */
    private C6969gv f22316e;

    /* renamed from: f */
    private ByteBuffer f22317f;

    /* renamed from: g */
    private ByteBuffer f22318g;

    /* renamed from: h */
    private boolean f22319h;

    public C6994ht() {
        ByteBuffer byteBuffer = f22236a;
        this.f22317f = byteBuffer;
        this.f22318g = byteBuffer;
        C6969gv gvVar = C6969gv.f22231a;
        this.f22316e = gvVar;
        this.f22313b = gvVar;
        this.f22314c = gvVar;
    }

    /* renamed from: a */
    public final C6969gv mo15892a(C6969gv gvVar) {
        this.f22315d = gvVar;
        this.f22316e = mo15985k(gvVar);
        return mo15893b() ? this.f22316e : C6969gv.f22231a;
    }

    /* renamed from: b */
    public boolean mo15893b() {
        return this.f22316e != C6969gv.f22231a;
    }

    /* renamed from: d */
    public final void mo15895d() {
        this.f22319h = true;
        mo15986l();
    }

    /* renamed from: e */
    public ByteBuffer mo15896e() {
        ByteBuffer byteBuffer = this.f22318g;
        this.f22318g = f22236a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo15897f() {
        return this.f22319h && this.f22318g == f22236a;
    }

    /* renamed from: g */
    public final void mo15898g() {
        this.f22318g = f22236a;
        this.f22319h = false;
        this.f22313b = this.f22315d;
        this.f22314c = this.f22316e;
        mo15987m();
    }

    /* renamed from: h */
    public final void mo15899h() {
        mo15898g();
        this.f22317f = f22236a;
        this.f22315d = C6969gv.f22231a;
        C6969gv gvVar = C6969gv.f22231a;
        this.f22316e = gvVar;
        this.f22313b = gvVar;
        this.f22314c = gvVar;
        mo15988n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final ByteBuffer mo15983i(int i) {
        if (this.f22317f.capacity() < i) {
            this.f22317f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f22317f.clear();
        }
        ByteBuffer byteBuffer = this.f22317f;
        this.f22318g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo15984j() {
        return this.f22318g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C6969gv mo15985k(C6969gv gvVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo15986l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo15987m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo15988n() {
    }
}
