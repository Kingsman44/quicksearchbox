package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.common.p4526f.C59052c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cq */
/* compiled from: PG */
public final /* synthetic */ class C126079cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347459a;

    /* renamed from: b */
    public final /* synthetic */ C126292aa f347460b;

    public /* synthetic */ C126079cq(C126081cs csVar, C126292aa aaVar) {
        this.f347459a = csVar;
        this.f347460b = aaVar;
    }

    public final void run() {
        C126081cs csVar = this.f347459a;
        C126292aa aaVar = this.f347460b;
        ((C59052c) ((C59052c) C126081cs.f347463a.mo56224b()).mo56372aa(36807)).mo56389s("#onDictationStarted: %s [SD]", aaVar);
        C126106dq dqVar = csVar.f347469g;
        C69664n.m101061g(aaVar, "params");
        dqVar.mo107340e(new C126094de(aaVar));
        C126114dy dyVar = csVar.f347474l;
        ak createBuilder = al.i.createBuilder();
        o oVar = o.g;
        createBuilder.copyOnWrite();
        oVar.getClass();
        createBuilder.instance.b = oVar;
        dyVar.mo107363g(createBuilder.build());
        csVar.f347474l.mo107361e(true);
    }
}
