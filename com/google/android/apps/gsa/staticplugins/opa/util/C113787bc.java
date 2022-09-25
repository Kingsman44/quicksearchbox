package com.google.android.apps.gsa.staticplugins.opa.util;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bc */
/* compiled from: PG */
public final class C113787bc {

    /* renamed from: a */
    public static final C59071e f315132a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.bc");

    /* renamed from: b */
    public final C86124t f315133b;

    /* renamed from: c */
    public final SharedPreferences f315134c;

    /* renamed from: d */
    public final C86054o f315135d;

    /* renamed from: e */
    public final bg f315136e;

    public C113787bc(C86124t tVar, SharedPreferences sharedPreferences, C86054o oVar, bg bgVar) {
        this.f315133b = tVar;
        this.f315134c = sharedPreferences;
        this.f315135d = oVar;
        this.f315136e = bgVar;
    }

    /* renamed from: a */
    public static String m188357a(String str) {
        return "opa_is_in_signed_out_mode_for_no_udc".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public static String m188358b(Account account) {
        return "opa_is_in_try_before_you_buy_updated".concat(String.valueOf(account == null ? BuildConfig.FLAVOR : account.name));
    }

    /* renamed from: c */
    public static String m188359c(String str) {
        return "opa_was_ever_signed_out_no_udc_mode".concat(String.valueOf(str));
    }

    /* renamed from: d */
    public static String m188360d(Account account) {
        return "opa_was_ever_in_try_before_you_buy_updated".concat(String.valueOf(account == null ? BuildConfig.FLAVOR : account.name));
    }

    /* renamed from: e */
    public final void mo100625e() {
        SharedPreferences.Editor edit = this.f315134c.edit();
        Account a = this.f315135d.mo79668a();
        if (a != null) {
            edit.remove("opa_is_in_signed_out_mode_for_no_account");
        }
        if (a != null && (this.f315133b.mo79746e(C90053de.f248982o) || this.f315136e.c(a.name))) {
            edit.remove(m188357a(a.name));
        }
        edit.remove(m188358b(a));
        edit.apply();
    }

    /* renamed from: f */
    public final void mo100626f() {
        Account a = this.f315135d.mo79668a();
        if (a != null) {
            String a2 = m188357a(a.name);
            String c = m188359c(a.name);
            boolean contains = this.f315134c.contains(a2);
            boolean contains2 = this.f315134c.contains(c);
            if (contains || contains2) {
                SharedPreferences.Editor edit = this.f315134c.edit();
                if (contains) {
                    edit.remove(m188357a(a.name));
                }
                if (contains2) {
                    edit.remove(m188359c(a.name));
                }
                edit.apply();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo100627g(Account account) {
        if (account == null) {
            return false;
        }
        return mo100628h(account.name);
    }

    /* renamed from: h */
    public final boolean mo100628h(String str) {
        if (str == null) {
            return false;
        }
        return this.f315134c.getBoolean(m188357a(str), false);
    }

    /* renamed from: i */
    public final boolean mo100629i(boolean z) {
        if (!mo100630j()) {
            return (!z && mo100631k()) || mo100632l();
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo100630j() {
        if (mo100633m() && this.f315135d.mo79668a() == null) {
            return this.f315134c.getBoolean("opa_is_in_signed_out_mode_for_no_account", false);
        }
        this.f315134c.edit().remove("opa_is_in_signed_out_mode_for_no_account").apply();
        return false;
    }

    /* renamed from: k */
    public final boolean mo100631k() {
        Account a = this.f315135d.mo79668a();
        if (a == null) {
            return false;
        }
        if (!mo100634n() || this.f315136e.c(a.name)) {
            this.f315134c.edit().remove(m188357a(a.name)).apply();
        }
        return mo100627g(a);
    }

    /* renamed from: l */
    public final boolean mo100632l() {
        return this.f315134c.getBoolean(m188358b(this.f315135d.mo79668a()), false);
    }

    /* renamed from: m */
    public final boolean mo100633m() {
        return this.f315133b.mo79746e(C90014bt.f247318er) || this.f315133b.mo79746e(C90086ek.f250400cS);
    }

    /* renamed from: n */
    public final boolean mo100634n() {
        return this.f315133b.mo79746e(C90014bt.f247319es) || this.f315133b.mo79746e(C90086ek.f250400cS);
    }

    /* renamed from: o */
    public final boolean mo100635o(Account account) {
        return this.f315134c.getBoolean(m188360d(account), false);
    }
}
