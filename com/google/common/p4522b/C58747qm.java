package com.google.common.p4522b;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.qm */
/* compiled from: PG */
public final class C58747qm extends C58756qv {

    /* renamed from: a */
    final /* synthetic */ Set f156520a;

    /* renamed from: b */
    final /* synthetic */ Set f156521b;

    public C58747qm(Set set, Set set2) {
        this.f156520a = set;
        this.f156521b = set2;
    }

    /* renamed from: a */
    public final C58800sl mo55858a() {
        return new C58746ql(this);
    }

    public final boolean contains(Object obj) {
        return this.f156520a.contains(obj) && this.f156521b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f156520a.containsAll(collection) && this.f156521b.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.f156521b, this.f156520a);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58746ql(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f156520a) {
            if (this.f156521b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
