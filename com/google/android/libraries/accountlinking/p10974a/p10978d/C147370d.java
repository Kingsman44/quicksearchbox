package com.google.android.libraries.accountlinking.p10974a.p10978d;

import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;

/* renamed from: com.google.android.libraries.accountlinking.a.d.d */
/* compiled from: PG */
public final /* synthetic */ class C147370d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C147371e f397814a;

    public /* synthetic */ C147370d(C147371e eVar) {
        this.f397814a = eVar;
    }

    public final void run() {
        C147371e eVar = this.f397814a;
        if (!eVar.f397822g) {
            eVar.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_DISMISS);
            C147372e eVar2 = eVar.f397820e;
            eVar2.f397826a.mo5706i(C147366d.m240280b(110));
            return;
        }
        eVar.f397822g = false;
    }
}
