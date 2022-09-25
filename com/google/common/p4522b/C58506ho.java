package com.google.common.p4522b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.ho */
/* compiled from: PG */
public class C58506ho {

    /* renamed from: a */
    final Map f156147a = new C58384da();

    /* renamed from: g */
    public final C58512hu mo55453g() {
        return C58487gw.m89868p(this.f156147a.entrySet());
    }

    /* renamed from: h */
    public Collection mo55454h() {
        return new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo55455i(C58506ho hoVar) {
        for (Map.Entry entry : hoVar.f156147a.entrySet()) {
            mo55458l(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    /* renamed from: j */
    public final void mo55456j(Object obj, Object obj2) {
        C58371co.m89406a(obj, obj2);
        Collection collection = (Collection) this.f156147a.get(obj);
        if (collection == null) {
            Map map = this.f156147a;
            Collection h = mo55454h();
            map.put(obj, h);
            collection = h;
        }
        collection.add(obj2);
    }

    /* renamed from: k */
    public final void mo55457k(C58671nr nrVar) {
        for (Map.Entry entry : nrVar.mo54950C().entrySet()) {
            mo55458l(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    /* renamed from: l */
    public final void mo55458l(Object obj, Iterable iterable) {
        if (obj != null) {
            Collection collection = (Collection) this.f156147a.get(obj);
            if (collection != null) {
                for (Object next : iterable) {
                    C58371co.m89406a(obj, next);
                    collection.add(next);
                }
                return;
            }
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Collection h = mo55454h();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C58371co.m89406a(obj, next2);
                    h.add(next2);
                }
                this.f156147a.put(obj, h);
                return;
            }
            return;
        }
        throw new NullPointerException("null key in entry: null=".concat(C58557jl.m90135p(iterable)));
    }
}
