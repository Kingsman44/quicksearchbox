package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.d.a.r */
/* compiled from: PG */
public final class C32525r {

    /* renamed from: a */
    public final C32524q f87124a;

    /* renamed from: b */
    public final C32508a f87125b;

    /* renamed from: c */
    public boolean f87126c = false;

    /* renamed from: d */
    public final HashMap f87127d = new HashMap();

    /* renamed from: e */
    private final Executor f87128e;

    public C32525r(C32508a aVar, C32524q qVar, Executor executor) {
        this.f87124a = qVar;
        this.f87128e = new C60904dr(executor);
        this.f87125b = aVar;
    }

    /* renamed from: a */
    public final void mo38127a() {
        this.f87128e.execute(C47810es.m84977q(new C32522o(this)));
    }

    /* renamed from: b */
    public final void mo38128b(C32510c cVar) {
        int i = cVar.f87089b;
        int i2 = 3;
        if (i != 0) {
            i2 = i != 2 ? i != 3 ? 0 : 2 : 1;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C60856cj.m92911t(C60856cj.m92905n(C47810es.m84965e(new C32520m(this, cVar)), this.f87128e), C47810es.m84974n(new C32523p(this, cVar)), this.f87128e);
        } else if (i3 == 1) {
            this.f87128e.execute(C47810es.m84977q(new C32521n(this, cVar)));
        }
    }
}
