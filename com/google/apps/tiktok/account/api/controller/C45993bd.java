package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.api.controller.bd */
/* compiled from: PG */
public final /* synthetic */ class C45993bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46003bn f120823a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120824b;

    /* renamed from: c */
    public final /* synthetic */ List f120825c;

    /* renamed from: d */
    public final /* synthetic */ Intent f120826d;

    public /* synthetic */ C45993bd(C46003bn bnVar, AccountId accountId, List list, Intent intent) {
        this.f120823a = bnVar;
        this.f120824b = accountId;
        this.f120825c = list;
        this.f120826d = intent;
    }

    public final C60870cx apply(Object obj) {
        return this.f120823a.mo50138c(this.f120824b, this.f120825c, this.f120826d);
    }
}
