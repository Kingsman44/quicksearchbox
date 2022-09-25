package com.google.common.p4526f.p4531c;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.common.f.c.i */
/* compiled from: PG */
public final class C59061i extends AbstractSet {

    /* renamed from: a */
    final int f156981a;

    /* renamed from: b */
    final /* synthetic */ C59062j f156982b;

    public C59061i(C59062j jVar, int i) {
        this.f156982b = jVar;
        this.f156981a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56324a() {
        return this.f156982b.f156985c[this.f156981a + 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo56325b() {
        int i = this.f156981a;
        if (i == -1) {
            return 0;
        }
        return this.f156982b.f156985c[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo56326c(int i) {
        return this.f156982b.f156984b[mo56325b() + i];
    }

    public final boolean contains(Object obj) {
        Comparator comparator;
        Object[] objArr = this.f156982b.f156984b;
        int b = mo56325b();
        int a = mo56324a();
        if (this.f156981a == -1) {
            comparator = C59062j.f156983a;
        } else {
            comparator = C59064l.f156994a;
        }
        return Arrays.binarySearch(objArr, b, a, obj, comparator) >= 0;
    }

    public final Iterator iterator() {
        return new C59060h(this);
    }

    public final int size() {
        return mo56324a() - mo56325b();
    }
}
