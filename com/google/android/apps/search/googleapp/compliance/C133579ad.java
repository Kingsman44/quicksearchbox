package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ad */
/* compiled from: PG */
final class C133579ad implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133576aa f363932a;

    public C133579ad(C133576aa aaVar) {
        this.f363932a = aaVar;
    }

    public final void onClick(View view) {
        C133576aa aaVar = this.f363932a;
        aaVar.f363924g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        AccountId accountId = aaVar.f363919b;
        C133588am amVar = new C133588am();
        C68324h.m98669f(amVar);
        C47247a.m84047b(amVar, accountId);
        amVar.showNow(aaVar.f363918a.getParentFragmentManager(), "COOKIE_PERSONALIZATION_TAG");
    }
}
