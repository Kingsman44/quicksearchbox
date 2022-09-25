package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.l */
/* compiled from: PG */
public final class C17602l implements C17597g {

    /* renamed from: a */
    public static final C59071e f50711a = C59071e.m91332i("com.google.android.libraries.assistant.c.h.a.a.l");

    /* renamed from: b */
    public final C70862aj f50712b;

    /* renamed from: c */
    public boolean f50713c;

    /* renamed from: d */
    private final Executor f50714d;

    public C17602l(Executor executor, C70862aj ajVar) {
        this.f50714d = new C60904dr(executor);
        this.f50712b = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f50714d.execute(C47810es.m84977q(new C17599i(this)));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f50714d.execute(C47810es.m84977q(new C17601k(this, th)));
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        this.f50714d.execute(C47810es.m84977q(new C17600j(this, obj)));
    }
}
