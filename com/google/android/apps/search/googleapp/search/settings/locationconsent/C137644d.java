package com.google.android.apps.search.googleapp.search.settings.locationconsent;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.d */
/* compiled from: PG */
public final class C137644d implements C45987ay {

    /* renamed from: a */
    public final LocationConsentSettingActivity f374406a;

    /* renamed from: b */
    private final C28310af f374407b;

    /* renamed from: c */
    private final C28306ab f374408c;

    public C137644d(LocationConsentSettingActivity locationConsentSettingActivity, C133155c cVar, C45989b bVar, C28310af afVar, C28306ab abVar) {
        this.f374406a = locationConsentSettingActivity;
        this.f374407b = afVar;
        this.f374408c = abVar;
        cVar.mo110998a(locationConsentSettingActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (this.f374406a.f727a.f739a.f744e.f634a.mo671c("location_consent_setting_fragment") == null) {
            C137651k a = C137651k.m223677a(awVar.f120815a.f120816a);
            C0154a aVar = new C0154a(this.f374406a.f727a.f739a.f744e);
            aVar.mo689v(R.id.googleapp_location_consent_setting_activity_container, a, "location_consent_setting_fragment");
            aVar.mo509f();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f374406a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f374408c;
        LocationConsentSettingActivity locationConsentSettingActivity = this.f374406a;
        C28313c a = this.f374407b.mo33805a(C28427h.m53115a(150579));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(150580));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(locationConsentSettingActivity.mo1322k().mo1177e(16908290), a);
    }
}
