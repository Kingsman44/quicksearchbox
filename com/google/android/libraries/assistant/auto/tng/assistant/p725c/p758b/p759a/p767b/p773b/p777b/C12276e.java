package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.C11964a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.C12281f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.e */
/* compiled from: PG */
public final class C12276e implements C12281f {

    /* renamed from: a */
    private static final C59071e f39057a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.e");

    /* renamed from: b */
    private final C12229a f39058b;

    /* renamed from: c */
    private final C12991i f39059c;

    /* renamed from: d */
    private final C11964a f39060d;

    /* renamed from: e */
    private final Executor f39061e;

    public C12276e(C12229a aVar, C12991i iVar, C11964a aVar2, Executor executor) {
        this.f39058b = aVar;
        this.f39059c = iVar;
        this.f39060d = aVar2;
        this.f39061e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20522a() {
        ((C59052c) ((C59052c) f39057a.mo56224b()).mo56372aa(44134)).mo56386p("#cancel");
        this.f39058b.mo20509b().cancel(true);
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo20523b() {
        C60870cx d = this.f39058b.mo20511d();
        C12275d dVar = C12275d.f39056a;
        return C60922j.m93044g(d, C47810es.m84963c(dVar), this.f39061e);
    }

    /* renamed from: c */
    public final C60870cx mo20524c() {
        return this.f39060d.mo20341c(this.f39058b.mo20510c(), this.f39059c);
    }

    /* renamed from: d */
    public final C60870cx mo20525d() {
        return this.f39058b.mo20512e();
    }
}
