package com.google.android.apps.gsa.voiceinteraction.p8866a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89852b;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.android.libraries.search.p2871b.p2902o.C37310c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.a.f */
/* compiled from: PG */
final class C118706f implements C37310c {

    /* renamed from: a */
    final /* synthetic */ C46128f f331124a;

    /* renamed from: b */
    final /* synthetic */ AccountId f331125b;

    /* renamed from: c */
    final /* synthetic */ C89852b f331126c;

    /* renamed from: d */
    final /* synthetic */ Executor f331127d;

    public C118706f(C46128f fVar, AccountId accountId, C89852b bVar, Executor executor) {
        this.f331124a = fVar;
        this.f331125b = accountId;
        this.f331126c = bVar;
        this.f331127d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40859a(C37309b bVar) {
        C60870cx b = this.f331124a.mo50215b(this.f331125b);
        C118705e eVar = new C118705e(this.f331126c, bVar);
        return C60922j.m93045h(b, C47810es.m84966f(eVar), this.f331127d);
    }
}
