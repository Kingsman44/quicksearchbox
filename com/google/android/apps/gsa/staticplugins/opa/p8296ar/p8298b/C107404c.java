package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83687f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48876s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.c */
/* compiled from: PG */
public final /* synthetic */ class C107404c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C91006f f298917a;

    public /* synthetic */ C107404c(C91006f fVar) {
        this.f298917a = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        List list;
        List<C83685d> list2;
        C48855bv bvVar;
        C48840bg bgVar;
        String str;
        C91006f fVar = this.f298917a;
        List list3 = (List) obj;
        if (list3.get(0) != null) {
            list = (List) list3.get(0);
        } else {
            list = new ArrayList();
        }
        if (list3.get(1) != null) {
            list2 = (List) list3.get(1);
        } else {
            list2 = new ArrayList<>();
        }
        Iterator it = list.iterator();
        while (true) {
            int i = 2;
            if (it.hasNext()) {
                C83683b bVar = (C83683b) it.next();
                C91005e c = fVar.mo85279c("ContentType");
                int a = C48876s.m85289a(bVar.f228111e);
                if (a == 0) {
                    a = 1;
                }
                switch (a - 1) {
                    case 200:
                        str = "MOBILE_NOTIFICATION";
                        break;
                    case 201:
                        str = "ZERO_STATE_CARD";
                        break;
                    case 202:
                        str = "ZERO_STATE_METADATA";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                c.mo85276a(C90752i.m148229c(str));
                C91006f e = fVar.mo85281e((Object) null);
                C91005e c2 = e.mo85279c("ParentJourneySelector");
                C48851br brVar = bVar.f228110d;
                if (brVar == null) {
                    brVar = C48851br.f126412f;
                }
                C48855bv bvVar2 = brVar.f126417d;
                if (bvVar2 == null) {
                    bvVar2 = C48855bv.f126424b;
                }
                c2.mo85276a(C90752i.m148229c(C107408g.m178311h(bvVar2)));
                C91005e c3 = e.mo85279c("id");
                C48851br brVar2 = bVar.f228110d;
                if (brVar2 == null) {
                    brVar2 = C48851br.f126412f;
                }
                c3.mo85276a(C90752i.m148229c(brVar2.f126418e.mo59170I(C90772bp.f253863a)));
                C91005e c4 = e.mo85279c("status");
                int a2 = C83687f.m133251a(bVar.f228108b);
                if (a2 != 0) {
                    i = a2;
                }
                c4.mo85276a(C90752i.m148229c(C107431k.m178349g(i)));
            } else {
                for (C83685d dVar : list2) {
                    C91005e c5 = fVar.mo85279c("JourneySelector");
                    int i2 = dVar.f228116b;
                    if (i2 == 1) {
                        bvVar = ((C48838be) dVar.f228117c).f126382a;
                        if (bvVar == null) {
                            bvVar = C48855bv.f126424b;
                        }
                    } else {
                        if (i2 == 4) {
                            bgVar = (C48840bg) dVar.f228117c;
                        } else {
                            bgVar = C48840bg.f126386b;
                        }
                        bvVar = bgVar.f126389a;
                        if (bvVar == null) {
                            bvVar = C48855bv.f126424b;
                        }
                    }
                    c5.mo85276a(C90752i.m148229c(C107408g.m178311h(bvVar)));
                    C91005e c6 = fVar.mo85281e((Object) null).mo85279c("status");
                    int a3 = C83687f.m133251a(dVar.f228119e);
                    if (a3 == 0) {
                        a3 = 2;
                    }
                    c6.mo85276a(C90752i.m148229c(C107431k.m178349g(a3)));
                }
                return C118826c.f331423b;
            }
        }
    }
}
