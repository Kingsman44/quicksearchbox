package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123913k;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.as */
/* compiled from: PG */
public final /* synthetic */ class C124064as implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342661a;

    /* renamed from: b */
    public final /* synthetic */ List f342662b;

    /* renamed from: c */
    public final /* synthetic */ boolean f342663c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f342664d;

    /* renamed from: e */
    public final /* synthetic */ C123755bv f342665e;

    /* renamed from: f */
    public final /* synthetic */ C123777f f342666f;

    /* renamed from: g */
    public final /* synthetic */ Optional f342667g;

    public /* synthetic */ C124064as(C124081bi biVar, List list, boolean z, C53306j jVar, C123755bv bvVar, C123777f fVar, Optional optional) {
        this.f342661a = biVar;
        this.f342662b = list;
        this.f342663c = z;
        this.f342664d = jVar;
        this.f342665e = bvVar;
        this.f342666f = fVar;
        this.f342667g = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124081bi biVar = this.f342661a;
        List<C60870cx> list = this.f342662b;
        boolean z = this.f342663c;
        C53306j jVar = this.f342664d;
        C123755bv bvVar = this.f342665e;
        C123777f fVar = this.f342666f;
        Optional optional = this.f342667g;
        ArrayList arrayList = new ArrayList();
        for (C60870cx r : list) {
            arrayList.add((C124080bh) C60856cj.m92909r(r));
        }
        C58528ij ijVar = (C58528ij) Collection.EL.stream(arrayList).flatMap(C124077be.f342706a).collect(C58370cn.f155947b);
        C58528ij<Integer> ijVar2 = (C58528ij) Collection.EL.stream(arrayList).flatMap(C124078bf.f342707a).collect(C58370cn.f155947b);
        C60870cx i = C60856cj.m92900i(C58733pz.f156496a);
        if (!ijVar2.isEmpty()) {
            if (!z) {
                C58976aa aaVar = C58975e.f156826a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Integer num : ijVar2) {
                    if (num.intValue() <= 100000) {
                        linkedHashSet.add(num);
                    } else if (biVar.f342714f.mo106225b(num.intValue()).isPresent()) {
                        ((C123913k) biVar.f342714f.mo106225b(num.intValue()).get()).mo106151a();
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    biVar.f342715g.mo106229b(jVar, bvVar, Optional.m71637of(linkedHashSet), false, fVar);
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                ArrayList arrayList2 = new ArrayList();
                C58800sl lA = ijVar2.iterator();
                while (lA.hasNext()) {
                    Integer num2 = (Integer) lA.next();
                    if (num2.intValue() <= 100000) {
                        linkedHashSet2.add(num2);
                    } else if (biVar.f342714f.mo106225b(num2.intValue()).isPresent()) {
                        arrayList2.add(((C123913k) biVar.f342714f.mo106225b(num2.intValue()).get()).mo106151a());
                    }
                }
                C60870cx i2 = C60856cj.m92900i(C123746bm.f341818b);
                if (!linkedHashSet2.isEmpty()) {
                    i2 = biVar.f342715g.mo106229b(jVar, bvVar, Optional.m71637of(linkedHashSet2), false, fVar);
                }
                i = C47638k.m84751b(C60856cj.m92906o(arrayList2), i2).mo51521b(new C124076bd(biVar, jVar, ijVar2, optional, fVar), biVar.f342713e);
            }
        }
        C124079bg bgVar = new C124079bg(ijVar);
        return C60922j.m93044g(i, C47810es.m84963c(bgVar), biVar.f342713e);
    }
}
