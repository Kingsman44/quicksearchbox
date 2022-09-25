package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.be */
/* compiled from: PG */
public final /* synthetic */ class C143757be implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f389740a;

    public /* synthetic */ C143757be(Handler handler) {
        this.f389740a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f389740a.post(runnable);
    }
}
