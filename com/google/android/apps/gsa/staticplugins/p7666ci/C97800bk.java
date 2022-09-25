package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123725as;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123747bn;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bk */
/* compiled from: PG */
public final /* synthetic */ class C97800bk implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273074a;

    /* renamed from: b */
    public final /* synthetic */ List f273075b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f273076c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f273077d;

    /* renamed from: e */
    public final /* synthetic */ C123777f f273078e;

    /* renamed from: f */
    public final /* synthetic */ C58495hd f273079f;

    public /* synthetic */ C97800bk(C97811bv bvVar, List list, C58485gu guVar, C53306j jVar, C123777f fVar, C58495hd hdVar) {
        this.f273074a = bvVar;
        this.f273075b = list;
        this.f273076c = guVar;
        this.f273077d = jVar;
        this.f273078e = fVar;
        this.f273079f = hdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        String str;
        C97811bv bvVar = this.f273074a;
        List list = this.f273075b;
        C58485gu guVar = this.f273076c;
        C53306j jVar = this.f273077d;
        C123777f fVar = this.f273078e;
        C58495hd hdVar = this.f273079f;
        List list2 = (List) obj;
        C118364f fVar2 = (C118364f) C118365g.f328542b.createBuilder();
        int i = 0;
        while (i < list2.size()) {
            C58833ax axVar = (C58833ax) list2.get(i);
            if (list.size() <= i || C123747bn.m203106b(((Integer) list.get(i)).intValue()) == 0) {
                str = "unknown";
            } else {
                int b = C123747bn.m203106b(((Integer) list.get(i)).intValue());
                str = C123747bn.m203105a(b);
                if (b == 0) {
                    throw null;
                }
            }
            if (axVar != null) {
                if (axVar.mo56113h()) {
                    C59104x b2 = C97811bv.f273109a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                    ((C59052c) ((C59052c) b2).mo56372aa(30268)).mo56389s("RequestType:%s data success.", str);
                    fVar2.mo103679a(((C118365g) axVar.mo56107c()).f328544a);
                    i++;
                } else {
                    C59104x d = C97811bv.f273109a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                    ((C59052c) ((C59052c) d).mo56372aa(30267)).mo56389s("RequestType:%s success but is empty.", str);
                }
            }
            C60870cx cxVar = (C60870cx) guVar.get(i);
            if (cxVar == null || !cxVar.isDone()) {
                C59104x d2 = C97811bv.f273109a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                ((C59052c) ((C59052c) d2).mo56372aa(30263)).mo56389s("RequestType:%s Future was null or has failed.", str);
                i++;
            } else {
                try {
                    C60856cj.m92909r(cxVar);
                    C59104x d3 = C97811bv.f273109a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                    ((C59052c) ((C59052c) d3).mo56372aa(30264)).mo56389s("RequestType:%s Future result was not null but did not fail?", str);
                } catch (Exception e) {
                    C59104x c = C97811bv.f273109a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30265)).mo56389s("Data future failed for data type %s", str);
                    if (e.getCause() != null) {
                        C59104x c2 = C97811bv.f273109a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e.getCause())).mo56372aa(30266)).mo56386p("Future failure cause");
                    }
                }
                i++;
            }
        }
        if (bvVar.f273129j.mo79746e(C90051dc.f248917n) && jVar.equals(C53306j.MORRIS_DRIVING_SCREEN) && list.contains(10)) {
            C62940bt r1 = C62942bv.checkIsLite(C123726at.f341744i);
            fVar.mo58887l(r1);
            if (fVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C123726at.f341744i);
                fVar.mo58887l(r12);
                Object l = fVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                int a = C123725as.m203079a(((C123726at) obj2).f341750e);
                if (a != 0 && a == 4) {
                    C22871g gVar = bvVar.f273126g;
                    C60870cx a2 = bvVar.f273133n.mo103704a(10);
                    C118366g gVar2 = bvVar.f273132m;
                    Objects.requireNonNull(gVar2);
                    C60870cx j = gVar.mo28210j(a2, "#getProactiveDataPreferenceStoreKey()", new C97785ay(gVar2));
                    C97806bq bqVar = new C97806bq(bvVar, hdVar, jVar, fVar);
                    C60856cj.m92911t(j, C47810es.m84974n(bqVar), C60826bg.f164896a);
                }
            }
        }
        return bvVar.f273140u.mo103703a((C118365g) fVar2.build(), jVar, fVar);
    }
}
