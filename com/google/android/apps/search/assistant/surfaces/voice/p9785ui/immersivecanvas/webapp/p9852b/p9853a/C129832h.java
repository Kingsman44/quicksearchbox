package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129749d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129750e;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.h */
/* compiled from: PG */
final class C129832h implements C57974a {

    /* renamed from: a */
    final /* synthetic */ C129834j f356214a;

    /* renamed from: b */
    private final C17360b f356215b;

    public C129832h(C129834j jVar, C17360b bVar) {
        this.f356214a = jVar;
        this.f356215b = bVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C67194al alVar = (C67194al) obj;
        ((C59052c) ((C59052c) C129834j.f356218a.mo56224b()).mo56372aa(38509)).mo56354G("%s TtsTimepoint onNext, ttsTimepoint=%s.", "[TtsTimepointSink]", alVar);
        C67193ak akVar = alVar.f182646b;
        if (akVar == null) {
            akVar = C67193ak.f182639c;
        }
        if ((akVar.f182641a & 8) != 0) {
            int i = alVar.f182645a & 4;
            if (i != 0) {
                C129750e eVar = this.f356214a.f356221b;
                C67193ak akVar2 = alVar.f182646b;
                if (akVar2 == null) {
                    akVar2 = C67193ak.f182639c;
                }
                if ((akVar2.f182641a & 8) != 0 && i != 0) {
                    DesugarAtomicReference.getAndUpdate(eVar.f356052a, new C129749d(alVar));
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38510)).mo56389s("%s Received ttsTimepoint without time seconds.", "[TtsTimepointSink]");
            return;
        }
        ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38511)).mo56389s("%s Received ttsTimepoint without position and/or name.", "[TtsTimepointSink]");
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56224b()).mo56372aa(38512)).mo56389s("%s TtsTimepoint stream started.", "[TtsTimepointSink]");
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56224b()).mo56372aa(38507)).mo56389s("%s TtsTimepoint stream closed.", "[TtsTimepointSink]");
        this.f356215b.mo23303b();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38508)).mo56389s("%s TtsTimepointSink failure.", "[TtsTimepointSink]");
    }
}
