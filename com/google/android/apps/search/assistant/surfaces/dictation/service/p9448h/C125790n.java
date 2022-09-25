package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125170s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125171t;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125173v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.p9449a.C125760a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.n */
/* compiled from: PG */
public final /* synthetic */ class C125790n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125760a f346694a;

    public /* synthetic */ C125790n(C125760a aVar) {
        this.f346694a = aVar;
    }

    public final void accept(Object obj) {
        C125760a aVar = this.f346694a;
        C125161j jVar = (C125161j) obj;
        C69664n.m101061g(jVar, "eligibility");
        C126322bc bcVar = aVar.f346588a;
        C125170s sVar = (C125170s) C125171t.f345314c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C125173v a = C69664n.m101061g(sVar, "builder");
        C69664n.m101061g(jVar, "value");
        C125170s sVar2 = a.f345318a;
        sVar2.copyOnWrite();
        C125171t tVar = (C125171t) sVar2.instance;
        jVar.getClass();
        tVar.f345317b = jVar;
        tVar.f345316a = 1;
        bcVar.mo107532b(a.mo106820a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
