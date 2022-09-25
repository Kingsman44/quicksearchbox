package com.google.android.apps.gsa.shared.util.p7159c;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.shared.util.c.c */
/* compiled from: PG */
public final class C90930c implements Executor {

    /* renamed from: a */
    public final Handler f254129a;

    public C90930c() {
        this.f254129a = new Handler(Looper.getMainLooper());
    }

    public C90930c(Handler handler) {
        this.f254129a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f254129a.post(runnable);
    }
}
