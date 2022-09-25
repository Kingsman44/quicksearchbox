package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.p10214s.C134536aa;
import com.google.android.apps.search.googleapp.discover.p10214s.C134537ab;
import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134559ax;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134561az;
import com.google.android.apps.search.googleapp.discover.p10214s.C134564bb;
import com.google.android.apps.search.googleapp.discover.p10214s.C134574bl;
import com.google.android.apps.search.googleapp.discover.p10214s.C134575bm;
import com.google.android.apps.search.googleapp.discover.p10214s.C134579bq;
import com.google.android.apps.search.googleapp.discover.p10214s.C134607y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57208n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57214t;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57216v;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57221ac;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57234ap;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.h */
/* compiled from: PG */
public final class C134932h implements C134930f {

    /* renamed from: a */
    private static final C59071e f367378a = C59071e.m91331h();

    /* renamed from: a */
    public final C134538ac mo112076a(C57221ac acVar, C134538ac acVar2, C57271bz bzVar) {
        C57235aq aqVar;
        C57235aq aqVar2;
        Object obj;
        C57235aq aqVar3;
        Object obj2;
        C57235aq aqVar4;
        Object obj3;
        C69664n.m101061g(acVar, "dataOperation");
        C69664n.m101061g(acVar2, "streamDataOperation");
        C69664n.m101061g(bzVar, "feedResponseMetadata");
        if (acVar.f152752a == 3) {
            aqVar = (C57235aq) acVar.f152753b;
        } else {
            aqVar = C57235aq.f152787g;
        }
        int a = C57234ap.m88272a(aqVar.f152791c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0) {
            C59052c cVar = (C59052c) f367378a.mo56226d();
            cVar.mo56379ah(new C59094n(40356));
            cVar.mo56386p("Unknown Feature type, ignored");
            return acVar2;
        } else if (i == 1) {
            C62934bn builder = acVar2.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C134536aa a2 = C69664n.m101061g((C134537ab) builder, "builder");
            C62934bn builder2 = a2.mo111812b().toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C134607y a3 = C69664n.m101061g((C134559ax) builder2, "builder");
            if (acVar.f152752a == 3) {
                aqVar2 = (C57235aq) acVar.f152753b;
            } else {
                aqVar2 = C57235aq.f152787g;
            }
            C62940bt r0 = C62942bv.checkIsLite(C57216v.f152747b);
            aqVar2.mo58887l(r0);
            Object l = aqVar2.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C69664n.m101060f(obj, "dataOperation.feature.ge…n(Stream.streamExtension)");
            C57216v vVar = (C57216v) obj;
            C69664n.m101061g(vVar, "value");
            C134559ax axVar = a3.f366559a;
            axVar.copyOnWrite();
            C134560ay ayVar = (C134560ay) axVar.instance;
            vVar.getClass();
            ayVar.f366457c = vVar;
            ayVar.f366456b = 5;
            a2.mo111814d(a3.mo111840a());
            return a2.mo111811a();
        } else if (i == 4) {
            C62934bn builder3 = acVar2.toBuilder();
            C69664n.m101060f(builder3, "this.toBuilder()");
            C134536aa a4 = C69664n.m101061g((C134537ab) builder3, "builder");
            C62934bn builder4 = a4.mo111812b().toBuilder();
            C69664n.m101060f(builder4, "this.toBuilder()");
            C134607y a5 = C69664n.m101061g((C134559ax) builder4, "builder");
            if (acVar.f152752a == 3) {
                aqVar3 = (C57235aq) acVar.f152753b;
            } else {
                aqVar3 = C57235aq.f152787g;
            }
            C62940bt r02 = C62942bv.checkIsLite(C57208n.f152726b);
            aqVar3.mo58887l(r02);
            Object l2 = aqVar3.f169962ag.mo58854l(r02.f169971d);
            if (l2 == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l2);
            }
            C69664n.m101060f(obj2, "dataOperation.feature.ge…Cluster.clusterExtension)");
            C57208n nVar = (C57208n) obj2;
            C69664n.m101061g(nVar, "value");
            C134559ax axVar2 = a5.f366559a;
            axVar2.copyOnWrite();
            C134560ay ayVar2 = (C134560ay) axVar2.instance;
            nVar.getClass();
            ayVar2.f366457c = nVar;
            ayVar2.f366456b = 7;
            a4.mo111814d(a5.mo111840a());
            return a4.mo111811a();
        } else if (i != 13) {
            return acVar2;
        } else {
            C62934bn builder5 = acVar2.toBuilder();
            C69664n.m101060f(builder5, "this.toBuilder()");
            C134536aa a6 = C69664n.m101061g((C134537ab) builder5, "builder");
            C62934bn builder6 = a6.mo111812b().toBuilder();
            C69664n.m101060f(builder6, "this.toBuilder()");
            C134607y a7 = C69664n.m101061g((C134559ax) builder6, "builder");
            C134574bl blVar = (C134574bl) C134575bm.f366507c.createBuilder();
            C69664n.m101060f(blVar, "newBuilder()");
            C69664n.m101061g(blVar, "builder");
            if (acVar.f152752a == 3) {
                aqVar4 = (C57235aq) acVar.f152753b;
            } else {
                aqVar4 = C57235aq.f152787g;
            }
            C62940bt r03 = C62942bv.checkIsLite(C57214t.f152742d);
            aqVar4.mo58887l(r03);
            Object l3 = aqVar4.f169962ag.mo58854l(r03.f169971d);
            if (l3 == null) {
                obj3 = r03.f169969b;
            } else {
                obj3 = r03.mo58889c(l3);
            }
            C69664n.m101060f(obj3, "dataOperation.feature.ge…ion\n                    )");
            C57214t tVar = (C57214t) obj3;
            C69664n.m101061g(tVar, "value");
            blVar.copyOnWrite();
            C134575bm bmVar = (C134575bm) blVar.instance;
            tVar.getClass();
            bmVar.f366510b = tVar;
            bmVar.f366509a = 1;
            C62942bv build = blVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C134575bm bmVar2 = (C134575bm) build;
            C69664n.m101061g(bmVar2, "value");
            C134559ax axVar3 = a7.f366559a;
            axVar3.copyOnWrite();
            C134560ay ayVar3 = (C134560ay) axVar3.instance;
            bmVar2.getClass();
            ayVar3.f366457c = bmVar2;
            ayVar3.f366456b = 21;
            a6.mo111814d(a7.mo111840a());
            C62934bn builder7 = a6.mo111813c().toBuilder();
            C69664n.m101060f(builder7, "this.toBuilder()");
            C134579bq a8 = C69664n.m101061g((C134561az) builder7, "builder");
            a8.mo111824c(C134564bb.REQUIRED);
            a6.mo111815e(a8.mo111822a());
            return a6.mo111811a();
        }
    }
}
