package com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84645a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ae.a.c */
/* compiled from: PG */
public final class C84648c extends C86731k {

    /* renamed from: c */
    private final Uri f230296c;

    /* renamed from: d */
    private final String f230297d;

    public C84648c(Uri uri, String str) {
        super("communicationdeeplink", "communicationdeeplink::handleCommunicationDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230296c = uri;
        this.f230297d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84645a) obj).mo78400a(this.f230296c, this.f230297d);
        return C118826c.f331423b;
    }
}
