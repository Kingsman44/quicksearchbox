package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42241i;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4181bi.C55800aj;
import com.google.p4181bi.C55807aq;
import com.google.p4181bi.C55808ar;
import com.google.p4181bi.C55847i;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.d.l */
/* compiled from: PG */
public final /* synthetic */ class C42378l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42383q f111132a;

    /* renamed from: b */
    public final /* synthetic */ List f111133b;

    /* renamed from: c */
    public final /* synthetic */ List f111134c;

    public /* synthetic */ C42378l(C42383q qVar, List list, List list2) {
        this.f111132a = qVar;
        this.f111133b = list;
        this.f111134c = list2;
    }

    public final C60870cx apply(Object obj) {
        C55847i iVar;
        C60870cx cxVar;
        C42383q qVar = this.f111132a;
        List list = this.f111133b;
        List list2 = this.f111134c;
        List list3 = (List) obj;
        C58838bb.m90869d(list2.size() == list3.size(), "key and value lists must have the same size");
        C58490gz gzVar = new C58490gz(4);
        for (int i = 0; i < list2.size(); i++) {
            gzVar.mo55429h(list2.get(i), list3.get(i));
        }
        C58495hd f = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        for (Map.Entry entry : f.entrySet()) {
            C42321ct ctVar = (C42321ct) entry.getKey();
            C55808ar arVar = ((C42241i) entry.getValue()).f110589a;
            if (arVar == null) {
                arVar = C55808ar.f147261b;
            }
            for (C55807aq aqVar : arVar.f147263a) {
                C55800aj ajVar = aqVar.f147258c;
                if (ajVar == null) {
                    ajVar = C55800aj.f147243c;
                }
                C42320cs csVar = C42320cs.EMAIL;
                int ordinal = ctVar.mo45203a().ordinal();
                if (ordinal == 0 ? !(ajVar.f147245a != 1 || !((String) ajVar.f147246b).equals(ctVar.mo45204b())) : !(ordinal == 1 ? ajVar.f147245a != 2 || !((String) ajVar.f147246b).equals(ctVar.mo45204b()) : !(ordinal == 2 && ajVar.f147245a == 3 && ((String) ajVar.f147246b).equals(ctVar.mo45204b())))) {
                    gzVar2.mo55429h(ctVar, aqVar);
                }
            }
        }
        C58495hd f2 = gzVar2.mo55427f(true);
        HashSet hashSet = new HashSet(list);
        C42374h hVar = new C42374h();
        hVar.f111117c = 10;
        hVar.f111118d = 2;
        C58490gz gzVar3 = new C58490gz(4);
        C58800sl lA = f2.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) lA.next();
            C42321ct ctVar2 = (C42321ct) entry2.getKey();
            C55807aq aqVar2 = (C55807aq) entry2.getValue();
            if (aqVar2.f147256a == 2) {
                C42404aa aaVar = new C42404aa();
                if (aqVar2.f147256a == 2) {
                    iVar = (C55847i) aqVar2.f147257b;
                } else {
                    iVar = C55847i.f147358c;
                }
                aaVar.mo45397d(iVar);
                aaVar.f111220c.add(C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID);
                C42405ab a = aaVar.mo45394a();
                if (!C69280a.m100466c() || !qVar.f111148d.mo56113h() || !a.mo45411m()) {
                    cxVar = C60856cj.m92900i(a);
                } else {
                    cxVar = ((C42146a) qVar.f111148d.mo56107c()).mo44845a();
                }
                gzVar3.mo55429h(ctVar2, cxVar);
                hashSet.remove(ctVar2);
            }
        }
        if (C69296d.m100510c()) {
            hVar.mo45361d(hashSet);
        } else {
            hVar.mo45360c(hashSet);
        }
        C58495hd f3 = gzVar3.mo55427f(true);
        return C60856cj.m92894c(f3.values()).mo57334a(new C42379m(f3, hVar), C60826bg.f164896a);
    }
}
