package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108940ep;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108993n;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108995p;
import com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nm */
/* compiled from: PG */
public final class C109739nm {

    /* renamed from: a */
    public final C108934ej f305735a;

    /* renamed from: b */
    public final C108993n f305736b;

    /* renamed from: c */
    private final C113787bc f305737c;

    /* renamed from: d */
    private final C86124t f305738d;

    public C109739nm(C108934ej ejVar, C113787bc bcVar, C108993n nVar, C86124t tVar) {
        this.f305735a = ejVar;
        this.f305737c = bcVar;
        this.f305736b = nVar;
        this.f305738d = tVar;
    }

    /* renamed from: d */
    public static boolean m182716d(Bundle bundle, C58833ax axVar) {
        if (axVar.mo56113h() && C87564g.m142223a(bundle) != e.bI && !C87566i.m142257aE(bundle)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final StartupConfig mo98060a(Bundle bundle) {
        C87565h hVar = new C87565h(bundle);
        boolean z = false;
        hVar.f236559e = false;
        hVar.f236515S = false;
        hVar.f236516T = false;
        if (this.f305738d.mo79746e(C90053de.f248941H)) {
            hVar.f236498B = true;
            hVar.f236556b = e.q;
        }
        Bundle a = hVar.mo81685a();
        C108940ep k = StartupConfig.m180996k();
        k.mo97301h(C87564g.m142223a(bundle).ca);
        ((C108995p) k).f303079a = a;
        k.mo97299f(!C87566i.m142293aq(bundle));
        boolean z2 = C87566i.m142270aR(bundle) || C87566i.m142292ap(bundle);
        boolean z3 = C87566i.m142296at(bundle) || C87566i.m142302az(bundle);
        boolean e = this.f305737c.f315133b.mo79746e(C90014bt.f247320et);
        if (z2 || z3 || e) {
            z = true;
        }
        k.mo97300g(z);
        k.mo97302i(C87566i.m142312k(bundle));
        k.mo97296c(C87566i.m142249X(bundle));
        k.mo97295b(C87566i.m142248W(bundle));
        if (C87566i.m142277aa(bundle)) {
            k.mo97297d(true);
        }
        return k.mo97294a();
    }

    /* renamed from: b */
    public final C58833ax mo98061b(Bundle bundle) {
        StartupConfig a = mo98060a(bundle);
        if (!m182716d(bundle, this.f305735a.mo97284a(a))) {
            return C58836b.f156633a;
        }
        Intent v = C87566i.m142323v(bundle);
        if (v != null) {
            return C58833ax.m90834k(v);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("error_checker_seq:config", a);
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "error_checker_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        gVar.f228606b = bundle2;
        o.mo77222b(this.f305736b.mo97354a(C87564g.m142223a(bundle)));
        return C58833ax.m90834k(o.mo77221a().mo77240n().addFlags(8388608));
    }

    /* renamed from: c */
    public final C58833ax mo98062c(Bundle bundle) {
        StartupConfig a = mo98060a(bundle);
        if (!m182716d(bundle, this.f305735a.mo97285b(a))) {
            return C58836b.f156633a;
        }
        Intent v = C87566i.m142323v(bundle);
        if (v != null) {
            return C58833ax.m90834k(v);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("opa_onboarding_seq:config", a);
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "opa_onboarding_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        gVar.f228606b = bundle2;
        o.mo77222b(this.f305736b.mo97354a(C87564g.m142223a(bundle)));
        return C58833ax.m90834k(o.mo77221a().mo77240n().addFlags(8388608));
    }
}
