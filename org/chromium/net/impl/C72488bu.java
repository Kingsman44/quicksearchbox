package org.chromium.net.impl;

import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.bu */
/* compiled from: PG */
final class C72488bu implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f192864a;

    /* renamed from: b */
    final /* synthetic */ String f192865b;

    /* renamed from: c */
    final /* synthetic */ C72495ca f192866c;

    public C72488bu(C72495ca caVar, UrlResponseInfo urlResponseInfo, String str) {
        this.f192866c = caVar;
        this.f192864a = urlResponseInfo;
        this.f192865b = str;
    }

    /* renamed from: a */
    public final void mo64214a() {
        C72495ca caVar = this.f192866c;
        C72522da daVar = caVar.f192878a;
        daVar.f192969a.onRedirectReceived(caVar.f192881d, this.f192864a, this.f192865b);
    }
}
