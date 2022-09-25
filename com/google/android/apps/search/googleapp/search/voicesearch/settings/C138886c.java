package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.assistant.p2704m.C34814i;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.p3637b.C46712c;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.c */
/* compiled from: PG */
public final class C138886c implements C139858a, C139871g {

    /* renamed from: a */
    public final C34814i f377767a;

    /* renamed from: b */
    private final Fragment f377768b;

    /* renamed from: c */
    private final C71422aw f377769c;

    /* renamed from: d */
    private final boolean f377770d;

    /* renamed from: e */
    private final C46689ag f377771e;

    public C138886c(Fragment fragment, C46723bg bgVar, C71422aw awVar, C34814i iVar, boolean z) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "assistantEligibilityServiceGrpc");
        this.f377768b = fragment;
        this.f377769c = awVar;
        this.f377767a = iVar;
        this.f377770d = z;
        C138866a aVar = new C138866a((C69577g) null);
        C138885b bVar = new C138885b(this, (C69577g) null);
        C69664n.m101061g(awVar, "<this>");
        this.f377771e = new C46712c(awVar, bVar, aVar);
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 150979;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return R.drawable.quantum_gm_ic_google_assistant_vd_theme_24;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f377771e;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f377770d ? this.f377768b.getResources().getString(R.string.googleapp_voice_settings_assistant_summary) : BuildConfig.FLAVOR;
        C69664n.m101060f(string, "if (enableGoogleMaterial…tant_summary)\n    else \"\"");
        return string;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f377768b.getResources().getString(R.string.googleapp_voice_settings_assistant_title);
        C69664n.m101060f(string, "fragment.resources.getSt…settings_assistant_title)");
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

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Fragment fragment = this.f377768b;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        C47709i.m84862b(fragment, c.mo24020b().mo24031a(), 0);
        return C60866ct.f164955a;
    }
}
