package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.c */
/* compiled from: PG */
public final class C108870c extends C83907bm {

    /* renamed from: b */
    public C86054o f302713b;

    /* renamed from: c */
    public C113787bc f302714c;

    /* renamed from: d */
    public C83893b f302715d;

    /* renamed from: e */
    private boolean f302716e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97242e() {
        startActivityForResult(AccountManager.newChooseAccountIntent((Account) null, (ArrayList) null, new String[]{"com.google"}, false, (String) null, (String) null, (String[]) null, (Bundle) null), 456);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 456 && i2 == -1) {
            String stringExtra = intent.getStringExtra("authAccount");
            this.f302713b.mo79680n();
            Account w = this.f302713b.mo79689w(stringExtra);
            if (w != null) {
                this.f302715d.mo77279b(w);
                mo77318iT().mo77312a();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.error_missing_account, (ViewGroup) null);
        boolean M = this.f302713b.mo79666M();
        C58838bb.m90883r(this.f302715d.mo77281d());
        if (!((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getBoolean("bypass_error_page", false)) {
            C28295m.m52919e(legacyOpaStandardPage, new C28292j(true != M ? 36593 : 36590));
            legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108815a(this)));
            this.f302716e = ((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getBoolean("allow_signed_out_mode", false);
            Button b = legacyOpaStandardPage.f228725d.mo77361b();
            if (this.f302713b.mo79668a() != null || !this.f302716e) {
                b.setVisibility(8);
            } else {
                b.setOnClickListener(new C89943l(new C108843b(this)));
            }
            return legacyOpaStandardPage;
        }
        mo97242e();
        return null;
    }
}
