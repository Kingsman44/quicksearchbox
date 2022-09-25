package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.upload.requesthandler.ActionRequestHandler$sendActionsRequest$2$1$1$1", mo61344c = "ActionRequestHandler.kt", mo61345d = "invokeSuspend", mo61346e = {75, 77})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.a.d */
/* compiled from: PG */
final class C133944d extends C69572j implements C69630p {

    /* renamed from: a */
    int f364825a;

    /* renamed from: b */
    final /* synthetic */ Iterable f364826b;

    /* renamed from: c */
    final /* synthetic */ C133950j f364827c;

    /* renamed from: d */
    final /* synthetic */ int f364828d;

    /* renamed from: e */
    final /* synthetic */ C133947g f364829e;

    /* renamed from: f */
    final /* synthetic */ UUID f364830f;

    /* renamed from: g */
    final /* synthetic */ boolean f364831g;

    /* renamed from: h */
    final /* synthetic */ AtomicReference f364832h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133944d(Iterable iterable, C133950j jVar, int i, C133947g gVar, UUID uuid, boolean z, AtomicReference atomicReference, C69577g gVar2) {
        super(2, gVar2);
        this.f364826b = iterable;
        this.f364827c = jVar;
        this.f364828d = i;
        this.f364829e = gVar;
        this.f364830f = uuid;
        this.f364831g = z;
        this.f364832h = atomicReference;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133944d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x014f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f364825a
            java.lang.String r2 = "requestId"
            java.lang.String r3 = "_builder.build()"
            java.lang.String r4 = "value"
            java.lang.String r5 = "builder"
            r6 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 == r6) goto L_0x0016
            p5462h.C69714l.m101134b(r14)
            goto L_0x00ee
        L_0x0016:
            p5462h.C69714l.m101134b(r14)
            goto L_0x00de
        L_0x001b:
            p5462h.C69714l.m101134b(r14)
            java.lang.Iterable r14 = r13.f364826b
            com.google.android.apps.search.googleapp.discover.a.b.a.j r1 = r13.f364827c
            com.google.bv.e.b.c.a.w r1 = r1.f364859b
            if (r1 != 0) goto L_0x0028
            com.google.bv.e.b.c.a.w r1 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w.f153198a
        L_0x0028:
            java.lang.String r7 = "token.token"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            int r7 = r13.f364828d
            com.google.at.c.b.a.a.e r8 = com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e.f141375d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.at.c.b.a.a.d r8 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53874d) r8
            java.lang.String r9 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            com.google.protobuf.a.b r10 = new com.google.protobuf.a.b
            com.google.protobuf.bv r11 = r8.instance
            com.google.at.c.b.a.a.e r11 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e) r11
            com.google.protobuf.cq r11 = r11.f141377a
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            java.lang.String r12 = "_builder.getFeedActionsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            r10.<init>(r11)
            java.lang.String r10 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r10)
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.at.c.b.a.a.e r10 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e) r10
            com.google.protobuf.cq r11 = r10.f141377a
            boolean r12 = r11.mo58948c()
            if (r12 != 0) goto L_0x006d
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)
            r10.f141377a = r11
        L_0x006d:
            com.google.protobuf.cq r10 = r10.f141377a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.at.c.b.a.a.e r14 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e) r14
            r1.getClass()
            r14.f141378b = r1
            com.google.bv.e.b.c.a.b r14 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57245b.f152815c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bv.e.b.c.a.a r14 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57218a) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.bv.e.b.c.a.b r1 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57245b) r1
            int r9 = r1.f152817a
            r9 = r9 | r6
            r1.f152817a = r9
            r1.f152818b = r7
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r3)
            com.google.bv.e.b.c.a.b r14 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57245b) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r4)
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.at.c.b.a.a.e r1 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e) r1
            r14.getClass()
            r1.f141379c = r14
            com.google.protobuf.bv r14 = r8.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r3)
            com.google.at.c.b.a.a.e r14 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e) r14
            com.google.android.apps.search.googleapp.discover.a.b.a.g r1 = r13.f364829e
            com.google.android.apps.search.googleapp.discover.d.aj r1 = r1.f364851d
            java.util.UUID r7 = r13.f364830f
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r1.mo111618d(r7)
            com.google.android.apps.search.googleapp.discover.a.b.a.g r1 = r13.f364829e
            boolean r7 = r1.f364854g
            if (r7 == 0) goto L_0x00e2
            boolean r7 = r13.f364831g
            if (r7 == 0) goto L_0x00e2
            com.google.android.apps.search.googleapp.discover.u.e r1 = r1.f364848a
            r13.f364825a = r6
            java.lang.Object r14 = r1.mo112115a(r14, r13)
            if (r14 == r0) goto L_0x00e1
        L_0x00de:
            com.google.at.c.b.a.a.g r14 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53877g) r14
            goto L_0x00f0
        L_0x00e1:
            return r0
        L_0x00e2:
            com.google.android.apps.search.googleapp.discover.u.e r1 = r1.f364848a
            r7 = 2
            r13.f364825a = r7
            java.lang.Object r14 = r1.mo112116b(r14, r13)
            if (r14 != r0) goto L_0x00ee
            return r0
        L_0x00ee:
            com.google.at.c.b.a.a.g r14 = (com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53877g) r14
        L_0x00f0:
            com.google.android.apps.search.googleapp.discover.a.b.a.g r0 = r13.f364829e
            com.google.android.apps.search.googleapp.discover.d.aj r0 = r0.f364851d
            java.util.UUID r1 = r13.f364830f
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.mo111620f(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r13.f364832h
            com.google.android.apps.search.googleapp.discover.a.b.a.j r1 = r13.f364827c
            java.lang.String r7 = "token"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.bv.e.b.c.a.w r14 = r14.f141383a
            if (r14 == 0) goto L_0x014f
            r0.set(r14)
            com.google.protobuf.bn r14 = r1.toBuilder()
            java.lang.String r1 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)
            com.google.android.apps.search.googleapp.discover.a.b.a.i r14 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133949i) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "consistencyTokenAtomic.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.bv.e.b.c.a.w r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.android.apps.search.googleapp.discover.a.b.a.j r1 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133950j) r1
            r0.getClass()
            r1.f364859b = r0
            int r0 = r1.f364858a
            r0 = r0 | r6
            r1.f364858a = r0
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r3)
            com.google.android.apps.search.googleapp.discover.a.b.a.j r14 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133950j) r14
            com.google.android.apps.search.googleapp.discover.a.b.a.g r0 = r13.f364829e
            java.util.UUID r1 = r13.f364830f
            com.google.android.apps.search.googleapp.discover.d.aj r0 = r0.f364851d
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.mo111619e(r1)
            return r14
        L_0x014f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "ActionUpload failed: no consistency token."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133944d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133944d(this.f364826b, this.f364827c, this.f364828d, this.f364829e, this.f364830f, this.f364831g, this.f364832h, gVar);
    }
}
