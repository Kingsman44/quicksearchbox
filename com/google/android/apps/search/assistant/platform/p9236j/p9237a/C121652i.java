package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$performDirectAction$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {79, 81})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.i */
/* compiled from: PG */
final class C121652i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337524a;

    /* renamed from: b */
    Object f337525b;

    /* renamed from: c */
    int f337526c;

    /* renamed from: d */
    final /* synthetic */ DirectAction f337527d;

    /* renamed from: e */
    final /* synthetic */ Bundle f337528e;

    /* renamed from: f */
    final /* synthetic */ C121655l f337529f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121652i(DirectAction directAction, Bundle bundle, C121655l lVar, C69577g gVar) {
        super(2, gVar);
        this.f337527d = directAction;
        this.f337528e = bundle;
        this.f337529f = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121652i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: io.grpc.n[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f337526c
            java.lang.String r2 = "BUNDLE_KEYS"
            r3 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 == r3) goto L_0x000f
            p5462h.C69714l.m101134b(r7)
            goto L_0x0070
        L_0x000f:
            java.lang.Object r1 = r6.f337525b
            java.lang.Object r4 = r6.f337524a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0048
        L_0x0017:
            p5462h.C69714l.m101134b(r7)
            io.grpc.de r7 = new io.grpc.de
            r7.<init>()
            com.google.frameworks.client.data.android.server.a.a.e r1 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337377b
            java.lang.String r4 = "DIRECT_ACTION_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            android.app.DirectAction r4 = r6.f337527d
            com.google.frameworks.client.data.android.server.p4646a.p4647a.C61538b.m94270a(r1, r4, r7)
            com.google.frameworks.client.data.android.server.a.a.e r1 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337376a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            android.os.Bundle r4 = r6.f337528e
            com.google.frameworks.client.data.android.server.p4646a.p4647a.C61538b.m94270a(r1, r4, r7)
            io.grpc.i.r r4 = new io.grpc.i.r
            r4.<init>(r7)
            com.google.android.apps.search.assistant.platform.j.a.l r1 = r6.f337529f
            r6.f337524a = r4
            r6.f337525b = r1
            r6.f337526c = r3
            java.lang.Object r7 = r1.mo105282g(r6)
            if (r7 == r0) goto L_0x007c
        L_0x0048:
            com.google.android.apps.search.assistant.platform.j.a.df r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121633df) r7
            io.grpc.n[] r3 = new p5488io.grpc.C70899n[r3]
            r5 = 0
            r3[r5] = r4
            io.grpc.i.e r7 = r7.mo62576o(r3)
            java.lang.String r3 = "getProcessAwareStub()\n  …Interceptors(interceptor)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            io.grpc.f.b r7 = (p5488io.grpc.p5526f.C70736b) r7
            com.google.android.apps.search.assistant.platform.j.a.h r3 = new com.google.android.apps.search.assistant.platform.j.a.h
            r4 = 0
            r3.<init>(r4)
            r6.f337524a = r4
            r6.f337525b = r4
            r4 = 2
            r6.f337526c = r4
            com.google.android.apps.search.assistant.platform.j.a.l r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121655l) r1
            java.lang.Object r7 = r1.mo105281f(r7, r3, r6)
            if (r7 != r0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.bo.a.a.a.i r7 = (com.google.p4238bo.p4239a.p4240a.p4241a.C56125i) r7
            com.google.frameworks.client.data.android.server.a.a.e r0 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337376a
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            android.os.Parcelable r7 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94279f(r7, r0)
            return r7
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121652i.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121652i(this.f337527d, this.f337528e, this.f337529f, gVar);
    }
}
