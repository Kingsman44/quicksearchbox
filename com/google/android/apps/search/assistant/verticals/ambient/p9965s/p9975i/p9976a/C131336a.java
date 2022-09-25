package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i.p9976a;

import android.accounts.AccountManager;
import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C131336a implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ boolean f359047a;

    /* renamed from: b */
    public final /* synthetic */ Context f359048b;

    /* renamed from: c */
    public final /* synthetic */ C46128f f359049c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f359050d;

    /* renamed from: e */
    public final /* synthetic */ ExecutorService f359051e;

    public /* synthetic */ C131336a(boolean z, Context context, C46128f fVar, AccountId accountId, ExecutorService executorService) {
        this.f359047a = z;
        this.f359048b = context;
        this.f359049c = fVar;
        this.f359050d = accountId;
        this.f359051e = executorService;
    }

    public final Object get() {
        boolean z = this.f359047a;
        Context context = this.f359048b;
        C46128f fVar = this.f359049c;
        AccountId accountId = this.f359050d;
        ExecutorService executorService = this.f359051e;
        if (z) {
            return C60856cj.m92900i(C58485gu.m89844l(AccountManager.get(context).getAccounts()));
        }
        return C60922j.m93044g(fVar.mo50214a(accountId), C47810es.m84963c(C131337b.f359052a), executorService);
    }
}
