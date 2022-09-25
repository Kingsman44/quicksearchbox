package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.telephony.PhoneStateListener;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.l */
/* compiled from: PG */
final class C95236l extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ C95237m f266442a;

    public C95236l(C95237m mVar) {
        this.f266442a = mVar;
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        if (i == 0) {
            this.f266442a.mo89149b(false);
        } else if (i == 1 || i == 2) {
            this.f266442a.mo89148a(false);
        } else {
            C59104x c = C95239o.f266447a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoAudioController");
            ((C59052c) ((C59052c) c).mo56372aa(14678)).mo56386p("Unknown state");
        }
    }
}
