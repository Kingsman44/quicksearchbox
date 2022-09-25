package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.facebook.litho.g.b.a */
/* compiled from: PG */
public final class C6299a implements C6318t {

    /* renamed from: a */
    static final C6308j f18584a = new C6307i().mo13308a();

    /* renamed from: f */
    static final C6300b f18585f = new C6300b();

    /* renamed from: g */
    public static final /* synthetic */ int f18586g = 0;

    /* renamed from: b */
    public int f18587b = 1;

    /* renamed from: c */
    public int f18588c = 2;

    /* renamed from: d */
    public int f18589d = 1;

    /* renamed from: e */
    public int f18590e = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: h */
    private C6308j f18591h = f18584a;

    /* renamed from: i */
    private final C6300b f18592i = f18585f;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6319u mo13301a() {
        C6301c cVar = new C6301c(this.f18587b, this.f18588c, this.f18591h, this.f18592i, this.f18590e);
        cVar.f18595c = Integer.MAX_VALUE;
        cVar.f18596d = this.f18589d;
        int i = cVar.f18594b;
        if (cVar.f18593a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return cVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo13302b(C6308j jVar) {
        this.f18591h = jVar;
    }
}
