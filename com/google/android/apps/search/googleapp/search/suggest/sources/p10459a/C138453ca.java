package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import java.util.TreeMap;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ca */
/* compiled from: PG */
public final /* synthetic */ class C138453ca implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138454cb f376609a;

    public /* synthetic */ C138453ca(C138454cb cbVar) {
        this.f376609a = cbVar;
    }

    public final C60870cx apply(Object obj) {
        Duration ofMinutes;
        C138454cb cbVar = this.f376609a;
        int intValue = ((Integer) obj).intValue();
        C138475e eVar = cbVar.f376616g;
        TreeMap treeMap = new TreeMap();
        for (C138474d dVar : eVar.f376662a) {
            treeMap.put(Duration.ofMinutes(dVar.f376657a), Long.valueOf(dVar.f376658b));
        }
        Iterator it = treeMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ofMinutes = Duration.ofMinutes(cbVar.f376618i);
                break;
            }
            ofMinutes = (Duration) it.next();
            Long l = (Long) treeMap.get(ofMinutes);
            if (l != null && ((long) intValue) >= l.longValue()) {
                break;
            }
        }
        return C60856cj.m92900i(ofMinutes);
    }
}
