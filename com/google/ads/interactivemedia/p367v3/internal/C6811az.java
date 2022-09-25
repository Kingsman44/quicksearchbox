package com.google.ads.interactivemedia.p367v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.az */
/* compiled from: PG */
final class C6811az extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6814bb f21574a;

    /* renamed from: b */
    private final C6813ba f21575b;

    /* renamed from: c */
    private final Handler f21576c;

    public C6811az(C6814bb bbVar, Handler handler, C6813ba baVar) {
        this.f21574a = bbVar;
        this.f21576c = handler;
        this.f21575b = baVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f21576c.post(this);
        }
    }

    public final void run() {
        if (this.f21574a.f21580c) {
            ((C6902ei) this.f21575b).f21990a.m20268ac(false, -1, 3);
        }
    }
}
