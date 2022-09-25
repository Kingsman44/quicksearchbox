package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.util.function.Consumer;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.e */
/* compiled from: PG */
public final class C125275e implements C70862aj {

    /* renamed from: a */
    public final C71604be f345601a;

    /* renamed from: b */
    public final Consumer f345602b;

    /* renamed from: c */
    public final C71788b f345603c = new C71799m();

    /* renamed from: d */
    private final C71422aw f345604d;

    public C125275e(C71422aw awVar, C71604be beVar, Consumer consumer) {
        C69664n.m101061g(awVar, "scope");
        this.f345604d = awVar;
        this.f345601a = beVar;
        this.f345602b = consumer;
    }

    /* renamed from: d */
    private final void m205198d(C69626l lVar) {
        C71803m.m105043d(this.f345604d, (C69585o) null, C71424ay.UNDISPATCHED, new C125274d(this, lVar, (C69577g) null), 1);
    }

    /* renamed from: a */
    public final void mo20121a() {
        m205198d(C125271a.f345592a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        m205198d(new C125272b(th));
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        m205198d(new C125273c(obj));
    }
}
