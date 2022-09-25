package com.google.android.apps.gsa.staticplugins.p7547bp.p7550c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90187b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90188c;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23214k;
import com.google.android.libraries.p576aq.C10542e;
import com.google.android.libraries.p576aq.C10547j;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10563z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bp.c.c */
/* compiled from: PG */
public final class C96685c implements C23214k {

    /* renamed from: a */
    public C23214k f270489a;

    /* renamed from: b */
    final /* synthetic */ C96686d f270490b;

    /* renamed from: c */
    private final Enum f270491c;

    public C96685c(C96686d dVar, Enum enumR) {
        this.f270490b = dVar;
        this.f270491c = enumR;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        C58833ax axVar;
        this.f270490b.f270493b.put(this.f270491c, dVar);
        C23214k kVar = this.f270489a;
        if (kVar != null) {
            kVar.mo28675a(dVar);
        }
        int i = 0;
        if (dVar instanceof C90187b) {
            C96686d dVar2 = this.f270490b;
            Enum enumR = this.f270491c;
            C90187b bVar = (C90187b) dVar;
            for (C90188c cVar : dVar2.f270494c.keySet()) {
                C10563z c = bVar.mo83932c(cVar);
                if (c != null) {
                    C96688f e = dVar2.mo90314e(cVar);
                    C58833ax k = C58833ax.m90834k(enumR);
                    C58838bb.m90873h(!((C58495hd) e.f270504a.mo18622m()).containsKey(k), "Attempt to create an input with an already existing selector value: %s", k);
                    e.f270505b.mo18522d();
                    C10542e h = C10563z.m25516h(e.f270506c.mo18622m());
                    k.toString();
                    e.f270505b.mo18521c();
                    C10558u uVar = e.f270504a;
                    C58490gz gzVar = new C58490gz(4);
                    gzVar.mo55433l((Map) e.f270504a.mo18622m());
                    gzVar.mo55429h(k, h);
                    uVar.mo18619f(gzVar.mo55427f(false));
                    new C10547j(dVar2.f270496e.f35335b, h).mo18604b(c);
                }
            }
        }
        C96686d dVar3 = this.f270490b;
        Enum enumR2 = this.f270491c;
        while (true) {
            if (i < dVar3.f270500i.size()) {
                if (((C58833ax) dVar3.f270500i.get(i)).mo56113h() && ((C58833ax) dVar3.f270500i.get(i)).mo56107c() == enumR2) {
                    axVar = C58833ax.m90834k(Integer.valueOf(i));
                    break;
                }
                i++;
            } else {
                axVar = C58836b.f156633a;
                break;
            }
        }
        if (axVar.mo56113h()) {
            this.f270490b.mo90315f(((Integer) axVar.mo56107c()).intValue(), C58833ax.m90834k(dVar));
        }
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        this.f270490b.f270493b.remove(this.f270491c);
        if (dVar instanceof C90187b) {
            for (C90188c e : this.f270490b.f270494c.keySet()) {
                C96688f e2 = this.f270490b.mo90314e(e);
                C58833ax k = C58833ax.m90834k(this.f270491c);
                if (((C58495hd) e2.f270504a.mo18622m()).containsKey(k)) {
                    C58490gz gzVar = new C58490gz(4);
                    C58800sl lA = ((C58495hd) e2.f270504a.mo18622m()).entrySet().iterator();
                    while (lA.hasNext()) {
                        Map.Entry entry = (Map.Entry) lA.next();
                        if (!((C58833ax) entry.getKey()).equals(k)) {
                            gzVar.mo55430i(entry);
                        }
                    }
                    e2.f270504a.mo18619f(gzVar.mo55427f(false));
                }
            }
        }
        C23214k kVar = this.f270489a;
        if (kVar != null) {
            kVar.mo28676b(dVar);
        }
    }
}
