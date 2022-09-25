package com.google.android.apps.gsa.search.core.p6519al.p6522aa.p6523a;

import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aa.a.d */
/* compiled from: PG */
public final class C84613d extends C86731k {

    /* renamed from: c */
    private final long f230267c;

    /* renamed from: d */
    private final ImproveLocationRequest f230268d;

    /* renamed from: e */
    private final C86360a f230269e;

    public C84613d(long j, ImproveLocationRequest improveLocationRequest, C86360a aVar) {
        super("context", "context::requestLocationPromptFromQuery", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230267c = j;
        this.f230268d = improveLocationRequest;
        this.f230269e = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84609a) obj).mo78373e(this.f230267c, this.f230268d, this.f230269e);
    }
}
