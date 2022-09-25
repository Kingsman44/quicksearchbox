package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123976m;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.j */
/* compiled from: PG */
public final /* synthetic */ class C131400j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C131401k f359196a;

    /* renamed from: b */
    public final /* synthetic */ C123976m f359197b;

    public /* synthetic */ C131400j(C131401k kVar, C123976m mVar) {
        this.f359196a = kVar;
        this.f359197b = mVar;
    }

    public final void run() {
        C131401k kVar = this.f359196a;
        C123976m mVar = this.f359197b;
        C58970a aVar = (C58970a) ((C58970a) kVar.f359202e.mo56225c()).mo56372aa(39239);
        String i = mVar.mo106214i();
        C52568wo woVar = mVar.mo106207b().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        aVar.mo56354G("#mediaItemWrapperToMediaItem: No imageContent { app: %s, title: %s }", i, woVar.f137998e);
    }
}
