package com.google.android.libraries.lens.sdk.p2038a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.sdk.a.l */
/* compiled from: PG */
public final class C24837l implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f67873a;

    public C24837l(Handler handler) {
        this.f67873a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f67873a.post(runnable);
    }
}
