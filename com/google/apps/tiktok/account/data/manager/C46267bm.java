package com.google.apps.tiktok.account.data.manager;

import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.WeakHashMap;

/* renamed from: com.google.apps.tiktok.account.data.manager.bm */
/* compiled from: PG */
public final /* synthetic */ class C46267bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ AccountId f121252a;

    public /* synthetic */ C46267bm(AccountId accountId) {
        this.f121252a = accountId;
    }

    public final C60870cx apply(Object obj) {
        AccountId accountId = this.f121252a;
        WeakHashMap weakHashMap = C47831fm.f123851a;
        return C2169h.m6027a(new C46263bi((C46278bx) obj, accountId));
    }
}
