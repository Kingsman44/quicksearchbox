package com.google.android.apps.gsa.search.core.p6519al.p6594bj.p6595a;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bj.a.c */
/* compiled from: PG */
public final class C84877c extends C86731k {

    /* renamed from: c */
    private final C80112b f230544c;

    /* renamed from: d */
    private final C58485gu f230545d;

    public C84877c(C80112b bVar, C58485gu guVar) {
        super("nga", "nga::sendFeedbackData", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230544c = bVar;
        this.f230545d = guVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84874a) obj).mo78557f(this.f230544c, this.f230545d);
        return C118826c.f331423b;
    }
}
