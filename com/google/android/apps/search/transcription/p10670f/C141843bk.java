package com.google.android.apps.search.transcription.p10670f;

import com.google.android.libraries.assistant.soda.C19389y;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.transcription.f.bk */
/* compiled from: PG */
final class C141843bk implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141844bl f384913a;

    public C141843bk(C141844bl blVar) {
        this.f384913a = blVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C141845bm.f384915a.mo56226d()).mo56372aa(41906)).mo56386p("Soda recognizer failed to initialize. Should never happen.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C19389y yVar = (C19389y) obj;
        C62910ar arVar = this.f384913a.f384914a.f384921g;
        if (arVar.f169860a == -1) {
            C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
            aqVar.copyOnWrite();
            ((C62910ar) aqVar.instance).f169860a = 0;
            C62910ar arVar2 = (C62910ar) aqVar.build();
            C62948a.m95465p(arVar2);
            yVar.mo24534g(arVar2);
            return;
        }
        yVar.mo24534g(arVar);
    }
}
