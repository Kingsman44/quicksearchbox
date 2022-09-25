package com.google.android.libraries.search.p3005i.p3007b;

import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.search.i.b.h */
/* compiled from: PG */
final class C38431h implements C47352j {

    /* renamed from: a */
    public final String f101724a;

    /* renamed from: b */
    public final C58528ij f101725b;

    /* renamed from: c */
    public final C38424a f101726c;

    /* renamed from: d */
    private final C46175b f101727d;

    /* renamed from: e */
    private final ExecutorService f101728e;

    public C38431h(String str, C58528ij ijVar, C38424a aVar, C46175b bVar, ExecutorService executorService) {
        this.f101724a = str;
        this.f101725b = ijVar;
        this.f101726c = aVar;
        this.f101727d = bVar;
        this.f101728e = executorService;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        return C60922j.m93045h(this.f101727d.mo50248e(), C47810es.m84966f(new C38430g(this)), this.f101728e);
    }
}
