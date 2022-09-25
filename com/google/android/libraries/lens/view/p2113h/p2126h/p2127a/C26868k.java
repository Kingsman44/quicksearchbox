package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.android.libraries.lens.view.p2113h.p2122e.C26779ad;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.k */
/* compiled from: PG */
public final class C26868k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C26878u f73190a;

    /* renamed from: b */
    final /* synthetic */ C26779ad f73191b;

    public C26868k(C26878u uVar, C26779ad adVar) {
        this.f73190a = uVar;
        this.f73191b = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        throw new IllegalStateException("Failed to set up gl", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f73190a.f73242d.set(true);
        C26779ad adVar = this.f73191b;
        C58974d dVar = C26784ai.f72971a;
        if (adVar.f72966e.f73017i == adVar.f72962a) {
            ((C58970a) ((C58970a) C26784ai.f72971a.mo56224b()).mo56372aa(49171)).mo56361N("*****connectToPreviewSurface input: %s output: %s analyzer: %dx%d -> factor: %f", adVar.f72963b, adVar.f72966e.f72985M, Integer.valueOf(adVar.f72964c.f72878a.getWidth()), Integer.valueOf(adVar.f72964c.f72878a.getHeight()), Float.valueOf(adVar.f72965d.mo33624a()));
            adVar.f72966e.mo32151t();
            C26784ai aiVar = adVar.f72966e;
            if (aiVar.f72994V == 0) {
                aiVar.f72994V = aiVar.f72990R.mo26873e() - adVar.f72966e.f72991S;
            }
        }
        this.f73190a.mo32247d();
    }
}
