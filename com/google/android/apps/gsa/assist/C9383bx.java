package com.google.android.apps.gsa.assist;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.bx */
/* compiled from: PG */
final class C9383bx extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C9384by f32543a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9383bx(C9384by byVar) {
        super("TTS_IS_DONE", 1, 0);
        this.f32543a = byVar;
    }

    public final void run() {
        C59104x c = C9397cb.f32567a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
        ((C59052c) ((C59052c) c).mo56372aa('\'')).mo56386p("Pretending that tts is done");
        this.f32543a.mo17565b();
    }
}
