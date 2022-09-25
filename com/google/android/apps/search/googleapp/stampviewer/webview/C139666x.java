package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10502c.C139529b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.x */
/* compiled from: PG */
final class C139666x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C139638n f379646a;

    public C139666x(C139638n nVar) {
        this.f379646a = nVar;
    }

    public final void onClick(View view) {
        C139638n nVar = this.f379646a;
        if (nVar.f379580d.getChildFragmentManager().f634a.mo671c("CREATOR_INFO_DIALOG") == null) {
            AccountId accountId = nVar.f379578b;
            C139392b bVar = nVar.f379579c;
            C139529b bVar2 = new C139529b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId);
            C47243l.m84039a(bVar2, bVar);
            bVar2.showNow(nVar.f379580d.getChildFragmentManager(), "CREATOR_INFO_DIALOG");
        }
        nVar.mo115124g("inactive");
    }
}
