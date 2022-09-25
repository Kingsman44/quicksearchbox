package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9611b;

import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125012a;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125013b;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125014c;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125015d;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125016e;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125018g;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125020i;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a.C127526a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a.C127527b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a.C127532g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.protobuf.C62911as;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.b.b */
/* compiled from: PG */
final class C127534b implements Callable {

    /* renamed from: a */
    final /* synthetic */ C127532g f351174a;

    /* renamed from: b */
    final /* synthetic */ C127535c f351175b;

    public C127534b(C127532g gVar, C127535c cVar) {
        this.f351174a = gVar;
        this.f351175b = cVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C125018g gVar;
        C34039bb bbVar = this.f351174a.f351169a;
        if (bbVar == null) {
            bbVar = C34039bb.f90716f;
        }
        C34043bf a = C34043bf.m62692a(bbVar.f90719b);
        if (a == null) {
            a = C34043bf.UNRECOGNIZED;
        }
        a.name();
        C34039bb bbVar2 = this.f351174a.f351169a;
        if (bbVar2 == null) {
            bbVar2 = C34039bb.f90716f;
        }
        C34043bf a2 = C34043bf.m62692a(bbVar2.f90719b);
        if (a2 == null) {
            a2 = C34043bf.UNRECOGNIZED;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 1) {
            C125016e eVar = (C125016e) C125018g.f344934c.createBuilder();
            C69664n.m101060f(eVar, "newBuilder()");
            C125020i a3 = C69664n.m101061g(eVar, "builder");
            C125012a aVar = (C125012a) C125013b.f344923b.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C125013b bVar = (C125013b) build;
            C69664n.m101061g(bVar, "value");
            C125016e eVar2 = a3.f344939a;
            eVar2.copyOnWrite();
            C125018g gVar2 = (C125018g) eVar2.instance;
            bVar.getClass();
            gVar2.f344937b = bVar;
            gVar2.f344936a = 3;
            gVar = a3.mo106780a();
        } else if (ordinal == 2 || ordinal == 3) {
            C125016e eVar3 = (C125016e) C125018g.f344934c.createBuilder();
            C69664n.m101060f(eVar3, "newBuilder()");
            C125020i a4 = C69664n.m101061g(eVar3, "builder");
            C125014c cVar = (C125014c) C125015d.f344927a.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C69664n.m101061g(cVar, "builder");
            C62942bv build2 = cVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            C125015d dVar = (C125015d) build2;
            C69664n.m101061g(dVar, "value");
            C125016e eVar4 = a4.f344939a;
            eVar4.copyOnWrite();
            C125018g gVar3 = (C125018g) eVar4.instance;
            dVar.getClass();
            gVar3.f344937b = dVar;
            gVar3.f344936a = 1;
            gVar = a4.mo106780a();
        } else if (ordinal == 4 || ordinal == 5) {
            C125016e eVar5 = (C125016e) C125018g.f344934c.createBuilder();
            C69664n.m101060f(eVar5, "newBuilder()");
            C125020i a5 = C69664n.m101061g(eVar5, "builder");
            C62911as asVar = (C62911as) C62912at.f169862a.createBuilder();
            C69664n.m101060f(asVar, "newBuilder()");
            C62912at a6 = C69664n.m101061g(asVar, "builder").mo58809a();
            C69664n.m101061g(a6, "value");
            C125016e eVar6 = a5.f344939a;
            eVar6.copyOnWrite();
            C125018g gVar4 = (C125018g) eVar6.instance;
            a6.getClass();
            gVar4.f344937b = a6;
            gVar4.f344936a = 2;
            gVar = a5.mo106780a();
        } else {
            C34039bb bbVar3 = this.f351174a.f351169a;
            if (bbVar3 == null) {
                bbVar3 = C34039bb.f90716f;
            }
            C34043bf a7 = C34043bf.m62692a(bbVar3.f90719b);
            if (a7 == null) {
                a7 = C34043bf.UNRECOGNIZED;
            }
            new StringBuilder("Unknown entry point type: ").append(a7);
            throw new UnsupportedOperationException("Unknown entry point type: ".concat(String.valueOf(a7)));
        }
        this.f351175b.f351176a.mo107852a(gVar);
        C127526a aVar2 = (C127526a) C127527b.f351163a.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        C62942bv build3 = aVar2.build();
        C69664n.m101060f(build3, "_builder.build()");
        return (C127527b) build3;
    }
}
