package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.aw */
/* compiled from: PG */
public final class C131391aw {

    /* renamed from: a */
    private final C131401k f359181a;

    /* renamed from: b */
    private final C21370a f359182b;

    /* renamed from: c */
    private final C69464a f359183c;

    /* renamed from: d */
    private final C58974d f359184d;

    public C131391aw(C131401k kVar, C71422aw awVar, C21370a aVar, C130603a aVar2, C69464a aVar3) {
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(aVar2, "loggerFactory");
        C69664n.m101061g(aVar3, "recommendationsGenerationTimeout");
        this.f359181a = kVar;
        this.f359182b = aVar;
        this.f359183c = aVar3;
        this.f359184d = aVar2.mo109740b(this);
    }

    /* renamed from: b */
    private static final boolean m213856b(C131391aw awVar, C17692f fVar, Duration duration) {
        Duration ofMillis = Duration.ofMillis(awVar.f359182b.mo26871c() - fVar.f50864e);
        if (ofMillis.compareTo(duration) <= 0) {
            return false;
        }
        ((C58970a) awVar.f359184d.mo56226d()).mo56354G("Media recommendations card generation timed out: %dms > %dms", ofMillis, duration);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110157a(com.google.assistant.p3886c.C50818do r13, com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131390av
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.assistant.verticals.ambient.s.j.av r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131390av) r0
            int r1 = r0.f359180f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359180f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.av r0 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.av
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f359178d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359180f
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r13 = r0.f359177c
            java.lang.Object r14 = r0.f359176b
            java.lang.Object r0 = r0.f359175a
            p5462h.C69714l.m101134b(r15)
            goto L_0x0157
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            p5462h.C69714l.m101134b(r15)
            g.a.a r15 = r12.f359183c
            java.lang.Object r15 = r15.mo17428b()
            java.lang.String r2 = "recommendationsGenerationTimeout.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r2)
            com.google.protobuf.ar r15 = (com.google.protobuf.C62910ar) r15
            j$.time.Duration r15 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r15)
            boolean r2 = m213856b(r12, r14, r15)
            if (r2 == 0) goto L_0x0053
            com.google.android.apps.search.assistant.verticals.ambient.s.j.at r13 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131388at.f359174a
            return r13
        L_0x0053:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.k r2 = r12.f359181a
            if (r13 != 0) goto L_0x00c1
            com.google.assistant.c.do r13 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.c.cn r13 = (com.google.assistant.p3886c.C50790cn) r13
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.MEDIA
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            int r4 = r4.f132222T
            r5.f132315l = r4
            int r4 = r5.f132304a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r5.f132304a = r4
            com.google.assistant.c.dj r4 = com.google.assistant.p3886c.C50813dj.f132278a
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.di r4 = (com.google.assistant.p3886c.C50812di) r4
            com.google.protobuf.bt r5 = com.google.assistant.p3886c.C50761bz.f132094e
            com.google.assistant.c.bz r6 = com.google.assistant.p3886c.C50761bz.f132093d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.c.by r6 = (com.google.assistant.p3886c.C50760by) r6
            j$.time.Duration r7 = r2.f359203f
            long r7 = r7.toSeconds()
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.c.bz r9 = (com.google.assistant.p3886c.C50761bz) r9
            int r10 = r9.f132096a
            r10 = r10 | 4
            r9.f132096a = r10
            r9.f132098c = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.c.bz r6 = (com.google.assistant.p3886c.C50761bz) r6
            r4.mo58885m(r5, r6)
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.dj r4 = (com.google.assistant.p3886c.C50813dj) r4
            r4.getClass()
            r5.f132329z = r4
            int r4 = r5.f132304a
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 | r6
            r5.f132304a = r4
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.c.do r13 = (com.google.assistant.p3886c.C50818do) r13
        L_0x00c1:
            long r4 = r14.f50864e
            int r6 = r14.f50862c
            com.google.android.libraries.assistant.contexttrigger.e.e r6 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.m34970a(r6)
            if (r6 != 0) goto L_0x00cd
            com.google.android.libraries.assistant.contexttrigger.e.e r6 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.UNKNOWN
        L_0x00cd:
            com.google.android.libraries.assistant.contexttrigger.e.e r7 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.GENERIC_BLUETOOTH
            boolean r6 = r7.equals(r6)
            if (r3 == r6) goto L_0x00d8
            java.lang.String r6 = "https://fonts.gstatic.com/s/i/googlematerialicons/headphones/v4/white-24dp/1x/gm_headphones_white_24dp.png"
            goto L_0x00da
        L_0x00d8:
            java.lang.String r6 = "https://fonts.gstatic.com/s/i/googlematerialicons/bluetooth_audio/v6/white-24dp/2x/gm_bluetooth_audio_white_24dp.png"
        L_0x00da:
            com.google.assistant.c.b.n r7 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.c.b.m r7 = (com.google.assistant.p3886c.p3888b.C50728m) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.c.b.n r8 = (com.google.assistant.p3886c.p3888b.C50729n) r8
            int r9 = r8.f132009a
            r9 = r9 | 4
            r8.f132009a = r9
            r8.f132011c = r6
            com.google.apps.tiktok.media.e r8 = r2.f359201d
            com.bumptech.glide.ad r8 = r8.mo51286a()
            com.bumptech.glide.z r8 = r8.mo11864b()
            com.bumptech.glide.z r8 = r8.mo12448j(r6)
            com.google.common.util.concurrent.cx r8 = com.bumptech.glide.p282c.p283a.C5528f.m14299a(r8)
            com.google.common.util.concurrent.cx r8 = com.bumptech.glide.p282c.p283a.C5528f.m14300b(r8)
            com.google.apps.tiktok.tracing.contrib.b.f r8 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r8)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.e r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131395e.f359189a
            java.util.concurrent.Executor r10 = r2.f359199b
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51515h(r9, r10)
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.f r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.f
            r9.<init>(r7)
            java.util.concurrent.Executor r10 = r2.f359199b
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51515h(r9, r10)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.g r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.g
            r9.<init>(r2, r6, r7)
            java.util.concurrent.Executor r6 = r2.f359199b
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            com.google.apps.tiktok.tracing.contrib.b.f r6 = r8.mo51513e(r7, r9, r6)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.h r7 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131398h.f359194a
            java.util.concurrent.Executor r8 = r2.f359199b
            com.google.apps.tiktok.tracing.contrib.b.f r6 = r6.mo51515h(r7, r8)
            com.google.apps.tiktok.tracing.contrib.b.f r6 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r6)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.d r7 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.d
            r7.<init>(r2, r13, r4)
            java.util.concurrent.Executor r13 = r2.f359199b
            com.google.apps.tiktok.tracing.contrib.b.f r13 = r6.mo51515h(r7, r13)
            r0.f359175a = r12
            r0.f359176b = r14
            r0.f359177c = r15
            r0.f359180f = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0182
            r0 = r12
            r11 = r15
            r15 = r13
            r13 = r11
        L_0x0157:
            com.google.assistant.c.do r15 = (com.google.assistant.p3886c.C50818do) r15
            com.google.android.apps.search.assistant.verticals.ambient.s.j.aw r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131391aw) r0
            com.google.common.f.a.d r1 = r0.f359184d
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r2 = "Generated final media recommendations card with Id: %s"
            int r3 = r15.f132307d
            r1.mo56387q(r2, r3)
            com.google.android.libraries.assistant.contexttrigger.e.f r14 = (com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f) r14
            j$.time.Duration r13 = (p3186j$.time.Duration) r13
            boolean r13 = m213856b(r0, r14, r13)
            if (r13 == 0) goto L_0x0177
            com.google.android.apps.search.assistant.verticals.ambient.s.j.at r13 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131388at.f359174a
            return r13
        L_0x0177:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.as r13 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.as
            java.lang.String r14 = "finalSmartspaceCard"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r14)
            r13.<init>(r15)
            return r13
        L_0x0182:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131391aw.mo110157a(com.google.assistant.c.do, com.google.android.libraries.assistant.contexttrigger.e.f, h.c.g):java.lang.Object");
    }
}
