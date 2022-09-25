package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.metadata.C3586c;

/* renamed from: androidx.media3.extractor.metadata.scte35.b */
/* compiled from: PG */
public final class C3615b extends C3586c {

    /* renamed from: a */
    private final C2604ac f11532a = new C2604ac();

    /* renamed from: b */
    private final C2603ab f11533b = new C2603ab();

    /* renamed from: c */
    private C2609ah f11534c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.media3.extractor.metadata.scte35.SpliceNullCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: androidx.media3.extractor.metadata.scte35.TimeSignalCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: androidx.media3.extractor.metadata.scte35.PrivateCommand} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.Metadata mo7492b(androidx.media3.extractor.metadata.C3585b r54, java.nio.ByteBuffer r55) {
        /*
            r53 = this;
            r0 = r53
            r1 = r54
            androidx.media3.common.b.ah r2 = r0.f11534c
            if (r2 == 0) goto L_0x0012
            long r3 = r1.f11423g
            long r5 = r2.mo6183e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0023
        L_0x0012:
            androidx.media3.common.b.ah r2 = new androidx.media3.common.b.ah
            long r3 = r1.f6957e
            r2.<init>(r3)
            r0.f11534c = r2
            long r3 = r1.f6957e
            long r5 = r1.f11423g
            long r3 = r3 - r5
            r2.mo6179a(r3)
        L_0x0023:
            byte[] r1 = r55.array()
            int r2 = r55.limit()
            androidx.media3.common.b.ac r3 = r0.f11532a
            r3.mo6157y(r1, r2)
            androidx.media3.common.b.ab r3 = r0.f11533b
            r3.mo6123h(r1, r2)
            androidx.media3.common.b.ab r1 = r0.f11533b
            r2 = 39
            r1.mo6126k(r2)
            androidx.media3.common.b.ab r1 = r0.f11533b
            r2 = 1
            int r1 = r1.mo6119d(r2)
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            androidx.media3.common.b.ab r5 = r0.f11533b
            int r5 = r5.mo6119d(r1)
            long r5 = (long) r5
            long r11 = r3 | r5
            androidx.media3.common.b.ab r3 = r0.f11533b
            r4 = 20
            r3.mo6126k(r4)
            androidx.media3.common.b.ab r3 = r0.f11533b
            r4 = 12
            int r3 = r3.mo6119d(r4)
            androidx.media3.common.b.ab r4 = r0.f11533b
            r5 = 8
            int r4 = r4.mo6119d(r5)
            androidx.media3.common.b.ac r5 = r0.f11532a
            int r6 = r5.f7235b
            int r6 = r6 + 14
            r5.mo6131A(r6)
            if (r4 == 0) goto L_0x0299
            r7 = 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L_0x0284
            r3 = 4
            r14 = 1
            r16 = 0
            r18 = 128(0x80, double:6.32E-322)
            if (r4 == r3) goto L_0x0185
            r3 = 5
            if (r4 == r3) goto L_0x009b
            r1 = 6
            if (r4 == r1) goto L_0x0088
            r1 = 0
            goto L_0x029e
        L_0x0088:
            androidx.media3.common.b.ac r1 = r0.f11532a
            androidx.media3.common.b.ah r3 = r0.f11534c
            long r7 = androidx.media3.extractor.metadata.scte35.TimeSignalCommand.m10436d(r1, r11)
            long r3 = r3.mo6180b(r7)
            androidx.media3.extractor.metadata.scte35.TimeSignalCommand r1 = new androidx.media3.extractor.metadata.scte35.TimeSignalCommand
            r1.<init>(r7, r3)
            goto L_0x029e
        L_0x009b:
            androidx.media3.common.b.ac r3 = r0.f11532a
            androidx.media3.common.b.ah r4 = r0.f11534c
            long r21 = r3.mo6146n()
            int r2 = r3.mo6139g()
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00ae
            r23 = 1
            goto L_0x00b0
        L_0x00ae:
            r23 = 0
        L_0x00b0:
            java.util.List r2 = java.util.Collections.emptyList()
            if (r23 != 0) goto L_0x015b
            int r5 = r3.mo6139g()
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00c0
            r6 = 1
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            r20 = r5 & 64
            if (r20 == 0) goto L_0x00c8
            r20 = 1
            goto L_0x00ca
        L_0x00c8:
            r20 = 0
        L_0x00ca:
            r24 = r5 & 32
            r5 = r5 & 16
            if (r5 == 0) goto L_0x00d2
            r5 = 1
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            if (r20 == 0) goto L_0x00dc
            if (r5 != 0) goto L_0x00dc
            long r25 = androidx.media3.extractor.metadata.scte35.TimeSignalCommand.m10436d(r3, r11)
            goto L_0x00e1
        L_0x00dc:
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e1:
            if (r20 != 0) goto L_0x0115
            int r2 = r3.mo6139g()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            r7 = 0
        L_0x00ed:
            if (r7 >= r2) goto L_0x0114
            int r30 = r3.mo6139g()
            if (r5 != 0) goto L_0x00fc
            long r31 = androidx.media3.extractor.metadata.scte35.TimeSignalCommand.m10436d(r3, r11)
            r9 = r31
            goto L_0x0101
        L_0x00fc:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0101:
            androidx.media3.extractor.metadata.scte35.d r8 = new androidx.media3.extractor.metadata.scte35.d
            long r33 = r4.mo6180b(r9)
            r29 = r8
            r31 = r9
            r29.<init>(r30, r31, r33)
            r13.add(r8)
            int r7 = r7 + 1
            goto L_0x00ed
        L_0x0114:
            r2 = r13
        L_0x0115:
            if (r24 == 0) goto L_0x0134
            int r7 = r3.mo6139g()
            long r7 = (long) r7
            long r9 = r7 & r18
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0124
            r9 = 1
            goto L_0x0125
        L_0x0124:
            r9 = 0
        L_0x0125:
            long r7 = r7 & r14
            long r7 = r7 << r1
            long r10 = r3.mo6146n()
            long r7 = r7 | r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r10
            r10 = 90
            long r7 = r7 / r10
            goto L_0x013a
        L_0x0134:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x013a:
            int r1 = r3.mo6142j()
            int r10 = r3.mo6139g()
            int r3 = r3.mo6139g()
            r35 = r1
            r31 = r2
            r37 = r3
            r24 = r6
            r33 = r7
            r32 = r9
            r36 = r10
            r1 = r25
            r26 = r5
            r25 = r20
            goto L_0x0175
        L_0x015b:
            r31 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r25 = 0
            r26 = 0
            r32 = 0
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r35 = 0
            r36 = 0
            r37 = 0
        L_0x0175:
            androidx.media3.extractor.metadata.scte35.SpliceInsertCommand r3 = new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand
            r20 = r3
            long r29 = r4.mo6180b(r1)
            r27 = r1
            r20.<init>(r21, r23, r24, r25, r26, r27, r29, r31, r32, r33, r35, r36, r37)
            r1 = r3
            goto L_0x029e
        L_0x0185:
            androidx.media3.common.b.ac r2 = r0.f11532a
            int r3 = r2.mo6139g()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
        L_0x0191:
            if (r5 >= r3) goto L_0x027e
            long r39 = r2.mo6146n()
            int r6 = r2.mo6139g()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01a2
            r41 = 1
            goto L_0x01a4
        L_0x01a2:
            r41 = 0
        L_0x01a4:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r41 != 0) goto L_0x024c
            int r7 = r2.mo6139g()
            r8 = r7 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01b5
            r8 = 1
            goto L_0x01b6
        L_0x01b5:
            r8 = 0
        L_0x01b6:
            r9 = r7 & 64
            if (r9 == 0) goto L_0x01bc
            r9 = 1
            goto L_0x01bd
        L_0x01bc:
            r9 = 0
        L_0x01bd:
            r7 = r7 & 32
            if (r9 == 0) goto L_0x01c6
            long r10 = r2.mo6146n()
            goto L_0x01cb
        L_0x01c6:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01cb:
            if (r9 != 0) goto L_0x01f8
            int r6 = r2.mo6139g()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r6)
            r13 = 0
        L_0x01d7:
            if (r13 >= r6) goto L_0x01f4
            int r1 = r2.mo6139g()
            long r14 = r2.mo6146n()
            r23 = r3
            androidx.media3.extractor.metadata.scte35.g r3 = new androidx.media3.extractor.metadata.scte35.g
            r3.<init>(r1, r14)
            r12.add(r3)
            int r13 = r13 + 1
            r3 = r23
            r1 = 32
            r14 = 1
            goto L_0x01d7
        L_0x01f4:
            r23 = r3
            r6 = r12
            goto L_0x01fa
        L_0x01f8:
            r23 = r3
        L_0x01fa:
            if (r7 == 0) goto L_0x021f
            int r1 = r2.mo6139g()
            long r12 = (long) r1
            long r14 = r12 & r18
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x0209
            r1 = 1
            goto L_0x020a
        L_0x0209:
            r1 = 0
        L_0x020a:
            r14 = 1
            long r12 = r12 & r14
            r3 = 32
            long r12 = r12 << r3
            long r20 = r2.mo6146n()
            long r12 = r12 | r20
            r20 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r20
            r24 = 90
            long r12 = r12 / r24
            goto L_0x022d
        L_0x021f:
            r3 = 32
            r14 = 1
            r20 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r1 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x022d:
            int r7 = r2.mo6142j()
            int r22 = r2.mo6139g()
            int r26 = r2.mo6139g()
            r47 = r1
            r44 = r6
            r50 = r7
            r42 = r8
            r43 = r9
            r45 = r10
            r48 = r12
            r51 = r22
            r52 = r26
            goto L_0x026c
        L_0x024c:
            r23 = r3
            r3 = 32
            r20 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r44 = r6
            r42 = 0
            r43 = 0
            r45 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r47 = 0
            r48 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r50 = 0
            r51 = 0
            r52 = 0
        L_0x026c:
            androidx.media3.extractor.metadata.scte35.h r1 = new androidx.media3.extractor.metadata.scte35.h
            r38 = r1
            r38.<init>(r39, r41, r42, r43, r44, r45, r47, r48, r50, r51, r52)
            r4.add(r1)
            int r5 = r5 + 1
            r3 = r23
            r1 = 32
            goto L_0x0191
        L_0x027e:
            androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand r1 = new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand
            r1.<init>((java.util.List) r4)
            goto L_0x029e
        L_0x0284:
            androidx.media3.common.b.ac r1 = r0.f11532a
            long r8 = r1.mo6146n()
            int r3 = r3 + -4
            byte[] r10 = new byte[r3]
            r2 = 0
            r1.mo6155w(r10, r2, r3)
            androidx.media3.extractor.metadata.scte35.PrivateCommand r1 = new androidx.media3.extractor.metadata.scte35.PrivateCommand
            r7 = r1
            r7.<init>(r8, r10, r11)
            goto L_0x029e
        L_0x0299:
            androidx.media3.extractor.metadata.scte35.SpliceNullCommand r1 = new androidx.media3.extractor.metadata.scte35.SpliceNullCommand
            r1.<init>()
        L_0x029e:
            if (r1 != 0) goto L_0x02ae
            androidx.media3.common.Metadata r1 = new androidx.media3.common.Metadata
            r2 = 0
            androidx.media3.common.Metadata$Entry[] r2 = new androidx.media3.common.Metadata.Entry[r2]
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r3, r2)
            goto L_0x02bf
        L_0x02ae:
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            androidx.media3.common.Metadata r5 = new androidx.media3.common.Metadata
            r6 = 1
            androidx.media3.common.Metadata$Entry[] r6 = new androidx.media3.common.Metadata.Entry[r6]
            r6[r2] = r1
            r5.<init>(r3, r6)
            r1 = r5
        L_0x02bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.scte35.C3615b.mo7492b(androidx.media3.extractor.metadata.b, java.nio.ByteBuffer):androidx.media3.common.Metadata");
    }
}
