package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130806h;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130733c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3860as.C49746ai;
import com.google.assistant.p3860as.C49782br;
import com.google.assistant.p3860as.C49783bs;
import com.google.assistant.p3860as.C49784bt;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3860as.C49796j;
import com.google.assistant.p3860as.C49798l;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ac */
/* compiled from: PG */
public final class C130739ac implements C130806h {

    /* renamed from: a */
    public static final C58495hd f357930a;

    /* renamed from: b */
    public final C58974d f357931b;

    /* renamed from: c */
    public final C130733c f357932c;

    /* renamed from: d */
    public final ExecutorService f357933d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53691ap.STORE, C49794h.SHOPPING);
        gzVar.mo55429h(C53691ap.TRANSIT_STATION, C49794h.TRANSIT_STATION);
        gzVar.mo55429h(C53691ap.RESTAURANT, C49794h.RESTAURANT);
        gzVar.mo55429h(C53691ap.GAS_STATION, C49794h.GAS_STATION);
        gzVar.mo55429h(C53691ap.PARKING, C49794h.PARKING);
        gzVar.mo55429h(C53691ap.CAFE, C49794h.CAFE);
        gzVar.mo55429h(C53691ap.SHOPPING_CENTER, C49794h.SHOPPING_CENTER);
        f357930a = gzVar.mo55427f(false);
    }

    public C130739ac(C130603a aVar, C130733c cVar, ExecutorService executorService) {
        this.f357931b = aVar.mo109740b(this);
        this.f357932c = cVar;
        this.f357933d = executorService;
    }

    /* renamed from: b */
    public static C58485gu m213133b(C49794h hVar, int i, C49746ai aiVar, double d, double d2, C49798l lVar) {
        C49746ai aiVar2 = aiVar;
        return m213134c(hVar, i, C58485gu.m89842j(aiVar2.f128461f), aiVar2.f128459d, d, d2, lVar);
    }

    /* renamed from: c */
    public static C58485gu m213134c(C49794h hVar, int i, C58485gu guVar, double d, double d2, double d3, C49798l lVar) {
        C49784bt btVar;
        C49798l lVar2 = lVar;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C49782br brVar = (C49782br) guVar.get(i2);
            int i3 = brVar.f128549a;
            if (i3 < 0 || i3 >= lVar2.f128637a.size()) {
                throw new C130738ab(String.format("Invalid application index in lexicon. Application index: %d, lexicon size: %d.", new Object[]{Integer.valueOf(i3), Integer.valueOf(lVar2.f128637a.size())}));
            }
            C49796j jVar = (C49796j) lVar2.f128637a.get(i3);
            C49794h a = C49794h.m85713a(jVar.f128634c);
            if (a == null) {
                a = C49794h.UNDEFINED;
            }
            if (a.equals(hVar)) {
                double d4 = brVar.f128550b * d * d2 * d3;
                C130696a b = C130701b.m213087b();
                b.mo109786b(jVar.f128633b);
                C49794h a2 = C49794h.m85713a(jVar.f128634c);
                if (a2 == null) {
                    a2 = C49794h.UNDEFINED;
                }
                ((C130735c) b).f357922b = Optional.m71637of(a2);
                b.mo109787c(d4);
                int i4 = i - 1;
                if (i4 == 1) {
                    C49783bs bsVar = (C49783bs) C49784bt.f128552i.createBuilder();
                    bsVar.copyOnWrite();
                    C49784bt btVar2 = (C49784bt) bsVar.instance;
                    btVar2.f128554a = 1 | btVar2.f128554a;
                    btVar2.f128555b = d4;
                    btVar = (C49784bt) bsVar.build();
                } else if (i4 == 2) {
                    C49783bs bsVar2 = (C49783bs) C49784bt.f128552i.createBuilder();
                    bsVar2.copyOnWrite();
                    C49784bt btVar3 = (C49784bt) bsVar2.instance;
                    btVar3.f128554a = 2 | btVar3.f128554a;
                    btVar3.f128556c = d4;
                    btVar = (C49784bt) bsVar2.build();
                } else if (i4 != 3) {
                    C49783bs bsVar3 = (C49783bs) C49784bt.f128552i.createBuilder();
                    bsVar3.copyOnWrite();
                    C49784bt btVar4 = (C49784bt) bsVar3.instance;
                    btVar4.f128554a |= 8;
                    btVar4.f128558e = d4;
                    btVar = (C49784bt) bsVar3.build();
                } else {
                    C49783bs bsVar4 = (C49783bs) C49784bt.f128552i.createBuilder();
                    bsVar4.copyOnWrite();
                    C49784bt btVar5 = (C49784bt) bsVar4.instance;
                    btVar5.f128554a |= 4;
                    btVar5.f128557d = d4;
                    btVar = (C49784bt) bsVar4.build();
                }
                b.mo109788d(btVar);
                e.mo55395g(b.mo109785a());
            }
        }
        return e.mo55394f();
    }

    /* renamed from: a */
    public final C60870cx mo109807a(C53691ap apVar, C8242v vVar, Optional optional) {
        C49794h hVar = (C49794h) f357930a.get(apVar);
        if (hVar == null) {
            ((C58970a) ((C58970a) this.f357931b.mo56226d()).mo56372aa(38964)).mo56387q("Unsupported place type: %s.", apVar.f140936l);
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C60870cx a = this.f357932c.mo109805a(apVar);
        C130789s sVar = new C130789s(this, hVar, vVar, optional, apVar);
        return C60922j.m93044g(a, C47810es.m84963c(sVar), this.f357933d);
    }
}
