package com.google.android.apps.gsa.search.core.p6519al.p6721dq.p6722a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6721dq.C85411a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dq.a.a */
/* compiled from: PG */
public final class C85412a extends C86731k {

    /* renamed from: c */
    private final Query f231208c;

    /* renamed from: d */
    private final long f231209d;

    /* renamed from: e */
    private final C86498a f231210e;

    /* renamed from: f */
    private final C60870cx f231211f;

    /* renamed from: g */
    private final C89356b f231212g;

    public C85412a(Query query, long j, C86498a aVar, C60870cx cxVar, C89356b bVar) {
        super("voice_access_to_srp_transition", "voice_access_to_srp_transition::startSearch", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231208c = query;
        this.f231209d = j;
        this.f231210e = aVar;
        this.f231211f = cxVar;
        this.f231212g = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85411a) obj).mo78926a(this.f231208c, this.f231209d, this.f231210e, this.f231211f, this.f231212g);
        return C118826c.f331423b;
    }
}
