package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.preference.TwoStatePreference;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135543c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44074i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.aw */
/* compiled from: PG */
public final class C97962aw extends C88994i {

    /* renamed from: a */
    public static final C59071e f273530a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.aw");

    /* renamed from: b */
    static final Uri f273531b = Uri.parse("https://myactivity.google.com");

    /* renamed from: c */
    public final Context f273532c;

    /* renamed from: d */
    public final C22871g f273533d;

    /* renamed from: e */
    public final C84474e f273534e;

    /* renamed from: f */
    private final C22871g f273535f;

    /* renamed from: g */
    private final Executor f273536g;

    /* renamed from: h */
    private final C86034c f273537h;

    /* renamed from: i */
    private final C44070e f273538i;

    /* renamed from: j */
    private final C83559c f273539j;

    /* renamed from: com.google.android.apps.gsa.staticplugins.cm.aw$a */
    /* compiled from: PG */
    public interface C97963a {
        /* renamed from: ch */
        C135543c mo90855ch();

        /* renamed from: gs */
        C44074i mo90856gs();
    }

    public C97962aw(Context context, C22871g gVar, C22871g gVar2, Executor executor, C86034c cVar, C44070e eVar, C84474e eVar2, C83559c cVar2) {
        this.f273532c = context;
        this.f273533d = gVar;
        this.f273535f = gVar2;
        this.f273536g = executor;
        this.f273537h = cVar;
        this.f273538i = eVar;
        this.f273534e = eVar2;
        this.f273539j = cVar2;
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* renamed from: a */
    public final void mo90854a(Preference preference, boolean z) {
        ? r1;
        C60870cx cxVar;
        Preference preference2 = preference;
        boolean z2 = z;
        PreferenceScreen preferenceScreen = (PreferenceScreen) preference2;
        PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceScreen.findPreference("google_app_browser_privacy_category");
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) preferenceScreen.findPreference("google_app_browser_safety_category");
        TwoStatePreference twoStatePreference = (TwoStatePreference) preferenceCategory2.findPreference("google_app_browser_safe_browsing");
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) preferenceCategory2.findPreference("google_app_browser_extended_safe_browsing");
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) preferenceCategory2.findPreference("google_app_browser_real_time_safe_browsing");
        Preference findPreference = preferenceCategory.findPreference("google_app_browser_site_settings");
        Preference findPreference2 = preferenceCategory.findPreference("google_app_browser_clear_data");
        TwoStatePreference twoStatePreference4 = (TwoStatePreference) preferenceCategory.findPreference("google_app_browser_ukm");
        ((TwoStatePreference) preferenceScreen.findPreference("use_google_app_browser")).setOnPreferenceChangeListener(new C97958as(this, preference2));
        Preference findPreference3 = preferenceCategory.findPreference("google_app_browser_browsing_history");
        findPreference3.setEnabled(false);
        Intent intent = new Intent();
        intent.setData(f273531b);
        this.f273533d.mo28211k(this.f273535f.mo28209i(this.f273537h.mo79697b(), "Create Google App Browser Intent", new C97957ar(this, intent)), "GoogleAppBrowserPrivacyController#setBrowsingHistoryPreference", new C97961av(findPreference3, z2, preferenceCategory));
        C60870cx b = this.f273537h.mo79697b();
        C97959at atVar = new C97959at(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(atVar), this.f273536g);
        C97943ad adVar = C97943ad.f273486a;
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(adVar), this.f273536g);
        C22871g gVar = this.f273535f;
        C44070e eVar = this.f273538i;
        Objects.requireNonNull(eVar);
        C60870cx i = gVar.mo28209i(h, "ProfileToProfileManager", new C97944ae(eVar));
        C97945af afVar = C97945af.f273488a;
        C60870cx h2 = C60922j.m93045h(i, C47810es.m84966f(afVar), this.f273536g);
        C97946ag agVar = C97946ag.f273489a;
        C60870cx h3 = C60922j.m93045h(i, C47810es.m84966f(agVar), this.f273536g);
        C97947ah ahVar = C97947ah.f273490a;
        C60870cx h4 = C60922j.m93045h(i, C47810es.m84966f(ahVar), this.f273536g);
        C97948ai aiVar = C97948ai.f273491a;
        C60870cx h5 = C60922j.m93045h(i, C47810es.m84966f(aiVar), this.f273536g);
        if (!this.f273534e.mo78065J()) {
            r1 = 0;
            cxVar = C60856cj.m92900i(false);
        } else {
            r1 = 0;
            C97956aq aqVar = C97956aq.f273514a;
            cxVar = C60922j.m93045h(g, C47810es.m84966f(aqVar), this.f273536g);
        }
        C60870cx cxVar2 = cxVar;
        findPreference2.setEnabled(z2);
        if (twoStatePreference != null) {
            twoStatePreference.setEnabled(r1);
        }
        if (twoStatePreference2 != null) {
            twoStatePreference2.setEnabled(r1);
        }
        if (twoStatePreference3 != null) {
            twoStatePreference3.setEnabled(r1);
        }
        if (findPreference != null) {
            findPreference.setEnabled(r1);
        }
        if (twoStatePreference4 != null) {
            twoStatePreference4.setEnabled(r1);
        }
        C60870cx[] cxVarArr = new C60870cx[6];
        cxVarArr[r1] = i;
        cxVarArr[1] = h2;
        cxVarArr[2] = h3;
        cxVarArr[3] = h4;
        cxVarArr[4] = h5;
        cxVarArr[5] = cxVar2;
        C97949aj ajVar = r0;
        C47637j d = C47638k.m84753d(cxVarArr);
        TwoStatePreference twoStatePreference5 = twoStatePreference4;
        Preference preference3 = findPreference;
        C60870cx cxVar3 = h3;
        TwoStatePreference twoStatePreference6 = twoStatePreference2;
        C60870cx cxVar4 = h4;
        TwoStatePreference twoStatePreference7 = twoStatePreference;
        PreferenceCategory preferenceCategory3 = preferenceCategory2;
        C97949aj ajVar2 = new C97949aj(this, cxVar2, i, twoStatePreference, z, h2, twoStatePreference2, twoStatePreference3, cxVar3, preferenceCategory2, cxVar4, twoStatePreference5, h5, preferenceCategory, preference3);
        C47637j jVar = d;
        C60870cx a = jVar.mo51520a(ajVar, new C97950ak(this));
        this.f273533d.mo28211k(a, "GoogleAppBrowserPrivacyController#handlePreference", new C97960au(preferenceCategory3, twoStatePreference7, twoStatePreference6, twoStatePreference3, preferenceCategory, preference3, twoStatePreference5));
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        mo90854a(preference, this.f273539j.f227865c.mo76896a());
    }
}
