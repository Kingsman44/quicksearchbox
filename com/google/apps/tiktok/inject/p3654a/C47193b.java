package com.google.apps.tiktok.inject.p3654a;

import android.os.Bundle;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.inject.a.b */
/* compiled from: PG */
final class C47193b extends C2319a {

    /* renamed from: a */
    final /* synthetic */ C47183a f122848a;

    /* renamed from: b */
    private final AccountId f122849b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47193b(C47183a aVar, AccountId accountId) {
        super(aVar.f122841b, (Bundle) null);
        this.f122848a = aVar;
        this.f122849b = accountId;
    }

    /* renamed from: d */
    public final C2358bf mo5722d(Class cls, C2344as asVar) {
        C58838bb.m90883r(cls.equals(C47194c.class));
        return new C47194c(asVar, this.f122848a.f122840a, this.f122849b);
    }
}
