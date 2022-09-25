package com.google.common.util.concurrent;

import com.google.common.p4522b.C58471gg;

/* renamed from: com.google.common.util.concurrent.k */
/* compiled from: PG */
public final /* synthetic */ class C60923k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60925m f165034a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f165035b;

    /* renamed from: c */
    public final /* synthetic */ int f165036c;

    public /* synthetic */ C60923k(C60925m mVar, C60870cx cxVar, int i) {
        this.f165034a = mVar;
        this.f165035b = cxVar;
        this.f165036c = i;
    }

    public final void run() {
        C60925m mVar = this.f165034a;
        C60870cx cxVar = this.f165035b;
        int i = this.f165036c;
        try {
            if (cxVar.isCancelled()) {
                mVar.f165040a = null;
                mVar.cancel(false);
            } else {
                mVar.mo57423g(i, cxVar);
            }
        } finally {
            mVar.mo57424h((C58471gg) null);
        }
    }
}
