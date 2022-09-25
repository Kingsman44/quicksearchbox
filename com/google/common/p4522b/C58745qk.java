package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.qk */
/* compiled from: PG */
public final class C58745qk extends C58756qv {

    /* renamed from: a */
    public final /* synthetic */ Set f156516a;

    /* renamed from: b */
    public final /* synthetic */ Set f156517b;

    public C58745qk(Set set, Set set2) {
        this.f156516a = set;
        this.f156517b = set2;
    }

    /* renamed from: a */
    public final C58800sl mo55858a() {
        return new C58744qj(this);
    }

    public final boolean contains(Object obj) {
        return this.f156516a.contains(obj) || this.f156517b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f156516a.isEmpty() && this.f156517b.isEmpty();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58744qj(this);
    }

    public final int size() {
        int size = this.f156516a.size();
        for (Object contains : this.f156517b) {
            if (!this.f156516a.contains(contains)) {
                size++;
            }
        }
        return size;
    }
}
