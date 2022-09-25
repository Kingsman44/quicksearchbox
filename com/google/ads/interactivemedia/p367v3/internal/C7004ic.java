package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ic */
/* compiled from: PG */
final class C7004ic extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ C7005id f22353a;

    public C7004ic(C7005id idVar) {
        this.f22353a = idVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ary.m19464q(audioTrack == this.f22353a.f22354a.f22399r);
        if (this.f22353a.f22354a.f22396o != null && this.f22353a.f22354a.f22374R) {
            this.f22353a.f22354a.f22396o.mo15929c();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ary.m19464q(audioTrack == this.f22353a.f22354a.f22399r);
        if (this.f22353a.f22354a.f22396o != null && this.f22353a.f22354a.f22374R) {
            this.f22353a.f22354a.f22396o.mo15929c();
        }
    }
}
