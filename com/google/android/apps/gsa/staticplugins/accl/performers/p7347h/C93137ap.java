package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ap */
/* compiled from: PG */
public final /* synthetic */ class C93137ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259780a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f259781b;

    /* renamed from: c */
    public final /* synthetic */ boolean f259782c;

    public /* synthetic */ C93137ap(C93150bb bbVar, C58833ax axVar, boolean z) {
        this.f259780a = bbVar;
        this.f259781b = axVar;
        this.f259782c = z;
    }

    public final C60870cx apply(Object obj) {
        C93150bb bbVar = this.f259780a;
        C58833ax axVar = this.f259781b;
        boolean z = this.f259782c;
        Exception exc = (Exception) obj;
        if (!bbVar.f259806g.mo79746e(C90014bt.f247529iq)) {
            C59104x d = C93150bb.f259800a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            C0118a.m110r(d, "#playTtsForMessageNotification, fallback disabled", 13406, exc, C58979ad.FULL);
            return C60856cj.m92900i(bbVar.mo87551b("Failed to get online TTS."));
        }
        C59104x d2 = C93150bb.f259800a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        C0118a.m110r(d2, "#playTtsForMessageNotification, fallback", 13405, exc, C58979ad.FULL);
        bbVar.f259812m.mo19974a(C37176a.f97314jh.mo40815i(C62722b.OK));
        return bbVar.mo87554e((BundledMessageNotification) axVar.mo56107c(), z);
    }
}
