package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.b */
/* compiled from: PG */
public abstract class C83352b implements C83358h {

    /* renamed from: a */
    public final Object f227183a = new Object();

    /* renamed from: b */
    public final Set f227184b = new LinkedHashSet();

    /* renamed from: c */
    public C58528ij f227185c;

    /* renamed from: d */
    public final AtomicReference f227186d = new AtomicReference();

    /* renamed from: e */
    public final C90919bp f227187e = new C83339a(this);

    /* renamed from: f */
    private final Class f227188f;

    public C83352b(Class cls, C58528ij ijVar) {
        this.f227188f = cls;
        this.f227185c = ijVar;
    }

    /* renamed from: a */
    public final Class mo76656a() {
        return this.f227188f;
    }

    /* renamed from: b */
    public abstract Object mo76654b();

    /* renamed from: c */
    public final Object mo76657c() {
        return mo76654b();
    }

    /* renamed from: d */
    public final void mo76658d(C90919bp bpVar) {
        synchronized (this.f227183a) {
            boolean isEmpty = this.f227184b.isEmpty();
            this.f227184b.add(bpVar);
            if (isEmpty) {
                this.f227186d.set(mo76654b());
                C58800sl lA = this.f227185c.iterator();
                while (lA.hasNext()) {
                    ((C83358h) lA.next()).mo76658d(this.f227187e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo76659e(C90919bp bpVar) {
        synchronized (this.f227183a) {
            this.f227184b.remove(bpVar);
            if (this.f227184b.isEmpty()) {
                C58800sl lA = this.f227185c.iterator();
                while (lA.hasNext()) {
                    ((C83358h) lA.next()).mo76659e(this.f227187e);
                }
            }
        }
    }
}
