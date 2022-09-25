package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.bt */
/* compiled from: PG */
final class C125229bt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SpeechRecognizer f345437a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345438b;

    /* renamed from: c */
    final /* synthetic */ C125234by f345439c;

    /* renamed from: d */
    final /* synthetic */ Intent f345440d;

    public C125229bt(SpeechRecognizer speechRecognizer, C125234by byVar, C125234by byVar2, Intent intent) {
        this.f345437a = speechRecognizer;
        this.f345438b = byVar;
        this.f345439c = byVar2;
        this.f345440d = intent;
    }

    public final void run() {
        this.f345437a.setRecognitionListener(this.f345438b.f345466l);
        C59052c cVar = (C59052c) C125237ca.f345479a.mo56224b();
        C61301b a = C126290c.m206496a(this.f345439c.toString());
        cVar.mo56379ah(new C59094n(36455));
        cVar.mo56389s("Calling SpeechRecognizer.startListening() for %s [SD]", a);
        this.f345437a.startListening(this.f345440d);
    }
}
