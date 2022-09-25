package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j;

import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8454e.C110665a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8463n.C110840a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8464o.C110842a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.j.a */
/* compiled from: PG */
public final /* synthetic */ class C110702a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110707f f308463a;

    public /* synthetic */ C110702a(C110707f fVar) {
        this.f308463a = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C123757bx bxVar;
        C123779h hVar;
        C123759bz bzVar;
        C110707f fVar = this.f308463a;
        Optional findFirst = Collection.EL.stream(((C123746bm) obj).f341820a).filter(C110705d.f308466a).findFirst();
        if (findFirst.isEmpty()) {
            return C60856cj.m92900i(C83800p.m133473k().mo77042a());
        }
        C110714m mVar = fVar.f308470c;
        C123744bk bkVar = (C123744bk) findFirst.get();
        C83739ak b = C110714m.m184430b(bkVar);
        int i = bkVar.f341810e;
        if (i == 11) {
            return mVar.f308486c.mo98852a(b);
        }
        if (i == 7) {
            return mVar.f308485b.mo98930b(b);
        }
        if (i == 17) {
            C50818do b2 = mVar.f308487d.mo98760b(b);
            if (b2 == null) {
                return C60856cj.m92899h(new IllegalArgumentException("Null event data"));
            }
            C83798n k = C83800p.m133473k();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            amVar.f228252c = b2;
            amVar.f228250a |= 4;
            k.mo77043b((C83741am) alVar.build());
            return C60856cj.m92900i(k.mo77042a());
        } else if (i == 16) {
            C110842a aVar = mVar.f308489f;
            C83738aj ajVar = b.f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 7) {
                bzVar = (C123759bz) ajVar.f228229b;
            } else {
                bzVar = C123759bz.f341867e;
            }
            if (bzVar.f341870b.isEmpty() || bzVar.f341871c.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                return C60856cj.m92899h(new IllegalArgumentException("Empty tips data received"));
            }
            C50818do a = aVar.mo98895a(bzVar, b.f228237f);
            if (a == null) {
                return C60856cj.m92899h(new IllegalArgumentException("Card creation failed for tips"));
            }
            C83798n k2 = C83800p.m133473k();
            C83740al alVar2 = (C83740al) C83741am.f228248e.createBuilder();
            alVar2.copyOnWrite();
            C83741am amVar2 = (C83741am) alVar2.instance;
            amVar2.f228252c = a;
            amVar2.f228250a |= 4;
            k2.mo77043b((C83741am) alVar2.build());
            return C60856cj.m92900i(k2.mo77042a());
        } else if (i == 25) {
            return mVar.f308492i.mo98860b(b);
        } else {
            if (i == 41) {
                return mVar.f308492i.mo98860b(b);
            }
            if (i == 32) {
                C110665a aVar2 = mVar.f308490g;
                C59104x b3 = C110665a.f308379a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "SSCommuteTimeIH");
                ((C59052c) ((C59052c) b3).mo56372aa(26584)).mo56386p("handle commute time proactive data input.");
                C83738aj ajVar2 = b.f228233b;
                if (ajVar2 == null) {
                    ajVar2 = C83738aj.f228226c;
                }
                if (ajVar2.f228228a == 18) {
                    hVar = (C123779h) ajVar2.f228229b;
                } else {
                    hVar = C123779h.f341925m;
                }
                if (hVar.f341930d.isEmpty() || hVar.f341931e.isEmpty()) {
                    C59104x d = C110665a.f308379a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SSCommuteTimeIH");
                    ((C59052c) ((C59052c) d).mo56372aa(26585)).mo56386p("Received incomplete commute time update.");
                    return C60856cj.m92899h(new IllegalArgumentException("Empty commute time data received"));
                }
                C50818do a2 = aVar2.mo98838a(hVar, b.f228237f);
                if (a2 == null) {
                    return C60856cj.m92899h(new IllegalArgumentException("Card creation failed for commute time"));
                }
                C83798n k3 = C83800p.m133473k();
                C83740al alVar3 = (C83740al) C83741am.f228248e.createBuilder();
                alVar3.copyOnWrite();
                C83741am amVar3 = (C83741am) alVar3.instance;
                amVar3.f228252c = a2;
                amVar3.f228250a |= 4;
                k3.mo77043b((C83741am) alVar3.build());
                return C60856cj.m92900i(k3.mo77042a());
            } else if (i != 31) {
                return C60856cj.m92899h(new IllegalArgumentException("Unsupported Smartspace data from pcp"));
            } else {
                C110840a aVar3 = mVar.f308491h;
                C59104x b4 = C110840a.f308808a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "SSTimeToLeaveIH");
                ((C59052c) ((C59052c) b4).mo56372aa(26811)).mo56386p("handle time to leave proactive data input.");
                C83738aj ajVar3 = b.f228233b;
                if (ajVar3 == null) {
                    ajVar3 = C83738aj.f228226c;
                }
                if (ajVar3.f228228a == 19) {
                    bxVar = (C123757bx) ajVar3.f228229b;
                } else {
                    bxVar = C123757bx.f341854l;
                }
                if (bxVar.f341859d.isEmpty() || bxVar.f341860e.isEmpty()) {
                    C59104x d2 = C110840a.f308808a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "SSTimeToLeaveIH");
                    ((C59052c) ((C59052c) d2).mo56372aa(26812)).mo56386p("Received incomplete time to leave update.");
                    return C60856cj.m92899h(new IllegalArgumentException("Empty time to leave data received"));
                }
                C83800p a3 = aVar3.mo98894a(bxVar, b.f228237f);
                if (a3 != null) {
                    return C60856cj.m92900i(a3);
                }
                return C60856cj.m92899h(new IllegalArgumentException("Card creation failed for time to leave"));
            }
        }
    }
}
