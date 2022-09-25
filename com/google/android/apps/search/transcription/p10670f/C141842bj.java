package com.google.android.apps.search.transcription.p10670f;

import com.google.android.libraries.assistant.soda.C19241ad;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;

/* renamed from: com.google.android.apps.search.transcription.f.bj */
/* compiled from: PG */
final class C141842bj implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C141845bm.f384915a.mo56226d()).mo56372aa(41905)).mo56386p("Soda recognizer failed to initialize. Should never happen.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C19389y yVar = (C19389y) obj;
        if (yVar.mo24536i()) {
            C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
            aqVar.copyOnWrite();
            ((C62910ar) aqVar.instance).f169860a = -1;
            ((C19241ad) yVar.f54240f.mo56107c()).mo24350q((C62910ar) aqVar.build());
        }
    }
}
