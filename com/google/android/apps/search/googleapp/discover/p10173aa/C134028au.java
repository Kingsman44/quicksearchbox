package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.apps.tiktok.contrib.work.C46584r;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.au */
/* compiled from: PG */
final class C134028au implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C63042fg f365082a;

    /* renamed from: b */
    final /* synthetic */ C46586t f365083b;

    public C134028au(C63042fg fgVar, C46586t tVar) {
        this.f365082a = fgVar;
        this.f365083b = tVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134036bb bbVar = (C134036bb) obj;
        C69664n.m101060f(bbVar, "currentData");
        C63042fg fgVar = this.f365082a;
        C46586t tVar = this.f365083b;
        C62934bn builder = bbVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134031ax a = C69664n.m101061g((C134035ba) builder, "builder");
        C62971cq cqVar = bbVar.f365097a;
        C69664n.m101060f(cqVar, "currentData.enqueuedSyncDataList");
        C134032ay ayVar = (C134032ay) C134033az.f365090d.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C134022ao a2 = C69664n.m101061g(ayVar, "builder");
        a2.mo111526c(fgVar);
        String name = tVar.mo50564a().f14081b.name();
        C46584r d = tVar.mo50567d();
        C58833ax f = tVar.mo50570f();
        C58528ij h = tVar.mo50572h();
        C58833ax g = tVar.mo50571g();
        a2.mo111525b(C69764m.m101224d("\n      Required network type: " + name + "\n      Initial delay: " + d + "\n      Periodic configuration: " + f + "\n      Tags: " + h + "\n      Uniqueness configuration: " + g + "\n    ", "|"));
        List a3 = C134024aq.m217405a(cqVar, a2.mo111524a());
        a.mo111532b();
        C134035ba baVar = a.f365089a;
        baVar.copyOnWrite();
        ((C134036bb) baVar.instance).f365097a = C134036bb.emptyProtobufList();
        a.mo111532b();
        C69664n.m101061g(a3, "values");
        C134035ba baVar2 = a.f365089a;
        baVar2.copyOnWrite();
        C134036bb bbVar2 = (C134036bb) baVar2.instance;
        C62971cq cqVar2 = bbVar2.f365097a;
        if (!cqVar2.mo58948c()) {
            bbVar2.f365097a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) a3, (List) bbVar2.f365097a);
        return a.mo111531a();
    }
}
