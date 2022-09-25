package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.phenotype.client.p2420a.C31640h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.m */
/* compiled from: PG */
public final class C47059m {

    /* renamed from: a */
    private final C31639g f122650a;

    /* renamed from: b */
    private final Executor f122651b;

    public C47059m(C31639g gVar, Executor executor) {
        C69664n.m101061g(gVar, "phenotypeApi");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f122650a = gVar;
        this.f122651b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo50991a(String str, C63088z zVar, C69626l lVar) {
        if (str == null || str.length() == 0) {
            return C60866ct.f164955a;
        }
        C60870cx a = this.f122650a.mo37287a(str);
        C69664n.m101060f(a, "phenotypeApi.commitToConfiguration(snapshotToken)");
        if (zVar != null) {
            C47057k kVar = new C47057k(lVar, zVar);
            a = C60922j.m93044g(a, C47810es.m84963c(kVar), this.f122651b);
        }
        C47058l lVar2 = C47058l.f122649a;
        return C60846c.m92878g(a, C31640h.class, C47810es.m84963c(lVar2), C60826bg.f164896a);
    }
}
