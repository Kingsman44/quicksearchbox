package com.google.android.apps.search.googleapp.discover.settings.p10215a;

import android.content.Context;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.a.b */
/* compiled from: PG */
public final class C134628b implements C139858a, C139869e {

    /* renamed from: a */
    private final Context f366619a;

    /* renamed from: b */
    private final C46723bg f366620b;

    /* renamed from: c */
    private final C46689ag f366621c;

    public C134628b(Context context, C46723bg bgVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bgVar, "dataSources");
        this.f366619a = context;
        this.f366620b = bgVar;
        this.f366621c = new C46719bc(bgVar, C134627a.f366618a, "DATA_SAVER_ENABLED_DATA_SOURCE_KEY");
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147446;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f366619a.getResources().getString(R.string.googleapp_disco_data_saver_deprecation_summary);
        C69664n.m101060f(string, "context.resources.getStr…aver_deprecation_summary)");
        return string;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f366619a.getResources().getString(R.string.googleapp_disco_data_saver_deprecation_title);
        C69664n.m101060f(string, "context.resources.getStr…_saver_deprecation_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: n */
    public final C46689ag mo111464n() {
        return this.f366621c;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        return C60866ct.f164955a;
    }
}
