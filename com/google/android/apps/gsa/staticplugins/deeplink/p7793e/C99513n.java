package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84669g;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.n */
/* compiled from: PG */
public final class C99513n extends C86734a implements C84669g {

    /* renamed from: a */
    private final C91097g f278460a;

    protected C99513n(C91097g gVar) {
        super(C118575h.WORKER_DEEPLINK, "smartsetupdeeplink");
        this.f278460a = gVar;
    }

    /* renamed from: a */
    public final void mo78407a(Uri uri) {
        Intent intent = new Intent("com.google.android.gms.settings.SMART_DEVICE_DISCOVERY");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("deeplink", uri);
        intent.putExtra("android.intent.extra.REFERRER_NAME", "agsa");
        this.f278460a.mo65089a(intent);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
