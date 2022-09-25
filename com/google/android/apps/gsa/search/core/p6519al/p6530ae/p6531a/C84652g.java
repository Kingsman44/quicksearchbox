package com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ae.a.g */
/* compiled from: PG */
public final class C84652g extends C86731k {

    /* renamed from: c */
    private final Uri f230301c;

    public C84652g(Uri uri) {
        super("podcasts_deeplink", "podcasts_deeplink::handlePodcastsDeeplink", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230301c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84653h) obj).mo78402a(this.f230301c);
        return C118826c.f331423b;
    }
}
