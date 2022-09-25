package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.s */
/* compiled from: PG */
public final /* synthetic */ class C125878s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125884y f346941a;

    public /* synthetic */ C125878s(C125884y yVar) {
        this.f346941a = yVar;
    }

    public final void accept(Object obj) {
        C125884y yVar = this.f346941a;
        C126293ab abVar = (C126293ab) obj;
        yVar.f346952e.set(abVar.mo107516b());
        yVar.f346949b.mo107532b(C125884y.m205873d(abVar.mo107517d()));
        if (abVar.mo107518e()) {
            C60870cx cxVar = abVar.mo107516b().f345896a.f345787f;
            C126308aq aqVar = new C126308aq(new C125880u(yVar), new C125881v(yVar));
            C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar), yVar.f346951d);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
