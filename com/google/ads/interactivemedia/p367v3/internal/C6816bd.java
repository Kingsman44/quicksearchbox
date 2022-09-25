package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bd */
/* compiled from: PG */
final class C6816bd implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C6818bf f21583a;

    /* renamed from: b */
    private final Handler f21584b;

    public C6816bd(C6818bf bfVar, Handler handler) {
        this.f21583a = bfVar;
        this.f21584b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f21584b.post(new C6815bc(this, i));
    }
}
