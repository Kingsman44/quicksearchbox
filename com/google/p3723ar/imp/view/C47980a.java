package com.google.p3723ar.imp.view;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.ar.imp.view.a */
/* compiled from: PG */
public final /* synthetic */ class C47980a implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f124183a;

    public /* synthetic */ C47980a(Handler handler) {
        this.f124183a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f124183a.post(runnable);
    }
}
