package com.google.android.apps.gsa.staticplugins.opa;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ng */
/* compiled from: PG */
public final class C109733ng {

    /* renamed from: a */
    private final C108230ba f305709a;

    /* renamed from: b */
    private final C91097g f305710b;

    /* renamed from: c */
    private final Context f305711c;

    /* renamed from: d */
    private final C86124t f305712d;

    /* renamed from: e */
    private final SharedPreferences f305713e;

    /* renamed from: f */
    private final boolean f305714f;

    /* renamed from: g */
    private final C113787bc f305715g;

    /* renamed from: h */
    private final C86054o f305716h;

    /* renamed from: i */
    private final C109790aj f305717i;

    /* renamed from: j */
    private final boolean f305718j;

    public C109733ng(C108230ba baVar, C91097g gVar, Context context, C86124t tVar, SharedPreferences sharedPreferences, boolean z, C113787bc bcVar, boolean z2, C86054o oVar, C109790aj ajVar) {
        this.f305709a = baVar;
        this.f305710b = gVar;
        this.f305711c = context;
        this.f305712d = tVar;
        this.f305713e = sharedPreferences;
        this.f305714f = z;
        this.f305718j = z2;
        this.f305715g = bcVar;
        this.f305716h = oVar;
        this.f305717i = ajVar;
    }

    /* renamed from: a */
    public final void mo98053a(boolean z) {
        boolean z2;
        if (!this.f305718j) {
            Account a = this.f305716h.mo79668a();
            if (a == null) {
                z2 = this.f305713e.getBoolean("opa_has_shown_tos_and_pp", false);
            } else {
                z2 = this.f305717i.mo98131m(a);
            }
            if (!z2) {
                if (this.f305714f || (((int) this.f305712d.mo79743a(C90014bt.f247690ls)) == 1 && !this.f305717i.mo98131m(a) && this.f305715g.mo100629i(false))) {
                    C108204ab abVar = new C108204ab("<a href=\"" + Uri.parse(String.format("https://www.google.com/intl/%s/policies/terms/", new Object[]{Locale.getDefault().toLanguageTag()})) + "\">" + this.f305711c.getResources().getString(R.string.opa_terms_of_service_chip_text) + "</a>" + this.f305711c.getResources().getString(R.string.opa_tos_privacy_policy_joiner) + "<a href=\"" + Uri.parse(String.format("https://www.google.com/intl/%s/policies/privacy/", new Object[]{Locale.getDefault().toLanguageTag()})) + "\">" + this.f305711c.getResources().getString(R.string.opa_privacy_policy_chip_text) + "</a>", this.f305710b);
                    abVar.f301029k.mo85049c(1, 0);
                    this.f305709a.mo95430s(abVar);
                    abVar.f301029k.mo85049c(0, 1);
                    if (!z) {
                        return;
                    }
                    if (a == null) {
                        this.f305713e.edit().putBoolean("opa_has_shown_tos_and_pp", true).apply();
                    } else {
                        this.f305717i.mo98129k(a, 3);
                    }
                }
            }
        }
    }
}
