package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import androidx.media3.exoplayer.C2759ad;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.b */
/* compiled from: PG */
public final /* synthetic */ class C26708b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26715i f72821a;

    public /* synthetic */ C26708b(C26715i iVar) {
        this.f72821a = iVar;
    }

    public final void run() {
        C2759ad adVar;
        C26715i iVar = this.f72821a;
        C26714h hVar = iVar.f72835f;
        if (!(hVar == null || (adVar = iVar.f72838i) == null)) {
            hVar.f72828b = C58833ax.m90834k(Long.valueOf(adVar.mo6004k()));
        }
        C2759ad adVar2 = iVar.f72838i;
        if (adVar2 != null) {
            adVar2.mo5974B(false);
            iVar.f72838i.mo6018y();
            iVar.f72838i = null;
        }
        iVar.f72834e = null;
        iVar.mo32026b();
        iVar.f72832c.set(false);
    }
}
