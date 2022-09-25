package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136413g;
import com.google.android.apps.search.googleapp.p10338l.C136414h;
import com.google.android.apps.search.googleapp.p10338l.C136415i;
import com.google.android.apps.search.googleapp.p10338l.C136416j;
import com.google.android.apps.search.googleapp.p10338l.C136417k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.C69677g;
import p5462h.C69692j;
import p5462h.C69702k;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69483q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.j */
/* compiled from: PG */
public final class C136391j {

    /* renamed from: a */
    final /* synthetic */ C136396o f371320a;

    /* renamed from: b */
    private final Map f371321b = new LinkedHashMap();

    public C136391j(C136396o oVar) {
        this.f371320a = oVar;
    }

    /* renamed from: a */
    public final Set mo112972a(C136417k kVar) {
        Iterable iterable;
        Map map = this.f371321b;
        Integer valueOf = Integer.valueOf(kVar.hashCode());
        Object obj = map.get(valueOf);
        if (obj == null) {
            if (kVar instanceof C136416j) {
                C136416j jVar = (C136416j) kVar;
                throw null;
            } else if (kVar instanceof C136413g) {
                C136413g gVar = (C136413g) kVar;
                throw null;
            } else if (kVar instanceof C136414h) {
                Collection values = ((C136414h) kVar).f371383a.values();
                C69664n.m101061g(values, "results");
                List<C69702k> J = C69540x.m100828J(values);
                ArrayList arrayList = new ArrayList();
                for (C69702k kVar2 : J) {
                    Object obj2 = new C69702k(kVar2.f186073a).f186073a;
                    if (true == (obj2 instanceof C69692j)) {
                        obj2 = null;
                    }
                    C136417k kVar3 = (C136417k) obj2;
                    if (kVar3 == null || (iterable = mo112972a(kVar3)) == null) {
                        iterable = C69498ao.f185920a;
                    }
                    C69540x.m100811r(arrayList, iterable);
                }
                obj = C69540x.m100846ab(arrayList);
                map.put(valueOf, obj);
            } else if (kVar instanceof C136415i) {
                new C69483q();
                C136415i iVar = (C136415i) kVar;
                throw null;
            } else {
                throw new C69677g();
            }
        }
        return (Set) obj;
    }
}
