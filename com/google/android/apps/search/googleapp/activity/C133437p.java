package com.google.android.apps.search.googleapp.activity;

import android.support.p031v4.app.C0154a;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84488a;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84489b;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84491d;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84492e;
import com.google.android.apps.search.googleapp.activity.p10137b.C133405b;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136233c;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136234d;
import com.google.android.apps.search.googleapp.incognito.p10334j.C136363g;
import com.google.android.apps.search.googleapp.p10310h.C136137r;
import com.google.android.apps.search.googleapp.p10370p.C136883s;
import com.google.android.apps.search.googleapp.p10370p.C136885u;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139683e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.activity.p */
/* compiled from: PG */
public final /* synthetic */ class C133437p implements C139683e {

    /* renamed from: a */
    public final /* synthetic */ C133444w f363583a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f363584b;

    public /* synthetic */ C133437p(C133444w wVar, ViewGroup viewGroup) {
        this.f363583a = wVar;
        this.f363584b = viewGroup;
    }

    /* renamed from: a */
    public final void mo111142a() {
        C133444w wVar = this.f363583a;
        ViewGroup viewGroup = this.f363584b;
        C47558bi a = C47831fm.m85006a("GoogleAppActivityMainFragmentPeer#initializeNavigationBar");
        try {
            if (wVar.mo111145b() == null) {
                C0154a aVar = new C0154a(wVar.f363619d.getChildFragmentManager());
                aVar.mo691x(17432576, 17432577, 0, 0);
                int i = true != wVar.f363600I.mo111133a() ? R.id.googleapp_navigation_bar_container : R.id.googleapp_navigation_rail_container;
                AccountId accountId = wVar.f363617b;
                C133405b bVar = new C133405b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                aVar.mo689v(i, bVar, (String) null);
                aVar.mo509f();
            }
            wVar.mo111148e();
            a.close();
            wVar.mo111153j(wVar.mo111155l());
            if (!wVar.f363611T.f101930a) {
                C46801dp dpVar = wVar.f363637v;
                C136234d dVar = wVar.f363636u;
                dpVar.mo50707a(new C46719bc(dVar.f371018a, new C136233c(dVar), "incognito-mode-state"), wVar.f363604M);
            }
            C47558bi a2 = C47831fm.m85006a("GoogleAppActivityMainFragmentPeer#initializeIncognitoTopbar");
            try {
                if (wVar.f363611T.f101930a) {
                    Window window = wVar.f363618c.getWindow();
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -8193);
                    wVar.f363618c.getWindow().setStatusBarColor(0);
                    if (wVar.f363619d.getChildFragmentManager().f634a.mo671c("incognito_topbar") == null) {
                        C0154a aVar2 = new C0154a(wVar.f363619d.getChildFragmentManager());
                        aVar2.mo689v(R.id.googleapp_incognito_topbar_container, C136363g.m221563a(wVar.f363617b), "incognito_topbar");
                        aVar2.mo509f();
                        wVar.mo111144a().findViewById(R.id.googleapp_incognito_topbar_container).startAnimation(AnimationUtils.loadAnimation(wVar.f363619d.getContext(), R.anim.googleapp_incognito_topbar_slide_in));
                    }
                }
                a2.close();
                HotwordDetectionRequester hotwordDetectionRequester = wVar.f363627l;
                C19559g.m37304c();
                if (hotwordDetectionRequester.f363418a == null) {
                    hotwordDetectionRequester.f363418a = new Object();
                }
                hotwordDetectionRequester.mo111108g();
                C84492e eVar = wVar.f363609R;
                if (!eVar.f229956c) {
                    eVar.f229955b.mo28212l("Schedule a task to update the SearchNow bootstrap data", new C84491d(eVar));
                    eVar.f229956c = true;
                }
                C84489b bVar2 = wVar.f363610S;
                if (!bVar2.f229950e) {
                    bVar2.f229947b.mo28213m("Mark the application as launched in StartupPreferences", 10000, new C84488a(bVar2, bVar2.f229948c.mo26870b()));
                }
                wVar.f363608Q.mo78209a();
                C46801dp dpVar2 = wVar.f363637v;
                C136969bx bxVar = wVar.f363594C;
                C139779t tVar = wVar.f363606O;
                tVar.getClass();
                dpVar2.mo50707a(bxVar.mo113452i(tVar), wVar.f363592A);
                C136137r rVar = wVar.f363621f.f363483d;
                if (rVar == null) {
                    rVar = C136137r.f370767d;
                }
                if ((rVar.f370769a & 1) != 0) {
                    C136969bx bxVar2 = wVar.f363594C;
                    C139779t tVar2 = wVar.f363606O;
                    tVar2.getClass();
                    C136137r rVar2 = wVar.f363621f.f363483d;
                    if (rVar2 == null) {
                        rVar2 = C136137r.f370767d;
                    }
                    bxVar2.mo113464u(tVar2, rVar2.f370770b);
                } else {
                    C136137r rVar3 = wVar.f363621f.f363483d;
                    if (rVar3 == null) {
                        rVar3 = C136137r.f370767d;
                    }
                    if (!rVar3.f370771c) {
                        C136969bx bxVar3 = wVar.f363594C;
                        C139779t tVar3 = wVar.f363606O;
                        tVar3.getClass();
                        bxVar3.mo113463t(tVar3);
                    }
                }
                C136885u uVar = wVar.f363602K;
                if (uVar.f372560b) {
                    C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(new C136883s(uVar)), 10000, TimeUnit.MILLISECONDS, uVar.f372563e), "Failed to run GrowthtrackingManager::markUsage", new Object[0]);
                }
                wVar.f363625j.ifPresent(new C133435n(viewGroup));
                return;
            } catch (Throwable th) {
                C133431j.m216575a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C133431j.m216575a(th, th2);
        }
    }
}
