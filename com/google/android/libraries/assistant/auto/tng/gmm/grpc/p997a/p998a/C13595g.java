package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a;

import com.google.android.libraries.assistant.auto.tng.assistant.p718a.C11951a;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13601c;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13604f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.g */
/* compiled from: PG */
public final class C13595g {

    /* renamed from: a */
    public static final C59071e f41610a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.g");

    /* renamed from: b */
    public final C13604f f41611b;

    /* renamed from: c */
    public final C13594f f41612c = new C13594f(this);

    /* renamed from: d */
    public final Executor f41613d;

    /* renamed from: e */
    public final C11951a f41614e;

    public C13595g(C13604f fVar, Executor executor, C11951a aVar) {
        this.f41611b = fVar;
        this.f41613d = new C60904dr(executor);
        this.f41614e = aVar;
    }

    /* renamed from: a */
    public final void mo21181a(C70862aj ajVar, Long l) {
        this.f41614e.mo20327c(l);
        try {
            ajVar.mo20121a();
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f41610a.mo56224b()).mo56382g(e)).mo56372aa(45128)).mo56384n();
        }
    }

    /* renamed from: b */
    public final void mo21182b() {
        this.f41613d.execute(C47810es.m84977q(new C13591c(this)));
    }

    /* renamed from: c */
    public final void mo21183c(C13601c cVar) {
        this.f41613d.execute(C47810es.m84977q(new C13592d(this, cVar)));
    }
}
