package com.android.p275j;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.j.h */
/* compiled from: PG */
final class C5196h implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f16493a;

    public C5196h(Handler handler) {
        this.f16493a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f16493a.post(runnable);
    }
}
