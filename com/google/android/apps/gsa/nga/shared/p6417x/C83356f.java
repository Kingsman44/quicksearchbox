package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.f */
/* compiled from: PG */
public final class C83356f implements C83357g {

    /* renamed from: a */
    public static final C58974d f227192a = C58974d.m91136j();

    /* renamed from: b */
    public final C83357g f227193b;

    /* renamed from: c */
    public final AtomicReference f227194c = new AtomicReference(C60856cj.m92898g());

    public C83356f(Object obj, Class cls) {
        this.f227193b = new C83361k(obj, cls);
    }

    /* renamed from: a */
    public final Class mo76656a() {
        return ((C83361k) this.f227193b).f227200c;
    }

    /* renamed from: b */
    public final void mo76660b(Object obj) {
        ((C60870cx) this.f227194c.getAndSet(C60856cj.m92898g())).cancel(false);
        this.f227193b.mo76660b(obj);
    }

    /* renamed from: c */
    public final Object mo76657c() {
        return ((C83361k) this.f227193b).f227199b.get();
    }

    /* renamed from: d */
    public final void mo76658d(C90919bp bpVar) {
        this.f227193b.mo76658d(bpVar);
    }

    /* renamed from: e */
    public final void mo76659e(C90919bp bpVar) {
        this.f227193b.mo76659e(bpVar);
    }
}
