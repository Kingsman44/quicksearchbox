package com.google.android.apps.search.googleapp.recents.p10382a;

import com.google.android.libraries.gsa.p1875j.C22830a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.HashSet;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.recents.a.c */
/* compiled from: PG */
public final /* synthetic */ class C137161c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137162d f373221a;

    /* renamed from: b */
    public final /* synthetic */ C22845p f373222b;

    public /* synthetic */ C137161c(C137162d dVar, C22845p pVar) {
        this.f373221a = dVar;
        this.f373222b = pVar;
    }

    public final Object apply(Object obj) {
        C137162d dVar = this.f373221a;
        C22845p pVar = this.f373222b;
        C22831b bVar = (C22831b) obj;
        ArrayList<C22845p> arrayList = new ArrayList<>(bVar.f62862a);
        if (!arrayList.isEmpty()) {
            for (C22845p pVar2 : arrayList) {
                int a = C22840k.m42693a(pVar.f62894c);
                if ((a == 0 || a != 2) && pVar.f62896e.equals(pVar2.f62896e) && pVar.f62895d - pVar2.f62895d < C137162d.f373223a.toMillis()) {
                    String str = pVar.f62896e;
                    return bVar;
                }
            }
        }
        String str2 = pVar.f62896e;
        HashSet hashSet = new HashSet();
        while (!arrayList.isEmpty() && (dVar.mo113578c(Instant.ofEpochMilli(((C22845p) arrayList.get(0)).f62895d)) || arrayList.size() >= 500)) {
            long j = ((C22845p) arrayList.get(0)).f62893b;
            hashSet.add(Long.valueOf(((C22845p) arrayList.get(0)).f62893b));
            arrayList.remove(0);
        }
        C60870cx b = dVar.f373230g.mo50215b(dVar.f373229f);
        C137160b bVar2 = new C137160b(dVar, hashSet);
        C46459k.m82829b(C60922j.m93045h(b, C47810es.m84966f(bVar2), dVar.f373226c), "Failed to prune screenshots", new Object[0]);
        C22830a aVar = (C22830a) C22831b.f62860b.createBuilder();
        aVar.mo28194a(arrayList);
        aVar.mo28195b(pVar);
        return (C22831b) aVar.build();
    }
}
