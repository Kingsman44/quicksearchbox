package com.google.android.play.core.p3534f;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.p3538g.C45186u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.f.o */
/* compiled from: PG */
public final /* synthetic */ class C45107o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f117777a;

    public /* synthetic */ C45107o(Context context) {
        this.f117777a = context;
    }

    public final void run() {
        Context context = this.f117777a;
        AtomicReference atomicReference = C45111s.f117782a;
        try {
            C45186u.m80446f(context).mo48882e();
        } catch (SecurityException unused) {
            Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
        }
    }
}
