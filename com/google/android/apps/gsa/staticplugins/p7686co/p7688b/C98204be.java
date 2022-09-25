package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.be */
/* compiled from: PG */
public final /* synthetic */ class C98204be implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98208bi f274198a;

    /* renamed from: b */
    public final /* synthetic */ boolean f274199b;

    public /* synthetic */ C98204be(C98208bi biVar, boolean z) {
        this.f274198a = biVar;
        this.f274199b = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C7708h hVar;
        C98208bi biVar = this.f274198a;
        boolean z = this.f274199b;
        biVar.f274208e.f274231u.remove(biVar);
        C60870cx cxVar = C118826c.f331423b;
        if (z) {
            ((C118831d) biVar.f274208e.f274229s.mo6453a()).mo104025g((long) biVar.f274206c.size());
            C98211bl blVar = biVar.f274208e;
            Set<String> set = biVar.f274206c;
            C58485gu<C7752iq> guVar = biVar.f274207d;
            C118316g c = blVar.f274218h.mo91759c();
            C118329t e = blVar.f274218h.mo91760e();
            for (String b : set) {
                c.mo103661b(b);
            }
            int i = 0;
            for (C7752iq iqVar : guVar) {
                if (iqVar.f27132b == 1) {
                    C58528ij ijVar = C98211bl.f254943b;
                    C7681g a = C7681g.m22802a(((C7708h) iqVar.f27133c).f26897b);
                    if (a == null) {
                        a = C7681g.INVALID;
                    }
                    if (ijVar.contains(a)) {
                        C7751ip ipVar = (C7751ip) iqVar.toBuilder();
                        C7752iq iqVar2 = (C7752iq) ipVar.instance;
                        if (iqVar2.f27132b == 1) {
                            hVar = (C7708h) iqVar2.f27133c;
                        } else {
                            hVar = C7708h.f26894n;
                        }
                        C7573c cVar = (C7573c) hVar.toBuilder();
                        cVar.copyOnWrite();
                        C7708h hVar2 = (C7708h) cVar.instance;
                        hVar2.f26896a |= 8;
                        hVar2.f26900e = false;
                        ipVar.copyOnWrite();
                        C7752iq iqVar3 = (C7752iq) ipVar.instance;
                        C7708h hVar3 = (C7708h) cVar.build();
                        hVar3.getClass();
                        iqVar3.f27133c = hVar3;
                        iqVar3.f27132b = 1;
                        blVar.mo91031y(e, (C7752iq) ipVar.build(), false);
                        i++;
                    }
                }
                if (iqVar.f27132b != 1) {
                    C59104x c2 = C98211bl.f274214e.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "EuaStore");
                    ((C59052c) ((C59052c) c2).mo56372aa(30576)).mo56386p("Encountered null action in ExecutedUserAction");
                }
            }
            ((C118831d) blVar.f274230t.mo6453a()).mo104025g((long) i);
            C98212c cVar2 = new C98212c(e, c);
            C60870cx i2 = C60856cj.m92900i(true);
            C118316g gVar = cVar2.f274234b;
            int i3 = gVar.f328434b;
            if (i3 > 0 && cVar2.f274233a.f328456b > 0) {
                i2 = biVar.f274208e.f274218h.mo91762h(gVar.mo103660a(), cVar2.f274233a.mo103669c());
            } else if (i3 > 0) {
                i2 = biVar.f274208e.f274218h.mo91762h(gVar.mo103660a());
            } else {
                C118329t tVar = cVar2.f274233a;
                if (tVar.f328456b > 0) {
                    i2 = biVar.f274208e.f274218h.mo91762h(tVar.mo103669c());
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            cxVar = C118826c.m197213c(i2);
        }
        return C60922j.m93045h(cxVar, new C98206bg(biVar), C60826bg.f164896a);
    }
}
