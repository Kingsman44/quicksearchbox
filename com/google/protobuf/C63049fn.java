package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.fn */
/* compiled from: PG */
public final class C63049fn extends AbstractList implements RandomAccess, C62983db {

    /* renamed from: a */
    public final C62983db f170167a;

    public C63049fn(C62983db dbVar) {
        this.f170167a = dbVar;
    }

    /* renamed from: d */
    public final C62983db mo58964d() {
        return this;
    }

    /* renamed from: f */
    public final Object mo58965f(int i) {
        return this.f170167a.mo58965f(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C62982da) this.f170167a).get(i);
    }

    /* renamed from: h */
    public final List mo58968h() {
        return Collections.unmodifiableList(((C62982da) this.f170167a).f170039b);
    }

    /* renamed from: i */
    public final void mo58969i(C63088z zVar) {
        throw new UnsupportedOperationException();
    }

    public final Iterator iterator() {
        return new C63048fm(this);
    }

    public final ListIterator listIterator(int i) {
        return new C63047fl(this, i);
    }

    public final int size() {
        return this.f170167a.size();
    }
}
