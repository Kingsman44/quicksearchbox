package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asq */
/* compiled from: PG */
public final class asq extends asp implements ListIterator, Iterator {

    /* renamed from: a */
    private final int f21503a;

    /* renamed from: b */
    private int f21504b;

    /* renamed from: c */
    private final arn f21505c;

    protected asq() {
    }

    protected asq(int i, int i2) {
        this();
        aqd.m19284l(i2, i);
        this.f21503a = i;
        this.f21504b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15361a(int i) {
        return this.f21505c.get(i);
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.f21504b < this.f21503a;
    }

    public boolean hasPrevious() {
        return this.f21504b > 0;
    }

    public Object next() {
        if (hasNext()) {
            int i = this.f21504b;
            this.f21504b = i + 1;
            return mo15361a(i);
        }
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return this.f21504b;
    }

    public Object previous() {
        if (hasPrevious()) {
            int i = this.f21504b - 1;
            this.f21504b = i;
            return mo15361a(i);
        }
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return this.f21504b - 1;
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public asq(arn arn, int i) {
        this(arn.size(), i);
        this.f21505c = arn;
    }
}
