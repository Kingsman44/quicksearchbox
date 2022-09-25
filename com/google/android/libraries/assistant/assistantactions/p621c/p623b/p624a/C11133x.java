package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.x */
/* compiled from: PG */
public final /* synthetic */ class C11133x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11070af f36489a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f36490b;

    /* renamed from: c */
    public final /* synthetic */ C52623yp f36491c;

    /* renamed from: d */
    public final /* synthetic */ Set f36492d;

    /* renamed from: e */
    public final /* synthetic */ C51021dl f36493e;

    public /* synthetic */ C11133x(C11070af afVar, HashMap hashMap, C52623yp ypVar, Set set, C51021dl dlVar) {
        this.f36489a = afVar;
        this.f36490b = hashMap;
        this.f36491c = ypVar;
        this.f36492d = set;
        this.f36493e = dlVar;
    }

    public final Object apply(Object obj) {
        C11070af afVar = this.f36489a;
        HashMap hashMap = this.f36490b;
        C52623yp ypVar = this.f36491c;
        Set set = this.f36492d;
        C51021dl dlVar = this.f36493e;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            return afVar.mo19535b(str, (String) C58833ax.m90833j((String) hashMap.get(str)).mo56109e(str));
        }
        boolean isEmpty = set.isEmpty();
        String str2 = BuildConfig.FLAVOR;
        if (isEmpty) {
            return afVar.mo19537d((String) afVar.f36334c.mo19588s().mo56109e(str2));
        }
        if (set.size() == 1) {
            String str3 = (String) C58557jl.m90133n(set);
            C51027dr a = dlVar.mo53500a(0);
            if (a.f132855b == 2) {
                str2 = (String) a.f132856c;
            }
            return afVar.mo19535b(str3, str2);
        }
        afVar.mo19547n(ypVar, (C51030du) dlVar.build(), 7);
        afVar.mo19546m(C51401gi.CONTACT_ENDPOINT_SELECTION);
        return C58833ax.m90834k(afVar.mo19534a(false));
    }
}
