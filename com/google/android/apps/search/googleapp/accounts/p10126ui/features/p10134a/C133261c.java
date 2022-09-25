package com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10134a;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.a.c */
/* compiled from: PG */
final class C133261c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C133262d f363200a;

    public C133261c(C133262d dVar) {
        this.f363200a = dVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133262d.f363201a.mo56226d()).mo56382g(th)).mo56372aa(40027)).mo56386p("Can't get Interstitial status for Mavatar!");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f363200a.mo111056b();
            return;
        }
        this.f363200a.f363202b.requireView().setVisibility(0);
        C133262d dVar = this.f363200a;
        C44565p pVar = dVar.f363206f;
        pVar.getClass();
        dVar.mo111055a((TextView) pVar.mo1197b().mo1177e(R.id.googleapp_interstitial_visibility_warning_intro), R.string.googleapp_interstitial_visibility_warning_intro);
        C133262d dVar2 = this.f363200a;
        C44565p pVar2 = dVar2.f363206f;
        pVar2.getClass();
        dVar2.mo111055a((TextView) pVar2.mo1197b().mo1177e(R.id.googleapp_interstitial_tabs_warning), R.string.googleapp_interstitial_tabs_warning);
    }
}
