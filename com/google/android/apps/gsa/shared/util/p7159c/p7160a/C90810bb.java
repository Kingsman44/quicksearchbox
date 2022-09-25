package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7159c.C90937cg;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bb */
/* compiled from: PG */
final class C90810bb implements Executor {

    /* renamed from: a */
    public final C90937cg f253937a;

    /* renamed from: b */
    private final C90814bf f253938b;

    public C90810bb(C90814bf bfVar, C90937cg cgVar) {
        this.f253938b = bfVar;
        this.f253937a = cgVar;
    }

    public final void execute(Runnable runnable) {
        if (runnable instanceof C90936cf) {
            this.f253938b.f253944a.post((C90936cf) runnable);
            return;
        }
        C90814bf bfVar = this.f253938b;
        bfVar.f253944a.post(new C90809ba(this, runnable));
    }
}
