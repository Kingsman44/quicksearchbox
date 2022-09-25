package com.google.android.apps.gsa.search.core.p6519al.p6524ab.p6525a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ab.a.f */
/* compiled from: PG */
public final class C84623f extends C86731k {

    /* renamed from: c */
    private final Query f230277c;

    public C84623f(Query query) {
        super("conversation", "conversation::notifyStartedConversation", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230277c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84617a) obj).mo78382e(this.f230277c);
        return C118826c.f331423b;
    }
}
