package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120783a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.f */
/* compiled from: PG */
public final class C120789f implements C120783a {

    /* renamed from: a */
    public static final C59071e f335917a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.l.a.f");

    /* renamed from: b */
    public final Executor f335918b;

    /* renamed from: c */
    public final C120794j f335919c;

    /* renamed from: d */
    public C120792i f335920d;

    /* renamed from: e */
    public boolean f335921e = false;

    /* renamed from: f */
    private boolean f335922f = false;

    /* renamed from: g */
    private final C33447g f335923g;

    public C120789f(Executor executor, C33447g gVar, C120794j jVar) {
        this.f335918b = new C60904dr(executor);
        this.f335923g = gVar;
        this.f335919c = jVar;
    }

    /* renamed from: c */
    private final void m199984c() {
        if (!this.f335922f) {
            this.f335923g.mo38849b(new C120785b(this));
            this.f335922f = true;
        }
    }

    /* renamed from: a */
    public final C60870cx mo104932a() {
        m199984c();
        C120786c cVar = new C120786c(this);
        return C60856cj.m92905n(C47810es.m84965e(cVar), this.f335918b);
    }

    /* renamed from: b */
    public final void mo104933b(C120811d dVar, boolean z) {
        m199984c();
        this.f335918b.execute(C47810es.m84977q(new C120787d(this, dVar, z)));
    }
}
