package com.google.common.p4522b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* renamed from: com.google.common.b.re */
/* compiled from: PG */
class C58766re extends C58695oo implements SortedSet {

    /* renamed from: a */
    public final C58765rd f156539a;

    public C58766re(C58765rd rdVar) {
        this.f156539a = rdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58692ol mo54961a() {
        return this.f156539a;
    }

    public final Comparator comparator() {
        return this.f156539a.comparator();
    }

    public final Object first() {
        return C58768rg.m90683b(this.f156539a.mo54991g());
    }

    public final SortedSet headSet(Object obj) {
        return this.f156539a.mo55218lw(obj, 1).mo54997s();
    }

    public final Iterator iterator() {
        return new C58693om(this.f156539a.mo54975m().iterator());
    }

    public final Object last() {
        return C58768rg.m90683b(this.f156539a.mo54992n());
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return this.f156539a.mo54998t(obj, 2, obj2, 1).mo54997s();
    }

    public final SortedSet tailSet(Object obj) {
        return this.f156539a.mo55219lx(obj, 2).mo54997s();
    }
}
