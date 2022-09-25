package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import android.databinding.C0118a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.al */
/* compiled from: PG */
final class C15704al implements C70862aj {

    /* renamed from: a */
    public final C59071e f46849a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.d.d.al");

    /* renamed from: b */
    public C57982a f46850b = new C57982a();

    /* renamed from: c */
    final /* synthetic */ C15706an f46851c;

    public C15704al(C15706an anVar) {
        this.f46851c = anVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) ((C59052c) this.f46849a.mo56224b()).mo56372aa(46286)).mo56386p("#onCompleted");
        Executor executor = this.f46851c.f46859h;
        C57982a aVar = this.f46850b;
        Objects.requireNonNull(aVar);
        executor.execute(C47810es.m84977q(new C15702aj(aVar)));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) this.f46849a.mo56224b()).mo56382g(th)).mo56372aa(46287)).mo56386p("#onError");
        this.f46851c.f46859h.execute(C47810es.m84977q(new C15700ah(this, th)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        this.f46851c.f46859h.execute(C47810es.m84977q(new C15701ai(this, (C67087ko) obj)));
    }

    /* renamed from: d */
    public final void mo22513d() {
        C0118a.m96d(this.f46849a.mo56224b(), "#closeAndRecreateChannel", 46284, C58979ad.SMALL);
        this.f46851c.f46859h.execute(C47810es.m84977q(new C15703ak(this)));
    }
}
