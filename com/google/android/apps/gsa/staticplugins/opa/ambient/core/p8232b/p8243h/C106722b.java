package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h;

import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.b */
/* compiled from: PG */
public final class C106722b {

    /* renamed from: a */
    private boolean f297435a = false;

    /* renamed from: b */
    private Object f297436b = null;

    /* renamed from: a */
    public final Object mo95627a(C58881cr crVar) {
        if (!this.f297435a) {
            synchronized (this) {
                if (!this.f297435a) {
                    this.f297436b = crVar.mo6453a();
                    this.f297435a = true;
                }
            }
        }
        return this.f297436b;
    }

    /* renamed from: b */
    public final synchronized void mo95628b(C58881cr crVar) {
        if (this.f297435a) {
            this.f297436b = crVar.mo6453a();
        }
    }
}
