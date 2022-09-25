package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.os.MessageQueue;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.be */
/* compiled from: PG */
final class C90813be implements MessageQueue.IdleHandler {

    /* renamed from: a */
    final /* synthetic */ C90814bf f253942a;

    /* renamed from: b */
    private final C90936cf f253943b;

    public C90813be(C90814bf bfVar, C90936cf cfVar) {
        this.f253942a = bfVar;
        this.f253943b = cfVar;
    }

    public final boolean queueIdle() {
        this.f253942a.mo85154a(this.f253943b);
        C90814bf bfVar = this.f253942a;
        bfVar.f253944a.post(this.f253943b);
        return false;
    }
}
