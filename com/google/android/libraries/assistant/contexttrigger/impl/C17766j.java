package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.j */
/* compiled from: PG */
public final /* synthetic */ class C17766j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17768l f51009a;

    /* renamed from: b */
    public final /* synthetic */ String f51010b;

    public /* synthetic */ C17766j(C17768l lVar, String str) {
        this.f51009a = lVar;
        this.f51010b = str;
    }

    public final C60870cx apply(Object obj) {
        C17768l lVar = this.f51009a;
        String str = this.f51010b;
        C58480gp e = C58485gu.m89837e();
        for (AccountId accountId : (Set) obj) {
            e.mo55395g(C47633f.m84733g(lVar.f51013b.mo50215b(accountId)).mo51515h(new C17765i(str, accountId), lVar.f51014c));
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
