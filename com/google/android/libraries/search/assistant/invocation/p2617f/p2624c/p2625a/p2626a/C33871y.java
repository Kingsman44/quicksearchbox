package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.os.IBinder;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onCreate$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.y */
/* compiled from: PG */
final class C33871y extends C69572j implements C69626l {

    /* renamed from: a */
    int f90382a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90383b;

    /* renamed from: c */
    final /* synthetic */ C33504b f90384c;

    /* renamed from: d */
    final /* synthetic */ IBinder f90385d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33871y(C33768ah ahVar, C33504b bVar, IBinder iBinder, C69577g gVar) {
        super(1, gVar);
        this.f90383b = ahVar;
        this.f90384c = bVar;
        this.f90385d = iBinder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33871y(this.f90383b, this.f90384c, this.f90385d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f4 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f90382a
            if (r1 == 0) goto L_0x000b
            p5462h.C69714l.m101134b(r6)
            goto L_0x00f5
        L_0x000b:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah r6 = r5.f90383b
            j$.util.Optional r6 = r6.f90190f
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.x r1 = new com.google.android.libraries.search.assistant.invocation.f.c.a.a.x
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r2 = r5.f90384c
            r1.<init>(r2)
            r6.ifPresent(r1)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah r6 = r5.f90383b
            com.google.android.libraries.search.assistant.invocation.f.c.a.d.a r6 = r6.f90193i
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r1 = r5.f90384c
            java.util.concurrent.atomic.AtomicReference r6 = r6.f90403a
            r6.set(r1)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah r6 = r5.f90383b
            com.google.android.apps.search.assistant.platform.j.a.bx r6 = r6.f90192h
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r1 = r5.f90384c
            com.google.android.apps.search.assistant.platform.j.a.t r2 = r6.f337380a
            r2.mo74754k(r1)
            j$.util.Optional r6 = r6.f337381b
            r2 = 0
            java.lang.Object r6 = r6.orElse(r2)
            com.google.android.apps.search.assistant.platform.j.a.t r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121663t) r6
            if (r6 == 0) goto L_0x0040
            r6.mo74754k(r1)
        L_0x0040:
            com.google.common.f.e r6 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33768ah.f90184a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah r1 = r5.f90383b
            com.google.android.libraries.search.assistant.invocation.f.a.b r1 = r1.f90188d
            java.lang.String r1 = r1.mo39040a()
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 51288(0xc858, float:7.187E-41)
            r2.<init>(r3)
            r6.mo56379ah(r2)
            java.lang.String r2 = "onCreate: process: %s"
            r6.mo56389s(r2, r1)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah r6 = r5.f90383b
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.b r1 = r6.f90186b
            com.google.android.libraries.search.assistant.invocation.f.a.b r6 = r6.f90188d
            java.lang.String r6 = r6.mo39040a()
            int r2 = r6.hashCode()
            r3 = -1603080551(0xffffffffa072ee99, float:-2.0577143E-19)
            if (r2 == r3) goto L_0x0094
            r3 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            if (r2 == r3) goto L_0x0089
            r3 = 3343801(0x3305b9, float:4.685663E-39)
            if (r2 == r3) goto L_0x007e
            goto L_0x009f
        L_0x007e:
            java.lang.String r2 = "main"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x009f
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj.PROCESS_MAIN
            goto L_0x00a1
        L_0x0089:
            java.lang.String r2 = "search"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x009f
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj.PROCESS_SEARCH
            goto L_0x00a1
        L_0x0094:
            java.lang.String r2 = "interactor"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x009f
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj.PROCESS_INTERACTOR
            goto L_0x00a1
        L_0x009f:
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj.PROCESS_UNKNOWN
        L_0x00a1:
            android.os.IBinder r2 = r5.f90385d
            r3 = 1
            r5.f90382a = r3
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.di r1 = r1.f90237a
            com.google.frameworks.client.data.android.server.a.a.e r3 = com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a.f89620e
            java.lang.String r4 = "BINDER_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.libraries.search.assistant.invocation.android.parcelables.IBinderContainer r4 = new com.google.android.libraries.search.assistant.invocation.android.parcelables.IBinderContainer
            r4.<init>(r2)
            io.grpc.i.e r1 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c.m94271a(r1, r3, r4)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.di r1 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33850di) r1
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ba r2 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33788ba.f90238b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.az r2 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33786az) r2
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ba r3 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33788ba) r3
            int r6 = r6.getNumber()
            r3.f90240a = r6
            com.google.protobuf.bv r6 = r2.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ba r6 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33788ba) r6
            io.grpc.de r2 = new io.grpc.de
            r2.<init>()
            java.lang.Object r6 = r1.mo39091d(r6, r2, r5)
            if (r6 != r0) goto L_0x00f5
            return r0
        L_0x00f5:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33871y.mo5193b(java.lang.Object):java.lang.Object");
    }
}
