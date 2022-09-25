package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.base.C58817ah;
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
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ck */
/* compiled from: PG */
final class C135009ck implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C135011cm f367634a;

    /* renamed from: b */
    final /* synthetic */ String f367635b;

    /* renamed from: c */
    final /* synthetic */ String f367636c;

    /* renamed from: d */
    final /* synthetic */ C57259bn f367637d;

    /* renamed from: e */
    final /* synthetic */ Status f367638e;

    public C135009ck(C135011cm cmVar, String str, String str2, C57259bn bnVar, Status status) {
        this.f367634a = cmVar;
        this.f367635b = str;
        this.f367636c = str2;
        this.f367637d = bnVar;
        this.f367638e = status;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C135001cc ccVar = (C135001cc) obj;
        C69664n.m101060f(ccVar, "data");
        C135011cm cmVar = this.f367634a;
        String str = this.f367635b;
        String str2 = this.f367636c;
        C57259bn bnVar = this.f367637d;
        Status status = this.f367638e;
        C62934bn builder = ccVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C135000cb cbVar = (C135000cb) builder;
        C69664n.m101061g(cbVar, "builder");
        List U = C69540x.m100839U(C134993by.m218911a(cbVar), 9);
        C134994bz bzVar = (C134994bz) C134999ca.f367585g.createBuilder();
        C69664n.m101060f(bzVar, "newBuilder()");
        C69664n.m101061g(bzVar, "builder");
        Instant a = cmVar.f367641a.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C63042fg b = C62949a.m95467b(a);
        C69664n.m101061g(b, "value");
        bzVar.copyOnWrite();
        C134999ca caVar = (C134999ca) bzVar.instance;
        b.getClass();
        caVar.f367592f = b;
        caVar.f367587a |= 16;
        C69664n.m101061g(str, "value");
        bzVar.copyOnWrite();
        C134999ca caVar2 = (C134999ca) bzVar.instance;
        str.getClass();
        caVar2.f367587a |= 1;
        caVar2.f367588b = str;
        C69664n.m101061g(str2, "value");
        bzVar.copyOnWrite();
        C134999ca caVar3 = (C134999ca) bzVar.instance;
        str2.getClass();
        caVar3.f367587a |= 2;
        caVar3.f367589c = str2;
        bzVar.copyOnWrite();
        C134999ca caVar4 = (C134999ca) bzVar.instance;
        caVar4.f367590d = bnVar.f152856q;
        caVar4.f367587a |= 4;
        String name = status.getCode().name();
        C69664n.m101061g(name, "value");
        bzVar.copyOnWrite();
        C134999ca caVar5 = (C134999ca) bzVar.instance;
        name.getClass();
        caVar5.f367587a |= 8;
        caVar5.f367591e = name;
        C62942bv build = bzVar.build();
        C69664n.m101060f(build, "_builder.build()");
        List N = C69540x.m100832N(U, (C134999ca) build);
        C134993by.m218911a(cbVar);
        cbVar.copyOnWrite();
        ((C135001cc) cbVar.instance).f367595a = C135001cc.emptyProtobufList();
        C134993by.m218911a(cbVar);
        C69664n.m101061g(N, "values");
        cbVar.copyOnWrite();
        C135001cc ccVar2 = (C135001cc) cbVar.instance;
        C62971cq cqVar = ccVar2.f367595a;
        if (!cqVar.mo58948c()) {
            ccVar2.f367595a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) N, (List) ccVar2.f367595a);
        C62942bv build2 = cbVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        return (C135001cc) build2;
    }
}
