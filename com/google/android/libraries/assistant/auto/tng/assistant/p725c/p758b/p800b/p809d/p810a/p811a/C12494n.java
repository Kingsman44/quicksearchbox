package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C12494n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12495o f39391a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f39392b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f39393c;

    public /* synthetic */ C12494n(C12495o oVar, Runnable runnable, Throwable th) {
        this.f39391a = oVar;
        this.f39392b = runnable;
        this.f39393c = th;
    }

    public final void run() {
        C12495o oVar = this.f39391a;
        Runnable runnable = this.f39392b;
        Throwable th = this.f39393c;
        oVar.f39398e = true;
        runnable.run();
        if (th != null) {
            C2164c cVar = oVar.f39396c;
            cVar.getClass();
            cVar.mo5439d(th);
            return;
        }
        C2164c cVar2 = oVar.f39396c;
        cVar2.getClass();
        cVar2.mo5437b((Object) null);
    }
}
