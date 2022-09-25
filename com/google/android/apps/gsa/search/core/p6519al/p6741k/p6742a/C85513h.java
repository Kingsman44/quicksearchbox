package com.google.android.apps.gsa.search.core.p6519al.p6741k.p6742a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.k.a.h */
/* compiled from: PG */
public final class C85513h extends C86731k {

    /* renamed from: c */
    private final C37520e f231355c;

    /* renamed from: d */
    private final C37478d f231356d;

    /* renamed from: e */
    private final C85505a f231357e;

    /* renamed from: f */
    private final boolean f231358f;

    public C85513h(C37520e eVar, C37478d dVar, C85505a aVar, boolean z) {
        super("audio", "audio::updateRoute", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f231355c = eVar;
        this.f231356d = dVar;
        this.f231357e = aVar;
        this.f231358f = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85515b) obj).mo79033i(this.f231355c, this.f231356d, this.f231357e, this.f231358f);
        return C118826c.f331423b;
    }
}
