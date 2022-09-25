package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.n */
/* compiled from: PG */
public final class C84984n extends C86731k {

    /* renamed from: c */
    private final Uri f230656c;

    /* renamed from: d */
    private final String f230657d;

    public C84984n(Uri uri, String str) {
        super("opa", "opa::handleConversationDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230656c = uri;
        this.f230657d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85005h) obj).mo78633r(this.f230656c, this.f230657d);
        return C118826c.f331423b;
    }
}
