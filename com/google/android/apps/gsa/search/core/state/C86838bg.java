package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6755r.C85558a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.bg */
/* compiled from: PG */
public final class C86838bg extends C86898ct {

    /* renamed from: a */
    public final C85558a f234548a;

    /* renamed from: b */
    public C60870cx f234549b;

    public C86838bg(C68214a aVar, C85558a aVar2) {
        super(aVar, 66);
        this.f234548a = aVar2;
    }

    /* renamed from: a */
    public final boolean mo80532a() {
        C60870cx cxVar = this.f234549b;
        return cxVar != null && !cxVar.isDone();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("Requesting client follow on").mo85276a(C90752i.m148229c(true != mo80532a() ? "false" : "true"));
    }
}
