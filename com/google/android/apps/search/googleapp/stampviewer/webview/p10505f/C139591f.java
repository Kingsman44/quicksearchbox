package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139346b;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.f */
/* compiled from: PG */
final class C139591f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C139587d f379478a;

    public C139591f(C139587d dVar) {
        this.f379478a = dVar;
    }

    public final void onClick(View view) {
        C139587d dVar = this.f379478a;
        dVar.f379467d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (dVar.f379465b.getChildFragmentManager().f634a.mo671c("OVERFLOW_MENU_DIALOG_FRAGMENT") == null) {
            AccountId accountId = dVar.f379464a;
            C139392b bVar = dVar.f379474k;
            C139595j jVar = new C139595j();
            C68324h.m98669f(jVar);
            C47247a.m84047b(jVar, accountId);
            C47243l.m84039a(jVar, bVar);
            jVar.showNow(dVar.f379465b.getChildFragmentManager(), "OVERFLOW_MENU_DIALOG_FRAGMENT");
        }
        C47393f.m84236g(new C139346b(), dVar.f379465b);
    }
}
