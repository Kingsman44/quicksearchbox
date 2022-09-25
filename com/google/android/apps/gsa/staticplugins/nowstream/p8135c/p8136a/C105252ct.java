package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91394f;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91395g;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91657f;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8140d.C105327a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105359u;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ct */
/* compiled from: PG */
public final class C105252ct implements C105359u {

    /* renamed from: a */
    final /* synthetic */ C105263dd f293526a;

    /* renamed from: b */
    private final Collection f293527b;

    public C105252ct(C105263dd ddVar, Collection collection) {
        this.f293526a = ddVar;
        this.f293527b = collection;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo94667a(Object obj) {
        C58833ax axVar;
        C91396h hVar = (C91396h) obj;
        if (!this.f293526a.f293551J && hVar != null) {
            if (this.f293527b.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            Iterator it = this.f293527b.iterator();
            C7669fo foVar = null;
            while (foVar == null && it.hasNext()) {
                C7718hj hjVar = (C7718hj) it.next();
                if ((hjVar.f26955a & 4) != 0 && (foVar = hjVar.f26968i) == null) {
                    foVar = C7669fo.f26633e;
                }
            }
            C105263dd ddVar = this.f293526a;
            C105687ar arVar = ddVar.f293549H;
            if (arVar != null) {
                arVar.mo94988z(hVar.mo85711a().mo85720c());
                if (foVar != null) {
                    ddVar.f293562U.mo94726c(hVar);
                    C105327a aVar = ddVar.f293562U;
                    String d = C91994m.m150997d(foVar);
                    C58833ax a = C91394f.m149470a(aVar.f293895b.mo85712b(), d);
                    if (!a.mo56113h()) {
                        aVar.mo94725b("Failed to getNextPage cursor with anchor ".concat(d));
                        aVar.mo94728f();
                        axVar = C58836b.f156633a;
                    } else {
                        C91395g gVar = (C91395g) a.mo56111f();
                        aVar.f293896c = gVar;
                        if (gVar == null) {
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(C105327a.m174973a(C58570jy.m90160l(gVar.f254979a, ((Integer) aVar.f293894a.mo94627l().f63720e).intValue())));
                        }
                    }
                    if (!axVar.mo56113h()) {
                        ddVar.mo94688s();
                        return;
                    }
                    ddVar.f293562U.mo94729g();
                    ddVar.mo94675G(arVar, (List) axVar.mo56109e(C58485gu.m89845m()));
                    if (arVar.f294846Q) {
                        C91657f fVar = ddVar.f293633z;
                        boolean z = ddVar.f293563V;
                        fVar.mo86062e(z);
                        synchronized (fVar.f255627a) {
                            if (fVar.mo86067j(z)) {
                                fVar.mo86064g(z, 3);
                                fVar.mo86058a(C37182a.f98086g.mo40805c(C62722b.OK), z);
                            }
                        }
                    }
                    arVar.mo94980r();
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
                if (ddVar.f293561T) {
                    ddVar.mo94676H(arVar);
                    ddVar.f293561T = false;
                }
            }
        }
    }
}
