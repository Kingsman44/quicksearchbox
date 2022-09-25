package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.b */
/* compiled from: PG */
public final class C84693b extends C86731k {

    /* renamed from: c */
    private final Query f230329c;

    /* renamed from: d */
    private final Uri f230330d;

    public C84693b(Query query, Uri uri) {
        super("externalquery", "externalquery::handleCaptchaChallenge", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230329c = query;
        this.f230330d = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84691a) obj).mo78424e(this.f230329c, this.f230330d);
        return C118826c.f331423b;
    }
}
