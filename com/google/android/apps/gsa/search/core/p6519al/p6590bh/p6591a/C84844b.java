package com.google.android.apps.gsa.search.core.p6519al.p6590bh.p6591a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6590bh.C84842a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bh.a.b */
/* compiled from: PG */
public final class C84844b extends C86731k {

    /* renamed from: c */
    private final Query f230526c;

    public C84844b(Query query) {
        super("message", "message::launchGmmWithQuery", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230526c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84842a) obj).mo78525b(this.f230526c);
        return C118826c.f331423b;
    }
}
