package com.google.apps.tiktok.tracing.contrib.grpc;

import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.j */
/* compiled from: PG */
final class C47685j implements C70862aj {

    /* renamed from: a */
    private final C70862aj f123637a;

    /* renamed from: b */
    private final C47816ey f123638b;

    public C47685j(C70862aj ajVar, C47816ey eyVar) {
        this.f123637a = ajVar;
        this.f123638b = eyVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123638b.f123841a);
        try {
            this.f123637a.mo20121a();
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123638b.f123841a);
        try {
            this.f123637a.mo20122b(th);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123638b.f123841a);
        try {
            this.f123637a.mo20123c(obj);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }
}
