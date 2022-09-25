package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.n */
/* compiled from: PG */
public final class C123990n implements C123991o {

    /* renamed from: a */
    public static final C59071e f342458a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.n");

    /* renamed from: b */
    private final Map f342459b;

    public C123990n(Map map) {
        this.f342459b = map;
    }

    /* renamed from: a */
    public final C60870cx mo106224a(List list) {
        if (list.isEmpty()) {
            return C60866ct.f164955a;
        }
        ArrayList<C123913k> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C123913k kVar = (C123913k) this.f342459b.get(Integer.valueOf(((Integer) it.next()).intValue()));
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C123913k a : arrayList) {
            C60870cx a2 = a.mo106151a();
            C60856cj.m92911t(a2, C47810es.m84974n(new C123915m()), C60826bg.f164896a);
            arrayList2.add(a2);
        }
        return C60856cj.m92892a(arrayList2).mo57335b(C47810es.m84965e(C123914l.f342264a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final Optional mo106225b(int i) {
        Map map = this.f342459b;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Optional.empty();
        }
        C123913k kVar = (C123913k) this.f342459b.get(valueOf);
        kVar.getClass();
        return Optional.m71637of(kVar);
    }
}
