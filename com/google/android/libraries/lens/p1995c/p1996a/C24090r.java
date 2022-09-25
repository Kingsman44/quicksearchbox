package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.c.a.r */
/* compiled from: PG */
final class C24090r implements Executor {

    /* renamed from: a */
    public final Handler f65791a;

    public C24090r(Handler handler) {
        this.f65791a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f65791a.post(runnable);
    }
}
