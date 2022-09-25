package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116435f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.android.libraries.gsa.p1880l.C22880h;
import com.google.common.base.C58833ax;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62963cj;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C116376ag implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116381al f322708a;

    public /* synthetic */ C116376ag(C116381al alVar) {
        this.f322708a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116424c cVar;
        C116381al alVar = this.f322708a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            cVar = (C116424c) axVar.mo56107c();
        } else {
            C22876d dVar = alVar.f322720h;
            int i = dVar.f62946a;
            if ((262144 & i) != 0) {
                C22880h hVar = dVar.f62963r;
                if (hVar == null) {
                    hVar = C22880h.f62974h;
                }
                if ((hVar.f62976a & 32) != 0) {
                    C57578av avVar = hVar.f62982g;
                    if (avVar == null) {
                        avVar = C57578av.f153822h;
                    }
                    cVar = C116371ab.m193010a(avVar);
                }
            } else if ((i & 16) != 0) {
                C22875c a = C22875c.m42745a(dVar.f62951f);
                if (a == null) {
                    a = C22875c.IMAGE;
                }
                int i2 = a.f62943e;
                Iterator it = ((C116426e) ((C23251a) alVar.f322715c.mo102657b()).f63720e).f322832a.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C116424c cVar2 = (C116424c) it.next();
                    Iterator it2 = new C62963cj(cVar2.f322822f, C116424c.f322814g).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C57665z zVar = (C57665z) it2.next();
                            C57563ag a2 = C57563ag.m88496a(cVar2.f322821e);
                            if (a2 == null) {
                                a2 = C57563ag.UNRECOGNIZED;
                            }
                            if (a2 == C57563ag.FAVORITES && C116381al.m193027e(zVar) == i2) {
                                cVar = cVar2;
                                break loop0;
                            }
                        }
                    }
                }
            }
            cVar = null;
        }
        if (cVar == null) {
            alVar.mo102678t();
        } else {
            alVar.f322721i = cVar;
            ((C23251a) alVar.f322715c.mo102662g()).mo28730f(C58833ax.m90834k(C116435f.CONFIRMATION_TRAY_VISIBLE), false);
            alVar.mo102670l(alVar.f322721i, false);
        }
        return C118826c.f331422a;
    }
}
