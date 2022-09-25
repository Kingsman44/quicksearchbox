package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.at */
/* compiled from: PG */
final class C134027at implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C63042fg f365080a;

    /* renamed from: b */
    final /* synthetic */ C134064h f365081b;

    public C134027at(C63042fg fgVar, C134064h hVar) {
        this.f365080a = fgVar;
        this.f365081b = hVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134036bb bbVar = (C134036bb) obj;
        C69664n.m101061g(bbVar, "currentData");
        C63042fg fgVar = this.f365080a;
        C134064h hVar = this.f365081b;
        C62934bn builder = bbVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134031ax a = C69664n.m101061g((C134035ba) builder, "builder");
        C62971cq cqVar = bbVar.f365098b;
        C69664n.m101060f(cqVar, "currentData.startedSyncDataList");
        C134032ay ayVar = (C134032ay) C134033az.f365090d.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C134022ao a2 = C69664n.m101061g(ayVar, "builder");
        a2.mo111526c(fgVar);
        new StringBuilder("refreshType = ").append(hVar);
        a2.mo111525b("refreshType = ".concat(String.valueOf(hVar)));
        List a3 = C134024aq.m217405a(cqVar, a2.mo111524a());
        a.mo111534d();
        C134035ba baVar = a.f365089a;
        baVar.copyOnWrite();
        ((C134036bb) baVar.instance).f365098b = C134036bb.emptyProtobufList();
        a.mo111534d();
        C69664n.m101061g(a3, "values");
        C134035ba baVar2 = a.f365089a;
        baVar2.copyOnWrite();
        C134036bb bbVar2 = (C134036bb) baVar2.instance;
        C62971cq cqVar2 = bbVar2.f365098b;
        if (!cqVar2.mo58948c()) {
            bbVar2.f365098b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) a3, (List) bbVar2.f365098b);
        return a.mo111531a();
    }
}
