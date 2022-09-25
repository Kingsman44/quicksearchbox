package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.j */
/* compiled from: PG */
public final class C85099j extends C86731k {

    /* renamed from: c */
    private final DoodleData f230773c;

    public C85099j(DoodleData doodleData) {
        super("recently", "recently::saveDoodleInfo", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230773c = doodleData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85089a) obj).mo78706j(this.f230773c);
        return C118826c.f331423b;
    }
}
