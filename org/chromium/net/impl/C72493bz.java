package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.bz */
/* compiled from: PG */
final class C72493bz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f192875a;

    /* renamed from: b */
    final /* synthetic */ CronetException f192876b;

    /* renamed from: c */
    final /* synthetic */ C72495ca f192877c;

    public C72493bz(C72495ca caVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f192877c = caVar;
        this.f192875a = urlResponseInfo;
        this.f192876b = cronetException;
    }

    public final void run() {
        try {
            C72495ca caVar = this.f192877c;
            C72522da daVar = caVar.f192878a;
            daVar.f192969a.onFailed(caVar.f192881d, this.f192875a, this.f192876b);
            this.f192877c.mo64240b();
        } catch (Exception e) {
            Log.e(C72499ce.f192892a, "Exception in onFailed method", e);
        }
    }
}
