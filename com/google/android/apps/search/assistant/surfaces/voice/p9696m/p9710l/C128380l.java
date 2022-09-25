package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.l */
/* compiled from: PG */
public final /* synthetic */ class C128380l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128384p f353086a;

    public /* synthetic */ C128380l(C128384p pVar) {
        this.f353086a = pVar;
    }

    public final void run() {
        C128384p pVar = this.f353086a;
        pVar.f353098f = pVar.f353096d.mo57444a();
        pVar.f353097e = true;
        for (C67194al alVar = (C67194al) pVar.f353094b.pollFirst(); alVar != null; alVar = (C67194al) pVar.f353094b.pollFirst()) {
            pVar.mo108406c(alVar);
        }
    }
}
