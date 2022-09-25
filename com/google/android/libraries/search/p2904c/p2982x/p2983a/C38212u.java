package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.p2911c.C37433c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.x.a.u */
/* compiled from: PG */
public final class C38212u {

    /* renamed from: a */
    public static final C59071e f101277a = C59071e.m91331h();

    /* renamed from: b */
    public final C37433c f101278b;

    /* renamed from: c */
    public final C69585o f101279c;

    /* renamed from: d */
    public final AtomicReference f101280d;

    /* renamed from: e */
    public final AtomicBoolean f101281e;

    /* renamed from: f */
    public final C60870cx f101282f;

    /* renamed from: g */
    public final C60870cx f101283g;

    /* renamed from: h */
    public final C60870cx f101284h;

    /* renamed from: i */
    public final C71816z f101285i;

    /* renamed from: j */
    public final C71816z f101286j;

    /* renamed from: k */
    public final C71816z f101287k = new C71816z();

    /* renamed from: l */
    public final C71816z f101288l;

    public C38212u(C37433c cVar, C69585o oVar) {
        C69664n.m101061g(oVar, "blockingContext");
        this.f101278b = cVar;
        this.f101279c = oVar;
        C71816z zVar = new C71816z();
        this.f101285i = zVar;
        C71816z zVar2 = new C71816z();
        this.f101286j = zVar2;
        C71816z zVar3 = new C71816z();
        this.f101288l = zVar3;
        this.f101280d = new AtomicReference((Object) null);
        this.f101281e = new AtomicBoolean(false);
        this.f101282f = C71663i.m104688a(zVar);
        this.f101283g = C71663i.m104688a(zVar2);
        this.f101284h = C71663i.m104688a(zVar3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41337a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.p2904c.p2982x.p2983a.C38209r
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.c.x.a.r r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38209r) r0
            int r1 = r0.f101273d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101273d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.x.a.r r0 = new com.google.android.libraries.search.c.x.a.r
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f101271b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101273d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f101270a
            p5462h.C69714l.m101134b(r6)
            goto L_0x006b
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f101281e
            boolean r6 = r6.getAndSet(r3)
            if (r6 == 0) goto L_0x003f
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x003f:
            com.google.common.f.e r6 = f101277a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 53008(0xcf10, float:7.428E-41)
            r2.<init>(r4)
            r6.mo56379ah(r2)
            java.lang.String r2 = "#audio# Completing handling remote audio session responses"
            r6.mo56386p(r2)
            h.c.o r6 = r5.f101279c
            com.google.android.libraries.search.c.x.a.s r2 = new com.google.android.libraries.search.c.x.a.s
            r4 = 0
            r2.<init>(r5, r4)
            r0.f101270a = r5
            r0.f101273d = r3
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r0 = r5
        L_0x006b:
            com.google.android.libraries.search.c.x.a.u r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38212u) r0
            kotlinx.coroutines.z r6 = r0.f101285i
            com.google.android.libraries.search.c.dz r1 = com.google.android.libraries.search.p2904c.C37519dz.FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED
            com.google.android.libraries.search.c.be r1 = com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as.m66797c(r1)
            r6.mo62909P(r1)
            kotlinx.coroutines.z r6 = r0.f101286j
            com.google.android.libraries.search.c.bw r1 = com.google.android.libraries.search.p2904c.C37418bw.f99351d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.bv r1 = (com.google.android.libraries.search.p2904c.C37417bv) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.c.id r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.c.du r3 = com.google.android.libraries.search.p2904c.C37514du.f99629c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.c.dt r3 = (com.google.android.libraries.search.p2904c.C37513dt) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            com.google.android.libraries.search.c.do r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.android.libraries.search.c.ds r4 = com.google.android.libraries.search.p2904c.C37512ds.FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED
            r3.mo40994b(r4)
            com.google.android.libraries.search.c.du r3 = r3.mo40993a()
            r1.mo41083b(r3)
            com.google.android.libraries.search.c.bw r1 = r1.mo41082a()
            r6.mo62909P(r1)
            kotlinx.coroutines.z r6 = r0.f101287k
            com.google.android.libraries.search.c.bb r1 = com.google.android.libraries.search.p2904c.C37397bb.f99320c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.ba r1 = (com.google.android.libraries.search.p2904c.C37396ba) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.c.gz r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.c.bb r1 = r1.mo41045a()
            r6.mo62909P(r1)
            kotlinx.coroutines.z r6 = r0.f101288l
            com.google.android.libraries.search.c.ay r0 = com.google.android.libraries.search.p2904c.C37360ay.f99224l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.c.av r0 = (com.google.android.libraries.search.p2904c.C37357av) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.android.libraries.search.c.aq r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.c.ay r0 = r0.mo40897a()
            r6.mo62909P(r0)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38212u.mo41337a(h.c.g):java.lang.Object");
    }
}
