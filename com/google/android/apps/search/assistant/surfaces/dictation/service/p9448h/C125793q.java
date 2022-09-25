package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125166o;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125170s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125171t;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125173v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.p9449a.C125760a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.q */
/* compiled from: PG */
public final /* synthetic */ class C125793q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125760a f346700a;

    public /* synthetic */ C125793q(C125760a aVar) {
        this.f346700a = aVar;
    }

    public final void accept(Object obj) {
        C125760a aVar = this.f346700a;
        C125166o oVar = (C125166o) obj;
        C69664n.m101061g(oVar, "eligibility");
        C126322bc bcVar = aVar.f346588a;
        C125170s sVar = (C125170s) C125171t.f345314c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C125173v a = C69664n.m101061g(sVar, "builder");
        C69664n.m101061g(oVar, "value");
        C125170s sVar2 = a.f345318a;
        sVar2.copyOnWrite();
        C125171t tVar = (C125171t) sVar2.instance;
        oVar.getClass();
        tVar.f345317b = oVar;
        tVar.f345316a = 6;
        bcVar.mo107532b(a.mo106820a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
