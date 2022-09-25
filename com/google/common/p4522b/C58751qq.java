package com.google.common.p4522b;

import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import java.util.Set;

/* renamed from: com.google.common.b.qq */
/* compiled from: PG */
public final class C58751qq extends C58756qv {

    /* renamed from: a */
    final /* synthetic */ Set f156529a;

    /* renamed from: b */
    final /* synthetic */ Set f156530b;

    public C58751qq(Set set, Set set2) {
        this.f156529a = set;
        this.f156530b = set2;
    }

    /* renamed from: a */
    public final C58800sl iterator() {
        return new C58750qp(this, this.f156529a.iterator(), new C0978h((C0979i) this.f156530b));
    }

    public final boolean contains(Object obj) {
        return this.f156530b.contains(obj) ^ this.f156529a.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f156529a.equals(this.f156530b);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f156529a) {
            if (!this.f156530b.contains(contains)) {
                i++;
            }
        }
        C0978h hVar = new C0978h((C0979i) this.f156530b);
        while (hVar.hasNext()) {
            if (!this.f156529a.contains(hVar.next())) {
                i++;
            }
        }
        return i;
    }
}
