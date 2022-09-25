package com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a;

import com.google.android.libraries.phenotype.client.p2420a.C31636d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.k */
/* compiled from: PG */
public final /* synthetic */ class C32038k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C32039l f86088a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f86089b;

    public /* synthetic */ C32038k(C32039l lVar, C58485gu guVar) {
        this.f86088a = lVar;
        this.f86089b = guVar;
    }

    public final Object call() {
        C32039l lVar = this.f86088a;
        C58485gu guVar = this.f86089b;
        C58539iu Q = C58541iw.m90066Q();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            try {
                C31636d dVar = (C31636d) C60856cj.m92909r((C60870cx) guVar.get(i));
                try {
                    C32036i iVar = lVar.f86093d;
                    Stream stream = Collection.EL.stream(dVar.f85121c);
                    Objects.requireNonNull(iVar.f86086a);
                    Q.mo55535n(((C58528ij) stream.map(new C32033f()).flatMap(C32034g.f86084a).flatMap(Function.CC.identity()).map(C32035h.f86085a).collect(C58370cn.f155947b)).mo55229u());
                } catch (Throwable th) {
                    ((C59052c) ((C59052c) ((C59052c) C32039l.f86090a.mo56226d()).mo56382g(th)).mo56372aa(50514)).mo56386p("Couldn't decode ExperimentToken");
                    return C32028a.f86081a;
                }
            } catch (Throwable th2) {
                ((C59052c) ((C59052c) ((C59052c) C32039l.f86090a.mo56226d()).mo56382g(th2)).mo56372aa(50515)).mo56386p("Couldn't extract ExperimentTokens");
            }
        }
        C58541iw k = Q.mo55486f();
        k.getClass();
        return new C32029b(k);
    }
}
