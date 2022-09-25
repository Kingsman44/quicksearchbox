package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37369f;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.C37888f;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37890a;
import com.google.android.libraries.search.p2904c.p2977w.C38154f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.w.a.g */
/* compiled from: PG */
public final class C38129g implements C38154f {

    /* renamed from: b */
    private static final C59071e f101017b = C59071e.m91331h();

    /* renamed from: a */
    public final C37890a f101018a;

    /* renamed from: c */
    private final C37467cp f101019c;

    /* renamed from: d */
    private final C37384h f101020d;

    /* renamed from: e */
    private final C58833ax f101021e;

    /* renamed from: f */
    private final C71422aw f101022f;

    /* renamed from: g */
    private final C69613f f101023g = new C69747m(new C38125c(this));

    /* renamed from: h */
    private final C71816z f101024h = new C71816z();

    /* renamed from: i */
    private final C37369f f101025i;

    /* renamed from: j */
    private final C37369f f101026j;

    public C38129g(C37467cp cpVar, C37384h hVar, C58833ax axVar, C37890a aVar, C37369f fVar, C37369f fVar2, C71422aw awVar) {
        this.f101019c = cpVar;
        this.f101020d = hVar;
        this.f101021e = axVar;
        this.f101018a = aVar;
        this.f101025i = fVar;
        this.f101026j = fVar2;
        this.f101022f = awVar;
    }

