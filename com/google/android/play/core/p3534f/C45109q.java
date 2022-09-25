package com.google.android.play.core.p3534f;

import android.util.Log;

/* renamed from: com.google.android.play.core.f.q */
/* compiled from: PG */
final class C45109q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C45111s f117779a;

    public C45109q(C45111s sVar) {
        this.f117779a = sVar;
    }

    public final void run() {
        try {
            this.f117779a.f117783b.mo48936j();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
