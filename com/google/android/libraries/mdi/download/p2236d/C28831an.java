package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.an */
/* compiled from: PG */
public final /* synthetic */ class C28831an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78324a;

    /* renamed from: b */
    public final /* synthetic */ Map f78325b;

    /* renamed from: c */
    public final /* synthetic */ List f78326c;

    public /* synthetic */ C28831an(C29117fe feVar, Map map, List list) {
        this.f78324a = feVar;
        this.f78325b = map;
        this.f78326c = list;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78324a;
        Map map = this.f78325b;
        List<C29334dr> list = this.f78326c;
        Void voidR = (Void) obj;
        if (map.isEmpty()) {
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        for (C29334dr drVar : list) {
            C60870cx a = feVar.f78975d.mo34596a(drVar);
            C28910by byVar = new C28910by(feVar, drVar);
            arrayList.add(C60922j.m93045h(a, C47810es.m84966f(byVar), feVar.f78980i));
        }
        return C29672d.m54726a(arrayList).mo34823a(new C28911bz(arrayList), feVar.f78980i);
    }
}
