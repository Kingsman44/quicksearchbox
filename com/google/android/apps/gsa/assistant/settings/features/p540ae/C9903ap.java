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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ap */
/* compiled from: PG */
final class C9903ap extends C30282k {

    /* renamed from: a */
    final /* synthetic */ C9907at f33963a;

    public C9903ap(C9907at atVar) {
        this.f33963a = atVar;
    }

    /* renamed from: a */
    public final void mo18104a() {
        String F = this.f33963a.f33982m.mo79659F();
        if (F != null && !F.isEmpty()) {
            C30491d k = C30492e.m56873k();
            ((C30489b) k).f82343b = F;
            this.f33963a.f33980k.mo35858i().f81934a.mo35796e(k.mo36109a());
        }
    }

    /* renamed from: b */
    public final void mo18106c(C30492e eVar) {
        if (eVar != null && !eVar.mo36114a().equals(this.f33963a.f33982m.mo79659F())) {
            try {
                this.f33963a.f33982m.mo79686t(eVar.mo36114a());
                C0167am activity = this.f33963a.f33972c.getActivity();
                if (activity != null) {
                    activity.setResult(2);
                    activity.finish();
                }
            } catch (AccountsException e) {
                C59104x c = C9907at.f33970a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MainPageFragmentPeer");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(951)).mo56386p("AccountsException");
            }
        }
    }
}
