package com.google.android.apps.search.googleapp.search.srp;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139683e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.l */
/* compiled from: PG */
public final /* synthetic */ class C137880l implements C139683e {

    /* renamed from: a */
    public final /* synthetic */ C137886r f375140a;

    public /* synthetic */ C137880l(C137886r rVar) {
        this.f375140a = rVar;
    }

    /* renamed from: a */
    public final void mo111142a() {
        C47558bi a;
        C137886r rVar = this.f375140a;
        C47558bi a2 = C47831fm.m85006a("HeaderFragmentPeer#onCriticalStartupUiInteractive");
        try {
            if (rVar.f375158h.getChildFragmentManager().f634a.mo670b(R.id.googleapp_account_disc_fragment) == null) {
                a = C47831fm.m85006a("HeaderFragmentPeer#attachAccountDiscFragment");
                C0154a aVar = new C0154a(rVar.f375158h.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_account_disc_fragment, C133252d.m216261a(rVar.f375152b, C133189b.f363045d), "GoogleApp_AccountDiscFragment", 1);
                aVar.mo509f();
                a.close();
            }
            a2.close();
            return;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                C137746d.m223911a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
