package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.staticplugins.p7565bu.C96814ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.p5610a.p5611a.p5618b.p5620b.C71994a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.ba */
/* compiled from: PG */
public final class C96783ba {

    /* renamed from: a */
    public static final C59071e f270686a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bu.a.ba");

    /* renamed from: a */
    public static C58495hd m160376a(Set set, C96814ag agVar, C96786e eVar, C84469a aVar) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C96762ag agVar2 = (C96762ag) it.next();
            Optional d = agVar2.mo90341d();
            if (d.isPresent()) {
                hashMap.put((String) d.get(), new C71994a(new C96781az(agVar2, agVar, eVar, aVar), new C96771ap(agVar2)));
            }
        }
        return C58495hd.m89898l(hashMap);
    }
}
