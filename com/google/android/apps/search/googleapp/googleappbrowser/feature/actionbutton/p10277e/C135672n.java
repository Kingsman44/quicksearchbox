package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.n */
/* compiled from: PG */
final class C135672n implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C135674p f369544a;

    public C135672n(C135674p pVar) {
        this.f369544a = pVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.googleapp_browser_actionbutton_overflowmenu;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_more_vert_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.googleapp_browser_actionbutton_overflowmenu;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 107043;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        AccountId accountId = this.f369544a.f369547b;
        C135648b bVar = new C135648b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        bVar.showNow(this.f369544a.f369548c.getChildFragmentManager(), "googleappbrowser_overflow_bottom_sheet");
    }
}
