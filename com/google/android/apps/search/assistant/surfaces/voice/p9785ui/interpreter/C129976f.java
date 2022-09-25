package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.f */
/* compiled from: PG */
final class C129976f implements Function {

    /* renamed from: a */
    final /* synthetic */ C129868c f356481a;

    public C129976f(C129868c cVar) {
        this.f356481a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C51910dq dqVar = (C51910dq) obj;
        C129855b bVar = this.f356481a.f356287n;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C69664n.m101060f(dqVar, "args");
        C69664n.m101061g(dqVar, "value");
        C129939bn bnVar2 = a.f356411a;
        bnVar2.copyOnWrite();
        C129940bo boVar = (C129940bo) bnVar2.instance;
        dqVar.getClass();
        boVar.f356410b = dqVar;
        boVar.f356409a = 1;
        bVar.mo109296b(a.mo109348a());
        return C127406c.f350821b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
