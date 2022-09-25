package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.h */
/* compiled from: PG */
final class C141777h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141780k f384745a;

    public C141777h(C141780k kVar) {
        this.f384745a = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141780k.f384746a.mo56225c()).mo56382g(th)).mo56372aa(41917)).mo56386p("Microphone didn't close!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f384745a.f384749d.mo116742l();
        C59052c cVar = (C59052c) ((C59052c) C141780k.f384746a.mo56224b()).mo56372aa(41918);
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        cVar.mo56389s("Mic closing result: %s", duVar);
    }
}
