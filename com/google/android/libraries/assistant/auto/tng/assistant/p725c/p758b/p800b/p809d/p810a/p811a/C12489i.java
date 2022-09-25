package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.common.base.C58838bb;
import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C12489i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12495o f39383a;

    /* renamed from: b */
    public final /* synthetic */ C57996c f39384b;

    public /* synthetic */ C12489i(C12495o oVar, C57996c cVar) {
        this.f39383a = oVar;
        this.f39384b = cVar;
    }

    public final void run() {
        C12495o oVar = this.f39383a;
        C57996c cVar = this.f39384b;
        C58838bb.m90884s(oVar.f39397d == null, "Can't stream multiple Sources to the same Sink!");
        oVar.f39397d = cVar;
    }
}
