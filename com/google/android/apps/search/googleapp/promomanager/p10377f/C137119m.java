package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137006dg;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4880aq.C63732au;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.m */
/* compiled from: PG */
public final class C137119m implements C46792di {

    /* renamed from: a */
    private static final C59071e f373119a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.m");

    /* renamed from: b */
    private static final C58528ij f373120b = C58528ij.m90012L(C63732au.DIALOG, C63732au.TOUT, C63732au.TAKEOVER);

    /* renamed from: c */
    private static final C58528ij f373121c = C58528ij.m90012L(C63958v.DIALOG, C63958v.TOUT, C63958v.FULLSCREEN);

    /* renamed from: d */
    private final AccountId f373122d;

    /* renamed from: e */
    private final Fragment f373123e;

    /* renamed from: f */
    private final C136969bx f373124f;

    /* renamed from: g */
    private final C58528ij f373125g;

    /* renamed from: h */
    private final int f373126h;

    /* renamed from: i */
    private C137007dh f373127i = C137007dh.f372869h;

    public C137119m(AccountId accountId, C136969bx bxVar, Fragment fragment, Map map, int i) {
        this.f373122d = accountId;
        this.f373123e = fragment;
        this.f373124f = bxVar;
        this.f373125g = C58528ij.m90006F(map.keySet());
        this.f373126h = i;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        throw m$$ExternalSyntheticBackport0.m222832m("This subscription callback only supports local Datasources which should never fail.", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C63733av avVar;
        C63959w wVar;
        C137007dh dhVar = (C137007dh) obj;
        mo113537d();
        if (this.f373123e.getContext().getResources().getConfiguration().orientation != 2) {
            if (dhVar.f372872b == 1) {
                avVar = (C63733av) dhVar.f372873c;
            } else {
                avVar = C63733av.f172308c;
            }
            C63732au a = C63732au.m96291a(avVar.f172310a);
            if (dhVar.f372872b == 2) {
                wVar = (C63959w) dhVar.f372873c;
            } else {
                wVar = C63959w.f172981b;
            }
            C63958v a2 = C63958v.m96327a(wVar.f172983a);
            if (a2 == null) {
                a2 = C63958v.TYPE_UNSPECIFIED;
            }
            if (!f373120b.contains(a) && !f373121c.contains(a2)) {
                return;
            }
            if (!dhVar.equals(this.f373127i) || dhVar.f372877g) {
                this.f373127i = dhVar;
                if (!C137121o.m222845l(dhVar, this.f373125g)) {
                    this.f373124f.mo113456m(dhVar);
                    return;
                }
                this.f373124f.mo113458o(dhVar);
                if (!dhVar.f372876f) {
                    int a3 = C137006dg.m222698a(dhVar.f372872b);
                    int i = a3 - 1;
                    if (a3 == 0) {
                        throw null;
                    } else if (i == 0) {
                        FragmentManager childFragmentManager = this.f373123e.getChildFragmentManager();
                        switch (a.ordinal()) {
                            case 0:
                                C47558bi a4 = C47831fm.m85006a("PromoManagerSubscriptionCallbacks#attachToutUI");
                                try {
                                    View view = this.f373123e.getView();
                                    view.getClass();
                                    view.findViewById(this.f373126h).setVisibility(0);
                                    if (dhVar.f372877g) {
                                        C137123q.m222847a(this.f373122d, dhVar).showNow(childFragmentManager, "promo_manager");
                                    } else {
                                        C0154a aVar = new C0154a(childFragmentManager);
                                        aVar.mo689v(this.f373126h, C137089ar.m222781f(this.f373122d, dhVar), "promo_manager");
                                        aVar.mo509f();
                                    }
                                    a4.close();
                                    return;
                                } catch (Throwable th) {
                                    C137118l.m222827a(th, th);
                                    break;
                                }
                            case 1:
                                C137098b.m222794a(this.f373122d, dhVar).showNow(childFragmentManager, "promo_manager");
                                return;
                            case 2:
                                C137075ad.m222763f(this.f373122d, dhVar).showNow(childFragmentManager, "promo_manager");
                                return;
                            case 3:
                            case 5:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40905)).mo56386p("Tooltips are not supporting in this callback.");
                                return;
                            case 4:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40906)).mo56386p("Account menu tooltips are not supported in this callback.");
                                return;
                            case 6:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40907)).mo56386p("Promotion was determined to be valid, but Content Case was not set for promotion.");
                                return;
                            default:
                                return;
                        }
                    } else if (i == 1) {
                        FragmentManager childFragmentManager2 = this.f373123e.getChildFragmentManager();
                        switch (a2.ordinal()) {
                            case 0:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40904)).mo56386p("Promotion was determined to be valid, but Content Case was not set for promotion.");
                                return;
                            case 1:
                                C47558bi a5 = C47831fm.m85006a("PromoManagerSubscriptionCallbacks#attachToutUI");
                                try {
                                    View view2 = this.f373123e.getView();
                                    view2.getClass();
                                    view2.findViewById(this.f373126h).setVisibility(0);
                                    if (dhVar.f372877g) {
                                        C137123q.m222847a(this.f373122d, dhVar).showNow(childFragmentManager2, "promo_manager");
                                    } else {
                                        C0154a aVar2 = new C0154a(childFragmentManager2);
                                        aVar2.mo689v(this.f373126h, C137089ar.m222781f(this.f373122d, dhVar), "promo_manager");
                                        aVar2.mo509f();
                                    }
                                    a5.close();
                                    return;
                                } catch (Throwable th2) {
                                    C137118l.m222827a(th, th2);
                                    break;
                                }
                            case 2:
                                C137098b.m222794a(this.f373122d, dhVar).showNow(childFragmentManager2, "promo_manager");
                                return;
                            case 3:
                                C137075ad.m222763f(this.f373122d, dhVar).showNow(childFragmentManager2, "promo_manager");
                                return;
                            case 4:
                            case 5:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40902)).mo56386p("Tooltips are not supporting in this callback.");
                                return;
                            case 6:
                                ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40903)).mo56386p("Account menu tooltips are not supported in this callback.");
                                return;
                            default:
                                return;
                        }
                    } else if (i == 2) {
                        ((C59052c) ((C59052c) f373119a.mo56225c()).mo56372aa(40901)).mo56386p("No content source. This should have been caught by supported types check.");
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }

    /* renamed from: d */
    public final void mo113537d() {
        FragmentManager childFragmentManager = this.f373123e.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c("promo_manager");
        if (c != null && !c.isRemoving()) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(c);
            aVar.mo509f();
        }
    }
}
