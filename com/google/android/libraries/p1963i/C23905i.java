package com.google.android.libraries.p1963i;

import android.os.Build;
import android.os.Looper;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.i.i */
/* compiled from: PG */
public final /* synthetic */ class C23905i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f65385a;

    public /* synthetic */ C23905i(SettableFuture settableFuture) {
        this.f65385a = settableFuture;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        SettableFuture settableFuture = this.f65385a;
        try {
            Looper.prepare();
            settableFuture.mo57356n(Looper.myLooper());
            Looper.loop();
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                C19559g.m37302a().post(C23887d.f65357a);
            }
        } catch (Throwable th) {
            settableFuture.mo57356n(Looper.myLooper());
            throw th;
        }
    }
}
