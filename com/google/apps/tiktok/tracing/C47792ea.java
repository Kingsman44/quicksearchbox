package com.google.apps.tiktok.tracing;

import android.os.MessageQueue;

/* renamed from: com.google.apps.tiktok.tracing.ea */
/* compiled from: PG */
public final /* synthetic */ class C47792ea implements MessageQueue.IdleHandler {

    /* renamed from: a */
    public final /* synthetic */ C47572bw f123787a;

    /* renamed from: b */
    public final /* synthetic */ MessageQueue.IdleHandler f123788b;

    public /* synthetic */ C47792ea(C47572bw bwVar, MessageQueue.IdleHandler idleHandler) {
        this.f123787a = bwVar;
        this.f123788b = idleHandler;
    }

    public final boolean queueIdle() {
        C47572bw bwVar = this.f123787a;
        MessageQueue.IdleHandler idleHandler = this.f123788b;
        int i = C47810es.f123822b;
        C47572bw h = C47831fm.m85013h(bwVar);
        try {
            return idleHandler.queueIdle();
        } finally {
            C47831fm.m85013h(h);
        }
    }
}
