package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121986bu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.at */
/* compiled from: PG */
public final class C122010at extends C121999ai {

    /* renamed from: a */
    private final C121986bu f338542a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122010at(C69585o oVar, C71422aw awVar, C121986bu buVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(buVar, "visTokenApiBackend");
        this.f338542a = buVar;
    }

    /* renamed from: b */
    public final C71587n mo105514b(C122028k kVar) {
        C69664n.m101061g(kVar, "request");
        C58976aa aaVar = C58975e.f156826a;
        return new C122004an(C71536cm.m104384b(this.f338542a.mo105422y(), new C122005ao((C69577g) null)));
    }

    /* renamed from: c */
    public final C71587n mo105515c(C122033p pVar) {
        C69664n.m101061g(pVar, "request");
        C58976aa aaVar = C58975e.f156826a;
        return new C122008ar(C71536cm.m104384b(this.f338542a.mo105423z(), new C122009as((C69577g) null)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105516d(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122001ak
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.c.ak r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122001ak) r0
            int r1 = r0.f338529c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338529c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.c.ak r0 = new com.google.android.apps.search.assistant.platform.j.b.c.c.ak
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f338527a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338529c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r5)     // Catch:{ TimeoutException -> 0x0027 }
            goto L_0x0040
        L_0x0027:
            r5 = move-exception
            goto L_0x0070
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.platform.j.b.c.bu r5 = r4.f338542a     // Catch:{ TimeoutException -> 0x0027 }
            r0.f338529c = r3     // Catch:{ TimeoutException -> 0x0027 }
            java.lang.Object r5 = r5.mo105416g(r0)     // Catch:{ TimeoutException -> 0x0027 }
            if (r5 == r1) goto L_0x006f
        L_0x0040:
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ TimeoutException -> 0x0027 }
            com.google.frameworks.client.data.android.server.a.a.e r0 = com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a.f89620e     // Catch:{ TimeoutException -> 0x0027 }
            java.lang.String r1 = "BINDER_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ TimeoutException -> 0x0027 }
            com.google.android.libraries.search.assistant.invocation.android.parcelables.IBinderContainer r1 = new com.google.android.libraries.search.assistant.invocation.android.parcelables.IBinderContainer     // Catch:{ TimeoutException -> 0x0027 }
            r1.<init>(r5)     // Catch:{ TimeoutException -> 0x0027 }
            com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94280g(r0, r1)     // Catch:{ TimeoutException -> 0x0027 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.f r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122023f.f338557a     // Catch:{ TimeoutException -> 0x0027 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ TimeoutException -> 0x0027 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.e r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122022e) r5     // Catch:{ TimeoutException -> 0x0027 }
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)     // Catch:{ TimeoutException -> 0x0027 }
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ TimeoutException -> 0x0027 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ TimeoutException -> 0x0027 }
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)     // Catch:{ TimeoutException -> 0x0027 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.f r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122023f) r5     // Catch:{ TimeoutException -> 0x0027 }
            return r5
        L_0x006f:
            return r1
        L_0x0070:
            java.lang.String r0 = "ApaVisTokenServiceImpl#getVisToken"
            io.grpc.fa r5 = com.google.android.libraries.search.assistant.invocation.utils.C34722f.m63458a(r5, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122010at.mo105516d(h.c.g):java.lang.Object");
    }
}
