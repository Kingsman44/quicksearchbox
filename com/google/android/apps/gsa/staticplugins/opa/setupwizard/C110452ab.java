package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ab */
/* compiled from: PG */
public final /* synthetic */ class C110452ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SuwActivity f307934a;

    /* renamed from: b */
    public final /* synthetic */ Account f307935b;

    public /* synthetic */ C110452ab(SuwActivity suwActivity, Account account) {
        this.f307934a = suwActivity;
        this.f307935b = account;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SuwActivity suwActivity = this.f307934a;
        Account account = this.f307935b;
        act act = (act) obj;
        act.getClass();
        String str = account.name;
        C49946ew ewVar = act.f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        String a = suwActivity.f307885n.a(ewVar);
        C62971cq<String> cqVar = ewVar.f129830e;
        ae aeVar = suwActivity.f307877f;
        String str2 = account.name;
        Locale u = C90772bp.m148313u(a);
        u.getClass();
        aeVar.f(str2, u);
        C58480gp e = C58485gu.m89837e();
        boolean z = false;
        for (String str3 : cqVar) {
            Locale u2 = C90772bp.m148313u(str3);
            u2.getClass();
            e.mo55395g(u2);
            z |= str3.equals(a);
        }
        if (!z) {
            Locale u3 = C90772bp.m148313u(a);
            u3.getClass();
            e.mo55395g(u3);
        }
        suwActivity.f307877f.e(account.name, e.mo55394f());
        suwActivity.mo98671d();
    }
}
