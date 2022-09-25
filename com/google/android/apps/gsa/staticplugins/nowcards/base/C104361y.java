package com.google.android.apps.gsa.staticplugins.nowcards.base;

import com.google.android.apps.gsa.shared.p7148ui.C90667d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104442e;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.y */
/* compiled from: PG */
public final /* synthetic */ class C104361y implements C90667d {

    /* renamed from: a */
    public final /* synthetic */ C104302ad f290416a;

    public /* synthetic */ C104361y(C104302ad adVar) {
        this.f290416a = adVar;
    }

    /* renamed from: a */
    public final void mo84964a(C8194z zVar, boolean z, boolean z2) {
        C104442e eVar;
        C104302ad adVar = this.f290416a;
        if (z) {
            if (adVar.f290100j) {
                adVar.mo94043b(zVar);
                return;
            }
            C90667d dVar = adVar.f290108r;
            if (dVar != null) {
                ((C104362z) dVar).f290417a.mo94044c(zVar, true);
            }
        } else if (z2 && (eVar = adVar.f290111u) != null) {
            eVar.mo94162f(zVar);
        }
    }
}
