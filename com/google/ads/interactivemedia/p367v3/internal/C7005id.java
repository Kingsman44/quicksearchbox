package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTrack;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.id */
/* compiled from: PG */
final class C7005id {

    /* renamed from: a */
    final /* synthetic */ C7006ie f22354a;

    /* renamed from: b */
    private final Handler f22355b = new Handler();

    /* renamed from: c */
    private final AudioTrack.StreamEventCallback f22356c = new C7004ic(this);

    public C7005id(C7006ie ieVar) {
        this.f22354a = ieVar;
    }

    /* renamed from: a */
    public final void mo16010a(AudioTrack audioTrack) {
        Handler handler = this.f22355b;
        handler.getClass();
        audioTrack.registerStreamEventCallback(C7003ib.m20666a(handler), this.f22356c);
    }

    /* renamed from: b */
    public final void mo16011b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f22356c);
        this.f22355b.removeCallbacksAndMessages((Object) null);
    }
}
