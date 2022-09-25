package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.c */
/* compiled from: PG */
public final class C135983c implements C139880p, C139871g {

    /* renamed from: a */
    private final Context f370351a;

    /* renamed from: b */
    private final C135973at f370352b;

    /* renamed from: c */
    private final C46689ag f370353c;

    public C135983c(Context context, C135973at atVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(atVar, "googleAppBrowserSettingsDataService");
        this.f370351a = context;
        this.f370352b = atVar;
        this.f370353c = atVar.mo112654c();
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 4559143;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final C139874j mo112666c() {
        return C139874j.BROWSER;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370353c;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f370351a.getResources().getString(R.string.googleapp_browser_settings_title);
        C69664n.m101060f(string, "context.resources.getStr…p_browser_settings_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }
}
