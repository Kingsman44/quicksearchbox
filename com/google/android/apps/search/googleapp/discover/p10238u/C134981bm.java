package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.bm */
/* compiled from: PG */
final class C134981bm implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C134983bo f367559a;

    /* renamed from: b */
    final /* synthetic */ String f367560b;

    /* renamed from: c */
    final /* synthetic */ C57259bn f367561c;

    /* renamed from: d */
    final /* synthetic */ C62722b f367562d;

    /* renamed from: e */
    final /* synthetic */ Integer f367563e;

    public C134981bm(C134983bo boVar, String str, C57259bn bnVar, C62722b bVar, Integer num) {
        this.f367559a = boVar;
        this.f367560b = str;
        this.f367561c = bnVar;
        this.f367562d = bVar;
        this.f367563e = num;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C134988bt btVar = (C134988bt) obj;
        C69664n.m101060f(btVar, "data");
        C134983bo boVar = this.f367559a;
        String str = this.f367560b;
        C57259bn bnVar = this.f367561c;
        C62722b bVar = this.f367562d;
        Integer num = this.f367563e;
        C62934bn builder = btVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134987bs bsVar = (C134987bs) builder;
        C69664n.m101061g(bsVar, "builder");
        List U = C69540x.m100839U(C134984bp.m218904a(bsVar), 9);
        C134985bq bqVar = (C134985bq) C134986br.f367571g.createBuilder();
        C69664n.m101060f(bqVar, "newBuilder()");
        C69664n.m101061g(bqVar, "builder");
        Instant a = boVar.f367566a.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C63042fg b = C62949a.m95467b(a);
        C69664n.m101061g(b, "value");
        bqVar.copyOnWrite();
        C134986br brVar = (C134986br) bqVar.instance;
        b.getClass();
        brVar.f367578f = b;
        brVar.f367573a |= 16;
        bqVar.copyOnWrite();
        C134986br brVar2 = (C134986br) bqVar.instance;
        brVar2.f367573a |= 1;
        brVar2.f367574b = str;
        C69664n.m101061g(bnVar, "value");
        bqVar.copyOnWrite();
        C134986br brVar3 = (C134986br) bqVar.instance;
        brVar3.f367575c = bnVar.f152856q;
        brVar3.f367573a |= 2;
        if (bVar != null) {
            bqVar.copyOnWrite();
            C134986br brVar4 = (C134986br) bqVar.instance;
            brVar4.f367576d = bVar.f169415s;
            brVar4.f367573a |= 4;
        }
        if (num != null) {
            int intValue = num.intValue();
            bqVar.copyOnWrite();
            C134986br brVar5 = (C134986br) bqVar.instance;
            brVar5.f367573a |= 8;
            brVar5.f367577e = intValue;
        }
        C62942bv build = bqVar.build();
        C69664n.m101060f(build, "_builder.build()");
        List N = C69540x.m100832N(U, (C134986br) build);
        C134984bp.m218904a(bsVar);
        bsVar.copyOnWrite();
        ((C134988bt) bsVar.instance).f367581a = C134988bt.emptyProtobufList();
        C134984bp.m218904a(bsVar);
        C69664n.m101061g(N, "values");
        bsVar.copyOnWrite();
        C134988bt btVar2 = (C134988bt) bsVar.instance;
        C62971cq cqVar = btVar2.f367581a;
        if (!cqVar.mo58948c()) {
            btVar2.f367581a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) N, (List) btVar2.f367581a);
        C62942bv build2 = bsVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        return (C134988bt) build2;
    }
}
