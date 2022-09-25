package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.am */
/* compiled from: PG */
public final /* synthetic */ class C28830am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78320a;

    /* renamed from: b */
    public final /* synthetic */ List f78321b;

    /* renamed from: c */
    public final /* synthetic */ Map f78322c;

    /* renamed from: d */
    public final /* synthetic */ List f78323d;

    public /* synthetic */ C28830am(C29117fe feVar, List list, Map map, List list2) {
        this.f78320a = feVar;
        this.f78321b = list;
        this.f78322c = map;
        this.f78323d = list2;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78320a;
        List<C29392ep> list = this.f78321b;
        Map map = this.f78322c;
        List list2 = this.f78323d;
        Void voidR = (Void) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (C29392ep builder : list) {
            C29391eo eoVar = (C29391eo) builder.toBuilder();
            eoVar.copyOnWrite();
            C29392ep epVar = (C29392ep) eoVar.instance;
            epVar.f79681a |= 8;
            epVar.f79685e = true;
            C29392ep epVar2 = (C29392ep) eoVar.build();
            arrayList.add(C60922j.m93045h(feVar.f78975d.mo34602g(epVar2), C47810es.m84966f(new C28937cb(map, epVar2, list2)), feVar.f78980i));
        }
        return C29672d.m54726a(arrayList).mo34824b(new C28938cc(feVar, arrayList, map, list), feVar.f78980i);
    }
}
