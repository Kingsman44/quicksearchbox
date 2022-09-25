package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14315er;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14318eu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bw */
/* compiled from: PG */
public final /* synthetic */ class C14835bw implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ PlaybackStateCompat f44671a;

    /* renamed from: b */
    public final /* synthetic */ C14315er f44672b;

    public /* synthetic */ C14835bw(PlaybackStateCompat playbackStateCompat, C14315er erVar) {
        this.f44671a = playbackStateCompat;
        this.f44672b = erVar;
    }

    public final void accept(Object obj, Object obj2) {
        PlaybackStateCompat playbackStateCompat = this.f44671a;
        C14315er erVar = this.f44672b;
        C14318eu euVar = (C14318eu) obj2;
        C59071e eVar = C14842cc.f44681a;
        if (C14842cc.m31214o(playbackStateCompat, ((Long) obj).longValue())) {
            erVar.copyOnWrite();
            C14320ew ewVar = (C14320ew) erVar.instance;
            C62962ci ciVar = C14320ew.f43316c;
            euVar.getClass();
            C62961ch chVar = ewVar.f43320b;
            if (!chVar.mo58948c()) {
                ewVar.f43320b = C62942bv.mutableCopy(chVar);
            }
            ewVar.f43320b.mo58916g(euVar.getNumber());
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
