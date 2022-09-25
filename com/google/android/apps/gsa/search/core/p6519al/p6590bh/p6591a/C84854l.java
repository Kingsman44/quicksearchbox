package com.google.android.apps.gsa.search.core.p6519al.p6590bh.p6591a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6590bh.C84842a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.bh.a.l */
/* compiled from: PG */
public final class C84854l extends C86731k {

    /* renamed from: c */
    private final List f230528c;

    public C84854l(List list) {
        super("message", "message::updateMessages", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_TEXT);
        this.f230528c = list;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84842a) obj).mo78534k(this.f230528c);
        return C118826c.f331423b;
    }
}
