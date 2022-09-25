package com.google.apps.tiktok.account.api.controller;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.api.controller.ae */
/* compiled from: PG */
public final /* synthetic */ class C45967ae implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C45974al f120801a;

    public /* synthetic */ C45967ae(C45974al alVar) {
        this.f120801a = alVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58485gu j;
        C60870cx cxVar;
        C45974al alVar = this.f120801a;
        synchronized (alVar.f120811b) {
            j = C58485gu.m89842j(alVar.f120811b);
        }
        ArrayList arrayList = new ArrayList(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            try {
                cxVar = ((C45965ac) j.get(i)).mo50099g();
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C45974al.f120810a.mo56225c()).mo56382g(th)).mo56372aa(54684)).mo56386p("OnRequirementStateChanged observer failed.");
                cxVar = C60866ct.f164955a;
            }
            arrayList.add(cxVar);
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
