package com.google.android.apps.gsa.search.core.p6519al.p6723dr.p6724a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dr.a.a */
/* compiled from: PG */
public final class C85415a extends C86731k {

    /* renamed from: c */
    private final Query f231214c;

    public C85415a(Query query) {
        super("voicesearch", "voicesearch::closeAudioProvider", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f231214c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85423d) obj).mo78930e(this.f231214c);
        return C118826c.f331423b;
    }
}
