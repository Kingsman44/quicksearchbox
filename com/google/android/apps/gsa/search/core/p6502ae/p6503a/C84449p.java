package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21467o;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.p */
/* compiled from: PG */
public final /* synthetic */ class C84449p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229818a;

    /* renamed from: b */
    public final /* synthetic */ String f229819b;

    /* renamed from: c */
    public final /* synthetic */ int f229820c;

    /* renamed from: d */
    public final /* synthetic */ List f229821d;

    /* renamed from: e */
    public final /* synthetic */ ConditionVariable f229822e;

    /* renamed from: f */
    public final /* synthetic */ C21467o f229823f;

    public /* synthetic */ C84449p(C84425ag agVar, String str, int i, C21467o oVar, List list, ConditionVariable conditionVariable) {
        this.f229818a = agVar;
        this.f229819b = str;
        this.f229820c = i;
        this.f229823f = oVar;
        this.f229821d = list;
        this.f229822e = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229818a;
        String str = this.f229819b;
        int i = this.f229820c;
        C21467o oVar = this.f229823f;
        List list = this.f229821d;
        ConditionVariable conditionVariable = this.f229822e;
        list.add(agVar.mo77993a(agVar.f229720c.mo77991c(str, i, oVar)));
        conditionVariable.open();
    }
}
