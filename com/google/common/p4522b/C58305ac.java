package com.google.common.p4522b;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.ac */
/* compiled from: PG */
final class C58305ac extends C58807y implements Set {

    /* renamed from: f */
    final /* synthetic */ C58307ae f155871f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58305ac(C58307ae aeVar, Object obj, Set set) {
        super(aeVar, obj, set, (C58807y) null);
        this.f155871f = aeVar;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean m = C58758qx.m90655m((Set) this.f156597b, collection);
        if (m) {
            int size2 = this.f156597b.size();
            this.f155871f.f155874b += size2 - size;
            mo56050c();
        }
        return m;
    }
}
