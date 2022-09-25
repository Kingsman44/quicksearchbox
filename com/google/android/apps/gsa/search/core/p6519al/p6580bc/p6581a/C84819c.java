package com.google.android.apps.gsa.search.core.p6519al.p6580bc.p6581a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6580bc.C84816a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bc.a.c */
/* compiled from: PG */
public final class C84819c extends C86731k {

    /* renamed from: c */
    private final boolean f230505c;

    /* renamed from: d */
    private final long f230506d;

    /* renamed from: e */
    private final Query f230507e;

    public C84819c(boolean z, long j, Query query) {
        super("legacyui", "legacyui::sendUpdateTimestampUiEvent", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230505c = z;
        this.f230506d = j;
        this.f230507e = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84816a) obj).mo78510b(this.f230505c, this.f230506d, this.f230507e);
        return C118826c.f331423b;
    }
}
