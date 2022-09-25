package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.o */
/* compiled from: PG */
public final class C84985o extends C86731k {

    /* renamed from: c */
    private final C58833ax f230658c;

    /* renamed from: d */
    private final Query f230659d;

    /* renamed from: e */
    private final C60870cx f230660e;

    /* renamed from: f */
    private final C86251f f230661f;

    public C84985o(C58833ax axVar, Query query, C60870cx cxVar, C86251f fVar) {
        super("opa", "opa::handleConversationDelta", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230658c = axVar;
        this.f230659d = query;
        this.f230660e = cxVar;
        this.f230661f = fVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85005h) obj).mo78623g(this.f230658c, this.f230659d, this.f230660e, this.f230661f);
    }
}
