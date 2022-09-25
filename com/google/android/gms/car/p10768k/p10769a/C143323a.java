package com.google.android.gms.car.p10768k.p10769a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.car.k.a.a */
/* compiled from: PG */
public final class C143323a implements Executor {

    /* renamed from: a */
    private final Handler f388549a;

    public C143323a(Handler handler) {
        this.f388549a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f388549a.post(runnable);
    }
}
