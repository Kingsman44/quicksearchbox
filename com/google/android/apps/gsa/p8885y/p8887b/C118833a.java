package com.google.android.apps.gsa.p8885y.p8887b;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.p8886a.C118830c;
import com.google.android.apps.gsa.search.core.p6494aa.C84388b;
import com.google.android.apps.gsa.search.core.p6494aa.C84392c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59793fu;
import com.google.common.p4552o.C59794fv;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.y.b.a */
/* compiled from: PG */
public final class C118833a implements c {

    /* renamed from: a */
    private final C84392c f331446a;

    public C118833a(C84392c cVar) {
        this.f331446a = cVar;
    }

    /* renamed from: b */
    public static C84392c m197237b(C84392c cVar, C84392c cVar2) {
        Iterable iterable;
        C84388b bVar = (C84388b) C84392c.f229649e.createBuilder();
        if (cVar.f229653c == 0 && cVar.f229654d == 0 && cVar.f229652b.size() == 0) {
            m197239d(bVar, cVar2);
        } else if (cVar.f229653c > cVar2.f229653c) {
            m197239d(bVar, cVar2);
            m197240e(2);
        } else if (cVar.f229654d != cVar2.f229654d) {
            m197239d(bVar, cVar2);
            m197240e(3);
        } else {
            if (cVar.f229652b.size() != 0) {
                iterable = m197238c(cVar2.f229652b, cVar.f229652b);
            } else {
                iterable = cVar2.f229652b;
            }
            bVar.mo77949a(iterable);
            long j = cVar.f229653c;
            bVar.copyOnWrite();
            C84392c cVar3 = (C84392c) bVar.instance;
            cVar3.f229651a |= 1;
            cVar3.f229653c = j;
            int i = cVar.f229654d;
            bVar.copyOnWrite();
            C84392c cVar4 = (C84392c) bVar.instance;
            cVar4.f229651a |= 2;
            cVar4.f229654d = i;
        }
        return (C84392c) bVar.build();
    }

    /* renamed from: c */
    public static List m197238c(List list, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59794fv fvVar = (C59794fv) it.next();
            hashMap.put(new C118830c(fvVar), fvVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C59794fv fvVar2 = (C59794fv) it2.next();
            C118830c cVar = new C118830c(fvVar2);
            if (hashMap.containsKey(cVar)) {
                C59794fv fvVar3 = (C59794fv) hashMap.get(cVar);
                C58838bb.m90868c(new C118830c(fvVar2).equals(new C118830c(fvVar3)));
                C59793fu fuVar = (C59793fu) C59794fv.f161570i.createBuilder();
                C118569b a = C118569b.m196859a(fvVar2.f161575d);
                if (a == null) {
                    a = C118569b.UNKNOWN_METRIC_TYPE;
                }
                fuVar.copyOnWrite();
                C59794fv fvVar4 = (C59794fv) fuVar.instance;
                fvVar4.f161575d = a.f329776ks;
                fvVar4.f161572a |= 4;
                C118575h a2 = C118575h.m196865a(fvVar2.f161573b);
                if (a2 == null) {
                    a2 = C118575h.ACTIVITY_ACCOUNT_DRAWER;
                }
                fuVar.copyOnWrite();
                C59794fv fvVar5 = (C59794fv) fuVar.instance;
                fvVar5.f161573b = a2.f330812sk;
                fvVar5.f161572a |= 1;
                C118575h a3 = C118575h.m196865a(fvVar2.f161574c);
                if (a3 == null) {
                    a3 = C118575h.ACTIVITY_ACCOUNT_DRAWER;
                }
                fuVar.copyOnWrite();
                C59794fv fvVar6 = (C59794fv) fuVar.instance;
                fvVar6.f161574c = a3.f330812sk;
                fvVar6.f161572a |= 2;
                int i = fvVar2.f161576e;
                fuVar.copyOnWrite();
                C59794fv fvVar7 = (C59794fv) fuVar.instance;
                fvVar7.f161572a |= 8;
                fvVar7.f161576e = i;
                int i2 = fvVar2.f161579h;
                int i3 = fvVar3.f161579h;
                fuVar.copyOnWrite();
                C59794fv fvVar8 = (C59794fv) fuVar.instance;
                fvVar8.f161572a |= 64;
                fvVar8.f161579h = i2 + i3;
                long max = Math.max(fvVar2.f161577f, fvVar3.f161577f);
                fuVar.copyOnWrite();
                C59794fv fvVar9 = (C59794fv) fuVar.instance;
                fvVar9.f161572a |= 16;
                fvVar9.f161577f = max;
                long j = fvVar2.f161578g;
                long j2 = fvVar3.f161578g;
                fuVar.copyOnWrite();
                C59794fv fvVar10 = (C59794fv) fuVar.instance;
                fvVar10.f161572a |= 32;
                fvVar10.f161578g = j + j2;
                hashMap.put(cVar, (C59794fv) fuVar.build());
            } else {
                hashMap.put(cVar, fvVar2);
            }
        }
        return C58485gu.m89842j(hashMap.values());
    }

    /* renamed from: d */
    private static void m197239d(C84388b bVar, C84392c cVar) {
        long j = cVar.f229653c;
        bVar.copyOnWrite();
        C84392c cVar2 = (C84392c) bVar.instance;
        cVar2.f229651a |= 1;
        cVar2.f229653c = j;
        int i = cVar.f229654d;
        bVar.copyOnWrite();
        C84392c cVar3 = (C84392c) bVar.instance;
        cVar3.f229651a |= 2;
        cVar3.f229654d = i;
        bVar.copyOnWrite();
        ((C84392c) bVar.instance).f229652b = C84392c.emptyProtobufList();
        bVar.mo77949a(cVar.f229652b);
    }

    /* renamed from: e */
    private static void m197240e(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1139;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164161bO = i - 1;
        ufVar2.f164253h |= 1073741824;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo104026a(Object obj) {
        return m197237b((C84392c) obj, this.f331446a);
    }
}
