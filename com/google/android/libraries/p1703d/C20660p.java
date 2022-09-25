package com.google.android.libraries.p1703d;

import android.net.Uri;
import android.os.Bundle;
import androidx.browser.p059a.C0955c;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.libraries.d.p */
/* compiled from: PG */
public class C20660p extends C0955c {
    /* renamed from: a */
    public final void mo3571a(String str, Bundle bundle) {
        if ("onFirstRunChanged".equals(str)) {
            mo25644i(bundle);
        } else if ("onNavigationInfoReady".equals(str)) {
            mo25647l(bundle);
        } else if ("onIsGoogleDefaultSearchProviderResult".equals(str)) {
            if (bundle.containsKey("isGoogleDefaultSearchEngine")) {
                mo25641f(bundle.getBoolean("isGoogleDefaultSearchEngine", false));
            } else {
                mo25640e(bundle.getString("error"));
            }
        } else if ("onWarmupCompleted".equals(str)) {
            mo25642g();
        } else if ("NavigationMetrics".equals(str)) {
            long j = bundle.getLong("navigationStart", 0);
            long j2 = bundle.getLong("firstContentfulPaint", 0);
            long j3 = bundle.getLong("loadEventStart", 0);
            Long l = null;
            if (j2 > 0) {
                if (j > 0) {
                    l = Long.valueOf(j + j2);
                }
                mo25643h(j2, l);
            } else if (j3 > 0) {
                if (j > 0) {
                    l = Long.valueOf(j + j3);
                }
                mo25645j(j3, l);
            } else if (bundle.getLong("requestStart", -1) >= 0 || bundle.getLong("effectiveConnectionType", -1) >= 0) {
                mo25648m(bundle);
            }
        } else if ("onBottomBarScrollStateChanged".equals(str)) {
            if (bundle.getBoolean("hidden")) {
                mo25649n();
            } else {
                mo25650o();
            }
        } else if ("onDetachedRequestRequested".equals(str)) {
            bundle.getInt("status");
            C58893dc.m90996a((Uri) bundle.getParcelable("url"));
        } else if ("onDetachedRequestCompleted".equals(str)) {
            bundle.getInt("net_error");
            C58893dc.m90996a((Uri) bundle.getParcelable("url"));
        } else if ("onVerticalScrollEvent".equals(str)) {
            if (bundle.containsKey("isDirectionUp")) {
                bundle.getBoolean("isDirectionUp", false);
                mo25654s();
            }
        } else if ("onGreatestScrollPercentageIncreased".equals(str) && bundle.containsKey("scrollPercentage")) {
            bundle.getInt("scrollPercentage", 0);
            mo25653r();
        }
    }

    /* renamed from: b */
    public final void mo3572b(int i, Bundle bundle) {
        Uri uri;
        Uri uri2;
        Long l = null;
        if (bundle != null) {
            Long valueOf = Long.valueOf(bundle.getLong("timestampUptimeMillis", 0));
            if (valueOf.longValue() > 0) {
                l = valueOf;
            }
            uri2 = (Uri) bundle.getParcelable("pendingUrl");
            uri = (Uri) bundle.getParcelable("urlInfo");
        } else {
            uri = null;
            uri2 = null;
        }
        mo25651p(i, l, uri, uri2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo25640e(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo25641f(boolean z) {
    }

    /* renamed from: g */
    public void mo25642g() {
        throw null;
    }

    /* renamed from: h */
    public void mo25643h(long j, Long l) {
    }

    /* renamed from: i */
    public void mo25644i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo25645j(long j, Long l) {
    }

    /* renamed from: k */
    public void mo25646k(int i, Long l, Uri uri) {
    }

    @Deprecated
    /* renamed from: l */
    public void mo25647l(Bundle bundle) {
        String string = bundle.getString("titleInfo", BuildConfig.FLAVOR);
        if (string != null) {
            Uri uri = (Uri) bundle.getParcelable("urlInfo");
            uri.getClass();
            mo25652q(new C20655k(string, uri, (Uri) bundle.getParcelable("bitmapUri")));
            return;
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: m */
    public void mo25648m(Bundle bundle) {
    }

    /* renamed from: n */
    public void mo25649n() {
    }

    /* renamed from: o */
    public void mo25650o() {
    }

    /* renamed from: p */
    public void mo25651p(int i, Long l, Uri uri, Uri uri2) {
        mo25646k(i, l, uri2);
    }

    /* renamed from: q */
    public void mo25652q(C20642af afVar) {
    }

    /* renamed from: r */
    public void mo25653r() {
    }

    /* renamed from: s */
    public void mo25654s() {
    }
}
