package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.tasks.bi */
/* compiled from: PG */
public final class C118506bi implements C86091a {

    /* renamed from: a */
    public final C68214a f328916a;

    /* renamed from: b */
    private final C60887da f328917b;

    public C118506bi(C68214a aVar, C60887da daVar) {
        this.f328916a = aVar;
        this.f328917b = daVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        this.f328917b.execute(new C118505bh(this, z2));
    }
}
