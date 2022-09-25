package com.google.android.apps.search.googleapp.homescreen;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134747g;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l;
import com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134762m;
import com.google.android.apps.search.googleapp.homescreen.p10315e.C136180d;
import com.google.android.apps.search.googleapp.homescreen.p10315e.p10316a.C136158a;
import com.google.android.apps.search.googleapp.incognito.p10333i.C136347b;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10380q.C137137b;
import com.google.android.apps.search.googleapp.p10527u.C139776q;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139683e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.i */
/* compiled from: PG */
final class C136187i implements C139683e {

    /* renamed from: a */
    final /* synthetic */ C136193o f370880a;

    public C136187i(C136193o oVar) {
        this.f370880a = oVar;
    }

    /* renamed from: a */
    public final void mo111142a() {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Fragment fragment;
        C136193o oVar = this.f370880a;
        C47558bi a = C47831fm.m85006a("HomeScreenFragmentPeer#onCriticalStartupUiInteractive");
        try {
            C47558bi a2 = C47831fm.m85006a("HomeScreenFragmentPeer#maybeInitializeDiscover");
            try {
                if (oVar.f370906S.f101930a) {
                    if (((C136347b) oVar.f370907b.getChildFragmentManager().f634a.mo671c("signpost")) == null) {
                        AccountId accountId = oVar.f370912g;
                        C139776q qVar = (C139776q) C139777r.f379893c.createBuilder();
                        C139779t tVar = C139779t.HOME_SCREEN;
                        qVar.copyOnWrite();
                        C139777r rVar = (C139777r) qVar.instance;
                        rVar.f379896b = tVar.f379907i;
                        rVar.f379895a |= 1;
                        C136347b a3 = C136347b.m221524a(accountId, (C139777r) qVar.build());
                        C0154a aVar = new C0154a(oVar.f370907b.getChildFragmentManager());
                        aVar.mo511h(R.id.googleapp_hs_incognito_signpost, a3, "signpost", 1);
                        aVar.mo509f();
                    }
                    C69598b.m101013a(a2, (Throwable) null);
                } else {
                    if (oVar.f370907b.getChildFragmentManager().f634a.mo671c("discover") == null) {
                        C134724d dVar = oVar.f370911f;
                        C136123d dVar2 = oVar.f370926u.f370796b;
                        if (dVar2 == null) {
                            dVar2 = C136123d.f370743d;
                        }
                        C69664n.m101060f(dVar2, "homeScreenFragmentArgs.discoverIntentOptions");
                        C69664n.m101061g(dVar2, "intentOptions");
                        if ((dVar2.f370745a & 1) == 0) {
                            dVar.mo111913a(C134762m.f366947a);
                        }
                        C134714d dVar3 = oVar.f370910e;
                        AccountId accountId2 = oVar.f370912g;
                        C134747g gVar = (C134747g) C134749h.f366906k.createBuilder();
                        C69664n.m101060f(gVar, "newBuilder()");
                        C69664n.m101061g(gVar, "builder");
                        C57528m mVar = C57528m.AGSA_MAIN_SCREEN;
                        C69664n.m101061g(mVar, "value");
                        gVar.copyOnWrite();
                        C134749h hVar = (C134749h) gVar.instance;
                        hVar.f366909b = mVar.f153693B;
                        hVar.f366908a |= 1;
                        int dimensionPixelSize = oVar.f370907b.getResources().getDimensionPixelSize(R.dimen.googleapp_hs_header_total_height);
                        gVar.copyOnWrite();
                        C134749h hVar2 = (C134749h) gVar.instance;
                        hVar2.f366908a |= 256;
                        hVar2.f366917j = dimensionPixelSize;
                        C136123d dVar4 = oVar.f370926u.f370796b;
                        if (dVar4 == null) {
                            dVar4 = C136123d.f370743d;
                        }
                        C69664n.m101060f(dVar4, "homeScreenFragmentArgs.discoverIntentOptions");
                        C69664n.m101061g(dVar4, "value");
                        gVar.copyOnWrite();
                        C134749h hVar3 = (C134749h) gVar.instance;
                        dVar4.getClass();
                        hVar3.f366910c = dVar4;
                        hVar3.f366908a |= 2;
                        C62942bv build = gVar.build();
                        C69664n.m101060f(build, "_builder.build()");
                        Fragment a4 = dVar3.mo111903a(accountId2, (C134749h) build);
                        C0154a aVar2 = new C0154a(oVar.f370907b.getChildFragmentManager());
                        aVar2.mo511h(R.id.googleapp_discover_cards_fragment, a4, "discover", 1);
                        aVar2.mo509f();
                        C134904m a5 = ((C134903l) a4).mo17754z();
                        oVar.mo112825k(a5);
                        HomeScreenFragment homeScreenFragment = oVar.f370907b;
                        View view = homeScreenFragment.getView();
                        if (view == null) {
                            if (homeScreenFragment.isResumed()) {
                                throw new IllegalStateException("Fragment view must exist when the fragment is resumed");
                            }
                        }
                        if (view != null) {
                            C2082cp z = C2043bi.m5597z(view);
                            oVar.mo112827m(a5, z != null ? z.mo5242d() : 0);
                        }
                    }
                    oVar.mo112828n();
                    C69598b.m101013a(a2, (Throwable) null);
                }
                C47558bi a6 = C47831fm.m85006a("HomeScreenFragmentPeer#initializeAccountDisc");
                try {
                    if (oVar.f370907b.getChildFragmentManager().f634a.mo670b(R.id.googleapp_account_disc_fragment) == null) {
                        C0154a aVar3 = new C0154a(oVar.f370907b.getChildFragmentManager());
                        aVar3.mo691x(17432576, 17432577, 0, 0);
                        aVar3.mo511h(R.id.googleapp_account_disc_fragment, C133252d.m216261a(oVar.f370912g, C133189b.f363045d), "GoogleApp_AccountDiscFragment", 1);
                        aVar3.mo509f();
                    }
                    C69598b.m101013a(a6, (Throwable) null);
                    if (!oVar.f370906S.f101930a) {
                        if (!oVar.f370931z) {
                            C47558bi a7 = C47831fm.m85006a("HomeScreenFragmentPeer#maybeAttachWeatherFragment");
                            try {
                                if (oVar.f370907b.getChildFragmentManager().f634a.mo671c("weather") == null) {
                                    C0154a aVar4 = new C0154a(oVar.f370907b.getChildFragmentManager());
                                    if (!oVar.f370892E || !oVar.f370893F.isPresent()) {
                                        AccountId accountId3 = oVar.f370912g;
                                        C136180d dVar5 = new C136180d();
                                        C68324h.m98669f(dVar5);
                                        C47247a.m84047b(dVar5, accountId3);
                                        fragment = dVar5;
                                    } else {
                                        fragment = ((C136158a) oVar.f370893F.get()).mo112811a();
                                    }
                                    aVar4.mo511h(R.id.googleapp_weather_container, fragment, "weather", 1);
                                    aVar4.mo509f();
                                }
                                C69598b.m101013a(a7, (Throwable) null);
                            } catch (Throwable th4) {
                                Throwable th5 = th4;
                                C69598b.m101013a(a7, th3);
                                throw th5;
                            }
                        }
                    }
                    if (oVar.f370899L) {
                        C47558bi a8 = C47831fm.m85006a("HomeScreenFragmentPeer#maybeAttachInboxFragment");
                        try {
                            if (oVar.f370907b.getChildFragmentManager().f634a.mo671c("inbox") == null) {
                                C0154a aVar5 = new C0154a(oVar.f370907b.getChildFragmentManager());
                                AccountId accountId4 = oVar.f370912g;
                                C69664n.m101061g(accountId4, "accountId");
                                C137137b bVar = new C137137b();
                                C68324h.m98669f(bVar);
                                C47247a.m84047b(bVar, accountId4);
                                aVar5.mo511h(R.id.googleapp_inbox_fragment, bVar, "inbox", 1);
                                aVar5.mo509f();
                            }
                            C69598b.m101013a(a8, (Throwable) null);
                        } catch (Throwable th6) {
                            Throwable th7 = th6;
                            C69598b.m101013a(a8, th2);
                            throw th7;
                        }
                    }
                    C69598b.m101013a(a, (Throwable) null);
                } catch (Throwable th8) {
                    C69598b.m101013a(a6, th2);
                    throw th2;
                } finally {
                    th2 = th8;
                }
            } catch (Throwable th9) {
                C69598b.m101013a(a2, th);
                throw th;
            } finally {
                th = th9;
            }
        } finally {
            Throwable th10 = th;
            try {
            } catch (Throwable th11) {
                Throwable th12 = th11;
                C69598b.m101013a(a, th10);
                throw th12;
            }
        }
    }
}
