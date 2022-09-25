package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.AccountsException;
import android.support.p031v4.app.C0167am;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30489b;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30491d;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bq */
/* compiled from: PG */
final class C9933bq extends C30282k {

    /* renamed from: a */
    final /* synthetic */ C9935bs f34039a;

    public C9933bq(C9935bs bsVar) {
        this.f34039a = bsVar;
    }

    /* renamed from: a */
    public final void mo18104a() {
        String b = this.f34039a.f34045e.b();
        if (b != null && !b.isEmpty()) {
            C30491d k = C30492e.m56873k();
            ((C30489b) k).f82343b = b;
            this.f34039a.f34046f.mo35858i().f81934a.mo35796e(k.mo36109a());
        }
    }

    /* renamed from: b */
    public final void mo18106c(C30492e eVar) {
        if (eVar != null && !eVar.mo36114a().equals(this.f34039a.f34045e.b())) {
            try {
                this.f34039a.f34048h.mo79686t(eVar.mo36114a());
                C0167am activity = this.f34039a.f34042b.getActivity();
                if (activity != null) {
                    activity.setResult(2);
                    activity.finish();
                }
            } catch (AccountsException e) {
                C59104x c = C9935bs.f34041a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MainPageV2FragPeer");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(957)).mo56386p("AccountsException");
            }
        }
    }
}
