package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.bh */
/* compiled from: PG */
public final class C84960bh extends C86731k {

    /* renamed from: c */
    private final Query f230633c;

    public C84960bh(Query query) {
        super("opa", "opa::startOpaForVoiceSearchWithQueryFallbackToCommit", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230633c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85005h) obj).mo78628l(this.f230633c);
    }
}
