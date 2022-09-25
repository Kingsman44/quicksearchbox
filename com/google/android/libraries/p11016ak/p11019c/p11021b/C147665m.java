package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.m */
/* compiled from: PG */
public final /* synthetic */ class C147665m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Optional f398520a;

    /* renamed from: b */
    public final /* synthetic */ TextToSpeech f398521b;

    /* renamed from: c */
    public final /* synthetic */ C68193f f398522c;

    public /* synthetic */ C147665m(Optional optional, TextToSpeech textToSpeech, C68193f fVar) {
        this.f398520a = optional;
        this.f398521b = textToSpeech;
        this.f398522c = fVar;
    }

    public final Object apply(Object obj) {
        Optional optional = this.f398520a;
        TextToSpeech textToSpeech = this.f398521b;
        C68193f fVar = this.f398522c;
        Optional findAny = Collection.EL.stream((C58485gu) obj).filter(new C147668p((C68183bs) optional.get())).findAny();
        if (findAny.isEmpty()) {
            textToSpeech.shutdown();
            Object[] objArr = new Object[2];
            C68185bu buVar = ((C68183bs) optional.get()).f184496b;
            if (buVar == null) {
                buVar = C68185bu.f184497d;
            }
            objArr[0] = buVar.f184499a;
            objArr[1] = fVar.f184516b;
            throw new IllegalArgumentException(String.format("Unsupported voice %s for language %s", objArr));
        }
        textToSpeech.setVoice((Voice) findAny.get());
        return new C147673u(textToSpeech, fVar);
    }
}
