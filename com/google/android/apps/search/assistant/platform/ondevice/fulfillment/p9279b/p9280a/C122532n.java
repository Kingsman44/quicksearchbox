package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.n */
/* compiled from: PG */
final class C122532n implements C17597g {

    /* renamed from: a */
    public static final C59071e f339646a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.n");

    /* renamed from: b */
    public final C60887da f339647b;

    /* renamed from: c */
    public C17597g f339648c;

    /* renamed from: d */
    private final Function f339649d;

    /* renamed from: e */
    private final Executor f339650e;

    public C122532n(C60887da daVar, Function function) {
        this.f339647b = daVar;
        this.f339650e = new C60904dr(daVar);
        this.f339649d = function;
    }

    /* renamed from: a */
    public final void mo20121a() {
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C122093b bVar = (C122093b) obj;
        C47633f i = C47633f.m84733g((C60870cx) this.f339649d.apply(Integer.valueOf(bVar.f338733c))).mo51516i(new C122530l(bVar), this.f339647b);
        C122531m mVar = new C122531m(this, bVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(mVar), this.f339650e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo105660d(C70862aj ajVar) {
        this.f339650e.execute(C47810es.m84977q(new C122529k(this, ajVar)));
    }
}
