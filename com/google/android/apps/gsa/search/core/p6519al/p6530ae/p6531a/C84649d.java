package com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84664b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ae.a.d */
/* compiled from: PG */
public final class C84649d extends C86731k {

    /* renamed from: c */
    private final Uri f230298c;

    public C84649d(Uri uri) {
        super("familydeeplink", "familydeeplink::handleFamilyDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230298c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84664b) obj).mo78401a(this.f230298c);
        return C118826c.f331423b;
    }
}
