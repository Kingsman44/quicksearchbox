package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import com.google.android.apps.gsa.shared.p7066m.C90079ed;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.r */
/* compiled from: PG */
public final /* synthetic */ class C99806r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99812x f279217a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f279218b;

    public /* synthetic */ C99806r(C99812x xVar, AccountId accountId) {
        this.f279217a = xVar;
        this.f279218b = accountId;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99812x xVar = this.f279217a;
        AccountId accountId = this.f279218b;
        Boolean bool = (Boolean) obj;
        if (!xVar.f279231i.mo79746e(C90079ed.f249801b)) {
            return xVar.mo91598f();
        }
        return bool.booleanValue() ? xVar.mo91599g(accountId) : xVar.mo91597e(accountId);
    }
}
