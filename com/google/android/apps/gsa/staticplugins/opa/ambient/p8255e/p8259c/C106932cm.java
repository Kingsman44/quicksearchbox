package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cm */
/* compiled from: PG */
public final /* synthetic */ class C106932cm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297854a;

    public /* synthetic */ C106932cm(C106941cv cvVar) {
        this.f297854a = cvVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C106941cv cvVar = this.f297854a;
        C123777f fVar = (C123777f) obj;
        ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23410)).mo56389s("getProactiveContent with state : %s", fVar);
        cvVar.f297878f.mo77077a("4/9: Selected media apps.");
        C118339a aVar = cvVar.f297875c;
        C53306j jVar = C53306j.AMBIENT_ASSISTANT;
        C58480gp e = C58485gu.m89837e();
        ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23403)).mo56386p("getProactiveContent using on device media");
        e.mo55395g(9);
        if (cvVar.f297874b.mo79746e(C90017bw.f248023cw)) {
            ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23405)).mo56386p("[Media.Potter] getProactiveContent using potter media");
            e.mo55395g(19);
        } else if (cvVar.f297874b.mo79746e(C90017bw.f247905aT)) {
            C62940bt r4 = C62942bv.checkIsLite(C123726at.f341744i);
            fVar.mo58887l(r4);
            Object l = fVar.f169962ag.mo58854l(r4.f169971d);
            if (l == null) {
                obj2 = r4.f169969b;
            } else {
                obj2 = r4.mo58889c(l);
            }
            if (Collection.EL.stream(((C123726at) obj2).f341747b).map(C106937cr.f297867a).anyMatch(new C106938cs())) {
                ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23404)).mo56386p("[Media.Potter] Using Potter for YTM");
                e.mo55395g(19);
            }
        }
        return aVar.mo90815e(jVar, e.mo55394f(), cvVar.f297874b.mo79746e(C90017bw.f248029f), fVar);
    }
}
