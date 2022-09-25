package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.f */
/* compiled from: PG */
public class C90846f implements C90858r {

    /* renamed from: a */
    public final C90815bg f254023a;

    /* renamed from: b */
    private final Executor f254024b;

    public C90846f(Executor executor, C90815bg bgVar) {
        this.f254024b = executor;
        this.f254023a = bgVar;
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        this.f254024b.execute(new C90845e(this, this.f254023a.mo85156a(crVar, 0), runnable));
    }
}
