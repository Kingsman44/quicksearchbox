package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127887c;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128026x;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.p4580v.p4582b.C60943b;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.c.i */
/* compiled from: PG */
public final class C127947i {

    /* renamed from: f */
    private static final C59071e f352180f = C59071e.m91331h();

    /* renamed from: a */
    public final C60950i f352181a;

    /* renamed from: b */
    public final C58528ij f352182b;

    /* renamed from: c */
    public final C127887c f352183c;

    /* renamed from: d */
    public final boolean f352184d;

    /* renamed from: e */
    public final Duration f352185e;

    /* renamed from: g */
    private final C128026x f352186g;

    /* renamed from: h */
    private final C34919e f352187h;

    public C127947i(C128026x xVar, C34919e eVar, C60950i iVar, long j, C58528ij ijVar, C127887c cVar, boolean z) {
        C69664n.m101061g(xVar, "motionSignalsServiceStub");
        C69664n.m101061g(iVar, "timeSource");
        this.f352186g = xVar;
        this.f352187h = eVar;
        this.f352181a = iVar;
        this.f352182b = ijVar;
        this.f352183c = cVar;
        this.f352184d = z;
        this.f352185e = C60943b.m93087c(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108290a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127941c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.i.c.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127941c) r0
            int r1 = r0.f352166d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352166d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.i.c.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.i.c.c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f352164b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352166d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            java.lang.Object r0 = r0.f352163a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x0061 }
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.o.e r6 = r5.f352187h     // Catch:{ Exception -> 0x0061 }
            com.google.common.util.concurrent.cx r6 = r6.mo39624b()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = "foregroundAppProvider.latestUsedPackageNameAndTime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)     // Catch:{ Exception -> 0x0061 }
            r0.f352163a = r5     // Catch:{ Exception -> 0x0061 }
            r0.f352166d = r4     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x0061 }
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r5
        L_0x004c:
            j$.util.Optional r6 = (p3186j$.util.Optional) r6     // Catch:{ Exception -> 0x0061 }
            com.google.android.apps.search.assistant.surfaces.voice.i.c.d r1 = new com.google.android.apps.search.assistant.surfaces.voice.i.c.d     // Catch:{ Exception -> 0x0061 }
            com.google.android.apps.search.assistant.surfaces.voice.i.c.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127947i) r0     // Catch:{ Exception -> 0x0061 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0061 }
            j$.util.Optional r6 = r6.map(r1)     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r6 = r6.orElse(r3)     // Catch:{ Exception -> 0x0061 }
            com.google.assistant.e.i.a.dy r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51336dy) r6     // Catch:{ Exception -> 0x0061 }
            r3 = r6
            goto L_0x0080
        L_0x0061:
            r6 = move-exception
            com.google.common.f.e r0 = f352180f
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r6 = r0.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37726(0x935e, float:5.2865E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Cannot get foreground app"
            r6.mo56386p(r0)
        L_0x0080:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127947i.mo108290a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108291b(java.lang.Iterable r8, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127946h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.i.c.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127946h) r0
            int r1 = r0.f352179c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352179c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.i.c.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.i.c.h
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f352177a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352179c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r10)     // Catch:{ Exception -> 0x0027 }
            goto L_0x008d
        L_0x0027:
            r8 = move-exception
            goto L_0x0097
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.assistant.surfaces.voice.i.d.x r10 = r7.f352186g     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.i.d.c r2 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128005c.f352273e     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.i.d.b r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128004b) r2     // Catch:{ Exception -> 0x0027 }
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r4 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r4 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r4)     // Catch:{ Exception -> 0x0027 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.i.d.c r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128005c) r4     // Catch:{ Exception -> 0x0027 }
            r9.getClass()     // Catch:{ Exception -> 0x0027 }
            r4.f352277d = r9     // Catch:{ Exception -> 0x0027 }
            int r9 = r4.f352275a     // Catch:{ Exception -> 0x0027 }
            r9 = r9 | r3
            r4.f352275a = r9     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.a.b r9 = new com.google.protobuf.a.b     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.cj r5 = new com.google.protobuf.cj     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.ch r4 = r4.f352276b     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.ci r6 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128005c.f352272c     // Catch:{ Exception -> 0x0027 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x0027 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)     // Catch:{ Exception -> 0x0027 }
            r2.mo108302a(r8)     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.bv r8 = r2.build()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.i.d.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128005c) r8     // Catch:{ Exception -> 0x0027 }
            r0.f352179c = r3     // Catch:{ Exception -> 0x0027 }
            io.grpc.de r9 = new io.grpc.de     // Catch:{ Exception -> 0x0027 }
            r9.<init>()     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r10 = r10.mo108306b(r8, r9, r0)     // Catch:{ Exception -> 0x0027 }
            if (r10 != r1) goto L_0x008d
            return r1
        L_0x008d:
            com.google.android.apps.search.assistant.surfaces.voice.i.d.e r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128007e) r10     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.cq r8 = r10.f352281a     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = "{\n      logger.atFine().…    .attributesList\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x0027 }
            goto L_0x00b7
        L_0x0097:
            com.google.common.f.e r9 = f352180f
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r8 = r9.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r10 = 37728(0x9360, float:5.2868E-41)
            r9.<init>(r10)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Cannot get motion signals"
            r8.mo56386p(r9)
            h.a.am r8 = p5462h.p5463a.C69496am.f185918a
        L_0x00b7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127947i.mo108291b(java.lang.Iterable, com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }
}
