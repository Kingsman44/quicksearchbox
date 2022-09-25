package com.google.android.libraries.lens.view.p2113h.p2115b;

import android.os.Handler;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.util.concurrent.C60861co;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.h.b.h */
/* compiled from: PG */
public final class C26721h {
    /* renamed from: a */
    public static void m49397a(Handler handler, Runnable runnable, Duration duration) {
        SettableFuture settableFuture = new SettableFuture();
        handler.post(new C26720g(runnable, settableFuture));
        C60861co.m92917c(settableFuture, Exception.class, duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public static void m49398b(C27658e eVar, Handler handler) {
        handler.getLooper().dump(new C26719f(eVar), BuildConfig.FLAVOR);
    }
}
