package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.android.libraries.silk.p3240c.C41879r;
import com.google.android.libraries.silk.p3240c.C41888s;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.u */
/* compiled from: PG */
public final class C40409u implements C68220f {

    /* renamed from: a */
    private final C69464a f106072a;

    /* renamed from: b */
    private final C69464a f106073b;

    public C40409u(C69464a aVar, C69464a aVar2) {
        this.f106072a = aVar;
        this.f106073b = aVar2;
    }

    /* renamed from: a */
    public static Set m70099a(Set set, C41871q qVar) {
        Set ab;
        if (set != null) {
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((C41888s) it.next()).mo44335a(qVar));
            }
            List l = C69540x.m100805l(arrayList);
            if (!(l == null || (ab = C69540x.m100846ab(l)) == null)) {
                return ab;
            }
        }
        return C69498ao.f185920a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        return m70099a((Set) ((C68221g) this.f106072a).f184583a, ((C41879r) this.f106073b).mo17428b());
    }
}
