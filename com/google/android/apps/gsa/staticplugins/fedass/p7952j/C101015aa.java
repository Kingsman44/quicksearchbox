package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.fedass.p7945d.C100836o;
import com.google.android.apps.gsa.staticplugins.fedass.p7945d.C100838q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.aa */
/* compiled from: PG */
public final /* synthetic */ class C101015aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101019ae f282116a;

    /* renamed from: b */
    public final /* synthetic */ Account f282117b;

    public /* synthetic */ C101015aa(C101019ae aeVar, Account account) {
        this.f282116a = aeVar;
        this.f282117b = account;
    }

    public final C60870cx apply(Object obj) {
        C101019ae aeVar = this.f282116a;
        Account account = this.f282117b;
        Void voidR = (Void) obj;
        String str = account == null ? null : account.name;
        C100838q qVar = (C100838q) aeVar.f282127e.mo17428b();
        C59104x b = C100838q.f281798a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FTrainRegClassicClnt");
        ((C59052c) ((C59052c) b).mo56372aa(19579)).mo56386p("updateTrainingAccount");
        return C60856cj.m92905n(C47810es.m84965e(new C100836o(qVar, str)), qVar.f281800c);
    }
}
