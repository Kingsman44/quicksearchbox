package com.google.android.apps.search.googleapp.saves.p10387a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.saves.a.d */
/* compiled from: PG */
public final class C137188d {

    /* renamed from: a */
    public static final long f373302a = Duration.ofHours(1).toMillis();

    /* renamed from: b */
    public final C21370a f373303b;

    /* renamed from: c */
    public final C42876ab f373304c;

    public C137188d(C21370a aVar, C42876ab abVar) {
        this.f373303b = aVar;
        this.f373304c = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo113590a() {
        C60870cx d = this.f373304c.mo46042d();
        C137186b bVar = new C137186b(this);
        return C60922j.m93044g(d, C47810es.m84963c(bVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo113591b(C57578av avVar) {
        return this.f373304c.mo46039a(new C137187c(this, avVar), C60826bg.f164896a);
    }
}
