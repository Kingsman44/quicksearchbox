package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.by */
/* compiled from: PG */
final class C72492by implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f192873a;

    /* renamed from: b */
    final /* synthetic */ C72495ca f192874b;

    public C72492by(C72495ca caVar, UrlResponseInfo urlResponseInfo) {
        this.f192874b = caVar;
        this.f192873a = urlResponseInfo;
    }

    public final void run() {
        try {
            C72495ca caVar = this.f192874b;
            C72522da daVar = caVar.f192878a;
            daVar.f192969a.onSucceeded(caVar.f192881d, this.f192873a);
            this.f192874b.mo64240b();
        } catch (Exception e) {
            Log.e(C72499ce.f192892a, "Exception in onSucceeded method", e);
        }
    }
}
