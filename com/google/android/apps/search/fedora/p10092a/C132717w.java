package com.google.android.apps.search.fedora.p10092a;

import com.google.android.p10905k.C146602a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.device.C46201e;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.fedora.a.w */
/* compiled from: PG */
public final class C132717w {

    /* renamed from: a */
    public static final C59071e f362141a = C59071e.m91332i("com.google.android.apps.search.fedora.a.w");

    /* renamed from: b */
    public final C46175b f362142b;

    /* renamed from: c */
    public final C46128f f362143c;

    /* renamed from: d */
    public final C46201e f362144d;

    /* renamed from: e */
    public final Executor f362145e;

    public C132717w(C46175b bVar, C46128f fVar, C46201e eVar, Executor executor) {
        this.f362142b = bVar;
        this.f362143c = fVar;
        this.f362144d = eVar;
        this.f362145e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo110891a(AccountId accountId, String str) {
        String a = C146602a.m238836a(str);
        C132706l lVar = new C132706l(this, accountId);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(lVar), this.f362145e)).mo51516i(new C132707m(this, a), this.f362145e);
    }

    /* renamed from: b */
    public final C60870cx mo110892b(AccountId accountId) {
        C132713s sVar = new C132713s(this, accountId);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(sVar), this.f362145e)).mo51515h(C132714t.f362137a, this.f362145e);
    }
}
