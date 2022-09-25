package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C12377c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12379e f39208a;

    public /* synthetic */ C12377c(C12379e eVar) {
        this.f39208a = eVar;
    }

    public final void run() {
        C12379e eVar = this.f39208a;
        eVar.f39214e = true;
        for (C60870cx cancel : eVar.f39210a) {
            cancel.cancel(true);
        }
    }
}
