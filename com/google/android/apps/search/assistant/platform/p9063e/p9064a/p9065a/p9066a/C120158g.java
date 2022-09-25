package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32567d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67175t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C120158g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C120163l f334413a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334414b;

    /* renamed from: c */
    public final /* synthetic */ C67050je f334415c;

    public /* synthetic */ C120158g(C120163l lVar, Consumer consumer, C67050je jeVar) {
        this.f334413a = lVar;
        this.f334414b = consumer;
        this.f334415c = jeVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C120163l lVar = this.f334413a;
        Consumer consumer = this.f334414b;
        C67050je jeVar = this.f334415c;
        C119891j jVar = C119891j.DEFAULT_AUDIO_ENCODING;
        int ordinal = lVar.f334424b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            C67073ka kaVar = jeVar.f182266c;
            if (kaVar == null) {
                kaVar = C67073ka.f182324f;
            }
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            return C120163l.m199094b(pVar.f182578b, consumer);
        } else if (ordinal != 2) {
            return C60856cj.m92899h(new IllegalArgumentException("invalid encoding"));
        } else {
            C67073ka kaVar2 = jeVar.f182266c;
            if (kaVar2 == null) {
                kaVar2 = C67073ka.f182324f;
            }
            C67171p pVar2 = kaVar2.f182327b;
            if (pVar2 == null) {
                pVar2 = C67171p.f182575e;
            }
            C67175t tVar = pVar2.f182579c;
            if (tVar == null) {
                tVar = C67175t.f182588e;
            }
            return lVar.f334426d.mo38148a(lVar.f334428f.mo66631a(new C32567d(tVar.f182592c, tVar.f182593d)), new C120152a(jeVar), new C120154c(consumer));
        }
    }
}
