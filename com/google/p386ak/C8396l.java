package com.google.p386ak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ak.l */
/* compiled from: PG */
public final class C8396l extends C8398n implements Iterable {

    /* renamed from: a */
    public final List f29253a = new ArrayList();

    /* renamed from: i */
    private final C8398n m23234i() {
        int size = this.f29253a.size();
        if (size == 1) {
            return (C8398n) this.f29253a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    /* renamed from: a */
    public final int mo17151a() {
        return this.f29253a.size();
    }

    /* renamed from: b */
    public final long mo17152b() {
        return m23234i().mo17152b();
    }

    /* renamed from: c */
    public final C8398n mo17153c(int i) {
        return (C8398n) this.f29253a.get(i);
    }

    /* renamed from: d */
    public final String mo17154d() {
        return m23234i().mo17154d();
    }

    /* renamed from: e */
    public final boolean mo17155e() {
        return m23234i().mo17155e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C8396l) && ((C8396l) obj).f29253a.equals(this.f29253a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f29253a.hashCode();
    }

    public final Iterator iterator() {
        return this.f29253a.iterator();
    }
}
