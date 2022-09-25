package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.search.core.p.by */
/* compiled from: PG */
final class C86242by implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C86232bo f233120a;

    /* renamed from: b */
    final /* synthetic */ C86243bz f233121b;

    public C86242by(C86243bz bzVar, C86232bo boVar) {
        this.f233121b = bzVar;
        this.f233120a = boVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            this.f233121b.mo79939b(253, false, this.f233120a);
        } else {
            this.f233121b.mo79939b(252, true, this.f233120a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f233121b.mo79939b(251, false, this.f233120a);
    }
}
