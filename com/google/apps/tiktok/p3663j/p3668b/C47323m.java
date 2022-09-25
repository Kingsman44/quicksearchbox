package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58819aj;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.j.b.m */
/* compiled from: PG */
public final /* synthetic */ class C47323m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C47333w f123001a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f123002b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f123003c;

    public /* synthetic */ C47323m(C47333w wVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f123001a = wVar;
        this.f123002b = cxVar;
        this.f123003c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C47333w wVar = this.f123001a;
        C60870cx cxVar = this.f123002b;
        C60870cx cxVar2 = this.f123003c;
        Set set = (Set) C60856cj.m92909r(cxVar);
        Set set2 = (Set) C60856cj.m92909r(cxVar2);
        C58756qv c = C58758qx.m90645c(set, set2);
        C58756qv c2 = C58758qx.m90645c(set2, set);
        wVar.mo51205h(c);
        HashSet<C47304al> hashSet = new HashSet<>();
        synchronized (wVar.f123023g) {
            for (C47304al alVar : wVar.f123023g.keySet()) {
                if (c2.contains(alVar.f122967c)) {
                    hashSet.add(alVar);
                }
            }
            synchronized (wVar.f123024h) {
                for (C47304al alVar2 : hashSet) {
                    C60870cx cxVar3 = (C60870cx) wVar.f123024h.get(alVar2);
                    if (cxVar3 != null) {
                        cxVar3.cancel(true);
                    }
                }
            }
            wVar.f123023g.keySet().removeAll(hashSet);
            C46459k kVar = wVar.f123019c;
            C47298af afVar = wVar.f123020d;
            C60870cx a = afVar.f122957c.mo19398a(new C47296ad(afVar, hashSet));
            kVar.mo50456d(a, C47831fm.m85015j());
            C46459k.m82829b(a, "Error removing accounts from sync. IDs: %s", c2);
        }
        if (c.isEmpty() && c2.isEmpty()) {
            return C60866ct.f164955a;
        }
        C60870cx i = C60856cj.m92900i(Collections.emptySet());
        wVar.mo51207l(i);
        return C60922j.m93044g(i, new C58819aj((Object) null), C60826bg.f164896a);
    }
}
