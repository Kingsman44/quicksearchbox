package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128368e;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128369f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.o */
/* compiled from: PG */
final class C128383o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C67194al f353090a;

    /* renamed from: b */
    final /* synthetic */ C128384p f353091b;

    public C128383o(C128384p pVar, C67194al alVar) {
        this.f353091b = pVar;
        this.f353090a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C128384p.f353092a.mo56226d()).mo56382g(th)).mo56372aa(37869)).mo56386p("Faied to post TTS timepoint to timepoint event queue.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C128369f fVar = (C128369f) obj;
        if (fVar == null) {
            ((C59052c) ((C59052c) C128384p.f353092a.mo56226d()).mo56372aa(37871)).mo56386p("Timepoint result is null.");
            return;
        }
        C128368e a = C128368e.m209480a(fVar.f353048b);
        if (a == null) {
            a = C128368e.UNKNOWN;
        }
        if (a != C128368e.SUCCESS) {
            C59052c cVar = (C59052c) ((C59052c) C128384p.f353092a.mo56226d()).mo56372aa(37870);
            C128368e a2 = C128368e.m209480a(fVar.f353048b);
            if (a2 == null) {
                a2 = C128368e.UNKNOWN;
            }
            cVar.mo56387q("Error posting timepoint to queue, code: %d", a2.f353044e);
            return;
        }
        C128384p pVar = this.f353091b;
        C67193ak akVar = this.f353090a.f182646b;
        if (akVar == null) {
            akVar = C67193ak.f182639c;
        }
        pVar.f353099g = akVar.f182642b;
    }
}
