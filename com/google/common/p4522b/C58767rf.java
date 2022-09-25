package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: com.google.common.b.rf */
/* compiled from: PG */
final class C58767rf extends C58766re implements NavigableSet {
    public C58767rf(C58765rd rdVar) {
        super(rdVar);
    }

    public final Object ceiling(Object obj) {
        return C58768rg.m90682a(this.f156539a.mo55219lx(obj, 2).mo54991g());
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new C58767rf(this.f156539a.mo54995q());
    }

    public final Object floor(Object obj) {
        return C58768rg.m90682a(this.f156539a.mo55218lw(obj, 2).mo54992n());
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new C58767rf(this.f156539a.mo55218lw(obj, C58335bf.m89396a(z)));
    }

    public final Object higher(Object obj) {
        return C58768rg.m90682a(this.f156539a.mo55219lx(obj, 1).mo54991g());
    }

    public final Object lower(Object obj) {
        return C58768rg.m90682a(this.f156539a.mo55218lw(obj, 1).mo54992n());
    }

    public final Object pollFirst() {
        return C58768rg.m90682a(this.f156539a.mo54993o());
    }

    public final Object pollLast() {
        return C58768rg.m90682a(this.f156539a.mo54994p());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C58767rf(this.f156539a.mo54998t(obj, C58335bf.m89396a(z), obj2, C58335bf.m89396a(z2)));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C58767rf(this.f156539a.mo55219lx(obj, C58335bf.m89396a(z)));
    }
}
