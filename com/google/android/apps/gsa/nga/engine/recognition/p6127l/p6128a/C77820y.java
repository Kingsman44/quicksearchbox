package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.y */
/* compiled from: PG */
public final /* synthetic */ class C77820y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77752af f214373a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f214374b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f214375c;

    public /* synthetic */ C77820y(C77752af afVar, C67087ko koVar, C79856d dVar) {
        this.f214373a = afVar;
        this.f214374b = koVar;
        this.f214375c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            com.google.android.apps.gsa.nga.engine.recognition.l.a.af r1 = r0.f214373a
            com.google.speech.j.ko r10 = r0.f214374b
            com.google.android.apps.gsa.nga.engine.x.d r2 = r0.f214375c
            com.google.speech.j.kk r3 = r10.f182370c
            if (r3 != 0) goto L_0x000e
            com.google.speech.j.kk r3 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x000e:
            r11 = r3
            boolean r12 = r1.f214197o
            r13 = 0
            r1.f214197o = r13
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6130c.C77827a.m124844a(r11)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0020
            goto L_0x05fe
        L_0x0020:
            java.lang.Object r3 = r3.get()
            r14 = r3
            com.google.android.apps.gsa.nga.engine.recognition.ai r14 = (com.google.android.apps.gsa.nga.engine.recognition.C77556ai) r14
            java.util.List r15 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6130c.C77827a.m124847d(r11)
            com.google.android.apps.gsa.nga.engine.b.c.j r9 = r2.mo74269a()
            com.google.android.apps.gsa.nga.engine.recognition.ai r3 = com.google.android.apps.gsa.nga.engine.recognition.C77556ai.PREFETCH
            boolean r3 = r3.equals(r14)
            r8 = 4
            if (r3 == 0) goto L_0x0081
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto L_0x0081
            com.google.android.apps.gsa.shared.logger.b.f r3 = new com.google.android.apps.gsa.shared.logger.b.f
            r3.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_RECOGNITION_EVENT
            r3.f246201a = r4
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r2.f218924a
            java.lang.String r2 = r2.c()
            java.lang.String r4 = "RecognitionUtteranceId"
            r3.mo83701c(r4, r2)
            com.google.speech.j.kk r2 = r10.f182370c
            if (r2 != 0) goto L_0x0058
            com.google.speech.j.kk r2 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x0058:
            int r4 = r2.f182354b
            if (r4 != r8) goto L_0x0061
            java.lang.Object r2 = r2.f182355c
            com.google.speech.j.kg r2 = (com.google.speech.p5218j.C67079kg) r2
            goto L_0x0063
        L_0x0061:
            com.google.speech.j.kg r2 = com.google.speech.p5218j.C67079kg.f182340h
        L_0x0063:
            com.google.protobuf.cq r2 = r2.f182343b
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r4 = "queryHash"
            r3.mo83701c(r4, r2)
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r2 = r1.f214189g
            com.google.android.apps.gsa.shared.logger.b.g r3 = r3.mo83699a()
            r2.mo72822e(r3)
        L_0x0081:
            com.google.android.apps.gsa.nga.engine.d.a.a.c r2 = r1.f214185c
            com.google.android.apps.gsa.nga.engine.recognition.u r3 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r4 = r1.f214189g
            j$.util.Optional r7 = r4.mo72821c()
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r4 = r1.f214189g
            j$.util.Optional r16 = r4.mo72820b()
            com.google.android.apps.gsa.nga.shared.v.io r17 = r9.c()
            r4 = r10
            r5 = r14
            r6 = r15
            r8 = r16
            r18 = r9
            r9 = r17
            com.google.android.apps.gsa.nga.engine.recognition.ah r2 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            com.google.android.apps.gsa.nga.engine.recognition.ai r3 = com.google.android.apps.gsa.nga.engine.recognition.C77556ai.FINAL
            boolean r3 = r14.equals(r3)
            r4 = 1
            if (r3 == 0) goto L_0x00da
            r1.f214197o = r4
            int r3 = r11.f182354b
            if (r3 != r4) goto L_0x00b6
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            goto L_0x00b8
        L_0x00b6:
            com.google.speech.j.ix r3 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x00b8:
            int r3 = r3.f182236h
            int r3 = com.google.speech.p5218j.C67041iw.m97416a(r3)
            if (r3 != 0) goto L_0x00c1
            r3 = 1
        L_0x00c1:
            r5 = 6
            if (r3 != r5) goto L_0x00d7
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r1 = r1.f214189g
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SPEECH_HANDLER_RESET_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.f r3 = new com.google.android.apps.gsa.shared.logger.b.f
            r3.<init>()
            r3.f246201a = r2
            com.google.android.apps.gsa.shared.logger.b.g r2 = r3.mo83699a()
            r1.mo72822e(r2)
            return
        L_0x00d7:
            r5 = 5
            if (r3 == r5) goto L_0x05fe
        L_0x00da:
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto L_0x00ef
            java.lang.Object r3 = r15.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r3 = 0
            goto L_0x00f0
        L_0x00ef:
            r3 = 1
        L_0x00f0:
            if (r3 == 0) goto L_0x0107
            com.google.android.apps.gsa.nga.engine.recognition.ai r5 = com.google.android.apps.gsa.nga.engine.recognition.C77556ai.FINAL
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x05fe
            com.google.android.apps.gsa.shared.util.v.g r5 = r1.f214186d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251516kL
            boolean r5 = r5.mo85405j(r6)
            if (r5 == 0) goto L_0x0107
            if (r12 != 0) goto L_0x05fe
            r12 = 0
        L_0x0107:
            if (r12 == 0) goto L_0x0118
            if (r3 != 0) goto L_0x0118
            com.google.android.apps.gsa.nga.shared.s.h r5 = r1.f214195m
            r6 = r18
            r9 = r6
            com.google.android.apps.gsa.nga.engine.b.c.a r9 = (com.google.android.apps.gsa.nga.engine.b.c.a) r9
            com.google.android.apps.gsa.nga.engine.b.g.ac r7 = r9.a
            r5.mo75090a(r7)
            goto L_0x011a
        L_0x0118:
            r6 = r18
        L_0x011a:
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r5 = r1.f214189g
            int r7 = r10.f182368a
            r8 = 2
            r7 = r7 & r8
            r13 = -1
            if (r7 == 0) goto L_0x0159
            com.google.speech.j.kk r7 = r10.f182370c
            if (r7 != 0) goto L_0x0129
            com.google.speech.j.kk r7 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x0129:
            com.google.protobuf.bt r16 = com.google.speech.p5218j.C66889df.f181848c
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r16)
            r7.mo58887l(r9)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r8 = r9.f169971d
            java.lang.Object r7 = r7.mo58854l(r8)
            if (r7 != 0) goto L_0x013f
            java.lang.Object r7 = r9.f169969b
            goto L_0x0143
        L_0x013f:
            java.lang.Object r7 = r9.mo58889c(r7)
        L_0x0143:
            com.google.speech.j.df r7 = (com.google.speech.p5218j.C66889df) r7
            int r7 = r7.f181850a
            int r7 = com.google.speech.p5218j.C66888de.m97370a(r7)
            if (r7 != 0) goto L_0x014e
            r7 = 1
        L_0x014e:
            int r7 = r7 + r13
            if (r7 == r4) goto L_0x0157
            r8 = 2
            if (r7 == r8) goto L_0x0155
            goto L_0x0159
        L_0x0155:
            r7 = 3
            goto L_0x015a
        L_0x0157:
            r7 = 2
            goto L_0x015a
        L_0x0159:
            r7 = 1
        L_0x015a:
            r9 = r6
            com.google.android.apps.gsa.nga.engine.b.c.a r9 = (com.google.android.apps.gsa.nga.engine.b.c.a) r9
            com.google.android.apps.gsa.nga.engine.b.g.ac r8 = r9.a
            com.google.android.apps.gsa.nga.shared.v.io r8 = r8.b()
            com.google.android.apps.gsa.nga.shared.v.i r4 = r5.f214264d
            java.lang.String r13 = r14.name()
            if (r13 == 0) goto L_0x0609
            j$.util.Optional r0 = r5.mo72821c()
            r20 = r3
            r19 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r0 = r0.orElse(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.apps.gsa.nga.shared.v.c.eu r3 = new com.google.android.apps.gsa.nga.shared.v.c.eu
            r21 = r10
            java.lang.String r10 = "NGA_SODA_EVENT_TYPE"
            r3.<init>(r10, r0, r13)
            r4.mo75579d(r3)
            com.google.common.o.agz r0 = com.google.common.p4552o.agz.f158679e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.agy r0 = (com.google.common.p4552o.agy) r0
            int r3 = r14.ordinal()
            r4 = 1
            if (r3 == r4) goto L_0x01d2
            r10 = 2
            if (r3 == r10) goto L_0x01a1
            goto L_0x022e
        L_0x01a1:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.agz r3 = (com.google.common.p4552o.agz) r3
            r10 = -1
            int r7 = r7 + r10
            r3.f158682b = r7
            int r7 = r3.f158681a
            r7 = r7 | r4
            r3.f158681a = r7
            com.google.android.apps.gsa.nga.engine.recognition.l.b r3 = r5.f214267g
            com.google.common.b.gu r3 = r3.mo72829a(r15)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.common.o.agz r4 = (com.google.common.p4552o.agz) r4
            com.google.protobuf.ch r7 = r4.f158684d
            boolean r10 = r7.mo58948c()
            if (r10 != 0) goto L_0x01cc
            com.google.protobuf.ch r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r7)
            r4.f158684d = r7
        L_0x01cc:
            com.google.protobuf.ch r4 = r4.f158684d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)
            goto L_0x01e3
        L_0x01d2:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.agz r3 = (com.google.common.p4552o.agz) r3
            r4 = -1
            int r7 = r7 + r4
            r3.f158683c = r7
            int r4 = r3.f158681a
            r7 = 2
            r4 = r4 | r7
            r3.f158681a = r4
        L_0x01e3:
            com.google.android.apps.gsa.nga.shared.v.w r3 = r5.f214262b
            com.google.android.apps.gsa.nga.shared.v.d.ec r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SODA_RECOGNITION_EVENT
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.nga.shared.v.d.dz r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz) r5
            com.google.android.apps.gsa.nga.shared.v.d.gm r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82951gm.f226316c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.nga.shared.v.d.gl r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82950gl) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.apps.gsa.nga.shared.v.d.gm r10 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82951gm) r10
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.agz r0 = (com.google.common.p4552o.agz) r0
            r0.getClass()
            r10.f226319b = r0
            int r0 = r10.f226318a
            r13 = 1
            r0 = r0 | r13
            r10.f226318a = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.nga.shared.v.d.ea r0 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r0
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.nga.shared.v.d.gm r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82951gm) r7
            r7.getClass()
            r0.f225980b = r7
            r7 = 100
            r0.f225979a = r7
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.apps.gsa.nga.shared.v.d.ea r0 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r0
            r3.mo75545c(r4, r0, r8)
        L_0x022e:
            com.google.android.apps.gsa.nga.engine.recognition.u r0 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            r2.mo72625c(r0)
            r0 = r2
            com.google.android.apps.gsa.nga.engine.recognition.m r0 = (com.google.android.apps.gsa.nga.engine.recognition.C77830m) r0
            r0.f214385d = r6
            com.google.common.v.i r3 = r1.f214183a
            j$.time.Instant r3 = r3.mo57444a()
            r2.mo72630h(r3)
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6130c.C77827a.m124845b(r11)
            r2.mo72634l(r3)
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6130c.C77827a.m124846c(r11)
            r2.mo72635m(r3)
            r2.mo72629g(r12)
            r2.mo72636n()
            r2.mo72626d(r14)
            int r3 = r11.f182354b
            r4 = 2
            if (r3 != r4) goto L_0x0263
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0261:
            r4 = 4
            goto L_0x0298
        L_0x0263:
            r4 = 1
            if (r3 != r4) goto L_0x027c
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            int r5 = r3.f182229a
            r5 = r5 & r4
            if (r5 == 0) goto L_0x027a
            float r3 = r3.f182232d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x0261
        L_0x027a:
            r4 = 4
            goto L_0x0294
        L_0x027c:
            r4 = 4
            if (r3 != r4) goto L_0x0294
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.kg r3 = (com.google.speech.p5218j.C67079kg) r3
            int r5 = r3.f182342a
            r7 = 2
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0294
            float r3 = r3.f182345d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x0298
        L_0x0294:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0298:
            r2.mo72632j(r3)
            int r3 = r11.f182354b
            r5 = 2
            if (r3 != r5) goto L_0x02a5
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x02d7
        L_0x02a5:
            r7 = 1
            if (r3 != r7) goto L_0x02bc
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            int r7 = r3.f182229a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x02d3
            float r3 = r3.f182233e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x02d7
        L_0x02bc:
            if (r3 != r4) goto L_0x02d3
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.kg r3 = (com.google.speech.p5218j.C67079kg) r3
            int r5 = r3.f182342a
            r7 = 1
            r5 = r5 & r7
            if (r5 == 0) goto L_0x02d3
            float r3 = r3.f182344c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x02d7
        L_0x02d3:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x02d7:
            r2.mo72631i(r3)
            com.google.android.apps.gsa.nga.engine.b.g.ac r3 = r9.a
            java.lang.String r3 = r3.c()
            int r5 = r11.f182354b
            r7 = 2
            if (r5 != r7) goto L_0x02fe
            java.lang.Object r5 = r11.f182355c
            com.google.speech.j.ju r5 = (com.google.speech.p5218j.C67066ju) r5
            int r7 = r5.f182304a
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0335
            com.google.android.apps.gsa.nga.engine.recognition.o.f r7 = r1.f214191i
            com.google.android.apps.gsa.nga.engine.recognition.u r8 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            com.google.speech.j.ks r5 = r5.f182307d
            if (r5 != 0) goto L_0x02f9
            com.google.speech.j.ks r5 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x02f9:
            com.google.android.apps.gsa.nga.engine.recognition.ap r3 = r7.mo72853a(r3, r8, r5)
            goto L_0x033f
        L_0x02fe:
            r7 = 1
            if (r5 != r7) goto L_0x031a
            java.lang.Object r5 = r11.f182355c
            com.google.speech.j.ix r5 = (com.google.speech.p5218j.C67042ix) r5
            int r7 = r5.f182229a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x0335
            com.google.android.apps.gsa.nga.engine.recognition.o.f r7 = r1.f214191i
            com.google.android.apps.gsa.nga.engine.recognition.u r8 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            com.google.speech.j.ks r5 = r5.f182235g
            if (r5 != 0) goto L_0x0315
            com.google.speech.j.ks r5 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x0315:
            com.google.android.apps.gsa.nga.engine.recognition.ap r3 = r7.mo72853a(r3, r8, r5)
            goto L_0x033f
        L_0x031a:
            if (r5 != r4) goto L_0x0335
            java.lang.Object r5 = r11.f182355c
            com.google.speech.j.kg r5 = (com.google.speech.p5218j.C67079kg) r5
            int r7 = r5.f182342a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0335
            com.google.android.apps.gsa.nga.engine.recognition.o.f r7 = r1.f214191i
            com.google.android.apps.gsa.nga.engine.recognition.u r8 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            com.google.speech.j.ks r5 = r5.f182347f
            if (r5 != 0) goto L_0x0330
            com.google.speech.j.ks r5 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x0330:
            com.google.android.apps.gsa.nga.engine.recognition.ap r3 = r7.mo72853a(r3, r8, r5)
            goto L_0x033f
        L_0x0335:
            com.google.android.apps.gsa.nga.engine.recognition.o.f r5 = r1.f214191i
            com.google.android.apps.gsa.nga.engine.recognition.u r7 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA
            com.google.speech.j.ks r8 = com.google.speech.p5218j.C67091ks.f182386h
            com.google.android.apps.gsa.nga.engine.recognition.ap r3 = r5.mo72853a(r3, r7, r8)
        L_0x033f:
            r2.mo72633k(r3)
            com.google.android.apps.gsa.nga.engine.recognition.c r3 = r1.f214192j
            com.google.android.apps.gsa.nga.engine.b.g.ac r5 = r9.a
            j$.util.Optional r3 = r3.mo72721a(r5)
            r2.mo72624b(r3)
            int r3 = r11.f182354b
            int r5 = com.google.speech.p5218j.C67082kj.m97421a(r3)
            int r7 = r5 + -1
            if (r5 == 0) goto L_0x0607
            if (r7 == 0) goto L_0x038d
            r5 = 1
            if (r7 == r5) goto L_0x0378
            r5 = 2
            if (r7 == r5) goto L_0x0364
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x03a1
        L_0x0364:
            if (r3 != r4) goto L_0x036b
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.kg r3 = (com.google.speech.p5218j.C67079kg) r3
            goto L_0x036d
        L_0x036b:
            com.google.speech.j.kg r3 = com.google.speech.p5218j.C67079kg.f182340h
        L_0x036d:
            com.google.speech.j.if r3 = r3.f182348g
            if (r3 != 0) goto L_0x0373
            com.google.speech.j.if r3 = com.google.speech.p5218j.C67024if.f182184b
        L_0x0373:
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77752af.m124749d(r3)
            goto L_0x03a1
        L_0x0378:
            r5 = 2
            if (r3 != r5) goto L_0x0380
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.ju r3 = (com.google.speech.p5218j.C67066ju) r3
            goto L_0x0382
        L_0x0380:
            com.google.speech.j.ju r3 = com.google.speech.p5218j.C67066ju.f182302g
        L_0x0382:
            com.google.speech.j.if r3 = r3.f182309f
            if (r3 != 0) goto L_0x0388
            com.google.speech.j.if r3 = com.google.speech.p5218j.C67024if.f182184b
        L_0x0388:
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77752af.m124749d(r3)
            goto L_0x03a1
        L_0x038d:
            r5 = 1
            if (r3 != r5) goto L_0x0395
            java.lang.Object r3 = r11.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            goto L_0x0397
        L_0x0395:
            com.google.speech.j.ix r3 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x0397:
            com.google.speech.j.if r3 = r3.f182239k
            if (r3 != 0) goto L_0x039d
            com.google.speech.j.if r3 = com.google.speech.p5218j.C67024if.f182184b
        L_0x039d:
            j$.util.Optional r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77752af.m124749d(r3)
        L_0x03a1:
            r2.mo72627e(r3)
            r3 = r21
            int r5 = r3.f182368a
            r7 = 2
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0416
            com.google.speech.j.kk r5 = r3.f182370c
            if (r5 != 0) goto L_0x03b2
            com.google.speech.j.kk r5 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x03b2:
            int r8 = r5.f182354b
            if (r8 != r7) goto L_0x03b9
            r7 = 2
            r8 = 2
            goto L_0x03ba
        L_0x03b9:
            r7 = 1
        L_0x03ba:
            if (r8 != r4) goto L_0x03bd
            r7 = 3
        L_0x03bd:
            r10 = 1
            if (r8 != r10) goto L_0x03c2
            r8 = 4
            goto L_0x03c3
        L_0x03c2:
            r8 = r7
        L_0x03c3:
            com.google.android.apps.gsa.shared.logger.f.d r7 = com.google.android.apps.gsa.shared.logger.p7060f.C89915d.f246343e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.shared.logger.f.a r7 = (com.google.android.apps.gsa.shared.logger.p7060f.C89912a) r7
            int r10 = r5.f182353a
            r10 = r10 & 8
            if (r10 == 0) goto L_0x03d9
            int r10 = r5.f182356d
            int r10 = com.google.speech.p5218j.C67161nh.m97429a(r10)
            if (r10 != 0) goto L_0x03da
        L_0x03d9:
            r10 = 1
        L_0x03da:
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.android.apps.gsa.shared.logger.f.d r12 = (com.google.android.apps.gsa.shared.logger.p7060f.C89915d) r12
            r13 = -1
            int r10 = r10 + r13
            r12.f246347b = r10
            int r10 = r12.f246346a
            r13 = 1
            r10 = r10 | r13
            r12.f246346a = r10
            java.lang.String r5 = r5.f182358f
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.apps.gsa.shared.logger.f.d r10 = (com.google.android.apps.gsa.shared.logger.p7060f.C89915d) r10
            r5.getClass()
            int r12 = r10.f246346a
            r13 = 2
            r12 = r12 | r13
            r10.f246346a = r12
            r10.f246348c = r5
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.android.apps.gsa.shared.logger.f.d r5 = (com.google.android.apps.gsa.shared.logger.p7060f.C89915d) r5
            r10 = -1
            int r8 = r8 + r10
            r5.f246349d = r8
            int r8 = r5.f246346a
            r8 = r8 | r4
            r5.f246346a = r8
            com.google.protobuf.bv r5 = r7.build()
            com.google.android.apps.gsa.shared.logger.f.d r5 = (com.google.android.apps.gsa.shared.logger.p7060f.C89915d) r5
            goto L_0x0418
        L_0x0416:
            com.google.android.apps.gsa.shared.logger.f.d r5 = com.google.android.apps.gsa.shared.logger.p7060f.C89915d.f246343e
        L_0x0418:
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            if (r5 == 0) goto L_0x05ff
            r0.f214389h = r5
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r0 = r1.f214189g
            j$.util.Optional r0 = r0.mo72821c()
            com.google.android.apps.gsa.nga.engine.recognition.l.a.ad r5 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.ad
            r5.<init>(r2)
            r0.ifPresent(r5)
            com.google.android.apps.gsa.nga.engine.recognition.aj r0 = r2.mo72623a()
            com.google.android.apps.gsa.nga.engine.recognition.ab r2 = r1.f214184b
            java.lang.String r5 = r3.f182374g
            r2.mo72602c(r0, r5)
            int r0 = r11.f182354b
            r2 = 1
            if (r0 != r2) goto L_0x04d1
            com.google.android.apps.gsa.nga.engine.recognition.l.a.o r0 = r1.f214190h
            java.lang.Object r2 = r11.f182355c
            com.google.speech.j.ix r2 = (com.google.speech.p5218j.C67042ix) r2
            com.google.speech.j.kw r2 = r2.f182237i
            if (r2 != 0) goto L_0x044a
            com.google.speech.j.kw r2 = com.google.speech.p5218j.C67095kw.f182399i
        L_0x044a:
            com.google.android.apps.gsa.nga.shared.v.io r5 = r6.c()
            java.util.concurrent.atomic.AtomicReference r6 = r0.f214346d
            java.lang.Object r6 = r6.get()
            j$.time.Duration r6 = (p3186j$.time.Duration) r6
            if (r6 == 0) goto L_0x046b
            int r7 = r2.f182401a
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x046b
            com.google.android.apps.gsa.nga.engine.recognition.k.a r7 = r0.f214344b
            long r12 = r2.f182406f
            j$.time.Duration r8 = r6.plusMillis(r12)
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r10 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.SODA
            r7.mo72792g(r8, r5, r10)
        L_0x046b:
            if (r6 == 0) goto L_0x04ba
            com.google.android.apps.gsa.shared.util.v.g r7 = r0.f214345c
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251775pf
            boolean r7 = r7.mo85405j(r8)
            if (r7 == 0) goto L_0x048b
            int r7 = r2.f182401a
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x048b
            com.google.android.apps.gsa.nga.engine.recognition.k.a r7 = r0.f214344b
            long r12 = r2.f182406f
            j$.time.Duration r2 = r6.plusMillis(r12)
            com.google.common.o.po r6 = com.google.common.p4552o.C60420po.SODA_TRUE_EOQ
            r7.mo72790e(r2, r6, r5)
            goto L_0x04b8
        L_0x048b:
            int r7 = r2.f182401a
            r8 = r7 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x04a3
            long r7 = r2.f182408h
            j$.time.Duration r2 = com.google.common.p4580v.C60944c.m93092e(r7)
            j$.time.Duration r2 = r6.plus(r2)
            com.google.android.apps.gsa.nga.engine.recognition.k.a r6 = r0.f214344b
            com.google.common.o.po r7 = com.google.common.p4552o.C60420po.SODA_NATIVE
            r6.mo72790e(r2, r7, r5)
            goto L_0x04b8
        L_0x04a3:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x04b8
            long r7 = r2.f182404d
            j$.time.Duration r2 = com.google.common.p4580v.C60944c.m93092e(r7)
            j$.time.Duration r2 = r6.plus(r2)
            com.google.android.apps.gsa.nga.engine.recognition.k.a r6 = r0.f214344b
            com.google.common.o.po r7 = com.google.common.p4552o.C60420po.SODA_ENDPOINTER_FALLBACK
            r6.mo72790e(r2, r7, r5)
        L_0x04b8:
            r6 = 3
            goto L_0x04c8
        L_0x04ba:
            int r2 = r0.f214348f
            r6 = 3
            if (r2 != r6) goto L_0x04c8
            com.google.android.apps.gsa.nga.engine.recognition.k.a r2 = r0.f214344b
            j$.time.Duration r7 = r0.f214347e
            com.google.common.o.po r8 = com.google.common.p4552o.C60420po.SODA_AUDIO_LEVEL
            r2.mo72790e(r7, r8, r5)
        L_0x04c8:
            int r2 = r0.f214348f
            if (r2 != r6) goto L_0x04d0
            r2 = 1
            r0.f214348f = r2
            goto L_0x04d1
        L_0x04d0:
            r2 = 1
        L_0x04d1:
            int r0 = r11.f182354b
            if (r0 != r2) goto L_0x04fa
            com.google.android.apps.gsa.shared.util.v.g r0 = r1.f214186d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251516kL
            boolean r0 = r0.mo85405j(r2)
            if (r0 == 0) goto L_0x04ea
            if (r20 != 0) goto L_0x04e2
            goto L_0x04ea
        L_0x04e2:
            com.google.android.apps.gsa.nga.engine.recognition.k.a r0 = r1.f214194l
            r1 = 12
            r0.mo72795j(r1)
            return
        L_0x04ea:
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bv r0 = r1.f214193k
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r9.a
            com.google.android.libraries.gsa.k.g r5 = r0.f214321b
            com.google.android.apps.gsa.nga.engine.recognition.l.a.br r6 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.br
            r6.<init>(r0, r2)
            java.lang.String r0 = "[NGA] SodaSpeechRecognizer.stopVerification"
            r5.mo28212l(r0, r6)
        L_0x04fa:
            com.google.speech.j.kk r0 = r3.f182370c
            if (r0 != 0) goto L_0x0500
            com.google.speech.j.kk r0 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x0500:
            int r0 = r0.f182354b
            r2 = 1
            if (r0 != r2) goto L_0x05fe
            com.google.android.apps.gsa.shared.util.v.g r0 = r1.f214186d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251044bQ
            boolean r0 = r0.mo85405j(r2)
            if (r0 == 0) goto L_0x05fe
            com.google.android.apps.gsa.nga.engine.b.g.ac r0 = r9.a
            com.google.speech.j.kk r2 = r3.f182370c
            if (r2 != 0) goto L_0x0517
            com.google.speech.j.kk r2 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x0517:
            int r5 = r2.f182354b
            r6 = 1
            if (r5 != r6) goto L_0x0521
            java.lang.Object r2 = r2.f182355c
            com.google.speech.j.ix r2 = (com.google.speech.p5218j.C67042ix) r2
            goto L_0x0523
        L_0x0521:
            com.google.speech.j.ix r2 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x0523:
            com.google.speech.j.p r5 = r2.f182234f
            if (r5 != 0) goto L_0x0529
            com.google.speech.j.p r5 = com.google.speech.p5218j.C67171p.f182575e
        L_0x0529:
            com.google.android.apps.gsa.nga.shared.ab.c.b.d r6 = com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80549d.f221098d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.nga.shared.ab.c.b.c r6 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80548c) r6
            com.google.speech.j.kw r7 = r2.f182237i
            if (r7 != 0) goto L_0x0537
            com.google.speech.j.kw r7 = com.google.speech.p5218j.C67095kw.f182399i
        L_0x0537:
            long r7 = r7.f182402b
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.d r9 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80549d) r9
            int r10 = r9.f221100a
            r11 = 1
            r10 = r10 | r11
            r9.f221100a = r10
            r9.f221101b = r7
            com.google.speech.j.kk r3 = r3.f182370c
            if (r3 != 0) goto L_0x054e
            com.google.speech.j.kk r3 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x054e:
            int r7 = r3.f182354b
            if (r7 != r11) goto L_0x0557
            java.lang.Object r3 = r3.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            goto L_0x0559
        L_0x0557:
            com.google.speech.j.ix r3 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x0559:
            com.google.protobuf.cq r3 = r3.f182231c
            java.util.Iterator r3 = r3.iterator()
        L_0x055f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x057a
            java.lang.Object r7 = r3.next()
            com.google.speech.j.jm r7 = (com.google.speech.p5218j.C67058jm) r7
            long r7 = r7.f182286a
            com.google.speech.j.kw r9 = r2.f182237i
            if (r9 != 0) goto L_0x0573
            com.google.speech.j.kw r9 = com.google.speech.p5218j.C67095kw.f182399i
        L_0x0573:
            long r9 = r9.f182405e
            long r7 = r7 - r9
            r6.mo74348a(r7)
            goto L_0x055f
        L_0x057a:
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r2 = com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b.f221090g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.nga.shared.ab.c.b.a r2 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80546a) r2
            com.google.protobuf.z r3 = r5.f182578b
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r7 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r7
            r3.getClass()
            int r8 = r7.f221092a
            r9 = 1
            r8 = r8 | r9
            r7.f221092a = r8
            r7.f221093b = r3
            com.google.speech.j.t r3 = r5.f182579c
            if (r3 != 0) goto L_0x059c
            com.google.speech.j.t r3 = com.google.speech.p5218j.C67175t.f182588e
        L_0x059c:
            int r3 = r3.f182592c
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r7 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r7
            int r8 = r7.f221092a
            r9 = 2
            r8 = r8 | r9
            r7.f221092a = r8
            r7.f221094c = r3
            com.google.speech.j.t r3 = r5.f182579c
            if (r3 != 0) goto L_0x05b3
            com.google.speech.j.t r3 = com.google.speech.p5218j.C67175t.f182588e
        L_0x05b3:
            int r3 = r3.f182593d
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r5 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r5
            int r7 = r5.f221092a
            r4 = r4 | r7
            r5.f221092a = r4
            r5.f221095d = r3
            com.google.android.apps.gsa.nga.shared.v.io r0 = r0.b()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r3 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r3
            r0.getClass()
            r3.f221096e = r0
            int r0 = r3.f221092a
            r0 = r0 | 8
            r3.f221092a = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r0 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r0
            com.google.protobuf.bv r3 = r6.build()
            com.google.android.apps.gsa.nga.shared.ab.c.b.d r3 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80549d) r3
            r3.getClass()
            r0.f221097f = r3
            int r3 = r0.f221092a
            r3 = r3 | 16
            r0.f221092a = r3
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.gsa.nga.shared.ab.c.b.b r0 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b) r0
            com.google.android.apps.gsa.nga.engine.recognition.h.a.a r1 = r1.f214198p
            java.util.concurrent.atomic.AtomicReference r1 = r1.f213880c
            r1.set(r0)
        L_0x05fe:
            return
        L_0x05ff:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null recognitionEventDebugData"
            r0.<init>(r1)
            throw r0
        L_0x0607:
            r0 = 0
            throw r0
        L_0x0609:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null eventType"
            r0.<init>(r1)
            goto L_0x0612
        L_0x0611:
            throw r0
        L_0x0612:
            goto L_0x0611
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77820y.run():void");
    }
}
