package com.google.research.xeno.effect;

import com.google.mediapipe.framework.Packet;

/* renamed from: com.google.research.xeno.effect.n */
/* compiled from: PG */
public final /* synthetic */ class C66411n implements C66417t {

    /* renamed from: a */
    public final /* synthetic */ Packet f180590a;

    /* renamed from: b */
    public final /* synthetic */ long f180591b;

    public /* synthetic */ C66411n(Packet packet, long j) {
        this.f180590a = packet;
        this.f180591b = j;
    }

    /* renamed from: a */
    public final void mo18708a(long j) {
        Packet packet = this.f180590a;
        long j2 = this.f180591b;
        String str = C66412o.f180592a;
        C66412o.nativeSendVideoProcessorAudioPacket(j, packet.getNativeHandle(), j2, C66409l.f180588a);
    }
}
