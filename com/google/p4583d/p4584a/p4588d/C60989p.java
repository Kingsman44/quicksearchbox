package com.google.p4583d.p4584a.p4588d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.d.a.d.p */
/* compiled from: PG */
final class C60989p implements Iterator {

    /* renamed from: a */
    final /* synthetic */ C60991r f165124a;

    /* renamed from: b */
    private int f165125b = 0;

    public C60989p(C60991r rVar) {
        this.f165124a = rVar;
    }

    public final boolean hasNext() {
        return this.f165125b < this.f165124a.f165128a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f165125b;
        if (i < this.f165124a.f165128a.length()) {
            this.f165125b = i + 1;
            return new C60991r(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
