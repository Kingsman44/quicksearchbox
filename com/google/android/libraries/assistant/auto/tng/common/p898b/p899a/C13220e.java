package com.google.android.libraries.assistant.auto.tng.common.p898b.p899a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.common.p898b.C13215a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.b.a.e */
/* compiled from: PG */
public final class C13220e implements C13215a {

    /* renamed from: a */
    public static final C59071e f40865a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.b.a.e");

    /* renamed from: b */
    public final Context f40866b;

    /* renamed from: c */
    private final C13213i f40867c;

    /* renamed from: d */
    private final AccountId f40868d;

    /* renamed from: e */
    private final Executor f40869e;

    public C13220e(C13213i iVar, AccountId accountId, Context context, Executor executor) {
        this.f40867c = iVar;
        this.f40868d = accountId;
        this.f40866b = context;
        this.f40869e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20981a() {
        return C47633f.m84733g(this.f40867c.mo20980c(this.f40868d)).mo51515h(new C13216a(this), this.f40869e).mo51516i(C13217b.f40862a, this.f40869e).mo51515h(C13218c.f40863a, this.f40869e).mo51513e(Exception.class, C13219d.f40864a, this.f40869e);
    }
}
