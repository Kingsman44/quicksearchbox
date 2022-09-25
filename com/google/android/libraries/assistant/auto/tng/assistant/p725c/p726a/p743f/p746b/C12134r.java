package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.android.libraries.search.p3028l.C38569b;
import com.google.audio.hearing.common.OggOpusEncoder;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.r */
/* compiled from: PG */
public final /* synthetic */ class C12134r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12135s f38796a;

    public /* synthetic */ C12134r(C12135s sVar) {
        this.f38796a = sVar;
    }

    public final void run() {
        C12135s sVar = this.f38796a;
        C38569b.m67851a(sVar.f38798b, "ogg_opus_encoder");
        sVar.f38799c = new OggOpusEncoder();
        OggOpusEncoder oggOpusEncoder = sVar.f38799c;
        C12133q qVar = sVar.f38797a;
        oggOpusEncoder.mo54137b(qVar.f38791g, qVar.f38793i, qVar.f38790f);
    }
}
