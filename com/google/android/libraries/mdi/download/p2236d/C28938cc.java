package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28812d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.cc */
/* compiled from: PG */
public final /* synthetic */ class C28938cc implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78603a;

    /* renamed from: b */
    public final /* synthetic */ List f78604b;

    /* renamed from: c */
    public final /* synthetic */ Map f78605c;

    /* renamed from: d */
    public final /* synthetic */ List f78606d;

    public /* synthetic */ C28938cc(C29117fe feVar, List list, Map map, List list2) {
        this.f78603a = feVar;
        this.f78604b = list;
        this.f78605c = map;
        this.f78606d = list2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29117fe feVar = this.f78603a;
        List list = this.f78604b;
        Map map = this.f78605c;
        List list2 = this.f78606d;
        C28812d.m53784d(list, C58836b.f156633a, "Unable to read downloaded file groups to remove", new Object[0]);
        C60870cx j = feVar.f78975d.mo34605j(C58485gu.m89842j(map.keySet()));
        C28949cn cnVar = new C28949cn(feVar, map, list2);
        return C60922j.m93045h(j, C47810es.m84966f(cnVar), feVar.f78980i);
    }
}
