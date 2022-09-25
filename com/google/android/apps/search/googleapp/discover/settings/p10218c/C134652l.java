package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.telephony.TelephonyManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134636d;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134638f;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134640h;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.l */
/* compiled from: PG */
public final class C134652l implements C139875k, C139871g, C139870f {

    /* renamed from: a */
    private final Context f366682a;

    /* renamed from: b */
    private final TelephonyManager f366683b;

    /* renamed from: c */
    private final C134640h f366684c;

    /* renamed from: d */
    private final C46689ag f366685d;

    /* renamed from: e */
    private final C46689ag f366686e;

    public C134652l(Context context, TelephonyManager telephonyManager, C134640h hVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(telephonyManager, "telephonyManager");
        C69664n.m101061g(hVar, "dataService");
        this.f366682a = context;
        this.f366683b = telephonyManager;
        this.f366684c = hVar;
        C46723bg bgVar = hVar.f366642e;
        this.f366685d = new C46719bc(bgVar, new C134638f(hVar), "discover_language_visibility");
        C134636d dVar = new C134636d(hVar);
        int a = hVar.f366640c.mo50068a();
        this.f366686e = new C46719bc(bgVar, dVar, new C46885y("discover_language_summary" + a));
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 124751;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        Map map = C134649j.f366665a;
        C69664n.m101061g(accountId, "accountId");
        C134648i iVar = new C134648i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        return iVar;
    }

    /* renamed from: d */
    public final C46689ag mo111454d() {
        return this.f366686e;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f366685d;
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return true;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f366682a.getResources().getString(R.string.googleapp_disco_lang_setting_title);
        C69664n.m101060f(string, "context.resources.getStr…disco_lang_setting_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return C69664n.m101066l("IN", Locale.getDefault().getCountry()) || C69664n.m101066l("IN", this.f366683b.getSimCountryIso()) || C69664n.m101066l("IN", this.f366683b.getNetworkCountryIso());
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
