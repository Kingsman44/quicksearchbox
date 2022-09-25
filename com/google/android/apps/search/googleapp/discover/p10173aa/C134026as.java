package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.as */
/* compiled from: PG */
final class C134026as implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C63042fg f365078a;

    /* renamed from: b */
    final /* synthetic */ C134023ap f365079b;

    public C134026as(C63042fg fgVar, C134023ap apVar) {
        this.f365078a = fgVar;
        this.f365079b = apVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134036bb bbVar = (C134036bb) obj;
        C69664n.m101060f(bbVar, "currentData");
        C63042fg fgVar = this.f365078a;
        C134023ap apVar = this.f365079b;
        C62934bn builder = bbVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134031ax a = C69664n.m101061g((C134035ba) builder, "builder");
        C62971cq cqVar = bbVar.f365099c;
        C69664n.m101060f(cqVar, "currentData.finishedSyncDataList");
        C134032ay ayVar = (C134032ay) C134033az.f365090d.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C134022ao a2 = C69664n.m101061g(ayVar, "builder");
        a2.mo111526c(fgVar);
        a2.mo111525b("TaskResult: ".concat(String.valueOf(apVar.name())));
        List a3 = C134024aq.m217405a(cqVar, a2.mo111524a());
        a.mo111533c();
        C134035ba baVar = a.f365089a;
        baVar.copyOnWrite();
        ((C134036bb) baVar.instance).f365099c = C134036bb.emptyProtobufList();
        a.mo111533c();
        C69664n.m101061g(a3, "values");
        C134035ba baVar2 = a.f365089a;
        baVar2.copyOnWrite();
        C134036bb bbVar2 = (C134036bb) baVar2.instance;
        C62971cq cqVar2 = bbVar2.f365099c;
        if (!cqVar2.mo58948c()) {
            bbVar2.f365099c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) a3, (List) bbVar2.f365099c);
        return a.mo111531a();
    }
}
