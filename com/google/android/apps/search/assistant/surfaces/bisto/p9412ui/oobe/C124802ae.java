package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ae */
/* compiled from: PG */
final class C124802ae implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C124803af f344318a;

    public C124802ae(C124803af afVar) {
        this.f344318a = afVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return C124803af.f344320b;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        OobeActivityViewModel oobeActivityViewModel = (OobeActivityViewModel) new C2368bp(this.f344318a.f344321c.requireActivity()).mo5770a(OobeActivityViewModel.class);
        C124803af afVar = this.f344318a;
        C124914k kVar = afVar.f344326h;
        C124844bo boVar = afVar.f344322d.f344439b;
        if (boVar == null) {
            boVar = C124844bo.f344417m;
        }
        String str = boVar.f344420b;
        C63138d dVar = oobeActivityViewModel.f344277d.f344851c;
        if (dVar == null) {
            dVar = C63138d.f170494j;
        }
        String str2 = dVar.f170500e;
        return C47633f.m84733g(kVar.f344647a.mo106598d(str)).mo51516i(new C124903d(kVar, str, str2, oobeActivityViewModel.mo106637a()), kVar.f344648b).mo51516i(new C124908e(kVar, str, str2), kVar.f344648b);
    }
}
