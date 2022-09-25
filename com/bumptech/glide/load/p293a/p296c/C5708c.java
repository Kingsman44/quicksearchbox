package com.bumptech.glide.load.p293a.p296c;

import android.os.StrictMode;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.a.c.c */
/* compiled from: PG */
final class C5708c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f17193a;

    /* renamed from: b */
    final /* synthetic */ C5709d f17194b;

    public C5708c(C5709d dVar, Runnable runnable) {
        this.f17194b = dVar;
        this.f17193a = runnable;
    }

    public final void run() {
        if (this.f17194b.f17195a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.f17193a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
