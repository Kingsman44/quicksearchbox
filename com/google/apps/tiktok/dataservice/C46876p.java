package com.google.apps.tiktok.dataservice;

import android.net.Uri;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.apps.tiktok.dataservice.p */
/* compiled from: PG */
final class C46876p extends C46783d {

    /* renamed from: a */
    public final Uri f122308a;

    /* renamed from: b */
    final /* synthetic */ C46877q f122309b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46876p(C46877q qVar, Uri uri) {
        super(qVar.f122314e, "External ContentObserver notification", qVar.f122315f);
        this.f122309b = qVar;
        this.f122308a = uri;
    }

    /* renamed from: a */
    public final void mo21781a(boolean z) {
        if (!z) {
            this.f122309b.f122312c.mo50787a(C60866ct.f164955a, this);
        }
    }

    public final String toString() {
        return "ResultPropagator for URI: ".concat(String.valueOf(String.valueOf(this.f122308a)));
    }
}
