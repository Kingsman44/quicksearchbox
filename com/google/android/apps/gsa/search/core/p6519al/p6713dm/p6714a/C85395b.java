package com.google.android.apps.gsa.search.core.p6519al.p6713dm.p6714a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6713dm.C85393a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dm.a.b */
/* compiled from: PG */
public final class C85395b extends C86731k {

    /* renamed from: c */
    private final int f231196c;

    /* renamed from: d */
    private final Query f231197d;

    /* renamed from: e */
    private final long f231198e;

    public C85395b(int i, Query query, long j) {
        super("uilaunch", "uilaunch::launchUiForVoiceSearch", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231196c = i;
        this.f231197d = query;
        this.f231198e = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85393a) obj).mo78917b(this.f231196c, this.f231197d, this.f231198e);
        return C118826c.f331423b;
    }
}
