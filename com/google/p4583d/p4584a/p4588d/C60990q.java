package com.google.p4583d.p4584a.p4588d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.d.a.d.q */
/* compiled from: PG */
final class C60990q implements Iterator {

    /* renamed from: a */
    final /* synthetic */ C60991r f165126a;

    /* renamed from: b */
    private int f165127b = 0;

    public C60990q(C60991r rVar) {
        this.f165126a = rVar;
    }

    public final boolean hasNext() {
        return this.f165127b < this.f165126a.f165128a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f165127b;
        String str = this.f165126a.f165128a;
        if (i < str.length()) {
            this.f165127b = i + 1;
            return new C60991r(String.valueOf(str.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
