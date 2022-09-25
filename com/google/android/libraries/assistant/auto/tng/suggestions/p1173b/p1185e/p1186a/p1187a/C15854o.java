package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.p1187a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.C15839a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.o */
/* compiled from: PG */
public final class C15854o implements C15839a {

    /* renamed from: a */
    public static final C59071e f47096a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.o");

    /* renamed from: b */
    public final Executor f47097b;

    /* renamed from: c */
    public final Executor f47098c;

    /* renamed from: d */
    public final Context f47099d;

    /* renamed from: e */
    public final C13213i f47100e;

    /* renamed from: f */
    public final AccountId f47101f;

    /* renamed from: g */
    public Optional f47102g;

    /* renamed from: h */
    public C58485gu f47103h = C58485gu.m89845m();

    /* renamed from: i */
    public C60870cx f47104i = C60856cj.m92900i(false);

    /* renamed from: j */
    final Optional f47105j;

    public C15854o(AccountId accountId, Context context, Executor executor, C13213i iVar) {
        this.f47097b = new C60904dr(executor);
        this.f47105j = Optional.empty();
        this.f47098c = executor;
        this.f47099d = context;
        this.f47100e = iVar;
        this.f47101f = accountId;
        this.f47102g = Optional.empty();
    }

    /* renamed from: a */
    public final C60870cx mo22586a(C58485gu guVar) {
        C15848i iVar = new C15848i(this, guVar);
        return C60856cj.m92905n(C47810es.m84965e(iVar), this.f47097b);
    }
}
