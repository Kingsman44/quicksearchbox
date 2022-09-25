package com.google.android.libraries.mdi.download.p2236d.p2240d;

import com.google.android.libraries.mdi.download.C28743bu;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.C29118ff;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.d.u */
/* compiled from: PG */
public final class C28983u implements C28963a {

    /* renamed from: a */
    public final C28743bu f78691a;

    /* renamed from: b */
    private final C28787cb f78692b;

    /* renamed from: c */
    private final C29118ff f78693c;

    /* renamed from: d */
    private final Executor f78694d;

    public C28983u(C28787cb cbVar, C28743bu buVar, C29118ff ffVar, Executor executor) {
        this.f78692b = cbVar;
        this.f78691a = buVar;
        this.f78693c = ffVar;
        this.f78694d = executor;
    }

    /* renamed from: e */
    public static Map m53870e(Map map, Iterable iterable) {
        HashMap hashMap = new HashMap(map);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m53871f(hashMap, (Long) it.next());
        }
        return hashMap;
    }

    /* renamed from: f */
    public static final Set m53871f(Map map, Long l) {
        if (!map.containsKey(l)) {
            map.put(l, new HashSet());
        }
        return (Set) map.get(l);
    }

    /* renamed from: g */
    public static final boolean m53872g(C29334dr drVar, C58817ah ahVar) {
        return (drVar.f79499a & 65536) != 0 && ((Boolean) ahVar.apply(drVar)).booleanValue();
    }

    /* renamed from: h */
    private final C29670b m53873h(C58817ah ahVar) {
        C60870cx c = this.f78693c.mo34598c();
        C28965c cVar = new C28965c(ahVar);
        return C29670b.m54719g(C60922j.m93044g(c, C47810es.m84963c(cVar), this.f78694d)).mo34821h(new C28982t(), this.f78694d);
    }

    /* renamed from: i */
    private final C29670b m53874i(C58817ah ahVar) {
        return C29670b.m54719g(this.f78693c.mo34600e()).mo34821h(new C28968f(ahVar), this.f78694d);
    }

    /* renamed from: j */
    private final boolean m53875j() {
        return this.f78692b.mo34443w();
    }

    /* renamed from: a */
    public final C60870cx mo34519a() {
        if (!m53875j()) {
            return C60866ct.f164955a;
        }
        C29670b h = m53873h(C28978p.f78686a);
        C29670b i = m53874i(C28979q.f78687a);
        return C29670b.m54719g(C29672d.m54727b(h, i).mo34823a(new C28980r(h, i), this.f78694d)).mo34822i(new C28981s(this), this.f78694d);
    }

    /* renamed from: b */
    public final C60870cx mo34520b(Collection collection) {
        Object obj;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C29334dr drVar = (C29334dr) it.next();
            long j = drVar.f79516r;
            String str = drVar.f79501c;
            if (!m53875j()) {
                obj = C60866ct.f164955a;
            } else {
                obj = m53873h(new C28966d(str)).mo34822i(new C28967e(this, j), this.f78694d);
            }
            arrayList.add(obj);
        }
        return C29672d.m54726a(arrayList).mo34823a(C28970h.f78675a, this.f78694d);
    }

    /* renamed from: c */
    public final C60870cx mo34521c(String str) {
        if (!m53875j()) {
            return C60866ct.f164955a;
        }
        C28971i iVar = new C28971i(str);
        C29670b h = m53873h(iVar);
        C29670b i = m53874i(iVar);
        C60870cx a = C29672d.m54727b(h, i).mo34823a(new C28972j(h, i), this.f78694d);
        C28973k kVar = new C28973k(this);
        return C60922j.m93045h(a, C47810es.m84966f(kVar), this.f78694d);
    }

    /* renamed from: d */
    public final C60870cx mo34526d(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Long l = (Long) entry.getKey();
            new StringBuilder("mdd_").append(l);
            int[] m = C60757n.m92752m((Set) entry.getValue());
            arrayList.addAll(C58597ky.m90217h(Arrays.asList(new C58833ax[]{this.f78691a.mo34355b(), this.f78691a.mo34356c(), C58833ax.m90834k("ICING")}), new C28975m(this, m, "mdd_".concat(String.valueOf(l)))));
        }
        return C29672d.m54728c(arrayList).mo34823a(C28969g.f78674a, C60826bg.f164896a);
    }
}
