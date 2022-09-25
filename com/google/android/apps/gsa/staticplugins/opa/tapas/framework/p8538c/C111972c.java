package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.c */
/* compiled from: PG */
final class C111972c extends C111887a {

    /* renamed from: b */
    private volatile transient C60870cx f311072b;

    public C111972c(C60870cx cxVar, C58881cr crVar, long j, long j2, C60870cx cxVar2) {
        super(cxVar, crVar, j, j2, cxVar2);
    }

    /* renamed from: f */
    public final C60870cx mo99319f() {
        if (this.f311072b == null) {
            synchronized (this) {
                if (this.f311072b == null) {
                    this.f311072b = (C60870cx) this.f310897a.mo6453a();
                    if (this.f311072b == null) {
                        throw new NullPointerException("getRankedResponse() cannot return null");
                    }
                }
            }
        }
        return this.f311072b;
    }
}
