package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4573p.C60719i;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.bi */
/* compiled from: PG */
public final class C58338bi extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public final transient C58485gu f155909a;

    /* renamed from: b */
    public final transient int[] f155910b;

    public C58338bi(C58485gu guVar) {
        this.f155909a = guVar;
        int i = ((C58724pq) guVar).f156474d;
        int[] iArr = new int[(i + 1)];
        iArr[i] = 1;
        while (true) {
            i--;
            if (i >= 0) {
                try {
                    int i2 = iArr[i + 1];
                    int size = ((List) guVar.get(i)).size();
                    long j = ((long) i2) * ((long) size);
                    int i3 = (int) j;
                    C60719i.m92653a(j == ((long) i3), "checkedMultiply", i2, size);
                    iArr[i] = i3;
                } catch (ArithmeticException unused) {
                    throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
                }
            } else {
                this.f155910b = iArr;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List<Object> list = (List) obj;
        if (list.size() != ((C58724pq) this.f155909a).f156474d) {
            return false;
        }
        int i = 0;
        for (Object contains : list) {
            if (!((List) this.f155909a.get(i)).contains(contains)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f155910b[0], "index");
        return new C58337bh(this, i);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != ((C58724pq) this.f155909a).f156474d) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = ((List) this.f155909a.get(nextIndex)).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i += indexOf * this.f155910b[nextIndex + 1];
        }
        return i;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != ((C58724pq) this.f155909a).f156474d) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = ((List) this.f155909a.get(nextIndex)).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i += lastIndexOf * this.f155910b[nextIndex + 1];
        }
        return i;
    }

    public final int size() {
        return this.f155910b[0];
    }
}
