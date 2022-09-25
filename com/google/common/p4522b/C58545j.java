package com.google.common.p4522b;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.b.j */
/* compiled from: PG */
public class C58545j extends C58307ae implements C58585km {
    private static final long serialVersionUID = 6588350623831699109L;

    protected C58545j(Map map) {
        super(map);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo54900a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ Collection mo54901b() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final /* synthetic */ Collection mo54902c(Object obj) {
        return (List) super.mo54902c(obj);
    }

    /* renamed from: d */
    public final /* synthetic */ Collection mo54903d(Object obj) {
        return (List) super.mo54903d(obj);
    }

    /* renamed from: e */
    public final Collection mo54904e(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* renamed from: f */
    public final Collection mo54905f(Object obj, Collection collection) {
        return mo54912p(obj, (List) collection, (C58807y) null);
    }

    /* renamed from: g */
    public final List mo55277g(Object obj) {
        return (List) super.mo54902c(obj);
    }

    /* renamed from: h */
    public final List mo55278h(Object obj) {
        return (List) super.mo54903d(obj);
    }

    /* renamed from: i */
    public final List mo55279i(Object obj, Iterable iterable) {
        Collection collection;
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            collection = mo54903d(obj);
        } else {
            Collection collection2 = (Collection) this.f155873a.get(obj);
            if (collection2 == null) {
                collection2 = mo54900a();
                this.f155873a.put(obj, collection2);
            }
            Collection a = mo54900a();
            a.addAll(collection2);
            this.f155874b -= collection2.size();
            collection2.clear();
            while (it.hasNext()) {
                if (collection2.add(it.next())) {
                    this.f155874b++;
                }
            }
            collection = mo54904e(a);
        }
        return (List) collection;
    }
}
