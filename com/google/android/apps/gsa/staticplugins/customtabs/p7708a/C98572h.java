package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6807j.C86133b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1703d.C20637aa;
import com.google.android.libraries.p1703d.C20640ad;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.h */
/* compiled from: PG */
public final class C98572h extends C20637aa implements C86133b, C90991b {

    /* renamed from: a */
    public final boolean f275307a;

    /* renamed from: b */
    public final /* synthetic */ C98573i f275308b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98572h(C98573i iVar, C20640ad adVar, boolean z) {
        super(adVar);
        this.f275308b = iVar;
        this.f275307a = z;
    }

    /* renamed from: c */
    public final boolean mo79780c() {
        return TextUtils.equals(mo91187h(), this.f57882c.mo25581a());
    }

    /* renamed from: e */
    public final boolean mo79781e() {
        return this.f57882c.mo25583f() && !mo91188i();
    }

    /* renamed from: g */
    public final boolean mo79783g() {
        return !this.f57882c.mo25583f() && !mo91188i();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsAvailabilityState");
        fVar.mo85279c("package name").mo85276a(C90752i.m148229c(this.f57882c.mo25582b()));
        fVar.mo85279c("private API version").mo85276a(C90752i.m148230d(this.f57882c.mo25584iG()));
        fVar.mo85279c("first run done").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f57882c.mo25583f())));
        fVar.mo85279c("is available").mo85276a(C90752i.m148228b(Boolean.valueOf(mo79781e())));
    }

    /* renamed from: h */
    public final String mo91187h() {
        String F = this.f275308b.f275309a.mo79659F();
        return F != null ? F : BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    public final boolean mo91188i() {
        return !mo25587k(5) && !this.f275308b.mo91195e();
    }

    /* renamed from: j */
    public final boolean mo91189j() {
        return this.f275308b.f275310b.mo79746e(C90110fh.f250578C) && mo25587k(30);
    }

    public final String toString() {
        String b = this.f57882c.mo25582b();
        Integer iG = this.f57882c.mo25584iG();
        boolean f = this.f57882c.mo25583f();
        boolean e = mo79781e();
        return "CustomTabsAvailabilityState[packageName=" + b + ", privateApiVersion=" + iG + ", isFirstRunDone=" + f + ", isAvailable=" + e + "]";
    }
}
