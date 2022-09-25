package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123765ce;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48636by;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48637bz;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48639ca;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48640cb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C111123i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111130p f309376a;

    public /* synthetic */ C111123i(C111130p pVar) {
        this.f309376a = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111130p pVar = this.f309376a;
        C58976aa aaVar = C58975e.f156826a;
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C123746bm) obj).f341820a).filter(C111124j.f309377a).map(C111125k.f309378a).filter(C111126l.f309379a).flatMap(C111127m.f309380a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            long b = pVar.f309384b.mo26870b();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return (C48635bx) bvVar.build();
        }
        ArrayList arrayList = new ArrayList();
        List list = (List) Collection.EL.stream(guVar).filter(C111128n.f309381a).collect(Collectors.toList());
        if (list.size() > 1) {
            C59104x d = C111130p.f309383a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TopContactInfosFetcher");
            ((C59052c) ((C59052c) d).mo56372aa(27113)).mo56386p("Unexpected duplicate TEXT TopContactSections.");
        }
        C123768ch chVar = (C123768ch) list.get(0);
        chVar.getClass();
        chVar.f341897b.size();
        for (C123766cf cfVar : chVar.f341897b) {
            List a = pVar.f309385c.mo100109a(cfVar.f341889d, C113320q.TEXT);
            a.addAll(pVar.f309385c.mo100109a(cfVar.f341889d, C113320q.CALL));
            C48637bz bzVar = (C48637bz) C48639ca.f125713c.createBuilder();
            C123765ce ceVar = (C123765ce) cfVar.toBuilder();
            C123762cb cbVar = C123762cb.TEXT;
            ceVar.copyOnWrite();
            C123766cf cfVar2 = (C123766cf) ceVar.instance;
            cfVar2.f341891f = cbVar.f341879e;
            cfVar2.f341886a |= 16;
            C123766cf cfVar3 = (C123766cf) ceVar.build();
            bzVar.copyOnWrite();
            cfVar3.getClass();
            ((C48639ca) bzVar.instance).f125715a = cfVar3;
            bzVar.mo53163a(a);
            arrayList.add((C48639ca) bzVar.build());
        }
        List list2 = (List) Collection.EL.stream(guVar).filter(C111129o.f309382a).collect(Collectors.toList());
        if (list2.size() > 1) {
            C59104x d2 = C111130p.f309383a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TopContactInfosFetcher");
            ((C59052c) ((C59052c) d2).mo56372aa(27111)).mo56386p("Unexpected duplicate CALL TopContactSections.");
        }
        C123768ch chVar2 = (C123768ch) list2.get(0);
        chVar2.getClass();
        chVar2.f341897b.size();
        for (C123766cf cfVar4 : chVar2.f341897b) {
            List a2 = pVar.f309385c.mo100109a(cfVar4.f341889d, C113320q.CALL);
            a2.addAll(pVar.f309385c.mo100109a(cfVar4.f341889d, C113320q.TEXT));
            C48637bz bzVar2 = (C48637bz) C48639ca.f125713c.createBuilder();
            C123765ce ceVar2 = (C123765ce) cfVar4.toBuilder();
            C123762cb cbVar2 = C123762cb.CALL;
            ceVar2.copyOnWrite();
            C123766cf cfVar5 = (C123766cf) ceVar2.instance;
            cfVar5.f341891f = cbVar2.f341879e;
            cfVar5.f341886a |= 16;
            C123766cf cfVar6 = (C123766cf) ceVar2.build();
            bzVar2.copyOnWrite();
            cfVar6.getClass();
            ((C48639ca) bzVar2.instance).f125715a = cfVar6;
            bzVar2.mo53163a(a2);
            arrayList.add((C48639ca) bzVar2.build());
        }
        C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
        C48636by byVar = (C48636by) C48640cb.f125717b.createBuilder();
        byVar.copyOnWrite();
        C48640cb cbVar3 = (C48640cb) byVar.instance;
        C62971cq cqVar = cbVar3.f125719a;
        if (!cqVar.mo58948c()) {
            cbVar3.f125719a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) cbVar3.f125719a);
        bvVar2.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar2.instance;
        C48640cb cbVar4 = (C48640cb) byVar.build();
        cbVar4.getClass();
        bxVar.f125707b = cbVar4;
        bxVar.f125706a = 4;
        long b2 = pVar.f309384b.mo26870b();
        bvVar2.copyOnWrite();
        ((C48635bx) bvVar2.instance).f125708c = b2;
        return (C48635bx) bvVar2.build();
    }
}
