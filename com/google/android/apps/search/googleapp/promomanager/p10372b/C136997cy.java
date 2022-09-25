package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63910ax;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63916bc;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cy */
/* compiled from: PG */
public final /* synthetic */ class C136997cy implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137003dd f372822a;

    /* renamed from: b */
    public final /* synthetic */ C137046o f372823b;

    /* renamed from: c */
    public final /* synthetic */ C137007dh f372824c;

    public /* synthetic */ C136997cy(C137003dd ddVar, C137046o oVar, C137007dh dhVar) {
        this.f372822a = ddVar;
        this.f372823b = oVar;
        this.f372824c = dhVar;
    }

    public final Object apply(Object obj) {
        C63959w wVar;
        C137003dd ddVar = this.f372822a;
        C137046o oVar = this.f372823b;
        C137007dh dhVar = this.f372824c;
        C63915bb bbVar = (C63915bb) obj;
        ddVar.f372849l.mo19974a(C37182a.f97896cV.mo40779c());
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172820c;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C63958v a = C63958v.m96327a(wVar.f172983a);
        if (a == null) {
            a = C63958v.TYPE_UNSPECIFIED;
        }
        C63926bm a2 = C63926bm.m96318a(dhVar.f372874d);
        if (a2 == null) {
            a2 = C63926bm.UNSPECIFIED;
        }
        C63919bf k = ddVar.mo113476k(i, a, a2, oVar);
        if (C63919bf.f172845g.equals(k)) {
            ddVar.mo113477x(C37182a.f98156hQ.mo40806d(), dhVar, C63042fg.f170152c);
            return bbVar;
        }
        C63910ax axVar = (C63910ax) bbVar.toBuilder();
        C63916bc d = C137004de.m222697d(i, axVar);
        int i2 = ((C63917bd) d.instance).f172843h;
        d.copyOnWrite();
        C63917bd bdVar = (C63917bd) d.instance;
        bdVar.f172836a |= 64;
        bdVar.f172843h = i2 + 1;
        C63042fg i3 = C62953e.m95484i(ddVar.f372846i.mo26870b());
        d.copyOnWrite();
        C63917bd bdVar2 = (C63917bd) d.instance;
        i3.getClass();
        bdVar2.f172844i = i3;
        bdVar2.f172836a |= 128;
        C63915bb c = C137004de.m222696c(k, axVar, d);
        ddVar.mo113477x(C37182a.f97897cW.mo40806d(), dhVar, C63042fg.f170152c);
        return c;
    }
}
