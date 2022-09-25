package com.google.apps.tiktok.account.p3604b;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.b.e */
/* compiled from: PG */
public final class C46064e {

    /* renamed from: a */
    public static final C59071e f120921a = C59071e.m91332i("com.google.apps.tiktok.account.b.e");

    /* renamed from: b */
    public final Context f120922b;

    /* renamed from: c */
    public final C46325t f120923c;

    /* renamed from: d */
    private final C60887da f120924d;

    /* renamed from: e */
    private final C60836bq f120925e = new C60836bq();

    public C46064e(Context context, C46325t tVar, C60887da daVar) {
        this.f120922b = context;
        this.f120923c = tVar;
        this.f120924d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo50181a() {
        return this.f120925e.mo57304a(new C46062c(this), this.f120924d);
    }

    /* renamed from: b */
    public final C60870cx mo50182b(Intent intent, AccountId accountId) {
        return C60922j.m93044g(C60856cj.m92897f(this.f120923c.mo50284d(accountId), mo50181a()), new C46061b(intent), C60826bg.f164896a);
    }
}
