package com.google.android.apps.search.googleapp.customtabs.p10163g;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133918a;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133919b;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133920c;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133921d;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133922e;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133923f;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133924g;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133931n;
import com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a.C133932o;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.p3637b.C46716g;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.g.a */
/* compiled from: PG */
public final class C133917a implements C139865b, C139869e, C139870f, C139871g {

    /* renamed from: a */
    private final Fragment f364739a;

    /* renamed from: b */
    private final C133932o f364740b;

    public C133917a(Fragment fragment, C133932o oVar) {
        C69664n.m101061g(fragment, "fragment");
        this.f364739a = fragment;
        this.f364740b = oVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 145947;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C133932o oVar = this.f364740b;
        C71422aw awVar = oVar.f364776n;
        C133920c cVar = new C133920c((C69577g) null);
        C133921d dVar = new C133921d(oVar, (C69577g) null);
        C46690ah ahVar = C133932o.f364763a;
        C69664n.m101060f(ahVar, "CUSTOM_TABS_ENABLED_DATA_SOURCE_KEY");
        return C46716g.m83256a(awVar, cVar, dVar, ahVar);
    }

    /* renamed from: d */
    public final C46689ag mo111454d() {
        C133932o oVar = this.f364740b;
        return C46716g.m83256a(oVar.f364776n, new C133924g((C69577g) null), new C133931n(oVar, (C69577g) null), C46786dc.m83350a(C58528ij.m90012L(C133932o.f364765c, C133932o.f364763a, C133932o.f364764b)));
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        C133932o oVar = this.f364740b;
        C71422aw awVar = oVar.f364776n;
        C133922e eVar = new C133922e((C69577g) null);
        C133923f fVar = new C133923f(oVar, (C69577g) null);
        C46690ah ahVar = C133932o.f364766d;
        C69664n.m101060f(ahVar, "CUSTOM_TABS_VISIBILITY_DATA_SOURCE_KEY");
        return C46716g.m83256a(awVar, eVar, fVar, ahVar);
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C133932o oVar = this.f364740b;
        C86337q b = oVar.f364778p.f331370a.mo80076b();
        b.mo80067b("use_custom_tabs", z);
        b.apply();
        C60870cx cxVar = C60866ct.f164955a;
        oVar.f364775m.mo50787a(cxVar, C133932o.f364763a);
        return cxVar;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: h */
    public final String mo111458h() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    public final String mo111459i() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f364739a.getString(R.string.googleapp_custom_tabs_enabled_setting_title);
        C69664n.m101060f(string, "fragment.getString(R.str…bs_enabled_setting_title)");
        return string;
    }

    /* renamed from: k */
    public final boolean mo111461k() {
        return true;
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
        C133932o oVar = this.f364740b;
        C71422aw awVar = oVar.f364776n;
        C133918a aVar = new C133918a((C69577g) null);
        C133919b bVar = new C133919b(oVar, (C69577g) null);
        C46690ah ahVar = C133932o.f364764b;
        C69664n.m101060f(ahVar, "CUSTOM_TABS_AVAILABILITY_DATA_SOURCE_KEY");
        return C46716g.m83256a(awVar, aVar, bVar, ahVar);
    }
}
