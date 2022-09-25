package com.google.common.p4522b;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.qa */
/* compiled from: PG */
public final class C58735qa extends C58541iw {

    /* renamed from: a */
    public static final C58735qa f156506a = new C58735qa(C58485gu.m89845m(), C58701ou.f156429a);

    /* renamed from: e */
    public final transient C58485gu f156507e;

    public C58735qa(C58485gu guVar, Comparator comparator) {
        super(comparator);
        this.f156507e = guVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return this.f156507e.mo55032a();
    }

    public final Object ceiling(Object obj) {
        int f = mo55846f(obj, true);
        if (f == this.f156507e.size()) {
            return null;
        }
        return this.f156507e.get(f);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f156507e, obj, this.f156195b) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof C58692ol) {
            collection = ((C58692ol) collection).mo54974l();
        }
        if (!C58763rb.m90669b(this.f156195b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C58801sm G = this.f156507e.listIterator(0);
        Iterator it = collection.iterator();
        if (!G.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = G.next();
        while (true) {
            try {
                int compare = this.f156195b.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    } else if (!it.hasNext()) {
                        return true;
                    } else {
                        next = it.next();
                    }
                } else if (!G.hasNext()) {
                    return false;
                } else {
                    next2 = G.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo55845e(Object obj, boolean z) {
        C58485gu guVar = this.f156507e;
        obj.getClass();
        int binarySearch = Collections.binarySearch(guVar, obj, this.f156195b);
        if (binarySearch >= 0) {
            return z ? binarySearch + 1 : binarySearch;
        }
        return binarySearch ^ -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[Catch:{ ClassCastException | NoSuchElementException -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r7 = (java.util.Set) r7
            com.google.common.b.gu r1 = r6.f156507e
            int r1 = r1.size()
            int r3 = r7.size()
            if (r1 == r3) goto L_0x0019
            return r2
        L_0x0019:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x0020:
            java.util.Comparator r1 = r6.f156195b
            boolean r1 = com.google.common.p4522b.C58763rb.m90669b(r1, r7)
            if (r1 == 0) goto L_0x004d
            java.util.Iterator r7 = r7.iterator()
            com.google.common.b.gu r1 = r6.f156507e     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            com.google.common.b.sm r1 = r1.listIterator(r2)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
        L_0x0032:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            java.lang.Object r4 = r7.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r4 == 0) goto L_0x004a
            java.util.Comparator r5 = r6.f156195b     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            int r3 = r5.compare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r3 == 0) goto L_0x0032
        L_0x004a:
            return r2
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        L_0x004d:
            boolean r7 = r6.containsAll(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58735qa.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo55846f(Object obj, boolean z) {
        C58485gu guVar = this.f156507e;
        obj.getClass();
        int binarySearch = Collections.binarySearch(guVar, obj, this.f156195b);
        if (binarySearch >= 0) {
            return z ? binarySearch : binarySearch + 1;
        }
        return binarySearch ^ -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f156507e.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int e = mo55845e(obj, true) - 1;
        if (e == -1) {
            return null;
        }
        return this.f156507e.get(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C58735qa mo55847g(int i, int i2) {
        if (i == 0) {
            if (i2 == this.f156507e.size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new C58735qa(this.f156507e.subList(i, i2), this.f156195b);
        }
        return m90070U(this.f156195b);
    }

    public final Object higher(Object obj) {
        int f = mo55846f(obj, false);
        if (f == this.f156507e.size()) {
            return null;
        }
        return this.f156507e.get(f);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f156507e.listIterator(0);
    }

    /* renamed from: j */
    public final C58541iw mo55159j() {
        Comparator reverseOrder = Collections.reverseOrder(this.f156195b);
        if (isEmpty()) {
            return m90070U(reverseOrder);
        }
        return new C58735qa(this.f156507e.mo55401lD(), reverseOrder);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return this.f156507e.listIterator(0);
    }

    public final Object last() {
        if (!isEmpty()) {
            C58485gu guVar = this.f156507e;
            return guVar.get(guVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int e = mo55845e(obj, false) - 1;
        if (e == -1) {
            return null;
        }
        return this.f156507e.get(e);
    }

    /* renamed from: lz */
    public final C58800sl descendingIterator() {
        return this.f156507e.mo55401lD().listIterator(0);
    }

    /* renamed from: m */
    public final C58541iw mo55162m(Object obj, boolean z) {
        return mo55847g(0, mo55845e(obj, z));
    }

    /* renamed from: p */
    public final C58541iw mo55165p(Object obj, boolean z, Object obj2, boolean z2) {
        return mo55168s(obj, z).mo55162m(obj2, z2);
    }

    /* renamed from: s */
    public final C58541iw mo55168s(Object obj, boolean z) {
        return mo55847g(mo55846f(obj, z), this.f156507e.size());
    }

    public final int size() {
        return this.f156507e.size();
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        return this.f156507e;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        return this.f156507e.mo55383w(objArr, i);
    }

    /* renamed from: x */
    public final int mo55384x() {
        return this.f156507e.mo55384x();
    }

    /* renamed from: y */
    public final int mo55385y() {
        return this.f156507e.mo55385y();
    }

    /* renamed from: z */
    public final Object[] mo55386z() {
        return this.f156507e.mo55386z();
    }
}
