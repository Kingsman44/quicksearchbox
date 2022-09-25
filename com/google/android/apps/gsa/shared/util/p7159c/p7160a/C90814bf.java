package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.os.Handler;
import android.os.MessageQueue;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bf */
/* compiled from: PG */
public final class C90814bf {

    /* renamed from: a */
    public final Handler f253944a;

    /* renamed from: b */
    public final MessageQueue f253945b;

    /* renamed from: c */
    public final Map f253946c = new HashMap(10);

    public C90814bf(Handler handler, MessageQueue messageQueue) {
        this.f253944a = handler;
        this.f253945b = messageQueue;
    }

    /* renamed from: a */
    public final MessageQueue.IdleHandler mo85154a(C90936cf cfVar) {
        synchronized (this.f253946c) {
            if (!this.f253946c.containsKey(cfVar)) {
                return null;
            }
            MessageQueue.IdleHandler idleHandler = (MessageQueue.IdleHandler) this.f253946c.remove(cfVar);
            return idleHandler;
        }
    }

    /* renamed from: b */
    public final void mo85155b(C90936cf cfVar) {
        this.f253944a.removeCallbacks(cfVar);
        MessageQueue.IdleHandler a = mo85154a(cfVar);
        if (a != null) {
            this.f253945b.removeIdleHandler(a);
        }
    }
}
