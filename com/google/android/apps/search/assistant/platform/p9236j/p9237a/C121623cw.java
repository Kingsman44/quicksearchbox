package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cw */
/* compiled from: PG */
public final class C121623cw extends C121630dc {

    /* renamed from: a */
    public final C121669z f337472a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121623cw(C69585o oVar, C121669z zVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(zVar, "directActionsBackend");
        this.f337472a = zVar;
    }

    /* renamed from: c */
    public final C71587n mo105272c(C121552af afVar) {
        C69664n.m101061g(afVar, "request");
        return C71590q.m104504a(new C121618cr(this, (C69577g) null));
    }

    /* renamed from: d */
    public final C71587n mo105273d(C121556aj ajVar) {
        C69664n.m101061g(ajVar, "request");
        return C71590q.m104504a(new C121620ct(this, (C69577g) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105271b(com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121564ar r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121622cv
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.a.cv r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121622cv) r0
            int r1 = r0.f337471c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337471c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.a.cv r0 = new com.google.android.apps.search.assistant.platform.j.a.cv
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f337469a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337471c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0048
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.platform.j.a.z r6 = r4.f337472a
            java.lang.String r5 = r5.f337319b
            com.google.common.util.concurrent.cx r5 = r6.mo105268e(r5)
            java.lang.String r6 = "directActionsBackend.req…tions(request.activityId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f337471c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.google.android.libraries.search.assistant.invocation.utils.ParcelableList r5 = com.google.android.libraries.search.assistant.invocation.utils.ParcelableList.m63448a(r6)
            com.google.frameworks.client.data.android.server.a.a.e r6 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337378c
            java.lang.String r0 = "DIRECT_ACTION_LIST_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94280g(r6, r5)
            com.google.android.apps.search.assistant.platform.j.a.at r5 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121566at.f337321a
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.assistant.platform.j.a.as r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121565as) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.String r6 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            com.google.protobuf.bv r5 = r5.build()
            java.lang.String r6 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.apps.search.assistant.platform.j.a.at r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121566at) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121623cw.mo105271b(com.google.android.apps.search.assistant.platform.j.a.ar, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105274e(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121621cu
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.a.cu r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121621cu) r0
            int r1 = r0.f337468c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337468c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.a.cu r0 = new com.google.android.apps.search.assistant.platform.j.a.cu
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f337466a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337468c
            java.lang.String r3 = "BUNDLE_KEYS"
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            p5462h.C69714l.m101134b(r7)
            goto L_0x0060
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.frameworks.client.data.android.server.a.a.e r7 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337377b
            java.lang.String r2 = "DIRECT_ACTION_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            android.os.Parcelable r7 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94277d(r7)
            android.app.DirectAction r7 = (android.app.DirectAction) r7
            com.google.frameworks.client.data.android.server.a.a.e r2 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337376a
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            android.os.Parcelable r2 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94277d(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.apps.search.assistant.platform.j.a.z r5 = r6.f337472a
            com.google.common.util.concurrent.cx r7 = r5.mo105267d(r7, r2)
            java.lang.String r2 = "directActionsBackend.per…ion(directAction, extras)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f337468c = r4
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            android.os.Bundle r7 = (android.os.Bundle) r7
            com.google.frameworks.client.data.android.server.a.a.e r0 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121596bw.f337376a
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94280g(r0, r7)
            com.google.android.apps.search.assistant.platform.j.a.ap r7 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121562ap.f337314a
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.assistant.platform.j.a.ao r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121561ao) r7
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            com.google.protobuf.bv r7 = r7.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            com.google.android.apps.search.assistant.platform.j.a.ap r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121562ap) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121623cw.mo105274e(h.c.g):java.lang.Object");
    }
}
