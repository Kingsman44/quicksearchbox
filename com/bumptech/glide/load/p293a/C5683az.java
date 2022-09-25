package com.bumptech.glide.load.p293a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bumptech.glide.load.a.az */
/* compiled from: PG */
public final class C5683az {

    /* renamed from: a */
    private boolean f17148a;

    /* renamed from: b */
    private final Handler f17149b = new Handler(Looper.getMainLooper(), new C5682ay());

    /* renamed from: a */
    public final synchronized void mo12187a(C5679av avVar, boolean z) {
        if (!this.f17148a) {
            if (!z) {
                this.f17148a = true;
                avVar.mo12162e();
                this.f17148a = false;
                return;
            }
        }
        this.f17149b.obtainMessage(1, avVar).sendToTarget();
    }
}
