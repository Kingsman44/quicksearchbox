package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.d */
/* compiled from: PG */
public final class C135984d implements C139858a, C139869e, C139871g {

    /* renamed from: a */
    private static final Uri f370354a = Uri.parse("https://myactivity.google.com/product/search?utm_source=gab&utm_campaign=settings");

    /* renamed from: b */
    private final Context f370355b;

    /* renamed from: c */
    private final C135973at f370356c;

    /* renamed from: d */
    private final C139795f f370357d;

    public C135984d(Context context, C135973at atVar, C139795f fVar) {
        this.f370355b = context;
        this.f370356c = atVar;
        this.f370357d = fVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 132393;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370356c.mo112654c();
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f370355b.getResources().getString(R.string.googleapp_browser_settings_browsing_history_summary);
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f370355b.getResources().getString(R.string.googleapp_browser_settings_browsing_history_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }

    /* renamed from: n */
    public final C46689ag mo111464n() {
        return this.f370356c.mo112653b();
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        C139795f fVar = this.f370357d;
        Uri uri = f370354a;
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.SETTINGS;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(uri, (C139823j) iVar.build());
        return C60866ct.f164955a;
    }
}
