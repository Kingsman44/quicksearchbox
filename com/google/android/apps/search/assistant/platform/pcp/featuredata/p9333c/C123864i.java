package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.i */
/* compiled from: PG */
public final /* synthetic */ class C123864i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123868m f342149a;

    public /* synthetic */ C123864i(C123868m mVar) {
        this.f342149a = mVar;
    }

    public final C60870cx apply(Object obj) {
        Map map = (Map) obj;
        C123877v vVar = (C123877v) this.f342149a;
        C123615ah b = C123624c.m202993b(vVar.f342176d.f342180b);
        List list = (List) Collection.EL.stream(map.keySet()).filter(new C123872q((List) Collection.EL.stream(vVar.f342175c).map(C123870o.f342159a).collect(Collectors.toCollection(C123871p.f342160a)))).collect(Collectors.toCollection(C123871p.f342160a));
        List c = C123878w.m203184c(vVar.f342175c, map);
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            C58485gu b2 = C123878w.m203183b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(vVar.f342176d.f342182d.mo106308a(Optional.empty(), list, Optional.m71637of((C53306j) b2.get(i)), Optional.m71637of(100003)));
            }
        }
        C60870cx a = C47638k.m84752c(arrayList).mo51520a(new C123873r(vVar, arrayList), C60826bg.f164896a);
        C123874s sVar = new C123874s(vVar, b.f341541b, list, c);
        return C47638k.m84751b(C60922j.m93045h(a, C47810es.m84966f(sVar), C60826bg.f164896a)).mo51521b(new C123875t(vVar), vVar.f342176d.f342181c);
    }
}
