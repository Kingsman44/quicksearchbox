package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125786j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125901h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.p9456a.C125894b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125926o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.q */
/* compiled from: PG */
public final class C125876q {
    @Deprecated

    /* renamed from: e */
    private static final C59071e f346933e = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f346934a;

    /* renamed from: b */
    public final C125786j f346935b;

    /* renamed from: c */
    public final C125901h f346936c;

    /* renamed from: d */
    public final C125926o f346937d;

    /* renamed from: f */
    private final C125894b f346938f;

    public C125876q(C71422aw awVar, C125786j jVar, C125894b bVar, C125901h hVar, C125926o oVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(jVar, "interactionManager");
        C69664n.m101061g(hVar, "keyboardGlobalState");
        C69664n.m101061g(oVar, "eligibilityChecker");
        this.f346934a = awVar;
        this.f346935b = jVar;
        this.f346938f = bVar;
        this.f346936c = hVar;
        this.f346937d = oVar;
    }

    /* renamed from: a */
    public final Object mo107143a(C125934w wVar, C69577g gVar) {
        return C71423ax.m104196a(new C125866g(wVar, this, (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107144b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125867h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.h r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125867h) r0
            int r1 = r0.f346911g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346911g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.h r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.h
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f346909e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346911g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r1 = r0.f346908d
            java.lang.Object r2 = r0.f346907c
            java.lang.Object r5 = r0.f346906b
            java.lang.Object r0 = r0.f346905a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0077
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.libraries.dictation.b.d r8 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d.f332631e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.assistant.libraries.dictation.b.c r8 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119281c) r8
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.apps.search.assistant.libraries.dictation.b.f r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.assistant.libraries.dictation.b.c r2 = r8.f332637a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r2 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r2
            r2.f332635c = r3
            com.google.android.apps.search.assistant.libraries.dictation.b.c r2 = r8.f332637a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r2 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r2
            r2.f332633a = r3
            r0.f346905a = r7
            r0.f346906b = r8
            r0.f346907c = r8
            r0.f346908d = r8
            r0.f346911g = r4
            java.lang.Object r0 = r7.mo107145c(r0)
            if (r0 == r1) goto L_0x00a8
            r1 = r8
            r2 = r1
            r5 = r2
            r8 = r0
            r0 = r7
        L_0x0077:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r6 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            if (r8 != r6) goto L_0x007c
            r3 = 1
        L_0x007c:
            com.google.android.apps.search.assistant.libraries.dictation.b.f r1 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r1
            com.google.android.apps.search.assistant.libraries.dictation.b.c r8 = r1.f332637a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r8 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r8
            com.google.android.apps.search.assistant.libraries.dictation.b.d r1 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d.f332631e
            r8.f332634b = r3
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125876q) r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h r8 = r0.f346936c
            j$.time.Instant r8 = r8.mo107156a()
            com.google.protobuf.fg r8 = com.google.protobuf.p4750c.C62950b.m95472c(r8)
            java.lang.String r0 = "toProtoTimestamp(keyboar…ate.lastKeyboardOpenTime)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            com.google.android.apps.search.assistant.libraries.dictation.b.f r2 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r2
            r2.mo104269b(r8)
            com.google.android.apps.search.assistant.libraries.dictation.b.f r5 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r5
            com.google.android.apps.search.assistant.libraries.dictation.b.d r8 = r5.mo104268a()
            return r8
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125876q.mo107144b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r8 != r1) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107145c(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125868i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.i r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125868i) r0
            int r1 = r0.f346915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346915d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.i r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.i
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f346913b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346915d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r8)
            goto L_0x00b2
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.f346912a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0095
        L_0x003c:
            java.lang.Object r2 = r0.f346912a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0079
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h r8 = r7.f346936c
            java.util.concurrent.atomic.AtomicReference r8 = r8.f346979b
            java.lang.Object r8 = r8.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.a r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125892a) r8
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r8 = r8.f346960a
            if (r8 == 0) goto L_0x0054
            return r8
        L_0x0054:
            com.google.common.f.e r8 = f346933e
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r2 = new com.google.common.f.n
            r6 = 36687(0x8f4f, float:5.141E-41)
            r2.<init>(r6)
            r8.mo56379ah(r2)
            java.lang.String r2 = "No cached eligibility. Asking the keyboard. [SD]"
            r8.mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.a.b r8 = r7.f346938f
            r0.f346912a = r7
            r0.f346915d = r5
            java.lang.Object r8 = r8.mo107155a(r0)
            if (r8 == r1) goto L_0x00b3
            r2 = r7
        L_0x0079:
            com.google.android.apps.search.assistant.surfaces.dictation.service.r.d r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d) r8
            if (r8 != 0) goto L_0x0080
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r8 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.NON_ELIGIBLE_ASSISTANT_NOT_CONNECTED_TO_KEYBOARD
            return r8
        L_0x0080:
            com.google.android.apps.search.assistant.surfaces.dictation.a.bt r8 = r8.mo107507b()
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            java.lang.String r6 = "emptyProto()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f346912a = r2
            r0.f346915d = r4
            java.lang.Object r8 = r8.mo106801c(r5, new p5488io.grpc.C70334de(), r0)
            if (r8 == r1) goto L_0x00b3
        L_0x0095:
            com.google.android.apps.search.assistant.surfaces.dictation.a.ba r8 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125073ba) r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125876q) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r2 = r2.f346937d
            com.google.android.apps.gsa.nga.api.a.af r8 = r8.f345064a
            if (r8 != 0) goto L_0x00a1
            com.google.android.apps.gsa.nga.api.a.af r8 = com.google.android.apps.gsa.nga.api.a.af.w
        L_0x00a1:
            java.lang.String r4 = "response.keyboardConfiguration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            r4 = 0
            r0.f346912a = r4
            r0.f346915d = r3
            java.lang.Object r8 = r2.mo107175j(r8, r0)
            if (r8 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            return r8
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125876q.mo107145c(h.c.g):java.lang.Object");
    }
}
