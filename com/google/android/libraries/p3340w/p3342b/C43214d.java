package com.google.android.libraries.p3340w.p3342b;

import android.os.SystemClock;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.w.b.d */
/* compiled from: PG */
final class C43214d extends C70162az {

    /* renamed from: a */
    final /* synthetic */ C43215e f112938a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43214d(C43215e eVar, C70897l lVar) {
        super(lVar);
        this.f112938a = eVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        C43218h hVar = this.f112938a.f112939a;
        synchronized (hVar.f112945a) {
            if (!hVar.f112947c) {
                hVar.f112947c = true;
                C43216f fVar = hVar.f112946b;
                if (fVar == null) {
                    hVar.f112948d.f84683s = status.getCode().value();
                    C31167ax.m58112a().mo36913d(hVar.f112948d);
                } else {
                    synchronized (fVar.f112940a) {
                        C31447f fVar2 = fVar.f112941b;
                        int i = fVar.f112943d;
                        int i2 = fVar.f112944e;
                        fVar2.f84667c = SystemClock.elapsedRealtime() - fVar2.f84665a;
                        fVar2.f84668d = i;
                        fVar2.f84669e = i2;
                        fVar.f112941b.f84683s = status.getCode().value();
                        C31167ax.m58112a().mo36913d(fVar.f112941b);
                        fVar.f112942c = true;
                    }
                }
            }
        }
        this.f187015b.mo27484b(status, deVar);
    }
}
