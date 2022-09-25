package com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84666d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ae.a.e */
/* compiled from: PG */
public final class C84650e extends C86731k {

    /* renamed from: c */
    private final Uri f230299c;

    public C84650e(Uri uri) {
        super("interpreterdeeplink", "interpreterdeeplink::handleInterpreterDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230299c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84666d) obj).mo78404a(this.f230299c);
        return C118826c.f331423b;
    }
}
