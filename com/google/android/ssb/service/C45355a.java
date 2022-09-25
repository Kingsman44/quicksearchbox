package com.google.android.ssb.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.ssb.service.a */
/* compiled from: PG */
public final class C45355a extends BroadcastReceiver {

    /* renamed from: a */
    private static final C59071e f118591a = C59071e.m91332i("com.google.android.ssb.service.a");

    /* renamed from: b */
    private final SsbService f118592b;

    public C45355a(SsbService ssbService) {
        this.f118592b = ssbService;
    }

    public final void onReceive(Context context, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f118592b == null) {
            C59104x b = f118591a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GmmNavBroadcastRec");
            ((C59052c) ((C59052c) b).mo56372aa(54347)).mo56386p("SsbService is not connected");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("nav", false);
        boolean booleanExtra2 = intent.getBooleanExtra("freenav", false);
        boolean booleanExtra3 = intent.getBooleanExtra("fg", false);
        boolean booleanExtra4 = intent.getBooleanExtra("hw", false);
        boolean z = true;
        if (!booleanExtra && !booleanExtra2) {
            z = false;
        }
        SsbService ssbService = this.f118592b;
        if (ssbService.f118585t != booleanExtra4) {
            ssbService.f118585t = booleanExtra4;
            C86341u uVar = new C86341u((C86346z) ssbService.f118571f.f232790a.mo79722a());
            uVar.mo80085k("hotword_navigation_requirement_met", Boolean.valueOf(ssbService.f118585t));
            uVar.mo80086l(false);
        }
        if (booleanExtra4) {
            SsbService ssbService2 = this.f118592b;
            boolean k = ((C89994f) ssbService2.f118573h.mo27525b()).mo83822k();
            ((C59052c) ((C59052c) SsbService.f118566a.mo56224b()).mo56372aa(54368)).mo56361N("gmmUpdate NV: %b, IF: %b, CTC: %b, HIN %b, HFG %b", Boolean.valueOf(z), Boolean.valueOf(booleanExtra3), Boolean.valueOf(ssbService2.f118567b.f118615j.get()), Boolean.valueOf(k), Boolean.valueOf(ssbService2.f118585t));
            if (k && ssbService2.f118585t && !ssbService2.f118567b.f118615j.get()) {
                boolean z2 = ssbService2.f118587v;
                if (z2 != booleanExtra3 || ssbService2.f118586u != z) {
                    if (!booleanExtra3 && z2) {
                        ssbService2.f118588w = ssbService2.f118569d.mo26871c() + 500;
                    } else if (booleanExtra3) {
                        ssbService2.f118588w = -1;
                    }
                    ssbService2.f118587v = booleanExtra3;
                    ssbService2.f118586u = z;
                    if (!booleanExtra3) {
                        new Handler().postDelayed(new C45357c(ssbService2), 500);
                    } else {
                        ssbService2.mo49361b();
                    }
                }
            }
        } else {
            C59104x b2 = f118591a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GmmNavBroadcastRec");
            ((C59052c) ((C59052c) b2).mo56372aa(54346)).mo56386p("canHotwordForGmm is false");
        }
    }
}
