package com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a;

import com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32004a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32013g;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.f.a.c */
/* compiled from: PG */
public final class C32025c {

    /* renamed from: a */
    private final C63088z f86051a;

    /* renamed from: b */
    private final C32013g f86052b;

    /* renamed from: c */
    private final C32004a f86053c;

    public C32025c(C32004a aVar, String str, C32013g gVar) {
        this.f86053c = aVar;
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        this.f86051a = C63088z.m96139A(bArr);
        this.f86052b = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0224, code lost:
        return com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b.m59664e(3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x021f */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0002] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b mo37804a(java.io.File r15) {
        /*
            r14 = this;
            r0 = 3
            r1 = 2
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            r2.<init>()     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r15 = android.os.ParcelFileDescriptor.open(r15, r4)     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            r3.<init>(r15)     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            r15 = 0
        L_0x0013:
            r4 = 1
            int r5 = r3.available()     // Catch:{ all -> 0x0203 }
            if (r5 <= 0) goto L_0x00f0
            com.google.p.a.b r5 = com.google.p4744p.p4745a.C62871b.f169757d     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r5 = com.google.p4744p.p4745a.C62871b.parseDelimitedFrom(r5, r3)     // Catch:{ all -> 0x0203 }
            com.google.p.a.b r5 = (com.google.p4744p.p4745a.C62871b) r5     // Catch:{ all -> 0x0203 }
            int r6 = r5.f169759a     // Catch:{ all -> 0x0203 }
            if (r6 != r4) goto L_0x004f
            java.lang.Object r15 = r5.f169760b     // Catch:{ all -> 0x0203 }
            com.google.p.j r15 = (com.google.p4744p.C62880j) r15     // Catch:{ all -> 0x0203 }
            com.google.protobuf.z r5 = r15.toByteString()     // Catch:{ all -> 0x0203 }
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0203 }
            com.google.p.g r6 = (com.google.p4744p.C62877g) r6     // Catch:{ all -> 0x0203 }
            if (r6 != 0) goto L_0x004d
            com.google.p.h r6 = com.google.p4744p.C62878h.f169773c     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x0203 }
            com.google.p.g r6 = (com.google.p4744p.C62877g) r6     // Catch:{ all -> 0x0203 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x0203 }
            com.google.p.h r7 = (com.google.p4744p.C62878h) r7     // Catch:{ all -> 0x0203 }
            r15.getClass()     // Catch:{ all -> 0x0203 }
            r7.f169775a = r15     // Catch:{ all -> 0x0203 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0203 }
        L_0x004d:
            r15 = r6
            goto L_0x0013
        L_0x004f:
            if (r15 == 0) goto L_0x00e8
            com.google.android.libraries.privatetelemetry.tqcobalt.d.g r6 = r14.f86052b     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r7 = r15.instance     // Catch:{ all -> 0x0203 }
            com.google.p.h r7 = (com.google.p4744p.C62878h) r7     // Catch:{ all -> 0x0203 }
            com.google.p.j r7 = r7.f169775a     // Catch:{ all -> 0x0203 }
            if (r7 != 0) goto L_0x005d
            com.google.p.j r7 = com.google.p4744p.C62880j.f169777d     // Catch:{ all -> 0x0203 }
        L_0x005d:
            int r9 = r7.f169779a     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r7 = r15.instance     // Catch:{ all -> 0x0203 }
            com.google.p.h r7 = (com.google.p4744p.C62878h) r7     // Catch:{ all -> 0x0203 }
            com.google.p.j r7 = r7.f169775a     // Catch:{ all -> 0x0203 }
            if (r7 != 0) goto L_0x006a
            com.google.p.j r8 = com.google.p4744p.C62880j.f169777d     // Catch:{ all -> 0x0203 }
            goto L_0x006b
        L_0x006a:
            r8 = r7
        L_0x006b:
            int r8 = r8.f169780b     // Catch:{ all -> 0x0203 }
            long r10 = (long) r8     // Catch:{ all -> 0x0203 }
            if (r7 != 0) goto L_0x0072
            com.google.p.j r7 = com.google.p4744p.C62880j.f169777d     // Catch:{ all -> 0x0203 }
        L_0x0072:
            int r7 = r7.f169781c     // Catch:{ all -> 0x0203 }
            long r12 = (long) r7     // Catch:{ all -> 0x0203 }
            com.google.android.libraries.privatetelemetry.tqcobalt.d.a r7 = new com.google.android.libraries.privatetelemetry.tqcobalt.d.a     // Catch:{ all -> 0x0203 }
            r8 = r7
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x0203 }
            com.google.android.libraries.privatetelemetry.tqcobalt.d.d r6 = r6.mo37781a(r7)     // Catch:{ all -> 0x0203 }
            com.google.android.libraries.privatetelemetry.tqcobalt.d.d r7 = com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32010d.VERSION_1_1     // Catch:{ all -> 0x0203 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0203 }
            if (r6 == 0) goto L_0x0013
            int r6 = r5.f169759a     // Catch:{ all -> 0x0203 }
            if (r6 != r0) goto L_0x0090
            java.lang.Object r6 = r5.f169760b     // Catch:{ all -> 0x0203 }
            com.google.p.f r6 = (com.google.p4744p.C62876f) r6     // Catch:{ all -> 0x0203 }
            goto L_0x00a7
        L_0x0090:
            if (r6 != r1) goto L_0x0097
            java.lang.Object r6 = r5.f169760b     // Catch:{ all -> 0x0203 }
            com.google.p.b r6 = (com.google.p4744p.C62872b) r6     // Catch:{ all -> 0x0203 }
            goto L_0x0099
        L_0x0097:
            com.google.p.b r6 = com.google.p4744p.C62872b.f169762d     // Catch:{ all -> 0x0203 }
        L_0x0099:
            com.google.protobuf.z r6 = r6.f169766c     // Catch:{ all -> 0x0203 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0203 }
            com.google.p.f r8 = com.google.p4744p.C62876f.f169771a     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r6, (com.google.protobuf.C62921ba) r7)     // Catch:{ all -> 0x0203 }
            com.google.p.f r6 = (com.google.p4744p.C62876f) r6     // Catch:{ all -> 0x0203 }
        L_0x00a7:
            com.google.android.libraries.privatetelemetry.tqcobalt.b.a r7 = r14.f86053c     // Catch:{ all -> 0x0203 }
            int r8 = r7.f86005b     // Catch:{ all -> 0x0203 }
            com.google.v.a.g r7 = r7.f86007d     // Catch:{ all -> 0x0203 }
            byte[] r9 = com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32005b.f86013f     // Catch:{ all -> 0x0203 }
            com.google.p.a r6 = com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32004a.m59616b(r6, r8, r7, r9)     // Catch:{ all -> 0x0203 }
            com.google.protobuf.z r5 = r5.f169761c     // Catch:{ all -> 0x0203 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x0203 }
            com.google.p.b r7 = (com.google.p4744p.C62872b) r7     // Catch:{ all -> 0x0203 }
            com.google.p.b r8 = com.google.p4744p.C62872b.f169762d     // Catch:{ all -> 0x0203 }
            r5.getClass()     // Catch:{ all -> 0x0203 }
            r7.f169765b = r5     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r5 = r6.build()     // Catch:{ all -> 0x0203 }
            com.google.p.b r5 = (com.google.p4744p.C62872b) r5     // Catch:{ all -> 0x0203 }
            r15.copyOnWrite()     // Catch:{ all -> 0x0203 }
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ all -> 0x0203 }
            com.google.p.h r6 = (com.google.p4744p.C62878h) r6     // Catch:{ all -> 0x0203 }
            r5.getClass()     // Catch:{ all -> 0x0203 }
            com.google.protobuf.cq r7 = r6.f169776b     // Catch:{ all -> 0x0203 }
            boolean r8 = r7.mo58948c()     // Catch:{ all -> 0x0203 }
            if (r8 != 0) goto L_0x00e1
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)     // Catch:{ all -> 0x0203 }
            r6.f169776b = r7     // Catch:{ all -> 0x0203 }
        L_0x00e1:
            com.google.protobuf.cq r6 = r6.f169776b     // Catch:{ all -> 0x0203 }
            r6.add(r5)     // Catch:{ all -> 0x0203 }
            goto L_0x0013
        L_0x00e8:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0203 }
            java.lang.String r2 = "Cobalt: invalid observations file; no metadata found before this observation"
            r15.<init>(r2)     // Catch:{ all -> 0x0203 }
            throw r15     // Catch:{ all -> 0x0203 }
        L_0x00f0:
            r3.close()     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
            java.util.Set r15 = r2.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x00fb:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.google.p.g r0 = (com.google.p4744p.C62877g) r0
            com.google.protobuf.bv r0 = r0.instance
            com.google.p.h r0 = (com.google.p4744p.C62878h) r0
            com.google.protobuf.cq r0 = r0.f169776b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00fb
            r15.remove()
            goto L_0x00fb
        L_0x011d:
            com.google.p.d r15 = com.google.p4744p.C62874d.f169767c
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.p.c r15 = (com.google.p4744p.C62873c) r15
            com.google.protobuf.z r0 = r14.f86051a
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.p.d r3 = (com.google.p4744p.C62874d) r3
            r3.f169770b = r0
            java.util.Collection r0 = r2.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0138:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0168
            java.lang.Object r3 = r0.next()
            com.google.p.g r3 = (com.google.p4744p.C62877g) r3
            com.google.protobuf.bv r3 = r3.build()
            com.google.p.h r3 = (com.google.p4744p.C62878h) r3
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.p.d r5 = (com.google.p4744p.C62874d) r5
            r3.getClass()
            com.google.protobuf.cq r6 = r5.f169769a
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0162
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f169769a = r6
        L_0x0162:
            com.google.protobuf.cq r5 = r5.f169769a
            r5.add(r3)
            goto L_0x0138
        L_0x0168:
            com.google.protobuf.bv r15 = r15.build()
            com.google.p.d r15 = (com.google.p4744p.C62874d) r15
            com.google.protobuf.cq r0 = r15.f169769a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x017b
            com.google.android.libraries.privatetelemetry.tqcobalt.f.a.b r15 = com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b.m59664e(r4)
            return r15
        L_0x017b:
            com.google.android.libraries.privatetelemetry.tqcobalt.b.a r0 = r14.f86053c     // Catch:{ all -> 0x01fe }
            int r3 = r0.f86004a     // Catch:{ all -> 0x01fe }
            com.google.v.a.g r0 = r0.f86006c     // Catch:{ all -> 0x01fe }
            byte[] r5 = com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32005b.f86010c     // Catch:{ all -> 0x01fe }
            com.google.p.a r15 = com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32004a.m59616b(r15, r3, r0, r5)     // Catch:{ all -> 0x01fe }
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ all -> 0x01fe }
            com.google.p.b r15 = (com.google.p4744p.C62872b) r15     // Catch:{ all -> 0x01fe }
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x019a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f0
            java.lang.Object r2 = r1.next()
            com.google.p.g r2 = (com.google.p4744p.C62877g) r2
            com.google.protobuf.bv r2 = r2.build()
            com.google.p.h r2 = (com.google.p4744p.C62878h) r2
            com.google.protobuf.cq r3 = r2.f169776b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x019a
            com.google.p.j r3 = r2.f169775a
            if (r3 != 0) goto L_0x01ba
            com.google.p.j r3 = com.google.p4744p.C62880j.f169777d
        L_0x01ba:
            int r3 = r3.f169779a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.p.j r5 = r2.f169775a
            if (r5 != 0) goto L_0x01c6
            com.google.p.j r5 = com.google.p4744p.C62880j.f169777d
        L_0x01c6:
            int r5 = r5.f169780b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r3 = android.util.Pair.create(r3, r5)
            java.lang.Object r5 = r0.get(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 != 0) goto L_0x01de
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
        L_0x01de:
            long r5 = r5.longValue()
            int r2 = r2.getSerializedSize()
            long r7 = (long) r2
            long r5 = r5 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.put(r3, r2)
            goto L_0x019a
        L_0x01f0:
            com.google.android.libraries.privatetelemetry.tqcobalt.f.a.a r1 = new com.google.android.libraries.privatetelemetry.tqcobalt.f.a.a
            com.google.common.b.hd r2 = com.google.common.p4522b.C58495hd.m89898l(r0)
            boolean r0 = r0.isEmpty()
            r1.<init>(r15, r2, r0, r4)
            return r1
        L_0x01fe:
            com.google.android.libraries.privatetelemetry.tqcobalt.f.a.b r15 = com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b.m59664e(r1)
            return r15
        L_0x0203:
            r15 = move-exception
            r3.close()     // Catch:{ all -> 0x0208 }
            goto L_0x021f
        L_0x0208:
            r2 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r7, r3)     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
            r4[r6] = r2     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
            r3.invoke(r15, r4)     // Catch:{ Exception -> 0x021f, all -> 0x0220 }
        L_0x021f:
            throw r15     // Catch:{ GeneralSecurityException -> 0x0225, all -> 0x0220 }
        L_0x0220:
            com.google.android.libraries.privatetelemetry.tqcobalt.f.a.b r15 = com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b.m59664e(r0)
            return r15
        L_0x0225:
            com.google.android.libraries.privatetelemetry.tqcobalt.f.a.b r15 = com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b.m59664e(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32025c.mo37804a(java.io.File):com.google.android.libraries.privatetelemetry.tqcobalt.f.a.b");
    }
}
