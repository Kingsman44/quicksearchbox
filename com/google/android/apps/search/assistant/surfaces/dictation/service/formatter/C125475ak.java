package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126297af;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ak */
/* compiled from: PG */
public final /* synthetic */ class C125475ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125482ar f346019a;

    public /* synthetic */ C125475ak(C125482ar arVar) {
        this.f346019a = arVar;
    }

    public final C60870cx apply(Object obj) {
        C125482ar arVar = this.f346019a;
        Locale locale = (Locale) obj;
        C60870cx c = arVar.f346039d.mo106904c(locale);
        C47633f a = C125482ar.m205457a(arVar.f346039d.mo106902a(locale), "capitalization model", locale);
        C47633f a2 = C125482ar.m205457a(arVar.f346039d.mo106903b(locale), "capitalization vocab", locale);
        C47633f a3 = C125482ar.m205457a(arVar.f346039d.mo106908g(locale), "spoken punctuation model", locale);
        C47633f a4 = C125482ar.m205457a(arVar.f346039d.mo106907f(locale), "spoken punctuation config", locale);
        C47633f a5 = C125482ar.m205457a(arVar.f346039d.mo106906e(locale), "spoken emoji patterns", locale);
        C60870cx a6 = C47638k.m84753d(arVar.f346040e.mo107149a(), c, a, a2, a3, a4, a5).mo51520a(new C125480ap(arVar, locale, c, a, a2, a3, a4, a5), arVar.f346038c);
        C60856cj.m92911t(a6, new C126308aq(new C125481aq(locale), C126297af.f347956a), C60826bg.f164896a);
        return a6;
    }
}
