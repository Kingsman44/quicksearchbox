package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p781a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.C12315d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.a.g */
/* compiled from: PG */
public final class C12294g implements C12315d {

    /* renamed from: a */
    private static final C59071e f39082a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.a.g");

    /* renamed from: b */
    private final C12283a f39083b;

    /* renamed from: c */
    private final Executor f39084c;

    public C12294g(C12283a aVar, Executor executor) {
        this.f39083b = aVar;
        this.f39084c = executor;
    }

    /* renamed from: d */
    private final C60870cx m28268d(C60870cx cxVar, C58817ah ahVar) {
        cxVar.cancel(false);
        return C60922j.m93044g(cxVar, C47810es.m84963c(ahVar), this.f39084c);
    }

    /* renamed from: a */
    public final C60870cx mo20538a() {
        ((C59052c) ((C59052c) f39082a.mo56224b()).mo56372aa(44165)).mo56386p("#cancel");
        return C60856cj.m92901j(C47638k.m84751b(m28268d(this.f39083b.mo20535e(), C12291d.f39079a), m28268d(this.f39083b.mo20532b(), C12292e.f39080a)).mo51520a(C12293f.f39081a, this.f39084c));
    }

    /* renamed from: b */
    public final C60870cx mo20539b() {
        return this.f39083b.mo20534d();
    }

    /* renamed from: c */
    public final C60870cx mo20540c() {
        return this.f39083b.mo20533c();
    }
}
