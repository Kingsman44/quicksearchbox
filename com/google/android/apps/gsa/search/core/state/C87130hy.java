package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hy */
/* compiled from: PG */
public final class C87130hy extends C86898ct {

    /* renamed from: a */
    public final C21370a f235416a;

    /* renamed from: b */
    public final C118827a f235417b;

    /* renamed from: c */
    public final C86726f f235418c = new C86726f(C86725e.m139700c(C86724d.IDLE));

    /* renamed from: d */
    public long f235419d;

    public C87130hy(C68214a aVar, C21370a aVar2, C118827a aVar3) {
        super(aVar, 70);
        this.f235416a = aVar2;
        this.f235417b = aVar3;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("UserAdvocateState");
        fVar.mo85279c("lastObservedUserScenario").mo85276a(C90752i.m148231e(this.f235418c.f234274a));
    }
}
