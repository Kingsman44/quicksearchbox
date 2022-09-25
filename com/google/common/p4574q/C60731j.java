package com.google.common.p4574q;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58436ez;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: com.google.common.q.j */
/* compiled from: PG */
final class C60731j extends C58436ez {

    /* renamed from: a */
    private final ListIterator f164735a;

    public C60731j(ListIterator listIterator) {
        this.f164735a = listIterator;
    }

    public final void add(Object obj) {
        C58838bb.m90866a(obj, "this list cannot contain null");
        this.f164735a.add(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Iterator mo55144b() {
        return this.f164735a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ListIterator mo55269c() {
        return this.f164735a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164735a;
    }

    public final void set(Object obj) {
        C58838bb.m90866a(obj, "this list cannot contain null");
        this.f164735a.set(obj);
    }
}
