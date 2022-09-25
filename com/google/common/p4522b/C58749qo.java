package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.qo */
/* compiled from: PG */
public final class C58749qo extends C58756qv {

    /* renamed from: a */
    final /* synthetic */ Set f156524a;

    /* renamed from: b */
    final /* synthetic */ Set f156525b;

    public C58749qo(Set set, Set set2) {
        this.f156524a = set;
        this.f156525b = set2;
    }

    /* renamed from: a */
    public final C58800sl mo55858a() {
        return new C58748qn(this);
    }

    public final boolean contains(Object obj) {
        return this.f156524a.contains(obj) && !this.f156525b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f156525b.containsAll(this.f156524a);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58748qn(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f156524a) {
            if (!this.f156525b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
