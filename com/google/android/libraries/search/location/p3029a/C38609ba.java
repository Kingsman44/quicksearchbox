package com.google.android.libraries.search.location.p3029a;

import android.accounts.Account;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C38609ba implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102041a;

    /* renamed from: b */
    public final /* synthetic */ boolean f102042b;

    /* renamed from: c */
    public final /* synthetic */ Account f102043c;

    public /* synthetic */ C38609ba(C38622bn bnVar, boolean z, Account account) {
        this.f102041a = bnVar;
        this.f102042b = z;
        this.f102043c = account;
    }

    public final C60870cx apply(Object obj) {
        C38622bn bnVar = this.f102041a;
        boolean z = this.f102042b;
        Account account = this.f102043c;
        Integer num = (Integer) obj;
        if (num.intValue() == 6) {
            return z ? C47633f.m84733g(C60856cj.m92899h(new C38618bj())) : bnVar.mo41525e(account, true);
        }
        return C47633f.m84733g(C60856cj.m92900i(num));
    }
}
