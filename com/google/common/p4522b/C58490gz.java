package com.google.common.p4522b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.gz */
/* compiled from: PG */
public class C58490gz {

    /* renamed from: a */
    Object[] f156121a;

    /* renamed from: b */
    int f156122b;

    /* renamed from: c */
    C58489gy f156123c;

    public C58490gz() {
        this(4);
    }

    /* renamed from: a */
    private final void m89877a(int i) {
        int i2 = i + i;
        Object[] objArr = this.f156121a;
        int length = objArr.length;
        if (i2 > length) {
            this.f156121a = Arrays.copyOf(objArr, C58470gf.m89790e(length, i2));
        }
    }

    @Deprecated
    /* renamed from: b */
    public C58495hd mo55362b() {
        return mo55363c();
    }

    /* renamed from: c */
    public C58495hd mo55363c() {
        return mo55427f(true);
    }

    /* renamed from: f */
    public final C58495hd mo55427f(boolean z) {
        C58489gy gyVar;
        C58489gy gyVar2;
        if (!z || (gyVar2 = this.f156123c) == null) {
            C58729pv b = C58729pv.m90559b(this.f156122b, this.f156121a, this);
            if (!z || (gyVar = this.f156123c) == null) {
                return b;
            }
            throw gyVar.mo55426a();
        }
        throw gyVar2.mo55426a();
    }

    /* renamed from: g */
    public final C58495hd mo55428g() {
        return mo55427f(false);
    }

    /* renamed from: h */
    public void mo55429h(Object obj, Object obj2) {
        m89877a(this.f156122b + 1);
        C58371co.m89406a(obj, obj2);
        Object[] objArr = this.f156121a;
        int i = this.f156122b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f156122b = i + 1;
    }

    /* renamed from: i */
    public final void mo55430i(Map.Entry entry) {
        mo55429h(entry.getKey(), entry.getValue());
    }

    /* renamed from: k */
    public final void mo55432k(Iterable iterable) {
        if (iterable instanceof Collection) {
            m89877a(this.f156122b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo55430i((Map.Entry) it.next());
        }
    }

    /* renamed from: l */
    public final void mo55433l(Map map) {
        mo55432k(map.entrySet());
    }

    public C58490gz(int i) {
        this.f156121a = new Object[(i + i)];
        this.f156122b = 0;
    }

    /* renamed from: j */
    public final void mo55431j(C58490gz gzVar) {
        gzVar.getClass();
        m89877a(this.f156122b + gzVar.f156122b);
        Object[] objArr = gzVar.f156121a;
        Object[] objArr2 = this.f156121a;
        int i = this.f156122b;
        int i2 = gzVar.f156122b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.f156122b += gzVar.f156122b;
    }
}
