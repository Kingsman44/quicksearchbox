package com.google.android.apps.search.webglide.webcontent;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.viewpager2.widget.C4313p;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.apps.search.webglide.p10699b.C142179j;
import com.google.android.apps.search.webglide.p10699b.C142180k;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.p10702e.C142220c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.logging.LoggingFeature;
import com.google.android.libraries.web.contrib.thirdparty.ThirdPartyFeature;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.C44086d;
import com.google.android.libraries.web.webview.contrib.intenturi.IntentUriFeature;
import com.google.android.libraries.web.webview.contrib.intenturi.internal.IntentUriWebFragmentObserver;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58893dc;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.webglide.webcontent.z */
/* compiled from: PG */
public final class C142267z {

    /* renamed from: a */
    public final Fragment f385964a;

    /* renamed from: b */
    public final C142185p f385965b;

    /* renamed from: c */
    public final C4313p f385966c = new C142266y(this);

    /* renamed from: d */
    private final AccountId f385967d;

    /* renamed from: e */
    private final C142258q f385968e;

    public C142267z(AccountId accountId, Fragment fragment, C142258q qVar, C142185p pVar) {
        this.f385967d = accountId;
        this.f385964a = fragment;
        this.f385968e = qVar;
        this.f385965b = pVar;
    }

    /* renamed from: a */
    public final ViewPager2 mo117097a() {
        Fragment parentFragment = this.f385964a.getParentFragment();
        C58893dc.m90996a(parentFragment);
        return (ViewPager2) parentFragment.requireView().findViewById(R.id.webglide_viewpager);
    }

    /* renamed from: b */
    public final void mo117098b() {
        if (this.f385964a.getChildFragmentManager().f634a.mo671c("WebGlideWebCoordinatorFragment") == null) {
            AccountId accountId = this.f385967d;
            C142258q qVar = this.f385968e;
            C43259j jVar = new C43259j();
            C44085c b = C44086d.m77840b();
            b.f114764a = true;
            b.f114767d.add(IntentUriWebFragmentObserver.class);
            jVar.mo46372b(ThirdPartyFeature.f114060a, new IntentUriFeature(b.mo47056a()), LoggingFeature.m77099d(C142220c.class));
            jVar.f113061d = -16777216;
            jVar.f113064g = true;
            jVar.f113065h = true;
            C69540x.m100812s(jVar.f113072o, new Class[]{ExternalUrlLauncher.class});
            jVar.f113058a = false;
            C142180k kVar = C142174e.m230796b(qVar.f385939b.getIntent(), qVar.f385940c.f385686a).f385681e;
            if (kVar == null) {
                kVar = C142180k.f385703q;
            }
            int a = C142179j.m230801a(kVar.f385706b);
            if (!(a == 0 || a == 1) || !qVar.f385938a.mo47088b()) {
                jVar.f113060c = C43271v.WEB_VIEW;
            } else {
                jVar.f113060c = C43271v.WEB_LAYER;
            }
            C43264o a2 = C43265p.m76349a(accountId, jVar.mo46371a());
            C0154a aVar = new C0154a(this.f385964a.getChildFragmentManager());
            aVar.mo511h(R.id.webglide_fragment_container, a2, "WebGlideWebCoordinatorFragment", 1);
            aVar.mo509f();
            AccountId accountId2 = this.f385967d;
            C142185p pVar = this.f385965b;
            C142260s sVar = new C142260s();
            C68324h.m98669f(sVar);
            C47247a.m84047b(sVar, accountId2);
            C47243l.m84039a(sVar, pVar);
            a2.mo17754z().mo46380b(sVar);
        }
    }
}
