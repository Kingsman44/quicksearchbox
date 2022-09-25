package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.p1703d.C20638ab;
import com.google.android.libraries.p1703d.C20639ac;
import com.google.android.libraries.p1703d.C20640ad;
import com.google.android.libraries.p1703d.C20652h;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.i */
/* compiled from: PG */
public final class C98573i {

    /* renamed from: a */
    public final C86054o f275309a;

    /* renamed from: b */
    public final C86124t f275310b;

    /* renamed from: c */
    public final boolean f275311c;

    /* renamed from: d */
    private final C68214a f275312d;

    /* renamed from: e */
    private final C83559c f275313e;

    /* renamed from: f */
    private final C98570f f275314f;

    public C98573i(C86054o oVar, C68214a aVar, C86124t tVar, boolean z, C83559c cVar, C98570f fVar) {
        this.f275309a = oVar;
        this.f275312d = aVar;
        this.f275310b = tVar;
        this.f275311c = z;
        this.f275313e = cVar;
        this.f275314f = fVar;
    }

    /* renamed from: g */
    private final void m163291g(String str, boolean z, boolean z2, String str2, int i, int i2) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.f275312d.mo27525b()).edit();
        edit.putString("custom_tabs_browser_package", str);
        edit.putBoolean("custom_tabs_browser_fre_done", z);
        edit.putBoolean("custom_tabs_is_google_default_search_provider", z2);
        edit.putString("custom_tabs_browser_account", str2);
        edit.putInt("custom_tabs_private_api_version", i);
        edit.putInt("amp_custom_tabs_private_api_version", i2);
        edit.apply();
    }

    /* renamed from: a */
    public final C98572h mo91191a() {
        Integer num;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f275312d.mo27525b();
        String string = sharedPreferences.getString("custom_tabs_browser_package", (String) null);
        if (string == null) {
            return null;
        }
        int i = sharedPreferences.getInt("custom_tabs_private_api_version", 0);
        C20638ab d = C20639ac.m38733d();
        C20652h hVar = (C20652h) d;
        hVar.f57903a = string;
        if (i == 0) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        hVar.f57905c = num;
        hVar.f57904b = sharedPreferences.getString("custom_tabs_browser_account", (String) null);
        d.mo25586b(sharedPreferences.getBoolean("custom_tabs_browser_fre_done", false));
        return new C98572h(this, d.mo25585a(), ((SharedPreferences) this.f275312d.mo27525b()).getBoolean("custom_tabs_is_google_default_search_provider", false));
    }

    /* renamed from: b */
    public final C98572h mo91192b(C20640ad adVar) {
        C20638ab d = C20639ac.m38733d();
        String str = ((C20665u) adVar).f57932a;
        if (str != null) {
            C20652h hVar = (C20652h) d;
            hVar.f57903a = str;
            hVar.f57905c = adVar.mo25584iG();
            if (adVar.mo25587k(2)) {
                hVar.f57904b = adVar.mo25581a();
                d.mo25586b(adVar.mo25583f());
            }
            C98572h hVar2 = new C98572h(this, d.mo25585a(), ((SharedPreferences) this.f275312d.mo27525b()).getBoolean("custom_tabs_is_google_default_search_provider", false));
            mo91194d(hVar2);
            return hVar2;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: c */
    public final void mo91193c() {
        m163291g((String) null, false, false, (String) null, 0, 0);
        C98570f fVar = this.f275314f;
        if (fVar.mo91186c()) {
            fVar.mo91184a(C37182a.f98120gh);
            C60856cj.m92911t(((C42876ab) fVar.f275304b.mo27525b()).mo46039a(C98567c.f275298a, C60826bg.f164896a), new C98568d(fVar), C60826bg.f164896a);
        }
    }

    /* renamed from: d */
    public final void mo91194d(C98572h hVar) {
        Integer iG = hVar.f57882c.mo25584iG();
        m163291g(hVar.f57882c.mo25582b(), hVar.f57882c.mo25583f(), hVar.f275307a, hVar.f57882c.mo25581a(), iG != null ? iG.intValue() : 0, (!hVar.mo79781e() || iG == null) ? 0 : iG.intValue());
    }

    /* renamed from: e */
    public final boolean mo91195e() {
        return this.f275309a.mo79684r().length == 1 && this.f275309a.mo79659F() != null;
    }

    /* renamed from: f */
    public final boolean mo91196f() {
        if (!((SharedPreferences) this.f275312d.mo27525b()).getBoolean("use_custom_tabs", true)) {
            return true;
        }
        if (!this.f275313e.mo76892c() || ((SharedPreferences) this.f275312d.mo27525b()).getBoolean("use_google_app_browser", true)) {
            return false;
        }
        return true;
    }
}
