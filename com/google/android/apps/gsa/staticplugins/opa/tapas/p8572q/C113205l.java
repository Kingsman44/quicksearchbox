package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import androidx.core.p094f.C1902o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.l */
/* compiled from: PG */
public final class C113205l implements C113169c {

    /* renamed from: a */
    private final C86124t f313539a;

    public C113205l(C86124t tVar) {
        this.f313539a = tVar;
    }

    /* renamed from: a */
    public final List mo99896a(Map map, Map map2, double d) {
        ArrayList arrayList = new ArrayList();
        Collection.EL.stream(map2.entrySet()).map(C113196d.f313529a).filter(new C113198e(map)).filter(new C113199f(d)).sorted(Comparator.EL.thenComparing(Comparator.EL.reversed(Comparator.CC.comparing(C113200g.f313533a)), (Function) C113201h.f313534a)).forEachOrdered(new C113202i(arrayList, map));
        return arrayList;
    }

    /* renamed from: b */
    public final List mo99897b(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = Math.max(i, ((List) it.next()).size());
        }
        list.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                List list2 = (List) list.get(i3);
                if (i2 < list2.size()) {
                    arrayList.add(list2.get(i2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final Map mo99898c(Context context) {
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        if (usageStatsManager == null || (Build.VERSION.SDK_INT >= 30 && !C1902o.m5170a(context))) {
            return new HashMap();
        }
        long epochMilli = Instant.now().toEpochMilli();
        return (Map) Collection.EL.stream(usageStatsManager.queryAndAggregateUsageStats(epochMilli - ((long) (this.f313539a.mo79747m(C90063do.f249281aa) * 8.64E7d)), epochMilli).entrySet()).collect(Collectors.toMap(C113203j.f313537a, C113204k.f313538a));
    }
}
