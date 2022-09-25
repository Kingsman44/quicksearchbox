package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69236b;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69238d;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ad */
/* compiled from: PG */
public final class C124048ad {

    /* renamed from: a */
    public final C58495hd f342627a;

    /* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ad$a */
    /* compiled from: PG */
    public interface C124049a {
        /* renamed from: aa */
        C124048ad mo106256aa();
    }

    public C124048ad(C69238d dVar, C69238d dVar2, C69238d dVar3, C69238d dVar4, C69238d dVar5, C69238d dVar6, C69238d dVar7, C69238d dVar8, C69238d dVar9, C69238d dVar10) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53306j.OPA_SMARTSPACE, dVar);
        gzVar.mo55429h(C53306j.AMBIENT_ASSISTANT, dVar2);
        gzVar.mo55429h(C53306j.ASSISTANT_WEARABLES, dVar3);
        gzVar.mo55429h(C53306j.WEATHER_WIDGET, dVar4);
        gzVar.mo55429h(C53306j.STOCK_WIDGET, dVar5);
        gzVar.mo55429h(C53306j.ASSISTANT_NOTIFICATIONS, dVar6);
        gzVar.mo55429h(C53306j.BLUECHIP_SMARTSPACE_TNG, dVar7);
        gzVar.mo55429h(C53306j.AR_GLASSES, dVar8);
        gzVar.mo55429h(C53306j.OPA_HUB_UI, dVar9);
        gzVar.mo55429h(C53306j.INPUT_PLATE, dVar10);
        this.f342627a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C124048ad m203471a(Context context, AccountId accountId) {
        return ((C124049a) C47245e.m84045a(context, C124049a.class, accountId)).mo106256aa();
    }

    /* renamed from: b */
    public final C58485gu mo106249b(C53306j jVar) {
        C69238d dVar = (C69238d) this.f342627a.get(jVar);
        dVar.getClass();
        return C58485gu.m89842j(dVar.f185339c);
    }

    /* renamed from: c */
    public final C58485gu mo106250c(C53306j jVar, List list, boolean z) {
        C69238d dVar = (C69238d) this.f342627a.get(jVar);
        dVar.getClass();
        Stream stream = Collection.EL.stream((List) Collection.EL.stream(dVar.f185338b).filter(new C124131q(z)).map(C124132r.f342820a).collect(Collectors.toCollection(C124047ac.f342626a)));
        Objects.requireNonNull(list);
        return C58485gu.m89842j((List) stream.filter(new C124133s(list)).collect(Collectors.toCollection(C124047ac.f342626a)));
    }

    /* renamed from: d */
    public final C58528ij mo106251d(C53306j jVar, Set set) {
        if (!mo106255h(jVar)) {
            return C58733pz.f156496a;
        }
        C58485gu b = mo106249b(jVar);
        if (set.isEmpty()) {
            return C58528ij.m90006F(b);
        }
        Stream stream = Collection.EL.stream(set);
        Objects.requireNonNull(b);
        return C58528ij.m90006F((Set) stream.filter(new C124134t(b)).collect(Collectors.toCollection(C124136v.f342824a)));
    }

    /* renamed from: e */
    public final C58528ij mo106252e(C53306j jVar) {
        Set hashSet = new HashSet();
        if (jVar == C53306j.ALL_PCP_CLIENTS) {
            HashSet hashSet2 = new HashSet();
            Map.EL.forEach(this.f342627a, new C124129o(hashSet2));
            hashSet.addAll(hashSet2);
        } else {
            C69238d dVar = (C69238d) this.f342627a.get(jVar);
            dVar.getClass();
            hashSet = (Set) Collection.EL.stream(dVar.f185338b).map(C124135u.f342823a).collect(Collectors.toCollection(C124136v.f342824a));
        }
        return C58528ij.m90006F(hashSet);
    }

    /* renamed from: f */
    public final Optional mo106253f(C53306j jVar, int i) {
        C69238d dVar = (C69238d) this.f342627a.get(jVar);
        dVar.getClass();
        return Collection.EL.stream(dVar.f185338b).filter(new C124137w(i)).findAny();
    }

    /* renamed from: g */
    public final Optional mo106254g(C53306j jVar, int i) {
        Optional f = mo106253f(jVar, i);
        if (f.isPresent()) {
            C69236b bVar = (C69236b) f.get();
            if ((bVar.f185330a & 4) != 0) {
                C69258x xVar = bVar.f185333d;
                if (xVar == null) {
                    xVar = C69258x.f185379c;
                }
                return Optional.m71637of(xVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: h */
    public final boolean mo106255h(C53306j jVar) {
        C69238d dVar = (C69238d) this.f342627a.get(jVar);
        dVar.getClass();
        return dVar.f185340d;
    }
}
