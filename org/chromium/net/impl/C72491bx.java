package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.bx */
/* compiled from: PG */
final class C72491bx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f192871a;

    /* renamed from: b */
    final /* synthetic */ C72495ca f192872b;

    public C72491bx(C72495ca caVar, UrlResponseInfo urlResponseInfo) {
        this.f192872b = caVar;
        this.f192871a = urlResponseInfo;
    }

    public final void run() {
        try {
            C72495ca caVar = this.f192872b;
            C72522da daVar = caVar.f192878a;
            daVar.f192969a.onCanceled(caVar.f192881d, this.f192871a);
            this.f192872b.mo64240b();
        } catch (Exception e) {
            Log.e(C72499ce.f192892a, "Exception in onCanceled method", e);
        }
    }
}
