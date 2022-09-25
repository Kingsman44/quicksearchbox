package com.google.android.apps.gsa.search.core.p6519al.p6678cw.p6679a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.cw.a.i */
/* compiled from: PG */
public final class C85241i extends C86731k {

    /* renamed from: c */
    private final Query f231003c;

    /* renamed from: d */
    private final List f231004d;

    /* renamed from: e */
    private final CardDecision f231005e;

    /* renamed from: f */
    private final int f231006f;

    public C85241i(Query query, List list, CardDecision cardDecision, int i) {
        super("service", "service::showVoiceActions", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231003c = query;
        this.f231004d = list;
        this.f231005e = cardDecision;
        this.f231006f = i;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85232a) obj).mo78815j(this.f231003c, this.f231004d, this.f231005e, this.f231006f);
        return C118826c.f331423b;
    }
}
