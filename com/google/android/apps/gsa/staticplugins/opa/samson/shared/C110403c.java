package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90023cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.c */
/* compiled from: PG */
public final class C110403c implements v {

    /* renamed from: b */
    private static final C59071e f307693b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.shared.c");

    /* renamed from: a */
    public final C68214a f307694a;

    /* renamed from: c */
    private final C86124t f307695c;

    /* renamed from: d */
    private final C110114a f307696d;

    /* renamed from: e */
    private final C110397a f307697e;

    public C110403c(C68214a aVar, C86124t tVar, C110114a aVar2, C110397a aVar3) {
        this.f307694a = aVar;
        this.f307695c = tVar;
        this.f307696d = aVar2;
        this.f307697e = aVar3;
    }

    /* renamed from: m */
    public static String m183817m(String str) {
        return m183823t(str).concat("enabled");
    }

    /* renamed from: n */
    public static String m183818n(String str) {
        return m183823t(str).concat("user_lpr_explicit_opt_out");
    }

    /* renamed from: o */
    public static String m183819o(String str) {
        return m183823t(str).concat("user_made_decision");
    }

    /* renamed from: p */
    public static String m183820p(String str) {
        return m183823t(str).concat("user_notification_explicit_opt_out");
    }

    /* renamed from: q */
    public static String m183821q(String str) {
        return m183823t(str).concat("user_personalization_explicit_opt_out");
    }

    /* renamed from: s */
    private static String m183822s(String str) {
        return m183823t(str).concat("dev_integ_enabled");
    }

    /* renamed from: t */
    private static String m183823t(String str) {
        return "ch_am_opt_in_".concat(String.valueOf(str));
    }

    /* renamed from: u */
    private static String m183824u(String str) {
        return m183823t(str).concat("shown");
    }

    /* renamed from: a */
    public final void mo98630a(String str, boolean z) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183817m(str), z).apply();
        if (!z) {
            this.f307696d.mo98390g();
        }
    }

    /* renamed from: b */
    public final void mo98631b(String str, boolean z) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183822s(str), z).apply();
        if (!z && !this.f307697e.mo98624b(true)) {
            this.f307696d.mo98390g();
        }
    }

    /* renamed from: c */
    public final boolean mo98632c(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean e = this.f307695c.mo79746e(C90023cb.f248128d);
        if (this.f307695c.mo79746e(C90014bt.f247376fw)) {
            return true;
        }
        if (e || i <= 30) {
            return ((SharedPreferences) this.f307694a.mo27525b()).getBoolean(m183817m(str), false);
        }
        C59104x b = f307693b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ChAmOptIn");
        ((C59052c) ((C59052c) b).mo56372aa(25913)).mo56386p("Not enabled for version S+");
        return false;
    }

    /* renamed from: d */
    public final boolean mo98633d(String str) {
        return ((SharedPreferences) this.f307694a.mo27525b()).getBoolean(m183822s(str), true);
    }

    /* renamed from: e */
    public final boolean mo98634e(String str) {
        return ((SharedPreferences) this.f307694a.mo27525b()).getBoolean(m183818n(str), false);
    }

    /* renamed from: f */
    public final boolean mo98635f(String str) {
        return ((SharedPreferences) this.f307694a.mo27525b()).getBoolean(m183820p(str), false);
    }

    /* renamed from: g */
    public final boolean mo98636g(String str) {
        return ((SharedPreferences) this.f307694a.mo27525b()).getBoolean(m183821q(str), false);
    }

    /* renamed from: h */
    public final void mo98637h(String str) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183819o(str), true).apply();
    }

    /* renamed from: i */
    public final void mo98638i(String str) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183818n(str), true).apply();
    }

    /* renamed from: j */
    public final void mo98639j(String str) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183820p(str), true).apply();
    }

    /* renamed from: k */
    public final void mo98640k(String str) {
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putBoolean(m183821q(str), true).apply();
    }

    /* renamed from: l */
    public final int mo98641l(String str) {
        return ((SharedPreferences) this.f307694a.mo27525b()).getInt(m183824u(str), 0);
    }

    /* renamed from: r */
    public final void mo98642r(String str) {
        int l = mo98641l(str);
        C58976aa aaVar = C58975e.f156826a;
        ((SharedPreferences) this.f307694a.mo27525b()).edit().putInt(m183824u(str), l + 1).apply();
    }
}
