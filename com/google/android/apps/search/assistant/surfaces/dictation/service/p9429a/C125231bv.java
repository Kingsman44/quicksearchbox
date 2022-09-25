package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.speech.SpeechRecognizer;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.bv */
/* compiled from: PG */
final class C125231bv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C125234by f345445a;

    /* renamed from: b */
    final /* synthetic */ SpeechRecognizer f345446b;

    public C125231bv(C125234by byVar, SpeechRecognizer speechRecognizer) {
        this.f345445a = byVar;
        this.f345446b = speechRecognizer;
    }

    public final void run() {
        C59052c cVar = (C59052c) C125237ca.f345479a.mo56224b();
        C61301b a = C126290c.m206496a(this.f345445a.toString());
        cVar.mo56379ah(new C59094n(36456));
        cVar.mo56389s("Calling SpeechRecognizer.cancel() for %s [SD]", a);
        this.f345446b.cancel();
    }
}
