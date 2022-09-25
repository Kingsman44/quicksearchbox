package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9211a;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121212a;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121219ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121238c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62995dn;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.a.a */
/* compiled from: PG */
public final /* synthetic */ class C121381a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121385e f337010a;

    public /* synthetic */ C121381a(C121385e eVar) {
        this.f337010a = eVar;
    }

    public final Object apply(Object obj) {
        C121238c cVar;
        C121385e eVar = this.f337010a;
        C58485gu guVar = (C58485gu) obj;
        C121219ad adVar = (C121219ad) C121220ae.f336741f.createBuilder();
        long epochMilli = eVar.f337015b.mo57444a().toEpochMilli();
        adVar.copyOnWrite();
        C121220ae aeVar = (C121220ae) adVar.instance;
        aeVar.f336743a |= 1;
        aeVar.f336746d = epochMilli;
        C48714bv bvVar = C48714bv.APP_ACTIONS_SIGNAL;
        adVar.copyOnWrite();
        C121220ae aeVar2 = (C121220ae) adVar.instance;
        aeVar2.f336747e = bvVar.f126042j;
        aeVar2.f336743a |= 2;
        if (guVar == null) {
            C59104x d = C121385e.f337014a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppActionsSignalFetcher");
            ((C58970a) ((C58970a) d).mo56372aa(35800)).mo56386p("AppActionsSignalFetcher fetched no response from Geller APP_ACTIONS corpus.");
            cVar = C121238c.f336777b;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            guVar.size();
            C58495hd hdVar = (C58495hd) Collection.EL.stream(guVar).collect(C58370cn.m89403c(C121382b.f337011a, C121383c.f337012a, C121384d.f337013a));
            C121212a aVar = (C121212a) C121238c.f336777b.createBuilder();
            aVar.copyOnWrite();
            C121238c cVar2 = (C121238c) aVar.instance;
            C62995dn dnVar = cVar2.f336779a;
            if (!dnVar.f170058b) {
                cVar2.f336779a = dnVar.mo58980a();
            }
            cVar2.f336779a.putAll(hdVar);
            cVar = (C121238c) aVar.build();
        }
        adVar.copyOnWrite();
        C121220ae aeVar3 = (C121220ae) adVar.instance;
        cVar.getClass();
        aeVar3.f336745c = cVar;
        aeVar3.f336744b = 3;
        return (C121220ae) adVar.build();
    }
}
