package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.TextToSpeech;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.r */
/* compiled from: PG */
public final /* synthetic */ class C147670r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C68193f f398530a;

    /* renamed from: b */
    public final /* synthetic */ C147743y f398531b;

    public /* synthetic */ C147670r(C68193f fVar, C147743y yVar) {
        this.f398530a = fVar;
        this.f398531b = yVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C68193f fVar = this.f398530a;
        C147743y yVar = this.f398531b;
        TextToSpeech textToSpeech = (TextToSpeech) obj;
        C147664l lVar = new C147664l(C60856cj.m92900i(textToSpeech));
        String str = fVar.f184516b;
        if (str.isEmpty()) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = C60922j.m93044g(lVar.mo124406a(), new C147663k(str), C60826bg.f164896a);
        }
        C147667o oVar = new C147667o(textToSpeech, fVar, yVar, lVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(oVar), C60826bg.f164896a);
    }
}
