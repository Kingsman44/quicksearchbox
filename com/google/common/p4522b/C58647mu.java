package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.mu */
/* compiled from: PG */
public final class C58647mu extends C58661nh {

    /* renamed from: a */
    public final Set f156373a;

    /* renamed from: b */
    final C58817ah f156374b;

    public C58647mu(Set set, C58817ah ahVar) {
        set.getClass();
        this.f156373a = set;
        this.f156374b = ahVar;
    }

    /* renamed from: b */
    public final Set mo55700b() {
        return new C58646mt(this);
    }

    public final void clear() {
        this.f156373a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f156373a.contains(obj);
    }

    /* renamed from: e */
    public final Set mo55703e() {
        return new C58641mo(this.f156373a);
    }

    public final Object get(Object obj) {
        if (C58374cr.m89412d(this.f156373a, obj)) {
            return this.f156374b.apply(obj);
        }
        return null;
    }

    /* renamed from: lu */
    public final Collection mo55695lu() {
        return new C58373cq(this.f156373a, this.f156374b);
    }

    public final Object remove(Object obj) {
        if (this.f156373a.remove(obj)) {
            return this.f156374b.apply(obj);
        }
        return null;
    }

    public final int size() {
        return this.f156373a.size();
    }
}
