package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5127o.C65693s;
import java.util.logging.Level;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.y */
/* compiled from: PG */
final class C18279y implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C60870cx f51869a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f51870b;

    /* renamed from: c */
    final /* synthetic */ C18280z f51871c;

    public C18279y(C18280z zVar, C60870cx cxVar, C70862aj ajVar) {
        this.f51871c = zVar;
        this.f51869a = cxVar;
        this.f51870b = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C18253ak.m35566e(this.f51871c.mo23746c(C18219aw.m35484b(), this.f51869a), "onCompleted", Level.INFO, (C70862aj) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Status d = Status.m102100d(th);
        C18253ak.m35566e(this.f51871c.mo23746c(C18219aw.m35485c(d.getCode().value(), d.getDescription()), this.f51869a), "onError", Level.SEVERE, this.f51870b);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C18280z zVar = this.f51871c;
        C18253ak.m35566e(zVar.mo23745b(new C18271q(zVar, this.f51869a, (C65693s) obj), false), "onNext", Level.SEVERE, this.f51870b);
    }
}
