package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C46058z;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.d */
/* compiled from: PG */
final class C130616d implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C130617e f357729a;

    public C130616d(C130617e eVar) {
        this.f357729a = eVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C130649i iVar = new C130649i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C0154a aVar = new C0154a(this.f357729a.f357732c.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_ambient_feedback_fragment_container, iVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C130617e.f357730a.mo56225c()).mo56382g(th)).mo56372aa(38939)).mo56386p("Account error on feedback dialog activity start.");
        if (th instanceof C46058z) {
            Snackbar.m79660p(this.f357729a.f357732c.mo1322k().mo1177e(16908290).getRootView(), R.string.assistant_ambient_no_account_selected_error, 0).mo48343h();
        } else {
            Snackbar.m79661q((Context) null, this.f357729a.f357732c.mo1322k().mo1177e(16908290).getRootView(), (CharSequence) C58831av.m90830c(th.getMessage(), this.f357729a.f357731b.getResources().getString(R.string.assistant_ambient_account_error)), 0).mo48343h();
        }
        this.f357729a.f357732c.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
