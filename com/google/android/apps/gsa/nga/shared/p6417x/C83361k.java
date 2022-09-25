package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.p1876k.p1877a.C22854h;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.k */
/* compiled from: PG */
public final class C83361k implements C83357g {

    /* renamed from: a */
    public final Set f227198a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final AtomicReference f227199b;

    /* renamed from: c */
    public final Class f227200c;

    /* renamed from: d */
    public final C90919bp f227201d = new C83360j(this);

    public C83361k(Object obj, Class cls) {
        this.f227199b = new AtomicReference(obj);
        this.f227200c = cls;
    }

    /* renamed from: a */
    public final Class mo76656a() {
        return this.f227200c;
    }

    /* renamed from: b */
    public final void mo76660b(Object obj) {
        C22872h.m42742b(this.f227200c);
        new C22854h(this.f227200c, new C83359i(this, obj)).run();
    }

    /* renamed from: c */
    public final Object mo76657c() {
        return this.f227199b.get();
    }

    /* renamed from: d */
    public final void mo76658d(C90919bp bpVar) {
        this.f227198a.add(bpVar);
    }

    /* renamed from: e */
    public final void mo76659e(C90919bp bpVar) {
        this.f227198a.remove(bpVar);
    }
}
