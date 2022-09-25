package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.al */
/* compiled from: PG */
public final /* synthetic */ class C28829al implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78316a;

    /* renamed from: b */
    public final /* synthetic */ List f78317b;

    /* renamed from: c */
    public final /* synthetic */ Map f78318c;

    /* renamed from: d */
    public final /* synthetic */ Set f78319d;

    public /* synthetic */ C28829al(C29117fe feVar, List list, Map map, Set set) {
        this.f78316a = feVar;
        this.f78317b = list;
        this.f78318c = map;
        this.f78319d = set;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29117fe feVar = this.f78316a;
        List<C29392ep> list = this.f78317b;
        Map map = this.f78318c;
        Set set = this.f78319d;
        ArrayList arrayList = new ArrayList(list.size());
        for (C29392ep builder : list) {
            C29391eo eoVar = (C29391eo) builder.toBuilder();
            eoVar.copyOnWrite();
            C29392ep epVar = (C29392ep) eoVar.instance;
            epVar.f79681a |= 8;
            epVar.f79685e = false;
            C29392ep epVar2 = (C29392ep) eoVar.build();
            arrayList.add(C29670b.m54719g(feVar.f78975d.mo34602g(epVar2)).mo34822i(new C28824ag(feVar, map, epVar2, set), feVar.f78980i));
        }
        return C29672d.m54726a(arrayList).mo34824b(new C28825ah(feVar, arrayList, map, list), feVar.f78980i);
    }
}
