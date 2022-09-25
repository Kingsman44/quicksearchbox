package com.google.android.libraries.lens.view.gleam;

import android.os.Trace;

/* renamed from: com.google.android.libraries.lens.view.gleam.cq */
/* compiled from: PG */
public final /* synthetic */ class C26512cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72252a;

    public /* synthetic */ C26512cq(C26526dd ddVar) {
        this.f72252a = ddVar;
    }

    public final void run() {
        C26526dd ddVar = this.f72252a;
        Trace.beginSection("onServerErrorTask");
        ddVar.f72296f.mo30775i(C26504ci.f72203e);
        Trace.endSection();
    }
}
