package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.android.apps.gsa.p8889z.p8917f.C119073b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.p4152bb.p4153a.C55421x;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.aa */
/* compiled from: PG */
public final class C84570aa {

    /* renamed from: a */
    public static final List f230153a = Arrays.asList(new Integer[]{2, 3, 12, 52, 53, 103, 107, 109, 110, 113, 114, 117, 133, 136, 137, 138, 141, 147, 169});

    /* renamed from: b */
    public static final List f230154b = Arrays.asList(new Integer[]{51});

    /* renamed from: a */
    public static C58528ij m135296a(Query query, C90021c cVar, String str) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (query.mo84337bV()) {
            hashSet.addAll(f230153a);
            if (query.mo84412cs()) {
                hashSet.addAll(cVar.mo79749o(C90139r.f251858f));
            }
        } else if (!query.mo84326bK()) {
            hashSet.addAll(cVar.mo79749o(C90120fr.f250815ag));
        }
        hashSet.addAll(m135297b(str, cVar));
        if (query.mo84415cv()) {
            hashSet.addAll(cVar.mo79749o(C90082eg.f250009cS));
        }
        C58526ih ihVar = new C58526ih();
        for (Integer intValue : hashSet) {
            ihVar.mo55373c(C55421x.m87686a(intValue.intValue()));
        }
        return ihVar.mo55486f();
    }

    /* renamed from: b */
    public static C58528ij m135297b(String str, C90021c cVar) {
        C58495hd r = cVar.mo79752r(C90139r.f251863k);
        if (!r.containsKey(str)) {
            return C58733pz.f156496a;
        }
        String[] split = ((String) r.get(str)).split("\\|");
        C58526ih ihVar = new C58526ih();
        for (String parseInt : split) {
            ihVar.mo55373c(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        return ihVar.mo55486f();
    }

    /* renamed from: c */
    public static List m135298c(Query query, C90021c cVar) {
        long j;
        if (query.mo84337bV()) {
            j = cVar.mo79743a(C90139r.f251867o);
        } else {
            j = !query.mo84326bK() ? cVar.mo79743a(C90120fr.f250824ap) : 0;
        }
        if (query.mo84415cv()) {
            j &= cVar.mo79743a(C90082eg.f250010cT);
        }
        ArrayList arrayList = new ArrayList();
        C58800sl lA = C119073b.f332165a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if ((((long) ((Integer) entry.getValue()).intValue()) & j) != 0) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List m135299d(C90021c cVar) {
        return cVar.mo79749o(C90086ek.f250347bS);
    }

    /* renamed from: e */
    public static boolean m135300e(C68214a aVar, C68214a aVar2, String str) {
        return !((Boolean) aVar2.mo27525b()).booleanValue() && ((C90021c) aVar.mo27525b()).mo79745c(C90120fr.f250786Z).contains(str);
    }

    /* renamed from: f */
    public static boolean m135301f(C90021c cVar, boolean z, String str) {
        return !z && cVar.mo79745c(C90120fr.f250825aq).contains(str) && cVar.mo79745c(C90120fr.f250786Z).contains(str);
    }
}
