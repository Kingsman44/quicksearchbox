package com.google.apps.tiktok.account.data.p3611a;

import android.accounts.Account;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.apps.tiktok.account.data.a.i */
/* compiled from: PG */
public final /* synthetic */ class C46131i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46144v f121023a;

    /* renamed from: b */
    public final /* synthetic */ String f121024b;

    public /* synthetic */ C46131i(C46144v vVar, String str) {
        this.f121023a = vVar;
        this.f121024b = str;
    }

    public final C60870cx apply(Object obj) {
        C146006ab abVar;
        C46144v vVar = this.f121023a;
        String str = this.f121024b;
        ((C59052c) ((C59052c) ((C59052c) C46144v.f121047a.mo56224b()).mo56382g((C142903e) obj)).mo56372aa(54696)).mo56386p("Fast Auth.getAccountId() Failed");
        C142915o oVar = vVar.f121053g;
        try {
            abVar = C146021aq.m237850d(C142914n.m231859g(oVar.f387822a, new Account(str, "com.google"), "oauth2:https://www.googleapis.com/auth/userinfo.email"));
        } catch (C142903e | IOException e) {
            abVar = C146021aq.m237849c(e);
        }
        return C60922j.m93045h(C43205e.m76192b(abVar), C47810es.m84966f(new C46132j(vVar, str)), vVar.f121050d);
    }
}
