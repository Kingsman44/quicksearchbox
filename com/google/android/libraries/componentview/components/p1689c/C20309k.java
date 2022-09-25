package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20168n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.c.k */
/* compiled from: PG */
final class C20309k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C20310l f57067a;

    public C20309k(C20310l lVar) {
        this.f57067a = lVar;
    }

    public final void onClick(View view) {
        C20310l lVar = this.f57067a;
        C20168n nVar = lVar.f57068a;
        int i = nVar.f56576a;
        if ((i & 8) != 0) {
            lVar.f57069b.mo25508n(nVar.f56580e);
            C20310l lVar2 = this.f57067a;
            C56429h hVar = lVar2.f57071d;
            if (hVar != null && hVar.f150551c) {
                C20601ca caVar = lVar2.f57072j;
                C20613d dVar = new C20613d();
                dVar.mo25529b(lVar2.f57068a.f56580e);
                dVar.mo25530c(this.f57067a.f57071d.f150556h);
                caVar.mo21037a(dVar.mo25528a());
            }
        } else if ((i & 2) == 0) {
            C20520h.m38497b(5, "AudioActionComponent", (Throwable) null, "Neither TTS nor URL is set in Audio Action Arguments", new Object[0]);
        } else if (!lVar.f57069b.mo25509o(nVar.f56578c, lVar.f57070c)) {
            C20520h.m38497b(5, "AudioActionComponent", (Throwable) null, "TTS couldn't be played: ".concat(String.valueOf(this.f57067a.f57068a.f56578c)), new Object[0]);
        }
    }
}
