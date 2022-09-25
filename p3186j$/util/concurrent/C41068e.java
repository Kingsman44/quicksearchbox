package p3186j$.util.concurrent;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.e */
final class C41068e extends C41065b implements Set, p3186j$.util.Set {
    C41068e(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (this.f107595a.mo43527g(entry.getKey(), entry.getValue(), false) == null) {
            return true;
        }
        return false;
    }

    public final boolean addAll(Collection collection) {
        boolean z;
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f107595a.mo43527g(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r2.f107595a.get((r0 = r3.getKey()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r3 = (r3 = (java.util.Map.Entry) r3).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0024
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0024
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f107595a
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0024
            if (r3 == r0) goto L_0x0022
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41068e.contains(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (java.util.Set) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto L_0x0016
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == r1) goto L_0x0014
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x0016
            boolean r2 = r2.containsAll(r1)
            if (r2 == 0) goto L_0x0016
        L_0x0014:
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41068e.equals(java.lang.Object):boolean");
    }

    public final void forEach(Consumer consumer) {
        if (consumer != null) {
            C41074k[] kVarArr = this.f107595a.f107579a;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c != null) {
                        consumer.accept(new C41073j(c.f107606b, c.f107607c, this.f107595a));
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        C41074k[] kVarArr = this.f107595a.f107579a;
        int i = 0;
        if (kVarArr != null) {
            C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                C41074k c = pVar.mo43572c();
                if (c == null) {
                    break;
                }
                i += c.hashCode();
            }
        }
        return i;
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        C41074k[] kVarArr = concurrentHashMap.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new C41067d(kVarArr, length, length, concurrentHashMap);
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x001c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x001c
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f107595a
            boolean r3 = r1.remove(r0, r3)
            if (r3 == 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41068e.remove(java.lang.Object):boolean");
    }

    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        if (predicate != null) {
            C41074k[] kVarArr = concurrentHashMap.f107579a;
            boolean z = false;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c == null) {
                        break;
                    }
                    Object obj = c.f107606b;
                    Object obj2 = c.f107607c;
                    if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.mo43528h(obj, (Object) null, obj2) != null) {
                        z = true;
                    }
                }
            }
            return z;
        }
        concurrentHashMap.getClass();
        throw null;
    }

    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        long k = concurrentHashMap.mo43529k();
        C41074k[] kVarArr = concurrentHashMap.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        long j = 0;
        if (k >= 0) {
            j = k;
        }
        return new C41069f(kVarArr, length, 0, length, j, concurrentHashMap);
    }

    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }
}
