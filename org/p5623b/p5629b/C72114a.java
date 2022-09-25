package org.p5623b.p5629b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: org.b.b.a */
/* compiled from: PG */
public final class C72114a implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final Object[] f191944a;

    /* renamed from: b */
    private int f191945b = 0;

    public C72114a(Object[] objArr) {
        this.f191944a = objArr;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f191945b < this.f191944a.length;
    }

    public final Object next() {
        int i = this.f191945b;
        Object[] objArr = this.f191944a;
        if (i != objArr.length) {
            this.f191945b = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException("Out of elements: " + i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
