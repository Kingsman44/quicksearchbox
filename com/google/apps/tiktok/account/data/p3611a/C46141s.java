package com.google.apps.tiktok.account.data.p3611a;

import android.accounts.Account;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.a.s */
/* compiled from: PG */
public final /* synthetic */ class C46141s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121042a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121043b;

    public /* synthetic */ C46141s(C60870cx cxVar, C60870cx cxVar2) {
        this.f121042a = cxVar;
        this.f121043b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f121042a;
        C60870cx cxVar2 = this.f121043b;
        HashSet<String> g = C58758qx.m90649g(r2);
        for (Account account : (Account[]) C60856cj.m92909r(cxVar)) {
            if (!"Android Enterprise".equals(account.name)) {
                g.add(account.name);
            }
        }
        HashSet g2 = C58758qx.m90649g(r1);
        for (Account account2 : (Account[]) C60856cj.m92909r(cxVar2)) {
            g2.add(account2.name);
        }
        C58490gz gzVar = new C58490gz(4);
        for (String str : g) {
            gzVar.mo55429h(str, Boolean.valueOf(g2.contains(str)));
        }
        return gzVar.mo55427f(true);
    }
}
