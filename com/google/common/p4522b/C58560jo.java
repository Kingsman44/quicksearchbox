package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.jo */
/* compiled from: PG */
final class C58560jo extends C58800sl {

    /* renamed from: a */
    int f156219a = 0;

    /* renamed from: b */
    final /* synthetic */ Iterator[] f156220b;

    public C58560jo(Iterator[] itArr) {
        this.f156220b = itArr;
    }

    public final boolean hasNext() {
        return this.f156219a < 2;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            Iterator it = (Iterator) Objects.requireNonNull(this.f156220b[this.f156219a]);
            Iterator[] itArr = this.f156220b;
            int i = this.f156219a;
            itArr[i] = null;
            this.f156219a = i + 1;
            return it;
        }
        throw new NoSuchElementException();
    }
}
