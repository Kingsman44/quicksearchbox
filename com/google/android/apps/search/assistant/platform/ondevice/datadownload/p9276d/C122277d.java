package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.d */
/* compiled from: PG */
public final class C122277d {

    /* renamed from: a */
    public final AccountId f339063a;

    /* renamed from: b */
    public final C46128f f339064b;

    /* renamed from: c */
    public final C60887da f339065c;

    /* renamed from: d */
    private final C46194e f339066d;

    public C122277d(AccountId accountId, C46128f fVar, C46194e eVar, C60887da daVar) {
        this.f339063a = accountId;
        this.f339064b = fVar;
        this.f339066d = eVar;
        this.f339065c = daVar;
    }

    /* renamed from: b */
    static String m201791b(C58833ax axVar) {
        return true != axVar.mo56113h() ? "without account" : "with account";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo105583a() {
        C60870cx a = this.f339066d.mo50254a();
        C122214a aVar = new C122214a(this);
        return C60922j.m93045h(a, C47810es.m84966f(aVar), this.f339065c);
    }
}
