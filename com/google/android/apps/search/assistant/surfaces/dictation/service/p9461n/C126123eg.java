package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.aj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125170s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125171t;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125173v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.p9449a.C125760a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.eg */
/* compiled from: PG */
public final /* synthetic */ class C126123eg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347554a;

    /* renamed from: b */
    public final /* synthetic */ aj f347555b;

    public /* synthetic */ C126123eg(C126141ey eyVar, aj ajVar) {
        this.f347554a = eyVar;
        this.f347555b = ajVar;
    }

    public final void run() {
        C126141ey eyVar = this.f347554a;
        aj ajVar = this.f347555b;
        C125760a aVar = eyVar.f347587a;
        C69664n.m101061g(ajVar, "keyboardUiCommand");
        C126322bc bcVar = aVar.f346588a;
        C125170s sVar = (C125170s) C125171t.f345314c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C125173v a = C69664n.m101061g(sVar, "builder");
        C69664n.m101061g(ajVar, "value");
        C125170s sVar2 = a.f345318a;
        sVar2.copyOnWrite();
        C125171t tVar = (C125171t) sVar2.instance;
        ajVar.getClass();
        tVar.f345317b = ajVar;
        tVar.f345316a = 4;
        bcVar.mo107532b(a.mo106820a());
    }
}
