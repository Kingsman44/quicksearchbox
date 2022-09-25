package com.google.common.p4574q;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58435ey;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.common.q.i */
/* compiled from: PG */
final class C60730i extends C58435ey {

    /* renamed from: a */
    final List f164734a;

    public C60730i(List list) {
        list.getClass();
        this.f164734a = list;
    }

    public final void add(int i, Object obj) {
        C58838bb.m90866a(obj, "this list cannot contain null");
        this.f164734a.add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        return this.f164734a.addAll(i, C60734m.m92688a(collection));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f164734a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final List mo55257c() {
        return this.f164734a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164734a;
    }

    public final ListIterator listIterator() {
        return new C60731j(this.f164734a.listIterator());
    }

    public final Object set(int i, Object obj) {
        C58838bb.m90866a(obj, "this list cannot contain null");
        return this.f164734a.set(i, obj);
    }

    public final List subList(int i, int i2) {
        return new C60730i(this.f164734a.subList(i, i2));
    }

    public final ListIterator listIterator(int i) {
        return new C60731j(this.f164734a.listIterator(i));
    }

    public final boolean add(Object obj) {
        C58838bb.m90866a(obj, "this list cannot contain null");
        return this.f164734a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        return this.f164734a.addAll(C60734m.m92688a(collection));
    }
}
