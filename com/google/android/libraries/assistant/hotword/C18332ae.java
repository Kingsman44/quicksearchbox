package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.assistant.hotword.ae */
/* compiled from: PG */
final class C18332ae {

    /* renamed from: a */
    final /* synthetic */ C18339al f51987a;

    public C18332ae(C18339al alVar) {
        this.f51987a = alVar;
    }

    /* renamed from: a */
    public final void mo23786a(HotwordResult hotwordResult) {
        ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47228)).mo56386p("Detection Finished.");
        C18339al alVar = this.f51987a;
        if (alVar.f52015o) {
            alVar.f52149p.f52121n = false;
            ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47229)).mo56386p("timestamp streaming stopped!");
        }
        if (hotwordResult == null || !hotwordResult.mo84680E()) {
            this.f51987a.f52018t.mo103905c(hotwordResult);
            this.f51987a.mo23801r(false);
            return;
        }
        this.f51987a.f52018t.mo103907e(hotwordResult);
        this.f51987a.mo23801r(true);
    }
}
