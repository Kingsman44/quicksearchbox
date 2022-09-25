package com.google.common.p4522b;

import com.google.common.base.C58815af;
import com.google.common.base.C58831av;
import com.google.common.p4575r.C60757n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p3186j$.util.concurrent.ConcurrentMap;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.mi */
/* compiled from: PG */
final class C58635mi extends AbstractMap implements ConcurrentMap, Serializable, p3186j$.util.concurrent.ConcurrentMap {

    /* renamed from: a */
    static final C58632mf f156351a = new C58600la();

    /* renamed from: k */
    public static final /* synthetic */ int f156352k = 0;
    private static final long serialVersionUID = 5;

    /* renamed from: b */
    final transient int f156353b;

    /* renamed from: c */
    final transient int f156354c;

    /* renamed from: d */
    final transient C58613ln[] f156355d;

    /* renamed from: e */
    final int f156356e;

    /* renamed from: f */
    final C58815af f156357f;

    /* renamed from: g */
    final transient C58609lj f156358g;

    /* renamed from: h */
    transient Set f156359h;

    /* renamed from: i */
    transient Collection f156360i;

    /* renamed from: j */
    transient Set f156361j;

    public C58635mi(C58598kz kzVar, C58609lj ljVar) {
        this.f156356e = Math.min(kzVar.mo55622a(), 65536);
        this.f156357f = (C58815af) C58831av.m90830c(kzVar.f156302f, kzVar.mo55624c().mo55674a());
        this.f156358g = ljVar;
        int min = Math.min(kzVar.mo55623b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f156356e) {
            i4++;
            i3 += i3;
        }
        this.f156354c = 32 - i4;
        this.f156353b = i3 - 1;
        this.f156355d = new C58613ln[i3];
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 += i2;
        }
        while (true) {
            C58613ln[] lnVarArr = this.f156355d;
            if (i < lnVarArr.length) {
                lnVarArr[i] = this.f156358g.mo55653f(this, i2);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static ArrayList m90313d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        C58570jy.m90163o(arrayList, collection.iterator());
        return arrayList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo55687a(Object obj) {
        int c = this.f156357f.mo56076c(obj);
        int i = c + ((c << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58815af mo55688b() {
        return this.f156358g.mo55651d().mo55674a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58613ln mo55689c(int i) {
        return this.f156355d[(i >>> this.f156354c) & this.f156353b];
    }

    public final void clear() {
        C58613ln[] lnVarArr = this.f156355d;
        int length = lnVarArr.length;
        for (int i = 0; i < length; i++) {
            C58613ln lnVar = lnVarArr[i];
            if (lnVar.f156324b != 0) {
                lnVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = lnVar.f156327e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, (Object) null);
                    }
                    lnVar.mo55668g();
                    lnVar.f156329g.set(0);
                    lnVar.f156325c++;
                    lnVar.f156324b = 0;
                } finally {
                    lnVar.unlock();
                }
            }
        }
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final boolean containsKey(Object obj) {
        C58608li b;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a = mo55687a(obj);
        C58613ln c = mo55689c(a);
        try {
            if (!(c.f156324b == 0 || (b = c.mo55663b(obj, a)) == null || b.mo55636d() == null)) {
                z = true;
            }
            return z;
        } finally {
            c.mo55670i();
        }
    }

    public final boolean containsValue(Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (obj3 == null) {
            return false;
        }
        C58613ln[] lnVarArr = this.f156355d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (C58613ln lnVar : lnVarArr) {
                int i2 = lnVar.f156324b;
                AtomicReferenceArray atomicReferenceArray = lnVar.f156327e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (C58608li liVar = (C58608li) atomicReferenceArray.get(i3); liVar != null; liVar = liVar.mo55634b()) {
                        if (liVar.mo55635c() == null || (obj2 = liVar.mo55636d()) == null) {
                            lnVar.mo55673l();
                            obj2 = null;
                        }
                        if (obj2 != null && mo55688b().mo56077d(obj3, obj2)) {
                            return true;
                        }
                    }
                }
                j2 += (long) lnVar.f156325c;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f156361j;
        if (set != null) {
            return set;
        }
        C58606lg lgVar = new C58606lg(this);
        this.f156361j = lgVar;
        return lgVar;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int a = mo55687a(obj);
        C58613ln c = mo55689c(a);
        try {
            C58608li b = c.mo55663b(obj, a);
            if (b != null) {
                obj2 = b.mo55636d();
                if (obj2 == null) {
                    c.mo55673l();
                }
            }
            return obj2;
        } finally {
            c.mo55670i();
        }
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final boolean isEmpty() {
        C58613ln[] lnVarArr = this.f156355d;
        long j = 0;
        for (int i = 0; i < lnVarArr.length; i++) {
            if (lnVarArr[i].f156324b != 0) {
                return false;
            }
            j += (long) lnVarArr[i].f156325c;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < lnVarArr.length; i2++) {
            if (lnVarArr[i2].f156324b != 0) {
                return false;
            }
            j -= (long) lnVarArr[i2].f156325c;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        Set set = this.f156359h;
        if (set != null) {
            return set;
        }
        C58611ll llVar = new C58611ll(this);
        this.f156359h = llVar;
        return llVar;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo55687a(obj);
        C58613ln c = mo55689c(a);
        c.lock();
        try {
            c.mo55671j();
            int i = c.f156324b;
            AtomicReferenceArray atomicReferenceArray = c.f156327e;
            int length = (atomicReferenceArray.length() - 1) & a;
            C58608li liVar = (C58608li) atomicReferenceArray.get(length);
            C58608li liVar2 = liVar;
            while (true) {
                if (liVar2 == null) {
                    break;
                }
                Object c2 = liVar2.mo55635c();
                if (liVar2.mo55633a() != a || c2 == null || !c.f156323a.f156357f.mo56077d(obj, c2)) {
                    liVar2 = liVar2.mo55634b();
                } else {
                    Object d = liVar2.mo55636d();
                    if (d == null) {
                        if (!C58613ln.m90256m(liVar2)) {
                        }
                    }
                    c.f156325c++;
                    atomicReferenceArray.set(length, c.mo55664c(liVar, liVar2));
                    c.f156324b--;
                    c.unlock();
                    return d;
                }
            }
            c.unlock();
            return null;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    public final int size() {
        C58613ln[] lnVarArr = this.f156355d;
        long j = 0;
        for (C58613ln lnVar : lnVarArr) {
            j += (long) lnVar.f156324b;
        }
        return C60757n.m92748i(j);
    }

    public final Collection values() {
        Collection collection = this.f156360i;
        if (collection != null) {
            return collection;
        }
        C58623lx lxVar = new C58623lx(this);
        this.f156360i = lxVar;
        return lxVar;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        C58615lp c = this.f156358g.mo55650c();
        C58615lp d = this.f156358g.mo55651d();
        C58815af afVar = this.f156357f;
        this.f156358g.mo55651d().mo55674a();
        return new C58614lo(c, d, afVar, this.f156356e, this);
    }

    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo55687a(obj);
        return mo55689c(a).mo55665d(obj, a, obj2, false);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo55687a(obj);
        return mo55689c(a).mo55665d(obj, a, obj2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (com.google.common.p4522b.C58613ln.m90256m(r6) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0079
            if (r11 != 0) goto L_0x0007
            goto L_0x0079
        L_0x0007:
            int r1 = r9.mo55687a(r10)
            com.google.common.b.ln r2 = r9.mo55689c(r1)
            r2.lock()
            r2.mo55671j()     // Catch:{ all -> 0x0074 }
            int r3 = r2.f156324b     // Catch:{ all -> 0x0074 }
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f156327e     // Catch:{ all -> 0x0074 }
            int r4 = r3.length()     // Catch:{ all -> 0x0074 }
            int r4 = r4 + -1
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0074 }
            com.google.common.b.li r5 = (com.google.common.p4522b.C58608li) r5     // Catch:{ all -> 0x0074 }
            r6 = r5
        L_0x0027:
            if (r6 == 0) goto L_0x0070
            java.lang.Object r7 = r6.mo55635c()     // Catch:{ all -> 0x0074 }
            int r8 = r6.mo55633a()     // Catch:{ all -> 0x0074 }
            if (r8 != r1) goto L_0x006b
            if (r7 == 0) goto L_0x006b
            com.google.common.b.mi r8 = r2.f156323a     // Catch:{ all -> 0x0074 }
            com.google.common.base.af r8 = r8.f156357f     // Catch:{ all -> 0x0074 }
            boolean r7 = r8.mo56077d(r10, r7)     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x006b
            java.lang.Object r10 = r6.mo55636d()     // Catch:{ all -> 0x0074 }
            com.google.common.b.mi r1 = r2.f156323a     // Catch:{ all -> 0x0074 }
            com.google.common.base.af r1 = r1.mo55688b()     // Catch:{ all -> 0x0074 }
            boolean r10 = r1.mo56077d(r11, r10)     // Catch:{ all -> 0x0074 }
            r11 = 1
            if (r10 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0058
        L_0x0052:
            boolean r10 = com.google.common.p4522b.C58613ln.m90256m(r6)     // Catch:{ all -> 0x0074 }
            if (r10 == 0) goto L_0x0070
        L_0x0058:
            int r10 = r2.f156325c     // Catch:{ all -> 0x0074 }
            int r10 = r10 + r11
            r2.f156325c = r10     // Catch:{ all -> 0x0074 }
            com.google.common.b.li r10 = r2.mo55664c(r5, r6)     // Catch:{ all -> 0x0074 }
            int r11 = r2.f156324b     // Catch:{ all -> 0x0074 }
            int r11 = r11 + -1
            r3.set(r4, r10)     // Catch:{ all -> 0x0074 }
            r2.f156324b = r11     // Catch:{ all -> 0x0074 }
            goto L_0x0070
        L_0x006b:
            com.google.common.b.li r6 = r6.mo55634b()     // Catch:{ all -> 0x0074 }
            goto L_0x0027
        L_0x0070:
            r2.unlock()
            return r0
        L_0x0074:
            r10 = move-exception
            r2.unlock()
            throw r10
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58635mi.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo55687a(obj);
        C58613ln c = mo55689c(a);
        c.lock();
        try {
            c.mo55671j();
            AtomicReferenceArray atomicReferenceArray = c.f156327e;
            int length = (atomicReferenceArray.length() - 1) & a;
            C58608li liVar = (C58608li) atomicReferenceArray.get(length);
            C58608li liVar2 = liVar;
            while (true) {
                if (liVar2 == null) {
                    break;
                }
                Object c2 = liVar2.mo55635c();
                if (liVar2.mo55633a() != a || c2 == null || !c.f156323a.f156357f.mo56077d(obj, c2)) {
                    liVar2 = liVar2.mo55634b();
                } else {
                    Object d = liVar2.mo55636d();
                    if (d != null) {
                        c.f156325c++;
                        c.mo55672k(liVar2, obj2);
                        c.unlock();
                        return d;
                    } else if (C58613ln.m90256m(liVar2)) {
                        int i = c.f156324b;
                        c.f156325c++;
                        atomicReferenceArray.set(length, c.mo55664c(liVar, liVar2));
                        c.f156324b--;
                    }
                }
            }
            return null;
        } finally {
            c.unlock();
        }
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int a = mo55687a(obj);
        C58613ln c = mo55689c(a);
        c.lock();
        try {
            c.mo55671j();
            AtomicReferenceArray atomicReferenceArray = c.f156327e;
            int length = (atomicReferenceArray.length() - 1) & a;
            C58608li liVar = (C58608li) atomicReferenceArray.get(length);
            C58608li liVar2 = liVar;
            while (true) {
                if (liVar2 == null) {
                    break;
                }
                Object c2 = liVar2.mo55635c();
                if (liVar2.mo55633a() != a || c2 == null || !c.f156323a.f156357f.mo56077d(obj, c2)) {
                    liVar2 = liVar2.mo55634b();
                } else {
                    Object d = liVar2.mo55636d();
                    if (d == null) {
                        if (C58613ln.m90256m(liVar2)) {
                            int i = c.f156324b;
                            c.f156325c++;
                            atomicReferenceArray.set(length, c.mo55664c(liVar, liVar2));
                            c.f156324b--;
                        }
                    } else if (c.f156323a.mo55688b().mo56077d(obj2, d)) {
                        c.f156325c++;
                        c.mo55672k(liVar2, obj3);
                        c.unlock();
                        return true;
                    }
                }
            }
            return false;
        } finally {
            c.unlock();
        }
    }
}
