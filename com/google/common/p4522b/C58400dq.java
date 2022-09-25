package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.b.dq */
/* compiled from: PG */
public final class C58400dq extends C58319aq implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient ConcurrentMap countMap;

    public C58400dq(ConcurrentMap concurrentMap) {
        C58838bb.m90873h(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    /* renamed from: g */
    private final List m89504g() {
        ArrayList e = C58597ky.m90214e(size());
        for (C58691ok okVar : mo54975m()) {
            Object b = okVar.mo55768b();
            for (int a = okVar.mo55767a(); a > 0; a--) {
                e.add(b);
            }
        }
        return e;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C58399dp.f156000a.mo55857b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    /* renamed from: c */
    public final int mo54922c() {
        return this.countMap.size();
    }

    public final void clear() {
        this.countMap.clear();
    }

    /* renamed from: d */
    public final int mo54924d(Object obj, int i) {
        int i2;
        int max;
        AtomicInteger atomicInteger = (AtomicInteger) C58662ni.m90348g(this.countMap, obj);
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    max = Math.max(0, i2 - i);
                }
            } while (!atomicInteger.compareAndSet(i2, max));
            if (max == 0) {
                this.countMap.remove(obj, atomicInteger);
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: e */
    public final Iterator mo54925e() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: f */
    public final Iterator mo54926f() {
        return new C58397dn(this, new C58396dm(this));
    }

    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    public final Iterator iterator() {
        return C58700ot.m90437a(this);
    }

    /* renamed from: j */
    public final Set mo54972j() {
        return new C58395dl(this.countMap.keySet());
    }

    @Deprecated
    /* renamed from: k */
    public final Set mo54973k() {
        return new C58398do(this);
    }

    /* renamed from: lv */
    public final int mo54932lv(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C58662ni.m90348g(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public final int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.countMap.values()) {
            j += (long) atomicInteger.get();
        }
        return C60757n.m92748i(j);
    }

    public final Object[] toArray() {
        return m89504g().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return m89504g().toArray(objArr);
    }

    /* renamed from: h */
    public final void mo54928h(Object obj, int i) {
        int i2;
        obj.getClass();
        AtomicInteger atomicInteger = (AtomicInteger) C58662ni.m90348g(this.countMap, obj);
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    return;
                }
            } while (!atomicInteger.compareAndSet(i2, 0));
            this.countMap.remove(obj, atomicInteger);
        }
    }

    /* renamed from: i */
    public final boolean mo54929i(Object obj, int i) {
        obj.getClass();
        C58371co.m89408c(i, "oldCount");
        AtomicInteger atomicInteger = (AtomicInteger) C58662ni.m90348g(this.countMap, obj);
        if (atomicInteger == null) {
            return i == 0;
        }
        int i2 = atomicInteger.get();
        if (i2 == i) {
            if (i2 == 0) {
                this.countMap.remove(obj, atomicInteger);
                return true;
            } else if (atomicInteger.compareAndSet(i2, 0)) {
                this.countMap.remove(obj, atomicInteger);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x006d;
     */
    /* renamed from: lF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo54931lF(java.lang.Object r5, int r6) {
        /*
            r4 = this;
            r5.getClass()
            if (r6 != 0) goto L_0x000a
            int r5 = r4.mo54932lv(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurrences"
            com.google.common.p4522b.C58371co.m89407b(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap r0 = r4.countMap
            java.lang.Object r0 = com.google.common.p4522b.C58662ni.m90348g(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002b
            java.util.concurrent.ConcurrentMap r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            return r1
        L_0x002b:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x0058
            int r3 = com.google.common.p4573p.C60716f.m92644a(r2, r6)     // Catch:{ ArithmeticException -> 0x003c }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003c }
            if (r3 == 0) goto L_0x002b
            return r2
        L_0x003c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Overflow adding "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0058:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x006d
            java.util.concurrent.ConcurrentMap r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58400dq.mo54931lF(java.lang.Object, int):int");
    }
}
