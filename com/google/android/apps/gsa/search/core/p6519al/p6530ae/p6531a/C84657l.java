package com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84669g;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ae.a.l */
/* compiled from: PG */
public final class C84657l extends C86731k {

    /* renamed from: c */
    private final Uri f230306c;

    public C84657l(Uri uri) {
        super("smartsetupdeeplink", "smartsetupdeeplink::handleSmartSetupDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230306c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84669g) obj).mo78407a(this.f230306c);
        return C118826c.f331423b;
    }
}
