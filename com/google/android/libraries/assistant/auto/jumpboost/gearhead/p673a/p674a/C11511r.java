package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13039a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13040b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.r */
/* compiled from: PG */
final class C11511r implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37390a;

    public C11511r(C11485ag agVar) {
        this.f37390a = agVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C13040b bVar = (C13040b) obj;
        C11485ag agVar = this.f37390a;
        C13039a aVar = (C13039a) C13040b.f40476c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        long b = agVar.f37315i.mo26870b();
        aVar.copyOnWrite();
        C13040b bVar2 = (C13040b) aVar.instance;
        bVar2.f40478a |= 1;
        bVar2.f40479b = b;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C13040b) build;
    }
}
