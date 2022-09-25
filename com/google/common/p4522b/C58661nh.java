package com.google.common.p4522b;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.nh */
/* compiled from: PG */
abstract class C58661nh extends AbstractMap {

    /* renamed from: a */
    private transient Set f156390a;

    /* renamed from: b */
    private transient Set f156391b;

    /* renamed from: c */
    private transient Collection f156392c;

    /* renamed from: b */
    public abstract Set mo55700b();

    /* renamed from: e */
    public Set mo55703e() {
        return new C58656nc(this);
    }

    public final Set entrySet() {
        Set set = this.f156390a;
        if (set != null) {
            return set;
        }
        Set b = mo55700b();
        this.f156390a = b;
        return b;
    }

    public Set keySet() {
        Set set = this.f156391b;
        if (set != null) {
            return set;
        }
        Set e = mo55703e();
        this.f156391b = e;
        return e;
    }

    /* renamed from: lu */
    public Collection mo55695lu() {
        return new C58660ng(this);
    }

    public final Collection values() {
        Collection collection = this.f156392c;
        if (collection != null) {
            return collection;
        }
        Collection lu = mo55695lu();
        this.f156392c = lu;
        return lu;
    }
}
