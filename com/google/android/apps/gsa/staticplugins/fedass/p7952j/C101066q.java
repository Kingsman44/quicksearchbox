package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.q */
/* compiled from: PG */
public final /* synthetic */ class C101066q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101071v f282227a;

    /* renamed from: b */
    public final /* synthetic */ Account f282228b;

    public /* synthetic */ C101066q(C101071v vVar, Account account) {
        this.f282227a = vVar;
        this.f282228b = account;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C101071v vVar = this.f282227a;
        Account account = this.f282228b;
        boolean z = false;
        if (TextUtils.isEmpty(account.name)) {
            C59104x b = C101071v.f282233a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedAssEligibility");
            ((C59052c) ((C59052c) b).mo56372aa(19732)).mo56386p("Empty account. Not eligible for FL.");
            return C60856cj.m92900i(false);
        } else if (account.name.endsWith("@google.com")) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(true);
        } else {
            C60870cx[] cxVarArr = new C60870cx[3];
            int a = ((cb) vVar.f282235c.mo27525b()).a(account);
            if (a != 0) {
                cxVar = C60856cj.m92900i(Boolean.valueOf(a == 1));
            } else {
                cxVar = C60846c.m92878g(((C86054o) vVar.f282234b.mo27525b()).mo79670c(account, "usm"), Throwable.class, C101068s.f282230a, vVar.f282236d);
            }
            cxVarArr[0] = cxVar;
            int b2 = ((cb) vVar.f282235c.mo27525b()).b(account);
            if (b2 != 0) {
                if (b2 == 1) {
                    z = true;
                }
                cxVar2 = C60856cj.m92900i(Boolean.valueOf(z));
            } else {
                cxVar2 = C60846c.m92878g(((C86054o) vVar.f282234b.mo27525b()).mo79670c(account, "uca"), Throwable.class, C101067r.f282229a, vVar.f282236d);
            }
            cxVarArr[1] = cxVar2;
            cxVarArr[2] = C60846c.m92878g(((C86054o) vVar.f282234b.mo27525b()).mo79670c(account, "HOSTED"), Throwable.class, new C101070u(account), vVar.f282236d);
            return C60922j.m93044g(C60856cj.m92907p(cxVarArr), C101069t.f282231a, vVar.f282236d);
        }
    }
}
