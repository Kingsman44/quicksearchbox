package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AccountsException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObservable;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.SelectAccountPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90078ec;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.p7154f.C90676a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7682a.C97938a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7891nu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.z */
/* compiled from: PG */
public final class C98031z extends C88994i implements Preference.OnPreferenceChangeListener, AccountManagerCallback, Preference.OnPreferenceClickListener {

    /* renamed from: j */
    public static final /* synthetic */ int f273743j = 0;

    /* renamed from: k */
    private static final C59071e f273744k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.z");

    /* renamed from: a */
    protected Preference f273745a;

    /* renamed from: b */
    public PreferenceGroup f273746b;

    /* renamed from: c */
    final C98027v f273747c;

    /* renamed from: d */
    public final Activity f273748d;

    /* renamed from: e */
    public final DataSetObservable f273749e;

    /* renamed from: f */
    public final C92518d f273750f;

    /* renamed from: g */
    public final C91097g f273751g;

    /* renamed from: h */
    public final boolean f273752h;

    /* renamed from: i */
    protected final C98029x f273753i;

    /* renamed from: l */
    private final C86124t f273754l;

    /* renamed from: m */
    private final C86054o f273755m;

    /* renamed from: n */
    private final C85651bb f273756n;

    /* renamed from: o */
    private final C68214a f273757o;

    /* renamed from: p */
    private final cb f273758p;

    /* renamed from: q */
    private final boolean f273759q;

    /* renamed from: r */
    private final boolean f273760r;

    public C98031z(C86124t tVar, C86054o oVar, C85651bb bbVar, Activity activity, DataSetObservable dataSetObservable, boolean z, boolean z2, C92518d dVar, C91097g gVar, C68214a aVar, C98028w wVar, cb cbVar) {
        C92518d dVar2 = dVar;
        C98028w wVar2 = wVar;
        C98029x xVar = new C98029x(this);
        this.f273753i = xVar;
        C86054o oVar2 = (C86054o) wVar2.f273735a.mo17428b();
        oVar2.getClass();
        activity.getClass();
        C89037bh bhVar = (C89037bh) wVar2.f273736b.mo17428b();
        bhVar.getClass();
        AccountManager accountManager = (AccountManager) wVar2.f273737c.mo17428b();
        accountManager.getClass();
        Integer num = (Integer) wVar2.f273738d.mo17428b();
        num.getClass();
        int intValue = num.intValue();
        Integer num2 = (Integer) wVar2.f273739e.mo17428b();
        num2.getClass();
        int intValue2 = num2.intValue();
        C97938a aVar2 = (C97938a) wVar2.f273740f.mo17428b();
        aVar2.getClass();
        C98027v vVar = new C98027v(oVar2, activity, bhVar, accountManager, z, intValue, intValue2, aVar2);
        this.f273747c = vVar;
        vVar.f273724b = C58833ax.m90834k(xVar);
        this.f273755m = oVar;
        this.f273756n = bbVar;
        this.f273748d = activity;
        this.f273749e = dataSetObservable;
        this.f273759q = z;
        this.f273760r = z2;
        this.f273750f = dVar2;
        this.f273751g = gVar;
        this.f273752h = dVar2 != null;
        this.f273754l = tVar;
        this.f273757o = aVar;
        this.f273758p = cbVar;
    }

    /* renamed from: a */
    public final Intent mo90890a() {
        if (!this.f273759q) {
            return new Intent("android.intent.action.ASSIST").setClassName(this.f273748d, e.b()).setFlags(67108864).putExtra("source-debug", "account-setting");
        }
        return null;
    }

    /* renamed from: b */
    public final Intent mo90891b(String str) {
        if (this.f273760r || this.f273756n.mo79134G()) {
            return mo90890a();
        }
        C91973ax axVar = new C91973ax(C7891nu.SETTINGS_SELECT_ACCOUNT);
        axVar.f256469a = str;
        axVar.f256475g = 1;
        return axVar.mo86664a();
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (preference.getKey().equals("google_account_history")) {
            C58976aa aaVar = C58975e.f156826a;
            this.f273745a = preference;
            if (TextUtils.isEmpty(this.f273755m.mo79659F())) {
                this.f273745a.setEnabled(false);
                return;
            }
            this.f273745a.setEnabled(true);
            this.f273745a.setOnPreferenceClickListener(this);
            return;
        }
        this.f273747c.mo82941c(preference);
    }

    /* renamed from: e */
    public final void mo82943e() {
        this.f273747c.mo82943e();
    }

    /* renamed from: g */
    public final void mo82945g() {
        C58976aa aaVar = C58975e.f156826a;
        Preference preference = this.f273745a;
        SelectAccountPreference selectAccountPreference = this.f273747c.f273723a;
        boolean z = false;
        if (selectAccountPreference != null && !TextUtils.isEmpty(selectAccountPreference.getValue())) {
            z = true;
        }
        mo90892m(preference, z);
        this.f273747c.mo82945g();
    }

    /* renamed from: i */
    public final void mo82947i() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f273752h) {
            this.f273750f.mo87273a((C92515a) null);
        }
    }

    /* renamed from: j */
    public final void mo82948j() {
        if (this.f273752h) {
            this.f273750f.mo87274b();
        }
    }

    /* renamed from: k */
    public final void mo82949k(PreferenceScreen preferenceScreen) {
        this.f273746b = preferenceScreen;
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        C58976aa aaVar = C58975e.f156826a;
        if (!preference.getKey().equals(C90507o.f253011a)) {
            return false;
        }
        Account a = this.f273755m.mo79668a();
        if (a == null || !this.f273758p.f(a)) {
            return this.f273754l.mo79746e(C90078ec.f249797a);
        }
        return true;
    }

    /* renamed from: m */
    public final void mo90892m(Preference preference, boolean z) {
        if (!z) {
            this.f273746b.removePreference(preference);
        } else if (this.f273746b.findPreference(preference.getKey()) == null) {
            this.f273746b.addPreference(preference);
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }

    public final boolean onPreferenceClick(Preference preference) {
        String F = this.f273755m.mo79659F();
        if (TextUtils.isEmpty(F)) {
            this.f273745a.setEnabled(false);
            return false;
        }
        C90676a aVar = (C90676a) this.f273757o.mo27525b();
        C90676a.m148044a(this.f273748d, F);
        return true;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            String string = bundle != null ? bundle.getString("authAccount") : null;
            C59104x b = f273744k.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GoogleAccountSettings");
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            ((C59052c) ((C59052c) b).mo56372aa(30393)).mo56389s("Add account activity returned account name: %s", C90753j.m148239a(string));
            if (!TextUtils.isEmpty(string)) {
                this.f273747c.mo90882a(string);
                Intent b2 = mo90891b(string);
                if (b2 != null) {
                    this.f273748d.startActivity(b2);
                }
                this.f273748d.finish();
            }
        } catch (OperationCanceledException e) {
            C59104x b3 = f273744k.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "GoogleAccountSettings");
            ((C59052c) ((C59052c) ((C59052c) b3).mo56382g(e)).mo56372aa(30394)).mo56386p("Adding new account cancelled");
        } catch (AccountsException e2) {
            C59104x d = f273744k.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GoogleAccountSettings");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(30395)).mo56386p("Account not found");
        } catch (Exception e3) {
            C59104x c = f273744k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GoogleAccountSettings");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e3)).mo56372aa(30396)).mo56386p("Failed to add new account");
        }
    }
}
