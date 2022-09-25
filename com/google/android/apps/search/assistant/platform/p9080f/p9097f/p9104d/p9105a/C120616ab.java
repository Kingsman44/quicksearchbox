package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.gsa.binaries.satin.app.aia;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119941b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120581e;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.ab */
/* compiled from: PG */
public final class C120616ab {

    /* renamed from: a */
    public static final C59071e f335495a = C59071e.m91331h();

    /* renamed from: b */
    public final C119941b f335496b;

    /* renamed from: c */
    public final Optional f335497c;

    /* renamed from: d */
    public final boolean f335498d;

    /* renamed from: e */
    public final C120581e f335499e;

    /* renamed from: f */
    private final C120632p f335500f;

    /* renamed from: g */
    private final C120623g f335501g;

    /* renamed from: h */
    private final aia f335502h;

    public C120616ab(C120632p pVar, C120623g gVar, aia aia, C119941b bVar, Optional optional, boolean z, C120581e eVar) {
        C69664n.m101061g(pVar, "contextFetcher");
        C69664n.m101061g(gVar, "connectionHolder");
        C69664n.m101061g(aia, "resultFactory");
        C69664n.m101061g(bVar, "onDeviceQueryLogger");
        C69664n.m101061g(optional, "onDeviceMdaControllerOptional");
        C69664n.m101061g(eVar, "orchestrationStateLogger");
        this.f335500f = pVar;
        this.f335501g = gVar;
        this.f335502h = aia;
        this.f335496b = bVar;
        this.f335497c = optional;
        this.f335498d = z;
        this.f335499e = eVar;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0113 A[Catch:{ all -> 0x006b, all -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104857a(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p r17, p5462h.p5466c.C69577g r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120641y
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.platform.f.f.d.a.y r2 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120641y) r2
            int r3 = r2.f335576h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f335576h = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.f.f.d.a.y r2 = new com.google.android.apps.search.assistant.platform.f.f.d.a.y
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f335574f
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f335576h
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x008f
            if (r4 == r9) goto L_0x0081
            if (r4 == r8) goto L_0x006f
            if (r4 == r7) goto L_0x0054
            if (r4 != r6) goto L_0x004c
            java.lang.Object r3 = r2.f335573e
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3
            java.lang.Object r4 = r2.f335572d
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ak r4 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak) r4
            java.lang.Object r5 = r2.f335571c
            com.google.assistant.e.j.ex r5 = (com.google.assistant.p3897e.p3921j.C52091ex) r5
            java.lang.Object r6 = r2.f335570b
            com.google.android.apps.search.assistant.platform.f.f.d.a.u r6 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120637u) r6
            java.lang.Object r2 = r2.f335569a
            p5462h.C69714l.m101134b(r0)
            r9 = r3
            r8 = r4
            r4 = r6
            r6 = r5
            goto L_0x018b
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            java.lang.Object r4 = r2.f335573e
            java.io.Closeable r4 = (java.io.Closeable) r4
            java.lang.Object r7 = r2.f335572d
            com.google.assistant.e.j.ex r7 = (com.google.assistant.p3897e.p3921j.C52091ex) r7
            java.lang.Object r8 = r2.f335571c
            com.google.android.apps.search.assistant.platform.f.f.d.a.u r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120637u) r8
            java.lang.Object r10 = r2.f335570b
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p r10 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p) r10
            java.lang.Object r11 = r2.f335569a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0116
        L_0x006b:
            r0 = move-exception
            r2 = r0
            goto L_0x01ae
        L_0x006f:
            java.lang.Object r4 = r2.f335572d
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.e r4 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e) r4
            java.lang.Object r8 = r2.f335571c
            com.google.android.apps.search.assistant.platform.f.f.d.a.u r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120637u) r8
            java.lang.Object r10 = r2.f335570b
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p r10 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p) r10
            java.lang.Object r11 = r2.f335569a
            p5462h.C69714l.m101134b(r0)
            goto L_0x00e1
        L_0x0081:
            java.lang.Object r4 = r2.f335571c
            com.google.android.apps.search.assistant.platform.f.f.d.a.u r4 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120637u) r4
            java.lang.Object r10 = r2.f335570b
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p r10 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p) r10
            java.lang.Object r11 = r2.f335569a
            p5462h.C69714l.m101134b(r0)
            goto L_0x00c6
        L_0x008f:
            p5462h.C69714l.m101134b(r0)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.binaries.satin.app.aia r0 = r1.f335502h
            com.google.android.apps.search.assistant.platform.f.f.d.a.u r4 = new com.google.android.apps.search.assistant.platform.f.f.d.a.u
            com.google.android.apps.gsa.binaries.satin.app.aib r10 = r0.f196189a
            com.google.android.apps.gsa.binaries.satin.app.aqy r10 = r10.a
            g.a.a r10 = r10.H
            java.lang.Object r10 = r10.mo17428b()
            kotlinx.coroutines.aw r10 = (kotlinx.coroutines.C71422aw) r10
            com.google.android.apps.gsa.binaries.satin.app.aib r0 = r0.f196189a
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r0.a
            g.a.a r0 = r0.n
            java.lang.Object r0 = r0.mo17428b()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r4.<init>(r10, r0)
            com.google.android.apps.search.assistant.platform.f.f.d.a.g r0 = r1.f335501g
            r2.f335569a = r1
            r10 = r17
            r2.f335570b = r10
            r2.f335571c = r4
            r2.f335576h = r9
            java.lang.Object r0 = r0.mo104859a(r2)
            if (r0 == r3) goto L_0x01be
            r11 = r1
        L_0x00c6:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.e r0 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e) r0
            r12 = r11
            com.google.android.apps.search.assistant.platform.f.f.d.a.ab r12 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120616ab) r12
            com.google.android.apps.search.assistant.platform.f.f.d.a.p r12 = r12.f335500f
            r2.f335569a = r11
            r2.f335570b = r10
            r2.f335571c = r4
            r2.f335572d = r0
            r2.f335576h = r8
            java.lang.Object r8 = r12.mo104860b(r2)
            if (r8 == r3) goto L_0x01be
            r15 = r4
            r4 = r0
            r0 = r8
            r8 = r15
        L_0x00e1:
            com.google.assistant.e.j.ex r0 = (com.google.assistant.p3897e.p3921j.C52091ex) r0
            java.lang.String r12 = "on-device fulfillment: starting prefetch"
            com.google.apps.tiktok.tracing.bi r12 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r12)
            com.google.android.apps.search.assistant.platform.f.f.d.a.t r13 = new com.google.android.apps.search.assistant.platform.f.f.d.a.t     // Catch:{ all -> 0x01b5 }
            r13.<init>(r8)     // Catch:{ all -> 0x01b5 }
            r14 = r11
            com.google.android.apps.search.assistant.platform.f.f.d.a.ab r14 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120616ab) r14     // Catch:{ all -> 0x01b5 }
            com.google.android.apps.search.assistant.platform.f.f.d.a.p r14 = r14.f335500f     // Catch:{ all -> 0x01b5 }
            r4.mo105652d(r10, r0, r13, r14)     // Catch:{ all -> 0x01b5 }
            p5462h.p5472e.C69598b.m101013a(r12, r5)
            java.lang.String r4 = "on-device fulfillment: initial response"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            r2.f335569a = r11     // Catch:{ all -> 0x006b }
            r2.f335570b = r10     // Catch:{ all -> 0x006b }
            r2.f335571c = r8     // Catch:{ all -> 0x006b }
            r2.f335572d = r0     // Catch:{ all -> 0x006b }
            r2.f335573e = r4     // Catch:{ all -> 0x006b }
            r2.f335576h = r7     // Catch:{ all -> 0x006b }
            kotlinx.coroutines.z r7 = r8.f335557b     // Catch:{ all -> 0x006b }
            java.lang.Object r7 = r7.mo62825a(r2)     // Catch:{ all -> 0x006b }
            if (r7 == r3) goto L_0x01ad
            r15 = r7
            r7 = r0
            r0 = r15
        L_0x0116:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ak r0 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak) r0     // Catch:{ all -> 0x006b }
            p5462h.p5472e.C69598b.m101013a(r4, r5)
            com.google.protos.f.q.fc r4 = r0.f339311a
            if (r4 != 0) goto L_0x0121
            com.google.protos.f.q.fc r4 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
        L_0x0121:
            int r4 = r4.f176458d
            com.google.protos.f.q.fb r4 = com.google.protos.p4985f.p5030q.C65195fb.m96585a(r4)
            if (r4 != 0) goto L_0x012b
            com.google.protos.f.q.fb r4 = com.google.protos.p4985f.p5030q.C65195fb.UNRECOGNIZED
        L_0x012b:
            java.lang.String r5 = "initialResponse.popResponse.status"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protos.f.q.fb r5 = com.google.protos.p4985f.p5030q.C65195fb.NO_ERROR
            if (r4 != r5) goto L_0x0199
            com.google.protos.f.q.fc r4 = r0.f339311a
            if (r4 != 0) goto L_0x013c
            com.google.protos.f.q.fc r4 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
        L_0x013c:
            com.google.android.libraries.assistant.portable.b.t r4 = r4.f176462h
            if (r4 != 0) goto L_0x0142
            com.google.android.libraries.assistant.portable.b.t r4 = com.google.android.libraries.assistant.portable.p1586b.C19088t.f53533p
        L_0x0142:
            com.google.assistant.ab.cx r4 = r4.f53549o
            if (r4 != 0) goto L_0x0148
            com.google.assistant.ab.cx r4 = com.google.assistant.p3745ab.C48296cx.f124910d
        L_0x0148:
            java.lang.String r5 = "initialResponse.popRespo…tions.verificationInfoLog"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            boolean r5 = r4.f124912a
            boolean r5 = r4.f124913b
            boolean r4 = r4.f124914c
            h.f.b.ae r4 = new h.f.b.ae
            r4.<init>()
            com.google.android.apps.search.assistant.platform.f.f.d.a r5 = com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120610a.HIGH_QUALITY
            r4.f186027a = r5
            int r5 = r10.f339490b
            if (r5 != r9) goto L_0x016e
            com.google.protos.f.q.fc r5 = r0.f339311a
            if (r5 != 0) goto L_0x0166
            com.google.protos.f.q.fc r5 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
        L_0x0166:
            boolean r5 = r5.f176463i
            if (r5 == 0) goto L_0x016e
            com.google.android.apps.search.assistant.platform.f.f.d.a r5 = com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120610a.FALLBACK
            r4.f186027a = r5
        L_0x016e:
            r5 = r11
            com.google.android.apps.search.assistant.platform.f.f.d.a.ab r5 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120616ab) r5
            com.google.android.apps.search.assistant.platform.f.f.d.a.p r5 = r5.f335500f
            r2.f335569a = r11
            r2.f335570b = r8
            r2.f335571c = r7
            r2.f335572d = r0
            r2.f335573e = r4
            r2.f335576h = r6
            java.lang.Object r2 = r5.mo104861c(r2)
            if (r2 == r3) goto L_0x0198
            r9 = r4
            r6 = r7
            r4 = r8
            r8 = r0
            r0 = r2
            r2 = r11
        L_0x018b:
            r7 = r0
            j$.util.Optional r7 = (p3186j$.util.Optional) r7
            com.google.android.apps.search.assistant.platform.f.f.d.a.aa r0 = new com.google.android.apps.search.assistant.platform.f.f.d.a.aa
            r5 = r2
            com.google.android.apps.search.assistant.platform.f.f.d.a.ab r5 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120616ab) r5
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0198:
            return r3
        L_0x0199:
            com.google.android.apps.search.assistant.platform.f.f.d.a.ac r0 = new com.google.android.apps.search.assistant.platform.f.f.d.a.ac
            java.lang.String r2 = r4.name()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Portable Assistant reported failure: "
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2, r4)
            throw r0
        L_0x01ad:
            return r3
        L_0x01ae:
            throw r2     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r4, r2)
            throw r3
        L_0x01b5:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r12, r2)
            throw r3
        L_0x01be:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120616ab.mo104857a(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p, h.c.g):java.lang.Object");
    }
}
