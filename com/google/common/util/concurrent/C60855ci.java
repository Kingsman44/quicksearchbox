package com.google.common.util.concurrent;

import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.common.util.concurrent.ci */
/* compiled from: PG */
final class C60855ci extends C60873d.C60883i implements Runnable {

    /* renamed from: a */
    private C60870cx f164947a;

    public C60855ci(C60870cx cxVar) {
        this.f164947a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        this.f164947a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60870cx cxVar = this.f164947a;
        if (cxVar == null) {
            return null;
        }
        return "delegate=[" + cxVar + "]";
    }

    public final void run() {
        C60870cx cxVar = this.f164947a;
        if (cxVar != null) {
            mo57358p(cxVar);
        }
    }
}
