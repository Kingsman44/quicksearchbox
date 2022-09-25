package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125066au;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125067av;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125170s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125171t;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125173v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.eu */
/* compiled from: PG */
public final /* synthetic */ class C126137eu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347581a;

    /* renamed from: b */
    public final /* synthetic */ boolean f347582b;

    public /* synthetic */ C126137eu(C126141ey eyVar, boolean z) {
        this.f347581a = eyVar;
        this.f347582b = z;
    }

    public final void run() {
        C126141ey eyVar = this.f347581a;
        boolean z = this.f347582b;
        C126322bc bcVar = eyVar.f347587a.f346588a;
        C125170s sVar = (C125170s) C125171t.f345314c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C125173v a = C69664n.m101061g(sVar, "builder");
        C125066au auVar = (C125066au) C125067av.f345043b.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C69664n.m101061g(auVar, "builder");
        auVar.copyOnWrite();
        ((C125067av) auVar.instance).f345045a = z;
        C62942bv build = auVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C125067av avVar = (C125067av) build;
        C69664n.m101061g(avVar, "value");
        C125170s sVar2 = a.f345318a;
        sVar2.copyOnWrite();
        C125171t tVar = (C125171t) sVar2.instance;
        avVar.getClass();
        tVar.f345317b = avVar;
        tVar.f345316a = 3;
        bcVar.mo107532b(a.mo106820a());
    }
}
