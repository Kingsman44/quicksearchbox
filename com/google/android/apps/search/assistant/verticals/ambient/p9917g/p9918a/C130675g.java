package com.google.android.apps.search.assistant.verticals.ambient.p9917g.p9918a;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.Supplier;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.a.g */
/* compiled from: PG */
final class C130675g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f357832a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f357833b;

    /* renamed from: c */
    final /* synthetic */ Supplier f357834c;

    /* renamed from: d */
    final /* synthetic */ C130676h f357835d;

    public C130675g(C130676h hVar, String str, C70862aj ajVar, Supplier supplier) {
        this.f357835d = hVar;
        this.f357832a = str;
        this.f357833b = ajVar;
        this.f357834c = supplier;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f357835d.f357836a.mo56226d()).mo56382g(th)).mo56372aa(38946)).mo56389s("%s failed.", this.f357832a);
        this.f357833b.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C58970a) ((C58970a) this.f357835d.f357836a.mo56224b()).mo56372aa(38947)).mo56389s("%s successful.", this.f357832a);
        this.f357833b.mo20123c(this.f357834c.get());
        this.f357833b.mo20121a();
    }
}
