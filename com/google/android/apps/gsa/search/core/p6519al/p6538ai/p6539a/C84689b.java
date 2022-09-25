package com.google.android.apps.gsa.search.core.p6519al.p6538ai.p6539a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ai.a.b */
/* compiled from: PG */
public final class C84689b extends C86731k {

    /* renamed from: c */
    private final Uri f230324c;

    /* renamed from: d */
    private final Long f230325d;

    /* renamed from: e */
    private final C60494rz f230326e;

    public C84689b(Uri uri, Long l, C60494rz rzVar) {
        super("exploreoncontent", "exploreoncontent::getRelatedDocuments", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230324c = uri;
        this.f230325d = l;
        this.f230326e = rzVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84687a) obj).mo78419a(this.f230324c, this.f230325d, this.f230326e);
    }
}
