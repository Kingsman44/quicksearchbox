package com.google.android.libraries.search.p2476a.p2479c;

import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.a.c.e */
/* compiled from: PG */
public final class C32204e {

    /* renamed from: a */
    public final C46175b f86413a;

    /* renamed from: b */
    public final Executor f86414b;

    /* renamed from: c */
    private final C46128f f86415c;

    /* renamed from: d */
    private final C46194e f86416d;

    public C32204e(C46128f fVar, C46175b bVar, Executor executor, C46194e eVar) {
        this.f86415c = fVar;
        this.f86413a = bVar;
        this.f86414b = executor;
        this.f86416d = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo37990a(String str) {
        C60870cx cxVar;
        if (str == null) {
            cxVar = this.f86416d.mo50254a();
        } else {
            cxVar = this.f86415c.mo50216c(str);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C32203d(this), this.f86414b);
    }
}
