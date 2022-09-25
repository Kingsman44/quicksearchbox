package com.google.android.apps.gsa.shared.util;

import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.shared.util.bb */
/* compiled from: PG */
public final class C90758bb {

    /* renamed from: a */
    public final AtomicInteger f253832a = new AtomicInteger(-1);

    /* renamed from: b */
    private volatile C90757ba f253833b;

    /* renamed from: d */
    private final void m148243d(int i) {
        C90757ba baVar = this.f253833b;
        if (baVar != null) {
            baVar.mo77682fN(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo85094a(C90757ba baVar) {
        if (this.f253833b == baVar) {
            this.f253833b = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo85095b(C90757ba baVar) {
        this.f253833b = baVar;
        m148243d(this.f253832a.get());
    }

    /* renamed from: c */
    public final void mo85096c(int i) {
        boolean z = true;
        if ((i < 0 || i > 100) && i != -1) {
            z = false;
        }
        C58838bb.m90868c(z);
        if (this.f253832a.getAndSet(i) != i) {
            m148243d(i);
        }
    }
}
