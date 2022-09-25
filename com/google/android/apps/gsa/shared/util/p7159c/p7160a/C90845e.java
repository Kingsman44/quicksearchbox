package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C90845e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90846f f254020a;

    /* renamed from: b */
    public final /* synthetic */ C90804aw f254021b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f254022c;

    public /* synthetic */ C90845e(C90846f fVar, C90804aw awVar, Runnable runnable) {
        this.f254020a = fVar;
        this.f254021b = awVar;
        this.f254022c = runnable;
    }

    public final void run() {
        C90846f fVar = this.f254020a;
        C90804aw awVar = this.f254021b;
        Runnable runnable = this.f254022c;
        fVar.f254023a.mo85158c(awVar);
        try {
            runnable.run();
        } finally {
            fVar.f254023a.mo85157b(awVar);
        }
    }
}
