package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134294n;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.g */
/* compiled from: PG */
public final class C134931g implements C134270b {

    /* renamed from: a */
    public final Collection f367377a = C134294n.m217875a();

    /* renamed from: a */
    public final C134286f mo111669a() {
        Collection collection = this.f367377a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(collection, 10));
        for (Object next : collection) {
            C134284d dVar = new C134284d();
            C134929e eVar = (C134929e) next;
            for (Map.Entry entry : eVar.f367372a.entrySet()) {
                int intValue = ((Number) entry.getValue()).intValue();
                List list = dVar.f365788a;
                C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
                C69664n.m101061g(pVar, "sensitivity");
                ArrayList arrayList2 = new ArrayList();
                C134297q.m217877a("Append or update on role ".concat(String.valueOf(((C134572bj) entry.getKey()).name())), intValue, pVar, arrayList2);
                C69540x.m100811r(list, arrayList2);
            }
            List list2 = dVar.f365788a;
            C134296p pVar2 = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar2, "sensitivity");
            ArrayList arrayList3 = new ArrayList();
            C134297q.m217877a("Remove count", eVar.f367373b, pVar2, arrayList3);
            C134297q.m217877a("Required count", eVar.f367374c, pVar2, arrayList3);
            C134297q.m217877a("Clear all count", eVar.f367375d, pVar2, arrayList3);
            C134297q.m217877a("Unknown count", eVar.f367376e, pVar2, arrayList3);
            C69540x.m100811r(list2, arrayList3);
            arrayList.add(dVar.mo111674a());
        }
        return new C134291k("Data Operations Counts", arrayList);
    }
}
