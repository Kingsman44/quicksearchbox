package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C100732ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C91006f f281621a;

    public /* synthetic */ C100732ao(C91006f fVar) {
        this.f281621a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.apps.gsa.shared.util.debug.a.f r0 = r13.f281621a
            com.google.common.b.gu r14 = (com.google.common.p4522b.C58485gu) r14
            java.util.List r14 = com.google.common.p4522b.C58597ky.m90216g(r14)
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000f:
            boolean r4 = r14.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x02a8
            java.lang.Object r4 = r14.next()
            com.google.speech.m.w r4 = (com.google.speech.p5228m.C67359w) r4
            org.c.a.w r6 = new org.c.a.w
            com.google.speech.m.y r7 = r4.f183089a
            if (r7 != 0) goto L_0x0024
            com.google.speech.m.y r7 = com.google.speech.p5228m.C67361y.f183093c
        L_0x0024:
            long r7 = r7.f183096b
            org.c.a.t r7 = com.google.p4476cf.p4477a.C58059a.m88814a(r7)
            r6.<init>(r7)
            org.c.a.e.b r7 = org.p5633c.p5634a.p5639e.C72267x.f192324e
            java.lang.String r6 = r7.mo63597c(r6)
            com.google.protobuf.z r7 = r4.f183091c     // Catch:{ ct -> 0x0278 }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0278 }
            com.google.speech.m.a.n r9 = com.google.speech.p5228m.p5229a.C67265n.f182842c     // Catch:{ ct -> 0x0278 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (com.google.protobuf.C63088z) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x0278 }
            com.google.speech.m.a.n r7 = (com.google.speech.p5228m.p5229a.C67265n) r7     // Catch:{ ct -> 0x0278 }
            int r8 = r7.f182844a     // Catch:{ ct -> 0x0278 }
            r9 = 1
            if (r8 != r9) goto L_0x0139
            if (r1 != 0) goto L_0x0137
            r0.mo85281e(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0134 }
            r1.<init>()     // Catch:{ ct -> 0x0134 }
            r1.append(r6)     // Catch:{ ct -> 0x0134 }
            java.lang.String r5 = " Sheldon Eligibility Metrics"
            r1.append(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = r1.toString()     // Catch:{ ct -> 0x0134 }
            r0.mo85291r(r1)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "LpResourcesPresent"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x006e
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x0070
        L_0x006e:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x0070:
            boolean r5 = r5.f182830b     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "PlanFilePresent"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x008c
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x008e
        L_0x008c:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x008e:
            boolean r5 = r5.f182831c     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "SheldonOptedIn"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x00aa
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x00ac
        L_0x00aa:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x00ac:
            boolean r5 = r5.f182832d     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "AsrFtEnabled"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x00c8
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x00ca
        L_0x00c8:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x00ca:
            boolean r5 = r5.f182833e     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "LmFtEnabled"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x00e6
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x00e8
        L_0x00e6:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x00e8:
            boolean r5 = r5.f182834f     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "RecognitionCachingEnabled"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x0104
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x0106
        L_0x0104:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x0106:
            boolean r5 = r5.f182835g     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            java.lang.String r1 = "SodaRecognitionHasFinalResult"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r0.mo85279c(r1)     // Catch:{ ct -> 0x0134 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x0134 }
            if (r5 != r9) goto L_0x0122
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x0134 }
            com.google.speech.m.a.j r5 = (com.google.speech.p5228m.p5229a.C67261j) r5     // Catch:{ ct -> 0x0134 }
            goto L_0x0124
        L_0x0122:
            com.google.speech.m.a.j r5 = com.google.speech.p5228m.p5229a.C67261j.f182827i     // Catch:{ ct -> 0x0134 }
        L_0x0124:
            boolean r5 = r5.f182836h     // Catch:{ ct -> 0x0134 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ct -> 0x0134 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r5)     // Catch:{ ct -> 0x0134 }
            r1.mo85276a(r5)     // Catch:{ ct -> 0x0134 }
            r1 = 1
            goto L_0x000f
        L_0x0134:
            r1 = move-exception
            goto L_0x027b
        L_0x0137:
            r1 = 1
            r8 = 1
        L_0x0139:
            r10 = 2
            if (r8 != r10) goto L_0x01aa
            if (r2 != 0) goto L_0x01a9
            r0.mo85281e(r5)     // Catch:{ ct -> 0x01a3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ct -> 0x01a3 }
            r2.<init>()     // Catch:{ ct -> 0x01a3 }
            r2.append(r6)     // Catch:{ ct -> 0x01a3 }
            java.lang.String r5 = " Sheldon Training Metrics"
            r2.append(r5)     // Catch:{ ct -> 0x01a3 }
            java.lang.String r2 = r2.toString()     // Catch:{ ct -> 0x01a3 }
            r0.mo85291r(r2)     // Catch:{ ct -> 0x01a3 }
            java.lang.String r2 = "Model Name"
            com.google.android.apps.gsa.shared.util.debug.a.e r2 = r0.mo85279c(r2)     // Catch:{ ct -> 0x01a3 }
            int r5 = r7.f182844a     // Catch:{ ct -> 0x01a3 }
            if (r5 != r10) goto L_0x0164
            java.lang.Object r5 = r7.f182845b     // Catch:{ ct -> 0x01a3 }
            com.google.speech.m.a.r r5 = (com.google.speech.p5228m.p5229a.C67269r) r5     // Catch:{ ct -> 0x01a3 }
            goto L_0x0166
        L_0x0164:
            com.google.speech.m.a.r r5 = com.google.speech.p5228m.p5229a.C67269r.f182851c     // Catch:{ ct -> 0x01a3 }
        L_0x0166:
            java.lang.String r5 = r5.f182853a     // Catch:{ ct -> 0x01a3 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r5)     // Catch:{ ct -> 0x01a3 }
            r2.mo85276a(r5)     // Catch:{ ct -> 0x01a3 }
            int r2 = r7.f182844a     // Catch:{ ct -> 0x01a3 }
            if (r2 != r10) goto L_0x0178
            java.lang.Object r2 = r7.f182845b     // Catch:{ ct -> 0x01a3 }
            com.google.speech.m.a.r r2 = (com.google.speech.p5228m.p5229a.C67269r) r2     // Catch:{ ct -> 0x01a3 }
            goto L_0x017a
        L_0x0178:
            com.google.speech.m.a.r r2 = com.google.speech.p5228m.p5229a.C67269r.f182851c     // Catch:{ ct -> 0x01a3 }
        L_0x017a:
            com.google.protobuf.cq r2 = r2.f182854b     // Catch:{ ct -> 0x01a3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ct -> 0x01a3 }
        L_0x0180:
            boolean r5 = r2.hasNext()     // Catch:{ ct -> 0x01a3 }
            if (r5 == 0) goto L_0x01a0
            java.lang.Object r5 = r2.next()     // Catch:{ ct -> 0x01a3 }
            com.google.speech.m.a.q r5 = (com.google.speech.p5228m.p5229a.C67268q) r5     // Catch:{ ct -> 0x01a3 }
            java.lang.String r6 = r5.f182848a     // Catch:{ ct -> 0x01a3 }
            com.google.android.apps.gsa.shared.util.debug.a.e r6 = r0.mo85279c(r6)     // Catch:{ ct -> 0x01a3 }
            float r5 = r5.f182849b     // Catch:{ ct -> 0x01a3 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ ct -> 0x01a3 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r5)     // Catch:{ ct -> 0x01a3 }
            r6.mo85276a(r5)     // Catch:{ ct -> 0x01a3 }
            goto L_0x0180
        L_0x01a0:
            r2 = 1
            goto L_0x000f
        L_0x01a3:
            r2 = move-exception
            r9 = r1
            r1 = r2
            r2 = 1
            goto L_0x027b
        L_0x01a9:
            r2 = 1
        L_0x01aa:
            r11 = 3
            if (r8 != r11) goto L_0x000f
            if (r3 != 0) goto L_0x0275
            r0.mo85281e(r5)     // Catch:{ ct -> 0x0270 }
            int r3 = r7.f182844a     // Catch:{ ct -> 0x0270 }
            if (r3 != r11) goto L_0x01bb
            java.lang.Object r3 = r7.f182845b     // Catch:{ ct -> 0x0270 }
            com.google.speech.m.a.h r3 = (com.google.speech.p5228m.p5229a.C67259h) r3     // Catch:{ ct -> 0x0270 }
            goto L_0x01bd
        L_0x01bb:
            com.google.speech.m.a.h r3 = com.google.speech.p5228m.p5229a.C67259h.f182823c     // Catch:{ ct -> 0x0270 }
        L_0x01bd:
            com.google.protobuf.cq r3 = r3.f182825a     // Catch:{ ct -> 0x0270 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ ct -> 0x0270 }
        L_0x01c3:
            boolean r5 = r3.hasNext()     // Catch:{ ct -> 0x0270 }
            if (r5 == 0) goto L_0x0202
            java.lang.Object r5 = r3.next()     // Catch:{ ct -> 0x0270 }
            com.google.speech.m.a.b r5 = (com.google.speech.p5228m.p5229a.C67253b) r5     // Catch:{ ct -> 0x0270 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0270 }
            r8.<init>()     // Catch:{ ct -> 0x0270 }
            r8.append(r6)     // Catch:{ ct -> 0x0270 }
            java.lang.String r12 = " Sheldon ASR Materializer Examples"
            r8.append(r12)     // Catch:{ ct -> 0x0270 }
            java.lang.String r8 = r8.toString()     // Catch:{ ct -> 0x0270 }
            r0.mo85291r(r8)     // Catch:{ ct -> 0x0270 }
            java.lang.String r8 = "Correct Transcription"
            com.google.android.apps.gsa.shared.util.debug.a.e r8 = r0.mo85279c(r8)     // Catch:{ ct -> 0x0270 }
            java.lang.String r12 = r5.f182814a     // Catch:{ ct -> 0x0270 }
            com.google.android.apps.gsa.shared.util.b.i r12 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r12)     // Catch:{ ct -> 0x0270 }
            r8.mo85276a(r12)     // Catch:{ ct -> 0x0270 }
            java.lang.String r8 = "Misrecognition"
            com.google.android.apps.gsa.shared.util.debug.a.e r8 = r0.mo85279c(r8)     // Catch:{ ct -> 0x0270 }
            java.lang.String r5 = r5.f182815b     // Catch:{ ct -> 0x0270 }
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r5)     // Catch:{ ct -> 0x0270 }
            r8.mo85276a(r5)     // Catch:{ ct -> 0x0270 }
            goto L_0x01c3
        L_0x0202:
            int r3 = r7.f182844a     // Catch:{ ct -> 0x0270 }
            if (r3 != r11) goto L_0x020b
            java.lang.Object r3 = r7.f182845b     // Catch:{ ct -> 0x0270 }
            com.google.speech.m.a.h r3 = (com.google.speech.p5228m.p5229a.C67259h) r3     // Catch:{ ct -> 0x0270 }
            goto L_0x020d
        L_0x020b:
            com.google.speech.m.a.h r3 = com.google.speech.p5228m.p5229a.C67259h.f182823c     // Catch:{ ct -> 0x0270 }
        L_0x020d:
            com.google.protobuf.cq r3 = r3.f182826b     // Catch:{ ct -> 0x0270 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ ct -> 0x0270 }
        L_0x0213:
            boolean r5 = r3.hasNext()     // Catch:{ ct -> 0x0270 }
            if (r5 == 0) goto L_0x0275
            java.lang.Object r5 = r3.next()     // Catch:{ ct -> 0x0270 }
            com.google.speech.m.a.g r5 = (com.google.speech.p5228m.p5229a.C67258g) r5     // Catch:{ ct -> 0x0270 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0270 }
            r7.<init>()     // Catch:{ ct -> 0x0270 }
            r7.append(r6)     // Catch:{ ct -> 0x0270 }
            java.lang.String r8 = " Sheldon LM Materializer Examples"
            r7.append(r8)     // Catch:{ ct -> 0x0270 }
            java.lang.String r7 = r7.toString()     // Catch:{ ct -> 0x0270 }
            r0.mo85291r(r7)     // Catch:{ ct -> 0x0270 }
            java.lang.String r7 = "Sheldon Query"
            com.google.android.apps.gsa.shared.util.debug.a.e r7 = r0.mo85279c(r7)     // Catch:{ ct -> 0x0270 }
            java.lang.String r8 = r5.f182820a     // Catch:{ ct -> 0x0270 }
            com.google.android.apps.gsa.shared.util.b.i r8 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r8)     // Catch:{ ct -> 0x0270 }
            r7.mo85276a(r8)     // Catch:{ ct -> 0x0270 }
            java.lang.String r7 = "Source Type"
            com.google.android.apps.gsa.shared.util.debug.a.e r7 = r0.mo85279c(r7)     // Catch:{ ct -> 0x0270 }
            int r5 = r5.f182821b     // Catch:{ ct -> 0x0270 }
            int r5 = com.google.speech.p5228m.p5229a.C67257f.m97446a(r5)     // Catch:{ ct -> 0x0270 }
            if (r5 != 0) goto L_0x0251
            goto L_0x0266
        L_0x0251:
            if (r5 == r9) goto L_0x0266
            if (r5 == r10) goto L_0x0263
            if (r5 == r11) goto L_0x0260
            r8 = 4
            if (r5 == r8) goto L_0x025d
            java.lang.String r5 = "WEB_SEARCH_FOOTPRINT"
            goto L_0x0268
        L_0x025d:
            java.lang.String r5 = "ASSISTANT_FOOTPRINT"
            goto L_0x0268
        L_0x0260:
            java.lang.String r5 = "EKHO_VOICE_QUERY"
            goto L_0x0268
        L_0x0263:
            java.lang.String r5 = "EKHO_TEXT_QUERY"
            goto L_0x0268
        L_0x0266:
            java.lang.String r5 = "UNKNOWN"
        L_0x0268:
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r5)     // Catch:{ ct -> 0x0270 }
            r7.mo85276a(r5)     // Catch:{ ct -> 0x0270 }
            goto L_0x0213
        L_0x0270:
            r3 = move-exception
            r9 = r1
            r1 = r3
            r3 = 1
            goto L_0x027b
        L_0x0275:
            r3 = 1
            goto L_0x000f
        L_0x0278:
            r5 = move-exception
            r9 = r1
            r1 = r5
        L_0x027b:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100733ap.f281622a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "FedAssDump"
            r5.mo56378ag(r6, r7)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.x r1 = r5.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r5 = 19520(0x4c40, float:2.7353E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r5)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.speech.m.y r4 = r4.f183089a
            if (r4 != 0) goto L_0x029e
            com.google.speech.m.y r4 = com.google.speech.p5228m.C67361y.f183093c
        L_0x029e:
            java.lang.String r5 = "Error Parsing Sheldon Log metrics. Ekho Event Timestamp: [%s]"
            long r6 = r4.f183096b
            r1.mo56388r(r5, r6)
            r1 = r9
            goto L_0x000f
        L_0x02a8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100732ao.apply(java.lang.Object):java.lang.Object");
    }
}
