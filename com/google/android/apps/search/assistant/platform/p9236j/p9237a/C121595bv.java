package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.utils.C34722f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.bv */
/* compiled from: PG */
public final class C121595bv extends C121659p {

    /* renamed from: a */
    private final Executor f337374a;

    /* renamed from: b */
    private final C121669z f337375b;

    public C121595bv(Executor executor, C121669z zVar) {
        this.f337374a = new C60904dr(executor);
        this.f337375b = zVar;
    }

    /* renamed from: b */
    public final void mo105255b(C121548ab abVar, C70862aj ajVar) {
        C121669z zVar = this.f337375b;
        C34053bp bpVar = abVar.f337290b;
        if (bpVar == null) {
            bpVar = C34053bp.f90753a;
        }
        C34037b a = C34037b.m62690a(abVar.f337289a);
        if (a == null) {
            a = C34037b.UNRECOGNIZED;
        }
        C34722f.m63459b(zVar.mo105264a(bpVar, a), ajVar, C121587bn.f337366a, "DirectActionsBackend#getForegroundActivityId", this.f337374a);
    }

    /* renamed from: c */
    public final void mo105256c(C121564ar arVar, C70862aj ajVar) {
        C34722f.m63459b(this.f337375b.mo105268e(arVar.f337319b), ajVar, C121588bo.f337367a, "DirectActionsBackend#requestDirectActions", this.f337374a);
    }

    /* renamed from: d */
    public final void mo105257d(C70862aj ajVar) {
        C60870cx b = this.f337375b.mo105265b(new C121590bq(ajVar));
        ((C70883v) ajVar).mo62583d(new C121591br(b));
        C121592bs bsVar = new C121592bs(ajVar);
        C60856cj.m92911t(b, C47810es.m84974n(bsVar), this.f337374a);
    }

    /* renamed from: e */
    public final void mo105258e(C70862aj ajVar) {
        C60870cx c = this.f337375b.mo105266c(new C121593bt(ajVar));
        ((C70883v) ajVar).mo62583d(new C121586bm(c));
        C121594bu buVar = new C121594bu(ajVar);
        C60856cj.m92911t(c, C47810es.m84974n(buVar), this.f337374a);
    }

    /* renamed from: f */
    public final void mo105259f(C70862aj ajVar) {
        C34722f.m63459b(this.f337375b.mo105267d((DirectAction) C61543g.m94274a(C121596bw.f337377b), (Bundle) C61543g.m94274a(C121596bw.f337376a)), ajVar, C121589bp.f337368a, "DirectActionsBackend#performDirectAction", this.f337374a);
    }
}
