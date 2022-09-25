package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4552o.C60321oe;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gt */
/* compiled from: PG */
public final class C108728gt extends C83869ac {

    /* renamed from: a */
    private final C68214a f302367a;

    /* renamed from: b */
    private final String f302368b;

    /* renamed from: c */
    private final Context f302369c;

    public C108728gt(C68214a aVar, String str, Context context) {
        this.f302367a = aVar;
        this.f302368b = str;
        this.f302369c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Context context = this.f302369c;
        Object[] objArr = {this.f302368b};
        C108634dg dgVar = new C108634dg();
        Bundle bundle = new Bundle();
        bundle.putString("error_message", context.getString(R.string.wrong_account_selected_error_message, objArr));
        bundle.putInt("layout", R.layout.wrong_account_selected_error);
        bundle.putBoolean("exit", true);
        dgVar.setArguments(bundle);
        C89949q.m146525j(C108607cg.m180627a(14), (C60321oe) null, (C63196b) null, (String) null);
        return C83875ai.m133540e(dgVar, dgVar.getArguments());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        if (C58837ba.m90859h(this.f302368b)) {
            return false;
        }
        C58833ax a = ((C83893b) this.f302367a.mo27525b()).mo77278a();
        return !a.mo56113h() || !this.f302368b.equals(((Account) a.mo56107c()).name);
    }
}
