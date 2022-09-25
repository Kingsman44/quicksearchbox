package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.p10712d.C142316av;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.r */
/* compiled from: PG */
public final /* synthetic */ class C96432r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96439y f269774a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f269775b;

    /* renamed from: c */
    public final /* synthetic */ C142316av f269776c;

    public /* synthetic */ C96432r(C96439y yVar, C58833ax axVar, C142316av avVar) {
        this.f269774a = yVar;
        this.f269775b = axVar;
        this.f269776c = avVar;
    }

    public final Object apply(Object obj) {
        C96439y yVar = this.f269774a;
        C58833ax axVar = this.f269775b;
        C142316av avVar = this.f269776c;
        C96438x xVar = (C96438x) obj;
        Account account = (Account) axVar.mo56107c();
        if (xVar.f269790b) {
            C59104x b = C96439y.f269793a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AccLinkSeq");
            ((C59052c) ((C59052c) b).mo56372aa(16935)).mo56386p("Provider already linked");
            return C83875ai.f228524a;
        } else if (C58837ba.m90859h(xVar.f269791c)) {
            C59104x d = C96439y.f269793a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AccLinkSeq");
            ((C59052c) ((C59052c) d).mo56372aa(16934)).mo56386p("Missing Provider Name");
            return C83875ai.f228524a;
        } else {
            C58480gp e = C58485gu.m89837e();
            e.mo55395g(C96439y.m159790d(account, xVar.f269791c, xVar.f269792d, avVar));
            if (!xVar.f269789a && !C58837ba.m90859h(xVar.f269792d)) {
                e.mo55395g(new C96437w(yVar, xVar.f269792d, account));
            }
            return C83875ai.m133538c(e.mo55394f());
        }
    }
}
