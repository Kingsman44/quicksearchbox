package com.google.android.libraries.social.populous.p3289c.p3293d.p3294a;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42244l;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.frameworks.client.data.android.p4643j.C61513a;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.social.populous.c.d.a.i */
/* compiled from: PG */
final class C42230i extends C70162az {

    /* renamed from: a */
    final /* synthetic */ C42231j f110568a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42230i(C42231j jVar, C70897l lVar) {
        super(lVar);
        this.f110568a = jVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        long j;
        try {
            C42231j jVar = this.f110568a;
            C61513a aVar = jVar.f110569a;
            if (!(aVar == null || jVar.f110570b == null)) {
                C58485gu b = aVar.mo58100b();
                C58485gu c = this.f110568a.f110569a.mo58101c();
                C42244l lVar = this.f110568a.f110570b;
                long j2 = -1;
                if (b.isEmpty()) {
                    j = -1;
                } else {
                    j = ((Long) C58557jl.m90131l(b)).longValue();
                }
                lVar.f110593b = j;
                C42244l lVar2 = this.f110568a.f110570b;
                if (!c.isEmpty()) {
                    j2 = ((Long) C58557jl.m90131l(c)).longValue();
                }
                lVar2.f110594c = j2;
                C42231j jVar2 = this.f110568a;
                jVar2.f110570b.f110595d = (long) jVar2.f110569a.mo58099a();
            }
        } finally {
            this.f187015b.mo27484b(status, deVar);
        }
    }
}
