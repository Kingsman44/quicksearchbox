package com.google.common.p4522b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.jp */
/* compiled from: PG */
final class C58561jp extends C58800sl {

    /* renamed from: a */
    final /* synthetic */ Iterator f156221a;

    /* renamed from: b */
    final /* synthetic */ int f156222b;

    public C58561jp(Iterator it, int i) {
        this.f156221a = it;
        this.f156222b = i;
    }

    public final boolean hasNext() {
        return this.f156221a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            Object[] objArr = new Object[this.f156222b];
            int i = 0;
            while (i < this.f156222b && this.f156221a.hasNext()) {
                objArr[i] = this.f156221a.next();
                i++;
            }
            for (int i2 = i; i2 < this.f156222b; i2++) {
                objArr[i2] = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            if (i == this.f156222b) {
                return unmodifiableList;
            }
            return unmodifiableList.subList(0, i);
        }
        throw new NoSuchElementException();
    }
}
