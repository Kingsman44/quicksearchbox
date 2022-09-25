package com.google.android.apps.gsa.p8867w.p8874d;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.w.d.b */
/* compiled from: PG */
public final /* synthetic */ class C118777b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118782g f331310a;

    /* renamed from: b */
    public final /* synthetic */ Account f331311b;

    /* renamed from: c */
    public final /* synthetic */ aa f331312c;

    public /* synthetic */ C118777b(C118782g gVar, Account account, aa aaVar) {
        this.f331310a = gVar;
        this.f331311b = account;
        this.f331312c = aaVar;
    }

    public final Object apply(Object obj) {
        C118782g gVar = this.f331310a;
        Account account = this.f331311b;
        aa aaVar = this.f331312c;
        act act = (act) obj;
        C58976aa aaVar2 = C58975e.f156826a;
        String str = account.name;
        boolean z = false;
        if (act == null) {
            return false;
        }
        C49946ew ewVar = act.f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        String a = aaVar.a(ewVar);
        C62971cq<String> cqVar = ewVar.f129830e;
        gVar.f331319b.f(account.name, C90772bp.m148313u(a));
        C58480gp e = C58485gu.m89837e();
        for (String str2 : cqVar) {
            e.mo55395g(C90772bp.m148313u(str2));
            z |= str2.equals(a);
        }
        if (!z) {
            e.mo55395g(C90772bp.m148313u(a));
        }
        gVar.f331319b.e(account.name, e.mo55394f());
        return true;
    }
}
