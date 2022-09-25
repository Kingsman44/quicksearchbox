package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.storage.p3304a.p3305a.C42714a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.search.core.udc.n */
/* compiled from: PG */
public final /* synthetic */ class C87218n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f235641a;

    public /* synthetic */ C87218n(Context context) {
        this.f235641a = context;
    }

    public final Object apply(Object obj) {
        Account account = (Account) obj;
        C42718e a = C42719f.m75461a(this.f235641a);
        C42719f.m75462b("managed");
        a.f111967b = "managed";
        C42719f.m75463c("facs");
        a.f111968c = "facs";
        C42714a.m75444b(account);
        a.f111969d = account;
        return a.mo45820a();
    }
}
