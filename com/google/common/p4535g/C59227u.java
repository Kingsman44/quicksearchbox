package com.google.common.p4535g;

import com.google.common.p4522b.C58597ky;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.g.u */
/* compiled from: PG */
public final class C59227u implements Iterable, Serializable, C59165cd {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public ArrayList f157335a = new ArrayList();

    /* renamed from: a */
    public static int m91961a(List list, C59226t tVar, int i) {
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >> 1;
            int a = ((C59226t) list.get(i2)).compareTo(tVar);
            if (a < 0) {
                i = i2 + 1;
            } else if (a <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static void m91962d(List list) {
        Collections.sort(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C59226t tVar = (C59226t) list.get(i2);
            if (i <= 0 || !((C59226t) list.get(i - 1)).mo56657C(tVar)) {
                while (i > 0) {
                    int i3 = i - 1;
                    if (!tVar.mo56657C((C59226t) list.get(i3))) {
                        break;
                    }
                    i = i3;
                }
                while (i >= 3) {
                    int i4 = i - 3;
                    long j = ((C59226t) list.get(i4)).f157334b;
                    int i5 = i - 2;
                    long j2 = ((C59226t) list.get(i5)).f157334b;
                    int i6 = i - 1;
                    long j3 = ((C59226t) list.get(i6)).f157334b;
                    long j4 = tVar.f157334b;
                    if (((j ^ j2) ^ j3) == j4) {
                        long lowestOneBit = Long.lowestOneBit(j4);
                        long j5 = lowestOneBit + lowestOneBit;
                        long j6 = (j5 + (j5 + j5)) ^ -1;
                        long j7 = tVar.f157334b & j6;
                        if ((((C59226t) list.get(i4)).f157334b & j6) != j7 || (((C59226t) list.get(i5)).f157334b & j6) != j7 || (j6 & ((C59226t) list.get(i6)).f157334b) != j7 || tVar.mo56660F()) {
                            break;
                        }
                        tVar = tVar.mo56675v();
                        i = i4;
                    } else {
                        break;
                    }
                }
                list.set(i, tVar);
                i++;
            }
        }
        int size = list.size();
        while (i < size) {
            size--;
            list.remove(size);
        }
    }

    /* renamed from: b */
    public final boolean mo56680b(C59226t tVar) {
        int binarySearch = Collections.binarySearch(this.f157335a, tVar);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch < this.f157335a.size() && ((C59226t) this.f157335a.get(binarySearch)).mo56678y().mo56662H(tVar)) {
            return true;
        }
        if (binarySearch == 0 || !((C59226t) this.f157335a.get(binarySearch - 1)).mo56677x().mo56658D(tVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo56681c(C59226t tVar) {
        int binarySearch = Collections.binarySearch(this.f157335a, tVar);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch < this.f157335a.size() && ((C59226t) this.f157335a.get(binarySearch)).mo56678y().mo56662H(tVar.mo56677x())) {
            return true;
        }
        if (binarySearch == 0 || !((C59226t) this.f157335a.get(binarySearch - 1)).mo56677x().mo56658D(tVar.mo56678y())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C59227u uVar = new C59227u();
        uVar.f157335a = C58597ky.m90211b(this.f157335a);
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59227u)) {
            return false;
        }
        return this.f157335a.equals(((C59227u) obj).f157335a);
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    public final int hashCode() {
        Iterator it = this.f157335a.iterator();
        int i = 17;
        while (it.hasNext()) {
            i = (i * 37) + ((C59226t) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        return this.f157335a.iterator();
    }
}
