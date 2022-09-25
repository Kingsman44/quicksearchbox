package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.TextToSpeech;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.o */
/* compiled from: PG */
public final /* synthetic */ class C147667o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ TextToSpeech f398524a;

    /* renamed from: b */
    public final /* synthetic */ C68193f f398525b;

    /* renamed from: c */
    public final /* synthetic */ C147743y f398526c;

    /* renamed from: d */
    public final /* synthetic */ C147664l f398527d;

    public /* synthetic */ C147667o(TextToSpeech textToSpeech, C68193f fVar, C147743y yVar, C147664l lVar) {
        this.f398524a = textToSpeech;
        this.f398525b = fVar;
        this.f398526c = yVar;
        this.f398527d = lVar;
    }

    public final C60870cx apply(Object obj) {
        TextToSpeech textToSpeech = this.f398524a;
        C68193f fVar = this.f398525b;
        C147743y yVar = this.f398526c;
        C147664l lVar = this.f398527d;
        if (((Boolean) obj).booleanValue()) {
            textToSpeech.setLanguage(new Locale.Builder().setLanguage(fVar.f184516b).build());
            C68189by byVar = yVar.f398680c;
            if (byVar == null) {
                byVar = C68189by.f184505b;
            }
            Optional findFirst = Collection.EL.stream(byVar.f184507a).filter(new C147671s(fVar)).findFirst();
            if (findFirst.isEmpty()) {
                return C60856cj.m92900i(new C147673u(textToSpeech, fVar));
            }
            C60870cx b = lVar.mo124407b();
            C147665m mVar = new C147665m(findFirst, textToSpeech, fVar);
            return C60922j.m93044g(b, C47810es.m84963c(mVar), C60826bg.f164896a);
        }
        textToSpeech.shutdown();
        throw new IllegalArgumentException(String.format("Unsupported language %s", new Object[]{fVar.f184516b}));
    }
}
