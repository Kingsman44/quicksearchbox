package com.google.android.apps.search.googleapp.search.settings.safesearch;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.d */
/* compiled from: PG */
public final class C137682d implements C45987ay {

    /* renamed from: a */
    public final SafeSearchSettingActivity f374493a;

    public C137682d(SafeSearchSettingActivity safeSearchSettingActivity, C133155c cVar, C45989b bVar) {
        this.f374493a = safeSearchSettingActivity;
        cVar.mo110998a(safeSearchSettingActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C137686h a = C137687i.m223784a(awVar.f120815a.f120816a);
        C0154a aVar = new C0154a(this.f374493a.f727a.f739a.f744e);
        aVar.mo689v(R.id.googleapp_safe_search_setting_activity_container, a, "safe_search_fragment");
        aVar.mo518o(a);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f374493a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
