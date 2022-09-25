package com.google.research.xeno.effect;

import com.google.mediapipe.framework.Packet;

/* renamed from: com.google.research.xeno.effect.j */
/* compiled from: PG */
public final /* synthetic */ class C66407j implements C66417t {

    /* renamed from: a */
    public final /* synthetic */ Packet f180584a;

    /* renamed from: b */
    public final /* synthetic */ long f180585b;

    public /* synthetic */ C66407j(Packet packet, long j) {
        this.f180584a = packet;
        this.f180585b = j;
    }

    /* renamed from: a */
    public final void mo18708a(long j) {
        Packet packet = this.f180584a;
        long j2 = this.f180585b;
        String str = C66412o.f180592a;
        C66412o.nativeSendVideoProcessorFramePacket(j, packet.getNativeHandle(), j2, C66410m.f180589a);
    }
}
