package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AccountsException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.SelectAccountPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.staticplugins.p7681cm.p7682a.C97938a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.v */
/* compiled from: PG */
public final class C98027v extends C88994i implements Preference.OnPreferenceChangeListener, AccountManagerCallback {

    /* renamed from: c */
    private static final C59071e f273722c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.v");

    /* renamed from: a */
    SelectAccountPreference f273723a;

    /* renamed from: b */
    public C58833ax f273724b = C58836b.f156633a;

    /* renamed from: d */
    private final Activity f273725d;

    /* renamed from: e */
    private final C86054o f273726e;

    /* renamed from: f */
    private final C89037bh f273727f;

    /* renamed from: g */
    private final AccountManager f273728g;

    /* renamed from: h */
    private final int f273729h;

    /* renamed from: i */
    private final int f273730i;

    /* renamed from: j */
    private final boolean f273731j;

    /* renamed from: k */
    private final C86051l f273732k = new C98026u(this);

    /* renamed from: l */
    private final C97938a f273733l;

    /* renamed from: m */
    private C98025t f273734m;

    public C98027v(C86054o oVar, Activity activity, C89037bh bhVar, AccountManager accountManager, boolean z, int i, int i2, C97938a aVar) {
        this.f273726e = oVar;
        this.f273725d = activity;
        this.f273727f = bhVar;
        this.f273728g = accountManager;
        this.f273731j = z;
        this.f273729h = i;
        this.f273730i = i2;
        this.f273733l = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo90882a(String str) {
        this.f273726e.mo79680n();
        this.f273726e.mo79686t(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo90883b() {
        String str;
        String[] s = this.f273726e.mo79685s();
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f273726e.mo79659F();
        String[] strArr = (String[]) Arrays.copyOf(s, s.length + 1);
        if (F != null) {
            str = this.f273725d.getResources().getString(R.string.select_google_account_sign_out);
        } else {
            str = this.f273725d.getResources().getString(R.string.select_google_account_add_account);
        }
        strArr[strArr.length - 1] = str;
        SelectAccountPreference selectAccountPreference = this.f273723a;
        if (selectAccountPreference != null) {
            selectAccountPreference.setEntries(strArr);
            this.f273723a.setEntryValues(strArr);
            if (F != null) {
                this.f273723a.setValue(F);
            }
        }
        mo90884m();
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        SelectAccountPreference selectAccountPreference;
        String key = preference.getKey();
        C58976aa aaVar = C58975e.f156826a;
        if (key.equals(C90507o.f253011a)) {
            SelectAccountPreference selectAccountPreference2 = (SelectAccountPreference) preference;
            this.f273723a = selectAccountPreference2;
            selectAccountPreference2.f233312a = this.f273727f;
            selectAccountPreference2.setOnPreferenceChangeListener(this);
            mo90883b();
            if (this.f273731j && (selectAccountPreference = this.f273723a) != null) {
                if (selectAccountPreference.getDialog() == null || !this.f273723a.getDialog().isShowing()) {
                    this.f273723a.showDialog((Bundle) null);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo82942d(Bundle bundle) {
        C86054o oVar = this.f273726e;
        if (oVar != null) {
            oVar.mo79675i(this.f273732k);
        }
        C98025t tVar = new C98025t(this);
        this.f273734m = tVar;
        this.f273733l.f273477a.f115250a.add(tVar);
    }

    /* renamed from: e */
    public final void mo82943e() {
        C86054o oVar = this.f273726e;
        if (oVar != null) {
            oVar.mo79681o(this.f273732k);
        }
        C98025t tVar = this.f273734m;
        if (tVar != null) {
            this.f273733l.f273477a.f115250a.remove(tVar);
            this.f273734m = null;
        }
    }

    /* renamed from: g */
    public final void mo82945g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f273726e.mo79680n();
        mo90883b();
    }

    /* renamed from: m */
    public final void mo90884m() {
        if (this.f273724b.mo56113h()) {
            C98029x xVar = (C98029x) this.f273724b.mo56107c();
            if (!xVar.f273741a.f273747c.mo90885n()) {
                C58976aa aaVar = C58975e.f156826a;
                xVar.f273741a.f273745a.setEnabled(false);
            } else if (xVar.f273741a.f273747c.mo90886o()) {
                xVar.f273741a.f273745a.setEnabled(true);
            } else {
                C98031z zVar = xVar.f273741a;
                if (zVar.f273746b != null) {
                    zVar.mo90892m(zVar.f273745a, false);
                }
            }
        }
        if (!mo90885n()) {
            SelectAccountPreference selectAccountPreference = this.f273723a;
            if (selectAccountPreference != null) {
                selectAccountPreference.setSummary(R.string.select_google_account_summary_no_accounts);
            }
        } else if (mo90886o()) {
            String F = this.f273726e.mo79659F();
            C58976aa aaVar2 = C58975e.f156826a;
            SelectAccountPreference selectAccountPreference2 = this.f273723a;
            if (selectAccountPreference2 != null) {
                selectAccountPreference2.setSummary(this.f273725d.getResources().getString(this.f273730i, new Object[]{F}));
            }
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            SelectAccountPreference selectAccountPreference3 = this.f273723a;
            if (selectAccountPreference3 != null) {
                selectAccountPreference3.setSummary(this.f273725d.getResources().getString(this.f273729h));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo90885n() {
        C86054o oVar = this.f273726e;
        return (oVar == null || oVar.mo79684r() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo90886o() {
        C86054o oVar = this.f273726e;
        return (oVar == null || oVar.mo79668a() == null) ? false : true;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        int i;
        Intent intent;
        C58976aa aaVar = C58975e.f156826a;
        if (preference == this.f273723a) {
            String str = (String) obj;
            if (str.equals(this.f273725d.getResources().getString(R.string.select_google_account_add_account))) {
                C90476a aVar = C91018d.f254254a;
                this.f273728g.addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this.f273725d, this, (Handler) null);
                i = 1;
            } else if (str.equals(this.f273725d.getResources().getString(R.string.select_google_account_sign_out))) {
                SelectAccountPreference selectAccountPreference = this.f273723a;
                if (selectAccountPreference != null) {
                    selectAccountPreference.setSummary(this.f273725d.getResources().getString(R.string.select_google_account_summary_signing_out));
                }
                this.f273726e.mo79679m();
                mo90883b();
                i = 2;
            } else if (str.equals(this.f273726e.mo79659F())) {
                i = 3;
            } else {
                i = mo90888p(str);
            }
            if (this.f273724b.mo56113h()) {
                C98029x xVar = (C98029x) this.f273724b.mo56107c();
                xVar.f273741a.f273749e.notifyChanged();
                if (i == 2) {
                    intent = xVar.f273741a.mo90890a();
                } else if (i == 5) {
                    intent = xVar.f273741a.mo90891b(str);
                }
                if (intent != null) {
                    xVar.f273741a.f273748d.startActivity(intent);
                }
                C98031z zVar = xVar.f273741a;
                if (zVar.f273752h && zVar.f273750f.mo87278f()) {
                    zVar.f273750f.mo87286n(zVar.f273751g, new C98030y(zVar));
                }
                xVar.f273741a.f273748d.finish();
            }
            if (i == 4) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo90888p(String str) {
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f273726e.mo79686t(str);
            mo90883b();
            return 5;
        } catch (AccountsException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return 4;
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            String string = bundle != null ? bundle.getString("authAccount") : null;
            C59104x b = f273722c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GoogleAccountSelection");
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            ((C59052c) ((C59052c) b).mo56372aa(30376)).mo56389s("Add account activity returned account name: %s", C90753j.m148239a(string));
            if (!TextUtils.isEmpty(string)) {
                mo90882a(string);
                this.f273725d.finish();
            }
        } catch (OperationCanceledException e) {
            C59104x b2 = f273722c.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GoogleAccountSelection");
            ((C59052c) ((C59052c) ((C59052c) b2).mo56382g(e)).mo56372aa(30377)).mo56386p("Adding new account cancelled");
        } catch (AccountsException e2) {
            C59104x d = f273722c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GoogleAccountSelection");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(30378)).mo56386p("Account not found");
        } catch (Exception e3) {
            C59104x c = f273722c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GoogleAccountSelection");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e3)).mo56372aa(30379)).mo56386p("Failed to add new account");
        }
    }
}
