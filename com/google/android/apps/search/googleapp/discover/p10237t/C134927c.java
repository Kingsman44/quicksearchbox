package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.p10214s.C134536aa;
import com.google.android.apps.search.googleapp.discover.p10214s.C134537ab;
import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134540ae;
import com.google.android.apps.search.googleapp.discover.p10214s.C134541af;
import com.google.android.apps.search.googleapp.discover.p10214s.C134544ai;
import com.google.android.apps.search.googleapp.discover.p10214s.C134559ax;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134594l;
import com.google.android.apps.search.googleapp.discover.p10214s.C134595m;
import com.google.android.apps.search.googleapp.discover.p10214s.C134596n;
import com.google.android.apps.search.googleapp.discover.p10214s.C134597o;
import com.google.android.apps.search.googleapp.discover.p10214s.C134598p;
import com.google.android.apps.search.googleapp.discover.p10214s.C134599q;
import com.google.android.apps.search.googleapp.discover.p10214s.C134607y;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.p4361a.C57114b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.p4361a.C57116d;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57198d;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57206l;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57210p;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57212r;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57221ac;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57234ap;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.c */
/* compiled from: PG */
public final class C134927c implements C134930f {
    /* renamed from: a */
    public final C134538ac mo112076a(C57221ac acVar, C134538ac acVar2, C57271bz bzVar) {
        C57235aq aqVar;
        C57235aq aqVar2;
        Object obj;
        Object obj2;
        C57235aq aqVar3;
        Object obj3;
        C134540ae aeVar;
        C57235aq aqVar4;
        C57235aq aqVar5;
        Object obj4;
        C57235aq aqVar6;
        Object obj5;
        Object obj6;
        Object obj7;
        C57221ac acVar3 = acVar;
        C69664n.m101061g(acVar3, "dataOperation");
        C134538ac acVar4 = acVar2;
        C69664n.m101061g(acVar4, "streamDataOperation");
        C69664n.m101061g(bzVar, "feedResponseMetadata");
        if (acVar3.f152752a == 3) {
            aqVar = (C57235aq) acVar3.f152753b;
        } else {
            aqVar = C57235aq.f152787g;
        }
        int a = C57234ap.m88272a(aqVar.f152791c);
        if (a == 0 || a != 4) {
            return acVar4;
        }
        C62934bn builder = acVar2.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134536aa a2 = C69664n.m101061g((C134537ab) builder, "builder");
        C62934bn builder2 = a2.mo111812b().toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C134607y a3 = C69664n.m101061g((C134559ax) builder2, "builder");
        C134541af afVar = (C134541af) C134544ai.f366393i.createBuilder();
        C69664n.m101060f(afVar, "newBuilder()");
        C69664n.m101061g(afVar, "builder");
        if (acVar3.f152752a == 3) {
            aqVar2 = (C57235aq) acVar3.f152753b;
        } else {
            aqVar2 = C57235aq.f152787g;
        }
        C62940bt r9 = C62942bv.checkIsLite(C57212r.f152735e);
        aqVar2.mo58887l(r9);
        Object l = aqVar2.f169962ag.mo58854l(r9.f169971d);
        if (l == null) {
            obj = r9.f169969b;
        } else {
            obj = r9.mo58889c(l);
        }
        C57212r rVar = (C57212r) obj;
        C62940bt r92 = C62942bv.checkIsLite(C57198d.f152706c);
        rVar.mo58887l(r92);
        Object l2 = rVar.f169962ag.mo58854l(r92.f169971d);
        if (l2 == null) {
            obj2 = r92.f169969b;
        } else {
            obj2 = r92.mo58889c(l2);
        }
        C57784p pVar = ((C57198d) obj2).f152708a;
        if (pVar == null) {
            pVar = C57784p.f154382f;
        }
        C69664n.m101060f(pVar, "dataOperation.feature\n  …          .elementsOutput");
        C69664n.m101061g(pVar, "value");
        afVar.copyOnWrite();
        C134544ai aiVar = (C134544ai) afVar.instance;
        pVar.getClass();
        aiVar.f366397c = pVar;
        aiVar.f366396b = 2;
        C57288cp cpVar = acVar3.f152755d;
        if (cpVar == null) {
            cpVar = C57288cp.f152930c;
        }
        C7669fo foVar = cpVar.f152933b;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        C69664n.m101060f(foVar, "dataOperation.metadata.contentId");
        C69664n.m101061g(foVar, "value");
        afVar.copyOnWrite();
        C134544ai aiVar2 = (C134544ai) afVar.instance;
        foVar.getClass();
        aiVar2.f366400f = foVar;
        aiVar2.f366395a |= 8;
        C57288cp cpVar2 = acVar3.f152755d;
        if (cpVar2 == null) {
            cpVar2 = C57288cp.f152930c;
        }
        String a4 = C134933i.m218817a(cpVar2);
        afVar.copyOnWrite();
        C134544ai aiVar3 = (C134544ai) afVar.instance;
        aiVar3.f366395a = 4 | aiVar3.f366395a;
        aiVar3.f366399e = a4;
        if (acVar3.f152752a == 3) {
            aqVar3 = (C57235aq) acVar3.f152753b;
        } else {
            aqVar3 = C57235aq.f152787g;
        }
        C62940bt r10 = C62942bv.checkIsLite(C57212r.f152735e);
        aqVar3.mo58887l(r10);
        Object l3 = aqVar3.f169962ag.mo58854l(r10.f169971d);
        if (l3 == null) {
            obj3 = r10.f169969b;
        } else {
            obj3 = r10.mo58889c(l3);
        }
        C57210p a5 = C57210p.m88269a(((C57212r) obj3).f152738b);
        if (a5 == null) {
            a5 = C57210p.ALIGNMENT_UNSPECIFIED;
        }
        C69664n.m101060f(a5, "dataOperation.feature.ge…ntentExtension).alignment");
        if (C134926b.f367370a[a5.ordinal()] == 1) {
            aeVar = C134540ae.CENTER;
        } else {
            aeVar = C134540ae.DEFAULT;
        }
        C69664n.m101061g(aeVar, "value");
        afVar.copyOnWrite();
        C134544ai aiVar4 = (C134544ai) afVar.instance;
        aiVar4.f366401g = aeVar.f366387d;
        aiVar4.f366395a |= 16;
        if (acVar3.f152752a == 3) {
            aqVar4 = (C57235aq) acVar3.f152753b;
        } else {
            aqVar4 = C57235aq.f152787g;
        }
        C62940bt r11 = C62942bv.checkIsLite(C57212r.f152735e);
        aqVar4.mo58887l(r11);
        if (aqVar4.f169962ag.mo58857o(r11.f169971d)) {
            if (acVar3.f152752a == 3) {
                aqVar5 = (C57235aq) acVar3.f152753b;
            } else {
                aqVar5 = C57235aq.f152787g;
            }
            C62940bt r12 = C62942bv.checkIsLite(C57212r.f152735e);
            aqVar5.mo58887l(r12);
            Object l4 = aqVar5.f169962ag.mo58854l(r12.f169971d);
            if (l4 == null) {
                obj4 = r12.f169969b;
            } else {
                obj4 = r12.mo58889c(l4);
            }
            if ((((C57212r) obj4).f152737a & 2) != 0) {
                if (acVar3.f152752a == 3) {
                    aqVar6 = (C57235aq) acVar3.f152753b;
                } else {
                    aqVar6 = C57235aq.f152787g;
                }
                C62940bt r4 = C62942bv.checkIsLite(C57212r.f152735e);
                aqVar6.mo58887l(r4);
                Object l5 = aqVar6.f169962ag.mo58854l(r4.f169971d);
                if (l5 == null) {
                    obj5 = r4.f169969b;
                } else {
                    obj5 = r4.mo58889c(l5);
                }
                C57206l lVar = ((C57212r) obj5).f152739c;
                if (lVar == null) {
                    lVar = C57206l.f152722a;
                }
                C69664n.m101060f(lVar, "dataOperation.feature.ge…ension).preresolutionData");
                C69664n.m101061g(lVar, "wirePreresolutionData");
                C134598p pVar2 = (C134598p) C134599q.f366550b.createBuilder();
                C69664n.m101060f(pVar2, "newBuilder()");
                C69664n.m101061g(pVar2, "builder");
                C62940bt r122 = C62942bv.checkIsLite(C57116d.f152466c);
                lVar.mo58887l(r122);
                Object l6 = lVar.f169962ag.mo58854l(r122.f169971d);
                if (l6 == null) {
                    obj6 = r122.f169969b;
                } else {
                    obj6 = r122.mo58889c(l6);
                }
                if (((List) obj6).size() > 0) {
                    C62940bt r123 = C62942bv.checkIsLite(C57116d.f152466c);
                    lVar.mo58887l(r123);
                    Object l7 = lVar.f169962ag.mo58854l(r123.f169971d);
                    if (l7 == null) {
                        obj7 = r123.f169969b;
                    } else {
                        obj7 = r123.mo58889c(l7);
                    }
                    C69664n.m101060f(obj7, "wirePreresolutionData\n  …OnDeviceMediaContentData)");
                    Iterator it = ((Iterable) obj7).iterator();
                    while (it.hasNext()) {
                        List unmodifiableList = Collections.unmodifiableList(((C134599q) pVar2.instance).f366552a);
                        C69664n.m101060f(unmodifiableList, "_builder.getFetchOnDeviceMediaContentDataList()");
                        new C62883b(unmodifiableList);
                        C134596n nVar = (C134596n) C134597o.f366547b.createBuilder();
                        C69664n.m101060f(nVar, "newBuilder()");
                        C69664n.m101061g(nVar, "builder");
                        C62971cq<C57114b> cqVar = ((C57116d) it.next()).f152468a;
                        C69664n.m101060f(cqVar, "contentData.collectionReferencesList");
                        for (C57114b bVar : cqVar) {
                            List unmodifiableList2 = Collections.unmodifiableList(((C134597o) nVar.instance).f366549a);
                            C69664n.m101060f(unmodifiableList2, "_builder.getCollectionReferenceList()");
                            new C62883b(unmodifiableList2);
                            C134594l lVar2 = (C134594l) C134595m.f366542d.createBuilder();
                            C69664n.m101060f(lVar2, "newBuilder()");
                            C69664n.m101061g(lVar2, "builder");
                            String str = bVar.f152463b;
                            C69664n.m101060f(str, "collectionReference.dataStoreKey");
                            C69664n.m101061g(str, "value");
                            lVar2.copyOnWrite();
                            C134595m mVar = (C134595m) lVar2.instance;
                            str.getClass();
                            Iterator it2 = it;
                            mVar.f366544a |= 2;
                            mVar.f366546c = str;
                            String str2 = bVar.f152462a;
                            C69664n.m101060f(str2, "collectionReference.watchCollectionId");
                            C69664n.m101061g(str2, "value");
                            lVar2.copyOnWrite();
                            C134595m mVar2 = (C134595m) lVar2.instance;
                            str2.getClass();
                            mVar2.f366544a |= 1;
                            mVar2.f366545b = str2;
                            C62942bv build = lVar2.build();
                            C69664n.m101060f(build, "_builder.build()");
                            C134595m mVar3 = (C134595m) build;
                            C69664n.m101061g(mVar3, "value");
                            nVar.copyOnWrite();
                            C134597o oVar = (C134597o) nVar.instance;
                            mVar3.getClass();
                            C62971cq cqVar2 = oVar.f366549a;
                            if (!cqVar2.mo58948c()) {
                                oVar.f366549a = C62942bv.mutableCopy(cqVar2);
                            }
                            oVar.f366549a.add(mVar3);
                            it = it2;
                        }
                        Iterator it3 = it;
                        C62942bv build2 = nVar.build();
                        C69664n.m101060f(build2, "_builder.build()");
                        C134597o oVar2 = (C134597o) build2;
                        C69664n.m101061g(oVar2, "value");
                        pVar2.copyOnWrite();
                        C134599q qVar = (C134599q) pVar2.instance;
                        oVar2.getClass();
                        C62971cq cqVar3 = qVar.f366552a;
                        if (!cqVar3.mo58948c()) {
                            qVar.f366552a = C62942bv.mutableCopy(cqVar3);
                        }
                        qVar.f366552a.add(oVar2);
                        it = it3;
                    }
                }
                C62942bv build3 = pVar2.build();
                C69664n.m101060f(build3, "_builder.build()");
                C134599q qVar2 = (C134599q) build3;
                C69664n.m101061g(qVar2, "value");
                afVar.copyOnWrite();
                C134544ai aiVar5 = (C134544ai) afVar.instance;
                qVar2.getClass();
                aiVar5.f366402h = qVar2;
                aiVar5.f366395a |= 32;
            }
        }
        C62942bv build4 = afVar.build();
        C69664n.m101060f(build4, "_builder.build()");
        C134544ai aiVar6 = (C134544ai) build4;
        C69664n.m101061g(aiVar6, "value");
        C134559ax axVar = a3.f366559a;
        axVar.copyOnWrite();
        C134560ay ayVar = (C134560ay) axVar.instance;
        aiVar6.getClass();
        ayVar.f366457c = aiVar6;
        ayVar.f366456b = 3;
        a2.mo111814d(a3.mo111840a());
        return a2.mo111811a();
    }
}