    /* renamed from: g */
    private final C37539c m67310g() {
        return (C37539c) this.f101023g.mo5768a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41277a(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.p2904c.p2977w.p2978a.C38124b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.c.w.a.b r0 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38124b) r0
            int r1 = r0.f101003d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101003d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.w.a.b r0 = new com.google.android.libraries.search.c.w.a.b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f101001b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101003d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "newBuilder()"
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x0047
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            p5462h.C69714l.m101134b(r13)
            goto L_0x014a
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003b:
            java.lang.Object r2 = r0.f101000a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0134
        L_0x0042:
            p5462h.C69714l.m101134b(r13)
            goto L_0x00e7
        L_0x0047:
            p5462h.C69714l.m101134b(r13)
            goto L_0x00b3
        L_0x004b:
            p5462h.C69714l.m101134b(r13)
            com.google.common.f.e r13 = f101017b
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "ALT.AdapterRoute"
            r13.mo56378ag(r2, r8)
            com.google.android.libraries.search.c.b.h r2 = r12.f101020d
            java.lang.String r2 = r2.name()
            com.google.android.libraries.search.c.e.c r8 = r12.m67310g()
            long r8 = r8.f99731b
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 52969(0xcee9, float:7.4225E-41)
            r10.<init>(r11)
            r13.mo56379ah(r10)
            java.lang.String r10 = "#audio# connect to adapter(%s), connection(token(%s))"
            r13.mo56353F(r10, r2, r8)
            kotlinx.coroutines.z r13 = r12.f101024h
            boolean r13 = r13.mo62875x()
            if (r13 == 0) goto L_0x009a
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x009a:
            com.google.android.libraries.search.c.b.a.f r13 = r12.f101026j
            com.google.android.libraries.search.c.b.h r2 = r12.f101020d
            com.google.android.libraries.search.c.e.c r8 = r12.m67310g()
            int r13 = r13.mo40907a(r2, r8)
            if (r13 >= 0) goto L_0x00cc
            com.google.android.libraries.search.c.cy r13 = com.google.android.libraries.search.p2904c.C37476cy.DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION
            r0.f101003d = r6
            java.lang.Object r13 = r12.mo41279c(r13, r0)
            if (r13 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.FAILED_ROUTING_UNEXPECTED_AUDIO_ADAPTER_CONNECTION
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x00cc:
            com.google.android.libraries.search.c.b.a.f r2 = r12.f101025i
            com.google.android.libraries.search.c.b.h r8 = r12.f101020d
            com.google.common.base.ax r2 = r2.mo40909c(r8)
            java.lang.Object r2 = r2.mo56111f()
            com.google.android.libraries.search.c.b.a r2 = (com.google.android.libraries.search.p2904c.p2908b.C37363a) r2
            if (r2 != 0) goto L_0x0100
            com.google.android.libraries.search.c.cy r13 = com.google.android.libraries.search.p2904c.C37476cy.DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED
            r0.f101003d = r5
            java.lang.Object r13 = r12.mo41279c(r13, r0)
            if (r13 != r1) goto L_0x00e7
            return r1
        L_0x00e7:
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.FAILED_ROUTING_DUE_TO_AUDIO_ADAPTER_NOT_REGISTERED
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x0100:
            if (r13 <= r6) goto L_0x0120
            com.google.android.libraries.search.c.b.h r13 = r12.f101020d
            r13.name()
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.UPDATED
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x0120:
            com.google.common.util.concurrent.cx r13 = r2.mo24474d()
            java.lang.String r2 = "audioAdapter.connect()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            r0.f101000a = r12
            r0.f101003d = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x017c
            r2 = r12
        L_0x0134:
            com.google.android.libraries.search.c.b.e r13 = (com.google.android.libraries.search.p2904c.p2908b.C37381e) r13
            com.google.android.libraries.search.c.b.e r4 = com.google.android.libraries.search.p2904c.p2908b.C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS
            if (r13 == r4) goto L_0x0163
            com.google.android.libraries.search.c.cy r13 = com.google.android.libraries.search.p2904c.C37476cy.DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER
            r4 = 0
            r0.f101000a = r4
            r0.f101003d = r3
            com.google.android.libraries.search.c.w.a.g r2 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g) r2
            java.lang.Object r13 = r2.mo41279c(r13, r0)
            if (r13 != r1) goto L_0x014a
            return r1
        L_0x014a:
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.FAILED_ROUTING_DUE_TO_CANNOT_CONNECT_TO_AUDIO_ADAPTER
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x0163:
            com.google.android.libraries.search.c.cm r13 = com.google.android.libraries.search.p2904c.C37464cm.f99446c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.cl r13 = (com.google.android.libraries.search.p2904c.C37463cl) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.libraries.search.c.dm r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.dk r0 = com.google.android.libraries.search.p2904c.C37504dk.UPDATED
            r13.mo40992b(r0)
            com.google.android.libraries.search.c.cm r13 = r13.mo40991a()
            return r13
        L_0x017c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g.mo41277a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41278b(com.google.android.libraries.search.p2904c.C37476cy r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.p2904c.p2977w.p2978a.C38127e
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.c.w.a.e r0 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38127e) r0
            int r1 = r0.f101012e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101012e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.w.a.e r0 = new com.google.android.libraries.search.c.w.a.e
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f101010c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101012e
            r3 = 1
            java.lang.String r4 = "newBuilder()"
            java.lang.String r5 = "ALT.AdapterRoute"
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r12 = r0.f101009b
            java.lang.Object r0 = r0.f101008a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0130
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            p5462h.C69714l.m101134b(r13)
            com.google.common.f.e r13 = f101017b
            com.google.common.f.x r2 = r13.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r6, r5)
            java.lang.String r6 = r12.name()
            com.google.android.libraries.search.c.b.h r7 = r11.f101020d
            java.lang.String r7 = r7.name()
            com.google.android.libraries.search.c.e.c r8 = r11.m67310g()
            long r8 = r8.f99731b
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 52971(0xceeb, float:7.4228E-41)
            r8.<init>(r9)
            r2.mo56379ah(r8)
            java.lang.String r8 = "#audio# disconnect(reason(%s)) audio adapter(%s), connection(token(%s))"
            r2.mo56359L(r8, r6, r7, r10)
            com.google.android.libraries.search.c.b.a.f r2 = r11.f101026j
            com.google.android.libraries.search.c.b.h r6 = r11.f101020d
            com.google.android.libraries.search.c.e.c r7 = r11.m67310g()
            int r2 = r2.mo40908b(r6, r7)
            if (r2 >= 0) goto L_0x00b3
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r5)
            com.google.android.libraries.search.c.b.h r0 = r11.f101020d
            java.lang.String r0 = r0.name()
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52975(0xceef, float:7.4234E-41)
            r1.<init>(r2)
            r13.mo56379ah(r1)
            java.lang.String r1 = "#audio# No connection found for adapter (%s), skipping disconnection"
            r13.mo56389s(r1, r0)
            com.google.android.libraries.search.c.ci r13 = com.google.android.libraries.search.p2904c.C37460ci.f99438c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.ch r13 = (com.google.android.libraries.search.p2904c.C37459ch) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            com.google.android.libraries.search.c.ce r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            r13.mo40979b(r12)
            com.google.android.libraries.search.c.ci r12 = r13.mo40978a()
            return r12
        L_0x00b3:
            com.google.android.libraries.search.c.b.a.f r6 = r11.f101025i
            com.google.android.libraries.search.c.b.h r7 = r11.f101020d
            com.google.common.base.ax r6 = r6.mo40909c(r7)
            java.lang.Object r6 = r6.mo56111f()
            com.google.android.libraries.search.c.b.a r6 = (com.google.android.libraries.search.p2904c.p2908b.C37363a) r6
            if (r6 != 0) goto L_0x00fb
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r5)
            com.google.android.libraries.search.c.b.h r0 = r11.f101020d
            java.lang.String r0 = r0.name()
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52974(0xceee, float:7.4232E-41)
            r1.<init>(r2)
            r13.mo56379ah(r1)
            java.lang.String r1 = "#audio# No audio adapter (%s) found for disconnection"
            r13.mo56389s(r1, r0)
            com.google.android.libraries.search.c.ci r13 = com.google.android.libraries.search.p2904c.C37460ci.f99438c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.ch r13 = (com.google.android.libraries.search.p2904c.C37459ch) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            com.google.android.libraries.search.c.ce r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            r13.mo40979b(r12)
            com.google.android.libraries.search.c.ci r12 = r13.mo40978a()
            return r12
        L_0x00fb:
            if (r2 <= 0) goto L_0x0119
            com.google.android.libraries.search.c.b.h r13 = r11.f101020d
            r13.name()
            com.google.android.libraries.search.c.ci r13 = com.google.android.libraries.search.p2904c.C37460ci.f99438c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.ch r13 = (com.google.android.libraries.search.p2904c.C37459ch) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            com.google.android.libraries.search.c.ce r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            r13.mo40979b(r12)
            com.google.android.libraries.search.c.ci r12 = r13.mo40978a()
            return r12
        L_0x0119:
            r13 = 0
            com.google.common.util.concurrent.cx r13 = r6.mo24475e(r13)
            java.lang.String r2 = "audioAdapter.disconnect(/* timedOut= */ false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            r0.f101008a = r11
            r0.f101009b = r12
            r0.f101012e = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0178
            r0 = r11
        L_0x0130:
            com.google.android.libraries.search.c.b.f r13 = (com.google.android.libraries.search.p2904c.p2908b.C37382f) r13
            com.google.android.libraries.search.c.b.f r1 = com.google.android.libraries.search.p2904c.p2908b.C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS
            if (r13 == r1) goto L_0x015f
            com.google.common.f.e r1 = f101017b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            com.google.android.libraries.search.c.w.a.g r0 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g) r0
            com.google.android.libraries.search.c.b.h r0 = r0.f101020d
            java.lang.String r0 = r0.name()
            java.lang.String r13 = r13.name()
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 52972(0xceec, float:7.423E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "#audio# Audio adapter (%s) disconnected unsuccessfully (%s)"
            r1.mo56354G(r2, r0, r13)
        L_0x015f:
            com.google.android.libraries.search.c.ci r13 = com.google.android.libraries.search.p2904c.C37460ci.f99438c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.c.ch r13 = (com.google.android.libraries.search.p2904c.C37459ch) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            com.google.android.libraries.search.c.ce r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.c.cy r12 = (com.google.android.libraries.search.p2904c.C37476cy) r12
            r13.mo40979b(r12)
            com.google.android.libraries.search.c.ci r12 = r13.mo40978a()
            return r12
        L_0x0178:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g.mo41278b(com.google.android.libraries.search.c.cy, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:27:0x0076, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41279c(com.google.android.libraries.search.p2904c.C37476cy r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.p2904c.p2977w.p2978a.C38128f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.c.w.a.f r0 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38128f) r0
            int r1 = r0.f101016d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101016d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.w.a.f r0 = new com.google.android.libraries.search.c.w.a.f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f101014b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101016d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x003b
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p5462h.C69714l.m101134b(r8)
            goto L_0x0079
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f101013a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0062
        L_0x003b:
            p5462h.C69714l.m101134b(r8)
            goto L_0x0055
        L_0x003f:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.z r8 = r6.f101024h
            boolean r8 = r8.mo62875x()
            if (r8 == 0) goto L_0x0056
            kotlinx.coroutines.z r7 = r6.f101024h
            r0.f101016d = r5
            java.lang.Object r8 = r7.mo62825a(r0)
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            return r8
        L_0x0056:
            r0.f101013a = r6
            r0.f101016d = r4
            java.lang.Object r8 = r6.mo41278b(r7, r0)
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r7 = r6
        L_0x0062:
            com.google.android.libraries.search.c.ci r8 = (com.google.android.libraries.search.p2904c.C37460ci) r8
            com.google.android.libraries.search.c.w.a.g r7 = (com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g) r7
            kotlinx.coroutines.z r2 = r7.f101024h
            r2.mo62909P(r8)
            kotlinx.coroutines.z r7 = r7.f101024h
            r8 = 0
            r0.f101013a = r8
            r0.f101016d = r3
            java.lang.Object r8 = r7.mo62825a(r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g.mo41279c(com.google.android.libraries.search.c.cy, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final C37877c mo41068d() {
        return new C37888f(C71663i.m104688a(this.f101024h), this.f101019c, this.f101021e, C69664n.m101061g(m67310g(), "<this>"));
    }

    /* renamed from: e */
    public final C60870cx mo41069e() {
        return C71663i.m104692e(this.f101022f, (C71424ay) null, new C38123a(this, (C69577g) null), 3);
    }

    /* renamed from: f */
    public final C60870cx mo41070f(C37476cy cyVar) {
        C69664n.m101061g(cyVar, "disconnectReason");
        return C71663i.m104692e(this.f101022f, (C71424ay) null, new C38126d(this, cyVar, (C69577g) null), 3);
    }
}
