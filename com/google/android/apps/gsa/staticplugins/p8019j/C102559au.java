package com.google.android.apps.gsa.staticplugins.p8019j;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.assistant.p3897e.p3917i.p3918a.C51421hb;
import com.google.assistant.p3897e.p3917i.p3918a.C51422hc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66559ap;
import com.google.speech.p5208h.C66560aq;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.au */
/* compiled from: PG */
final class C102559au implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C66566aw f286241a;

    /* renamed from: b */
    final /* synthetic */ C2164c f286242b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f286243c;

    /* renamed from: d */
    final /* synthetic */ C51421hb f286244d;

    public C102559au(C66566aw awVar, C2164c cVar, C58833ax axVar, C51421hb hbVar) {
        this.f286241a = awVar;
        this.f286242b = cVar;
        this.f286243c = axVar;
        this.f286244d = hbVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C51421hb hbVar = this.f286244d;
        C66566aw awVar = this.f286241a;
        C66559ap apVar = (C66559ap) C66560aq.f181048d.createBuilder();
        apVar.copyOnWrite();
        C66560aq aqVar = (C66560aq) apVar.instance;
        aqVar.f181050a |= 1;
        aqVar.f181051b = "tch";
        apVar.copyOnWrite();
        C66560aq aqVar2 = (C66560aq) apVar.instance;
        aqVar2.f181050a |= 2;
        aqVar2.f181052c = "6";
        C66559ap apVar2 = (C66559ap) C66560aq.f181048d.createBuilder();
        apVar2.copyOnWrite();
        C66560aq aqVar3 = (C66560aq) apVar2.instance;
        aqVar3.f181050a |= 1;
        aqVar3.f181051b = "wf";
        apVar2.copyOnWrite();
        C66560aq aqVar4 = (C66560aq) apVar2.instance;
        aqVar4.f181050a |= 2;
        aqVar4.f181052c = "pp1";
        C66559ap apVar3 = (C66559ap) C66560aq.f181048d.createBuilder();
        apVar3.copyOnWrite();
        C66560aq aqVar5 = (C66560aq) apVar3.instance;
        aqVar5.f181050a |= 1;
        aqVar5.f181051b = "noj";
        apVar3.copyOnWrite();
        C66560aq aqVar6 = (C66560aq) apVar3.instance;
        aqVar6.f181050a |= 2;
        aqVar6.f181052c = "1";
        awVar.mo59676a(C58485gu.m89848p((C66560aq) apVar.build(), (C66560aq) apVar2.build(), (C66560aq) apVar3.build()));
        C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
        arVar.copyOnWrite();
        C66563at atVar = (C66563at) arVar.instance;
        atVar.f181056a |= 1;
        atVar.f181057b = "X-Agsa-Voice-Search";
        arVar.copyOnWrite();
        C66563at atVar2 = (C66563at) arVar.instance;
        atVar2.f181056a |= 2;
        atVar2.f181058c = "apvs";
        awVar.copyOnWrite();
        C66567ax axVar = (C66567ax) awVar.instance;
        C66563at atVar3 = (C66563at) arVar.build();
        C66567ax axVar2 = C66567ax.f181069f;
        atVar3.getClass();
        axVar.mo59679a();
        axVar.f181075d.add(atVar3);
        C63088z byteString = ((C66567ax) awVar.build()).toByteString();
        hbVar.copyOnWrite();
        C51422hc hcVar = (C51422hc) hbVar.instance;
        C51422hc hcVar2 = C51422hc.f133938f;
        byteString.getClass();
        hcVar.f133940a |= 2;
        hcVar.f133942c = byteString;
        this.f286242b.mo5437b(C58833ax.m90834k((C51422hc) this.f286244d.build()));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x d = C102560av.f286245a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GwsRequestParams");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(13990)).mo56386p("Error in filling ASH GwsRequestParams.");
        this.f286242b.mo5437b(this.f286243c);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C18496n nVar = (C18496n) obj;
        this.f286241a.mo59676a((Iterable) Collection.EL.stream(nVar.f52440a).map(C102557as.f286239a).collect(Collectors.toList()));
        this.f286241a.mo59677b((Iterable) Collection.EL.stream(nVar.f52441b).map(C102558at.f286240a).collect(Collectors.toList()));
    }
}
