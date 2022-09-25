package com.google.android.apps.search.assistant.platform.p9141h.p9152d;

import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121038a;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121040c;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121041d;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.d.f */
/* compiled from: PG */
final class C121046f implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C121040c f336436a;

    public C121046f(C121040c cVar) {
        this.f336436a = cVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C121041d dVar = (C121041d) obj;
        C69664n.m101060f(dVar, "data");
        C121040c cVar = this.f336436a;
        C62934bn builder = dVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C121038a aVar = (C121038a) builder;
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(cVar, "value");
        aVar.copyOnWrite();
        C121041d dVar2 = (C121041d) aVar.instance;
        dVar2.f336429b = cVar.f336425d;
        dVar2.f336428a |= 1;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C121041d) build;
    }
}
