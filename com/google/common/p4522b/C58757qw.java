package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.common.b.qw */
/* compiled from: PG */
final class C58757qw extends C58446fi implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final NavigableSet f156531a;

    /* renamed from: b */
    private final SortedSet f156532b;

    /* renamed from: c */
    private transient C58757qw f156533c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f156532b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Set mo55041c() {
        return this.f156532b;
    }

    public final Object ceiling(Object obj) {
        return this.f156531a.ceiling(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final SortedSet mo55296d() {
        return this.f156532b;
    }

    public final Iterator descendingIterator() {
        return C58570jy.m90153e(this.f156531a.descendingIterator());
    }

    public final NavigableSet descendingSet() {
        C58757qw qwVar = this.f156533c;
        if (qwVar != null) {
            return qwVar;
        }
        C58757qw qwVar2 = new C58757qw(this.f156531a.descendingSet());
        this.f156533c = qwVar2;
        qwVar2.f156533c = this;
        return qwVar2;
    }

    public final Object floor(Object obj) {
        return this.f156531a.floor(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156532b;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return C58758qx.m90651i(this.f156531a.headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return this.f156531a.higher(obj);
    }

    public final Object lower(Object obj) {
        return this.f156531a.lower(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return C58758qx.m90651i(this.f156531a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return C58758qx.m90651i(this.f156531a.tailSet(obj, z));
    }

    public C58757qw(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.f156531a = navigableSet;
        this.f156532b = Collections.unmodifiableSortedSet(navigableSet);
    }
}
