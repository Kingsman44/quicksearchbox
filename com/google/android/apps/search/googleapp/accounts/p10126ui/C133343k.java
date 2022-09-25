package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.k */
/* compiled from: PG */
final class C133343k extends C0192bk {

    /* renamed from: a */
    final /* synthetic */ C133344l f363347a;

    /* renamed from: b */
    private int f363348b = 0;

    public C133343k(C133344l lVar) {
        this.f363347a = lVar;
    }

    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof C0260w) {
            this.f363348b++;
        }
    }

    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        AccountMenuActivity accountMenuActivity;
        if (fragment instanceof C0260w) {
            this.f363348b--;
        }
        if (this.f363348b == 0 && (accountMenuActivity = this.f363347a.f363349a) != null && !accountMenuActivity.isChangingConfigurations()) {
            this.f363347a.f363349a.finish();
            this.f363347a.f363349a.overridePendingTransition(0, 0);
        }
    }
}
