package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119623e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127448f;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127452g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127424a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127426c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127427d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127428e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127433j;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127435l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.i */
/* compiled from: PG */
public final /* synthetic */ class C119558i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C119561l f333217a;

    /* renamed from: b */
    public final /* synthetic */ C127434k f333218b;

    public /* synthetic */ C119558i(C119561l lVar, C127434k kVar) {
        this.f333217a = lVar;
        this.f333218b = kVar;
    }

    public final C60870cx apply(Object obj) {
        C119605ay ayVar;
        C119561l lVar = this.f333217a;
        C127434k kVar = this.f333218b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92899h(lVar.mo104430a(Status.f186912j, "TNG:MA isn't available. The handover isn't possible."));
        }
        C127448f fVar = lVar.f333226e;
        C127427d dVar = (C127427d) C127428e.f350867c.createBuilder();
        C127424a aVar = (C127424a) C127426c.f350863c.createBuilder();
        C127433j jVar = (C127433j) C127435l.f350884b.createBuilder();
        jVar.copyOnWrite();
        ((C127435l) jVar.instance).f350886a = kVar.getNumber();
        aVar.copyOnWrite();
        C127426c cVar = (C127426c) aVar.instance;
        C127435l lVar2 = (C127435l) jVar.build();
        lVar2.getClass();
        cVar.f350866b = lVar2;
        cVar.f350865a = 1;
        C127426c cVar2 = (C127426c) aVar.build();
        dVar.copyOnWrite();
        cVar2.getClass();
        ((C127428e) dVar.instance).f350870b = cVar2;
        C119623e eVar = lVar.f333223b;
        if (eVar.f333374b == 2) {
            ayVar = (C119605ay) eVar.f333375c;
        } else {
            ayVar = C119605ay.f333343c;
        }
        C51805du duVar = ayVar.f333346b;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        dVar.copyOnWrite();
        duVar.getClass();
        ((C127428e) dVar.instance).f350869a = duVar;
        C60870cx a = C70876o.m103760a(fVar.f189039a.mo39510a(C127452g.m208415b(), fVar.f189040b), (C127428e) dVar.build());
        C119556g gVar = C119556g.f333215a;
        return C60922j.m93044g(a, C47810es.m84963c(gVar), C60826bg.f164896a);
    }
}
