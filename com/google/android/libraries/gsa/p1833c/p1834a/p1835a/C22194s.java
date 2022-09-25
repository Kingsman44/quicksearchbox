package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58781rt;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: com.google.android.libraries.gsa.c.a.a.s */
/* compiled from: PG */
abstract class C22194s {

    /* renamed from: a */
    private final Queue f61274a;

    /* renamed from: b */
    private final int f61275b;

    public C22194s(int i, int i2) {
        this.f61274a = new C58781rt(new C58425eo(i));
        this.f61275b = i2;
    }

    /* renamed from: a */
    public abstract long mo27397a(Object obj);

    /* renamed from: b */
    public abstract Object mo27398b(Object obj);

    /* renamed from: c */
    public final void mo27445c(Object obj) {
        this.f61274a.add(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo27446d() {
        this.f61274a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo27447e(C91006f fVar) {
        synchronized (this.f61274a) {
            for (Object f : this.f61274a) {
                mo27399f(f, fVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo27399f(Object obj, C91006f fVar);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Object[] mo27448g(long j) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f61274a) {
            int size = this.f61274a.size() - this.f61275b;
            for (Object next : this.f61274a) {
                if (size > 0) {
                    size--;
                } else if (mo27397a(next) >= j) {
                    arrayList.add(mo27398b(next));
                }
            }
        }
        if (arrayList.isEmpty() || (obj = arrayList.get(0)) == null) {
            return null;
        }
        return C58557jl.m90142w(arrayList, obj.getClass());
    }
}
