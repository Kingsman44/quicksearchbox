package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136432ad;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136433ae;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136438aj;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136465a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.l */
/* compiled from: PG */
final class C136535l implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136533k f371745a;

    public C136535l(C136533k kVar) {
        this.f371745a = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136465a aVar = (C136465a) bVar;
        C136438aj ajVar = this.f371745a.f371736i;
        if (ajVar != null && ajVar.f371442a) {
            ajVar.f371443b.f371455j.mo113057a("onSharedOverlayToggled");
            C136432ad adVar = ajVar.f371444c;
            if (adVar.f371412a != null) {
                C136433ae aeVar = adVar.f371413b;
                if (aeVar.f371417d >= 10 && !aeVar.f371427n) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("initiate_overlay_switch", true);
                    adVar.f371413b.mo113032w(false);
                    try {
                        adVar.f371412a.mo28130c(bundle);
                    } catch (RemoteException e) {
                        ((C59052c) ((C59052c) ((C59052c) C136433ae.f371414a.mo56225c()).mo56382g(e)).mo56372aa(40735)).mo56386p("Failed to initiate shared overlay switch");
                    }
                }
            }
        }
        return C47392e.f123115a;
    }
}
