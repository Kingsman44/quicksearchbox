package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128173e;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128174f;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128184p;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128187s;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p5488io.grpc.C70153aq;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C78340b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78347i f215682a;

    /* renamed from: b */
    public final /* synthetic */ C70153aq f215683b;

    public /* synthetic */ C78340b(C78347i iVar, C70153aq aqVar) {
        this.f215682a = iVar;
        this.f215683b = aqVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C78347i iVar = this.f215682a;
        C70153aq aqVar = this.f215683b;
        C123733b bVar = (C123733b) obj;
        C128184p pVar = iVar.f215700f;
        C128184p pVar2 = new C128184p(pVar.f189039a, pVar.f189040b.mo62565a(aqVar));
        C128173e eVar = (C128173e) C128174f.f352598e.createBuilder();
        eVar.copyOnWrite();
        C128174f fVar = (C128174f) eVar.instance;
        bVar.getClass();
        fVar.f352602c = bVar;
        fVar.f352600a |= 2;
        long epochMilli = iVar.f215702h.mo57444a().toEpochMilli();
        eVar.copyOnWrite();
        C128174f fVar2 = (C128174f) eVar.instance;
        fVar2.f352600a |= 4;
        fVar2.f352603d = epochMilli;
        return C70876o.m103760a(pVar2.f189039a.mo39510a(C128187s.m209272a(), pVar2.f189040b), (C128174f) eVar.build());
    }
}
