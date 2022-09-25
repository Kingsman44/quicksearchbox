package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.j */
/* compiled from: PG */
final class C125254j implements C125191ai {

    /* renamed from: a */
    private final C2164c f345525a;

    /* renamed from: b */
    private boolean f345526b;

    /* renamed from: c */
    private boolean f345527c = false;

    /* renamed from: d */
    private final C126174c f345528d;

    /* renamed from: e */
    private final long f345529e;

    public C125254j(C2164c cVar, boolean z, C126174c cVar2, long j) {
        this.f345525a = cVar;
        this.f345526b = !z;
        this.f345528d = cVar2;
        this.f345529e = j;
    }

    /* renamed from: j */
    private final void m205156j() {
        if (!this.f345527c) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36417)).mo56386p("Waiting for onStartSuccessful(). [SD]");
        } else if (!this.f345526b) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36416)).mo56386p("Waiting for onRmsChanged(). [SD]");
        } else {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36415)).mo56386p("AiAi is available. [SD]");
            this.f345525a.mo5437b(C125072b.AIAI_AVAILABLE);
        }
    }

    /* renamed from: a */
    public final void mo106836a() {
        ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36418)).mo56389s("AiAi session has started for AiAi check #%s. [SD]", C126290c.m206496a(Long.valueOf(this.f345529e)));
        this.f345528d.mo107403b(this.f345529e);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo106837b(String str, boolean z, C58485gu guVar) {
        C69664n.m101061g(guVar, "resultAlternatives");
    }

    /* renamed from: d */
    public final void mo106839d(float f) {
        if (!this.f345526b) {
            this.f345526b = true;
            m205156j();
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo106840e() {
    }

    /* renamed from: f */
    public final void mo106841f(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56382g(th)).mo56372aa(36423)).mo56386p("AiAi unavailable due to SpeechRecognizer failure to start [SD]");
        this.f345525a.mo5437b(C125072b.AIAI_UNAVAILABLE_REASON_UNKNOWN);
    }

    /* renamed from: g */
    public final void mo106842g() {
        this.f345528d.mo107405d(this.f345529e);
        this.f345527c = true;
        m205156j();
    }

    /* renamed from: h */
    public final void mo106843h() {
    }

    /* renamed from: i */
    public final int mo106844i() {
        return 2;
    }

    /* renamed from: c */
    public final void mo106838c(int i) {
        if (i == 8) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56372aa(36420)).mo56386p("AiAi unavailable due to SpeechRecognizer error: ERROR_RECOGNIZER_BUSY [SD]");
            this.f345525a.mo5437b(C125072b.AIAI_UNAVAILABLE_RECOGNIZER_BUSY);
        } else if (i == 12) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36421)).mo56386p("AiAi unavailable due to SpeechRecognizer error: ERROR_LANGUAGE_NOT_SUPPORTED [SD]");
            this.f345525a.mo5437b(C125072b.AIAI_UNAVAILABLE_LANGUAGE_NOT_SUPPORTED);
        } else if (i != 13) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56372aa(36419)).mo56389s("AiAi unavailable due to SpeechRecognizer error: %s [SD]", C126290c.m206496a(Integer.valueOf(i)));
            this.f345525a.mo5437b(C125072b.AIAI_UNAVAILABLE_REASON_UNKNOWN);
        } else {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36422)).mo56386p("AiAi unavailable due to SpeechRecognizer error: ERROR_LANGUAGE_UNAVAILABLE [SD]");
            this.f345525a.mo5437b(C125072b.AIAI_UNAVAILABLE_LANGUAGE_PACK_NOT_INSTALLED);
        }
    }
}
