package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b.C127491b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d.C127521b;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.t */
/* compiled from: PG */
public final class C127519t {

    /* renamed from: a */
    public static final C59071e f351146a = C59071e.m91331h();

    /* renamed from: b */
    public final C126978e f351147b;

    /* renamed from: c */
    public final C69585o f351148c;

    /* renamed from: d */
    private final C127521b f351149d;

    /* renamed from: e */
    private final C127491b f351150e;

    public C127519t(C126978e eVar, C127521b bVar, C69585o oVar, C127491b bVar2) {
        C69664n.m101061g(oVar, "lightweightContext");
        this.f351147b = eVar;
        this.f351149d = bVar;
        this.f351148c = oVar;
        this.f351150e = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019e A[Catch:{ Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c7 A[Catch:{ Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e6 A[Catch:{ Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0232 A[Catch:{ Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a6 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108108a(com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "interactionId.id"
            java.lang.String r4 = "interactionId"
            boolean r5 = r2 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127516q
            if (r5 == 0) goto L_0x001d
            r5 = r2
            com.google.android.apps.search.assistant.surfaces.voice.f.c.q r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127516q) r5
            int r6 = r5.f351139e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f351139e = r6
            goto L_0x0022
        L_0x001d:
            com.google.android.apps.search.assistant.surfaces.voice.f.c.q r5 = new com.google.android.apps.search.assistant.surfaces.voice.f.c.q
            r5.<init>(r1, r2)
        L_0x0022:
            java.lang.Object r2 = r5.f351137c
            h.c.a.a r6 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r7 = r5.f351139e
            java.lang.String r8 = "request"
            r9 = 1
            if (r7 == 0) goto L_0x0045
            if (r7 != r9) goto L_0x003d
            java.lang.Object r6 = r5.f351136b
            java.lang.Object r5 = r5.f351135a
            p5462h.C69714l.m101134b(r2)     // Catch:{ Exception -> 0x003a }
            r16 = r3
            goto L_0x025f
        L_0x003a:
            r0 = move-exception
            goto L_0x02aa
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0045:
            p5462h.C69714l.m101134b(r2)
            com.google.android.libraries.search.assistant.invocation.o.a.bb r2 = r0.f350986b
            if (r2 != 0) goto L_0x004e
            com.google.android.libraries.search.assistant.invocation.o.a.bb r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb.f90716f
        L_0x004e:
            java.lang.String r7 = "request.invocation"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.android.apps.search.assistant.surfaces.voice.f.b.b r7 = r1.f351150e
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r10 = r0.f350987c
            if (r10 != 0) goto L_0x005b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r10 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c.f350977d
        L_0x005b:
            java.lang.String r11 = "request.visEntryPointContext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            java.lang.String r12 = "visEntryPointContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r12)
            int r12 = r10.f350980b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.m208430a(r12)
            if (r12 != 0) goto L_0x006f
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.UNRECOGNIZED
        L_0x006f:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r13 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.UNKNOWN_VIS_FROM_SYSTEM
            java.lang.String r14 = "newBuilder()"
            if (r12 == r13) goto L_0x0135
            int r12 = r10.f350980b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.m208430a(r12)
            if (r12 != 0) goto L_0x007f
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.UNRECOGNIZED
        L_0x007f:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r13 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.LEGACY_PROGRAMMATIC_INVOCATION
            if (r12 != r13) goto L_0x0085
            goto L_0x0135
        L_0x0085:
            int r12 = r10.f350979a
            r12 = r12 & r9
            if (r12 != 0) goto L_0x012d
            com.google.android.apps.search.assistant.surfaces.voice.f.b.d r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b.C127493d.f351010c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.f.b.c r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b.C127492c) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r14)
            java.lang.String r13 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r13)
            com.google.android.apps.search.assistant.surfaces.voice.f.b.e r7 = r7.f351009a
            boolean r7 = r7.mo108093a()
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.apps.search.assistant.surfaces.voice.f.b.d r13 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b.C127493d) r13
            int r15 = r13.f351012a
            r15 = r15 | r9
            r13.f351012a = r15
            r13.f351013b = r7
            com.google.protobuf.bv r7 = r12.build()
            java.lang.String r12 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            com.google.android.apps.search.assistant.surfaces.voice.f.b.d r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b.C127493d) r7
            int r12 = r10.f350980b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.m208430a(r12)
            if (r12 != 0) goto L_0x00c3
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.UNRECOGNIZED
        L_0x00c3:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.b r13 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b.UNKNOWN
            com.google.android.apps.search.assistant.surfaces.voice.f.a.b.b r13 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127415b.UNKNOWN
            com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k r13 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k.UNKNOWN
            int r12 = r12.ordinal()
            switch(r12) {
                case 2: goto L_0x010b;
                case 3: goto L_0x0101;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00ea;
                case 7: goto L_0x00e0;
                case 8: goto L_0x00dd;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r2 = r10.f350980b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.m208430a(r2)
            if (r2 != 0) goto L_0x0117
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b.UNRECOGNIZED
            goto L_0x0117
        L_0x00dd:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.a
            goto L_0x0114
        L_0x00e0:
            boolean r7 = r7.f351013b
            if (r7 == 0) goto L_0x00e7
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.br
            goto L_0x0114
        L_0x00e7:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bv
            goto L_0x0114
        L_0x00ea:
            boolean r7 = r7.f351013b
            if (r7 == 0) goto L_0x00f1
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bq
            goto L_0x0114
        L_0x00f1:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bu
            goto L_0x0114
        L_0x00f4:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.by
            goto L_0x0114
        L_0x00f7:
            boolean r7 = r7.f351013b
            if (r7 == 0) goto L_0x00fe
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bo
            goto L_0x0114
        L_0x00fe:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.ay
            goto L_0x0114
        L_0x0101:
            boolean r7 = r7.f351013b
            if (r7 == 0) goto L_0x0108
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bn
            goto L_0x0114
        L_0x0108:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.ax
            goto L_0x0114
        L_0x010b:
            boolean r7 = r7.f351013b
            if (r7 == 0) goto L_0x0112
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bs
            goto L_0x0114
        L_0x0112:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.aU
        L_0x0114:
            int r7 = r7.ca
            goto L_0x0137
        L_0x0117:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid VisEntryPointType! "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x012d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "triggeredBy only allowed in UNKNOWN_VIS_FROM_SYSTEM and LEGACY_PROGRAMMATIC_INVOCATION visEntryPointType"
            r0.<init>(r2)
            throw r0
        L_0x0135:
            int r7 = r10.f350981c
        L_0x0137:
            com.google.android.apps.search.assistant.surfaces.voice.f.d.d r10 = new com.google.android.apps.search.assistant.surfaces.voice.f.d.d
            com.google.android.libraries.search.assistant.invocation.o.a.ba r12 = r2.f90721d
            if (r12 != 0) goto L_0x013f
            com.google.android.libraries.search.assistant.invocation.o.a.ba r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba.f90707h
        L_0x013f:
            com.google.android.libraries.search.assistant.invocation.o.a.cp r12 = r12.f90713e
            if (r12 != 0) goto L_0x0145
            com.google.android.libraries.search.assistant.invocation.o.a.cp r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34080cp.f90803i
        L_0x0145:
            long r12 = r12.f90808d
            j$.time.Duration r12 = p3186j$.time.Duration.ofMillis(r12)
            java.lang.String r13 = "ofMillis(requestInvocati…etadata.invocationTimeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            com.google.protobuf.ar r13 = r0.f350988d
            if (r13 != 0) goto L_0x0156
            com.google.protobuf.ar r13 = com.google.protobuf.C62910ar.f169858c
        L_0x0156:
            java.lang.String r15 = "request.invocationElapsedRealTime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r15)
            j$.time.Duration r13 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r13)
            r10.<init>(r12, r7, r13)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.e r12 = r1.f351147b     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.d r13 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d.f349837e     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.a r13 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127043a) r13     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.t r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cs r15 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs.f333803i     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cm r15 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119845cm) r15     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cw r15 = p5462h.p5473f.p5475b.C69664n.m101061g(r15, "builder")     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cr r16 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119850cr.f333797d     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            r9 = r16
            com.google.android.apps.search.assistant.platform.b.a.d.cq r9 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119849cq) r9     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cy r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cr r9 = r9.mo104547a()     // Catch:{ Exception -> 0x02a7 }
            r15.mo104546d(r9)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r2.f90720c     // Catch:{ Exception -> 0x02a7 }
            if (r9 != 0) goto L_0x01a0
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ Exception -> 0x02a7 }
        L_0x01a0:
            r16 = r3
            java.lang.String r3 = "requestInvocation.token"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)     // Catch:{ Exception -> 0x02a7 }
            r15.mo104545c(r9)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.platform.b.a.d.cs r3 = r15.mo104543a()     // Catch:{ Exception -> 0x02a7 }
            r13.mo107915c(r3)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.b r3 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b.f350829i     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.a r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127410a) r3     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.d r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")     // Catch:{ Exception -> 0x02a7 }
            r3.mo108064e(r2)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r2 = r0.f350987c     // Catch:{ Exception -> 0x02a7 }
            if (r2 != 0) goto L_0x01c9
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c.f350977d     // Catch:{ Exception -> 0x02a7 }
        L_0x01c9:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r9 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.a r9 = r3.f350887a     // Catch:{ Exception -> 0x02a7 }
            r9.copyOnWrite()     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bv r9 = r9.instance     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.b r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b) r9     // Catch:{ Exception -> 0x02a7 }
            r2.getClass()     // Catch:{ Exception -> 0x02a7 }
            r9.f350833c = r2     // Catch:{ Exception -> 0x02a7 }
            r2 = 2
            r9.f350832b = r2     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r2 = r0.f350987c     // Catch:{ Exception -> 0x02a7 }
            if (r2 != 0) goto L_0x01e8
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c.f350977d     // Catch:{ Exception -> 0x02a7 }
        L_0x01e8:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.a.a.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9606b.C127501a.m208464a(r2)     // Catch:{ Exception -> 0x02a7 }
            r3.mo108063d(r2)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c.f350959c     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.a r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127463a) r2     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.e r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.b r9 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b.SUCCESS     // Catch:{ Exception -> 0x02a7 }
            r2.mo108080c(r9)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r2 = r2.mo108078a()     // Catch:{ Exception -> 0x02a7 }
            r3.mo108062c(r2)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.a r2 = r3.f350887a     // Catch:{ Exception -> 0x02a7 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.b r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b) r2     // Catch:{ Exception -> 0x02a7 }
            r2.f350838h = r7     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.b r2 = r3.mo108060a()     // Catch:{ Exception -> 0x02a7 }
            r13.mo107914b(r2)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.c r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c.f349832d     // Catch:{ Exception -> 0x02a7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.b r2 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127044b) r2     // Catch:{ Exception -> 0x02a7 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.r r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.q r0 = r0.f350989e     // Catch:{ Exception -> 0x02a7 }
            if (r0 != 0) goto L_0x0234
            com.google.android.apps.search.assistant.surfaces.voice.f.a.q r0 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q.f351002c     // Catch:{ Exception -> 0x02a7 }
        L_0x0234:
            java.lang.String r3 = "request.localeInfo"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ Exception -> 0x02a7 }
            r2.mo107909b(r0)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.c r0 = r2.mo107908a()     // Catch:{ Exception -> 0x02a7 }
            r13.mo107916d(r0)     // Catch:{ Exception -> 0x02a7 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.d r0 = r13.mo107913a()     // Catch:{ Exception -> 0x02a7 }
            com.google.common.util.concurrent.cx r0 = r12.mo107878a(r0)     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "conversationController\n …            }\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ Exception -> 0x02a7 }
            r5.f351135a = r1     // Catch:{ Exception -> 0x02a7 }
            r5.f351136b = r10     // Catch:{ Exception -> 0x02a7 }
            r2 = 1
            r5.f351139e = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r5)     // Catch:{ Exception -> 0x02a7 }
            if (r2 == r6) goto L_0x02a6
            r5 = r1
            r6 = r10
        L_0x025f:
            com.google.android.apps.search.assistant.platform.b.a.d.cb r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb) r2     // Catch:{ Exception -> 0x003a }
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.f.c.t r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127519t) r0     // Catch:{ Exception -> 0x003a }
            com.google.android.apps.search.assistant.surfaces.voice.f.d.b r0 = r0.f351149d     // Catch:{ Exception -> 0x003a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ Exception -> 0x003a }
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)     // Catch:{ Exception -> 0x003a }
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)     // Catch:{ Exception -> 0x003a }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d.C127521b.f351154a     // Catch:{ Exception -> 0x003a }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ Exception -> 0x003a }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ Exception -> 0x003a }
            java.lang.String r4 = "logInteractionStarted from VIS with request:%s"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ Exception -> 0x003a }
            r9 = 37487(0x926f, float:5.253E-41)
            r7.<init>(r9)     // Catch:{ Exception -> 0x003a }
            r3.mo56379ah(r7)     // Catch:{ Exception -> 0x003a }
            r3.mo56389s(r4, r6)     // Catch:{ Exception -> 0x003a }
            java.lang.String r3 = r2.f333767a     // Catch:{ Exception -> 0x003a }
            r4 = r16
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ Exception -> 0x003a }
            r7 = r6
            com.google.android.apps.search.assistant.surfaces.voice.f.d.d r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d.C127523d) r7     // Catch:{ Exception -> 0x003a }
            r0.mo108118f(r3, r7)     // Catch:{ Exception -> 0x003a }
            com.google.android.libraries.search.b.b r0 = r0.f351155b     // Catch:{ Exception -> 0x003a }
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97097fC     // Catch:{ Exception -> 0x003a }
            java.lang.String r7 = "MAIN_ASSISTANT_INTERACTION_STARTED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)     // Catch:{ Exception -> 0x003a }
            java.lang.String r7 = r2.f333767a     // Catch:{ Exception -> 0x003a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)     // Catch:{ Exception -> 0x003a }
            com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a.m209322b(r0, r3, r7)     // Catch:{ Exception -> 0x003a }
            return r2
        L_0x02a6:
            return r6
        L_0x02a7:
            r0 = move-exception
            r5 = r1
            r6 = r10
        L_0x02aa:
            com.google.android.apps.search.assistant.surfaces.voice.f.c.t r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127519t) r5
            com.google.android.apps.search.assistant.surfaces.voice.f.d.b r2 = r5.f351149d
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)
            java.lang.String r3 = com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a.m209321a()
            com.google.android.apps.search.assistant.surfaces.voice.f.d.d r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d.C127523d) r6
            r2.mo108118f(r3, r6)
            r2.mo108115c(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127519t.mo108108a(com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108109b(com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127517r
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.f.c.r r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127517r) r0
            int r1 = r0.f351142c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351142c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.f.c.r r0 = new com.google.android.apps.search.assistant.surfaces.voice.f.c.r
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f351140a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351142c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            h.c.o r7 = r5.f351148c
            com.google.android.apps.search.assistant.surfaces.voice.f.c.s r2 = new com.google.android.apps.search.assistant.surfaces.voice.f.c.s
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.f351142c = r3
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r6 = "suspend fun startMainAss… )\n        .await()\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.C127519t.mo108109b(com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g, h.c.g):java.lang.Object");
    }
}
