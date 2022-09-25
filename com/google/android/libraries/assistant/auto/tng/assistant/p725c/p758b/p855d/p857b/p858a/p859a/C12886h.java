package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.b.a.a.h */
/* compiled from: PG */
public final class C12886h {

    /* renamed from: a */
    public final C42876ab f40145a;

    /* renamed from: b */
    public final Executor f40146b;

    /* renamed from: c */
    public final Executor f40147c;

    /* renamed from: d */
    public C60870cx f40148d = C60866ct.f164955a;

    public C12886h(C42876ab abVar, Executor executor) {
        this.f40145a = abVar;
        this.f40146b = executor;
        this.f40147c = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20836a(C58817ah ahVar) {
        C12885g gVar = new C12885g(this, ahVar);
        return C60856cj.m92905n(C47810es.m84965e(gVar), this.f40147c);
    }
}
