package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.b */
/* compiled from: PG */
public final class C137567b implements C45987ay {

    /* renamed from: a */
    public final AdsPersonalizationSettingActivity f374186a;

    /* renamed from: b */
    private final C28310af f374187b;

    /* renamed from: c */
    private final C28306ab f374188c;

    public C137567b(AdsPersonalizationSettingActivity adsPersonalizationSettingActivity, C133155c cVar, C45989b bVar, C28310af afVar, C28306ab abVar) {
        this.f374186a = adsPersonalizationSettingActivity;
        this.f374187b = afVar;
        this.f374188c = abVar;
        cVar.mo110998a(adsPersonalizationSettingActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C137576k a = C137576k.m223500a(awVar.f120815a.f120816a);
        C0154a aVar = new C0154a(this.f374186a.f727a.f739a.f744e);
        aVar.mo689v(R.id.googleapp_ads_personalization_setting_activity_container, a, "ads_personalization_fragment");
        aVar.mo518o(a);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f374186a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f374188c;
        AdsPersonalizationSettingActivity adsPersonalizationSettingActivity = this.f374186a;
        C28313c a = this.f374187b.mo33805a(C28427h.m53115a(150733));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(150734));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(adsPersonalizationSettingActivity.mo1322k().mo1177e(16908290), a);
    }
}
