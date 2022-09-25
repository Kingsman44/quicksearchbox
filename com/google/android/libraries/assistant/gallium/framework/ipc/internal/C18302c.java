package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65653ah;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.internal.c */
/* compiled from: PG */
public final /* synthetic */ class C18302c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18306g f51934a;

    /* renamed from: b */
    public final /* synthetic */ C65648ac f51935b;

    /* renamed from: c */
    public final /* synthetic */ long f51936c;

    public /* synthetic */ C18302c(C18306g gVar, C65648ac acVar, long j) {
        this.f51934a = gVar;
        this.f51935b = acVar;
        this.f51936c = j;
    }

    public final void run() {
        C65653ah ahVar;
        C18306g gVar = this.f51934a;
        C65648ac acVar = this.f51935b;
        long j = this.f51936c;
        if (acVar.f178383b == 2) {
            ahVar = (C65653ah) acVar.f178384c;
        } else {
            ahVar = C65653ah.f178394c;
        }
        SettableFuture settableFuture = (SettableFuture) gVar.f51942c.remove(Long.valueOf(j));
        if (settableFuture != null) {
            settableFuture.mo57356n(ahVar);
        }
    }
}
