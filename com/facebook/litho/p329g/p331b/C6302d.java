package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.facebook.litho.g.b.d */
/* compiled from: PG */
public final class C6302d implements C6318t {

    /* renamed from: a */
    static final C6308j f18599a = new C6307i().mo13308a();

    /* renamed from: d */
    static final C6303e f18600d = new C6303e();

    /* renamed from: e */
    public static final /* synthetic */ int f18601e = 0;

    /* renamed from: b */
    public int f18602b = 1;

    /* renamed from: c */
    public int f18603c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: f */
    private C6308j f18604f = f18599a;

    /* renamed from: g */
    private final C6303e f18605g = f18600d;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6319u mo13301a() {
        C6304f fVar = new C6304f(this.f18602b, this.f18603c, this.f18604f, this.f18605g);
        fVar.f18608c = Integer.MAX_VALUE;
        fVar.f18609d = 1;
        int i = fVar.f18607b;
        if (fVar.f18606a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return fVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo13302b(C6308j jVar) {
        this.f18604f = jVar;
    }
}
