package com.google.android.apps.gsa.search.core.p6519al.p6674cu.p6675a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cu.a.j */
/* compiled from: PG */
public final class C85221j extends C86731k {

    /* renamed from: c */
    private final Query f230984c;

    public C85221j(Query query) {
        super("searchplate", "searchplate::updateSearchPlateUiQuery", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230984c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85211a) obj).mo78799j(this.f230984c);
        return C118826c.f331423b;
    }
}
