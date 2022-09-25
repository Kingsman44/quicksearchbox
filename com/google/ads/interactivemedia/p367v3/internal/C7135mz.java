package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mz */
/* compiled from: PG */
public final class C7135mz {
    /* renamed from: a */
    public static byte[] m21198a(UUID uuid, byte[] bArr) {
        return m21199b(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: b */
    public static byte[] m21199b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2);
        allocate.putInt(length2);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(r5);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || (length = bArr.length) == 0)) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID m21200c(byte[] r9) {
        /*
            com.google.ads.interactivemedia.v3.internal.aee r0 = new com.google.ads.interactivemedia.v3.internal.aee
            r0.<init>((byte[]) r9)
            int r9 = r0.mo14551e()
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto L_0x0010
        L_0x000e:
            r9 = r2
            goto L_0x007c
        L_0x0010:
            r9 = 0
            r0.mo14554h(r9)
            int r1 = r0.mo14568v()
            int r3 = r0.mo14550d()
            int r3 = r3 + 4
            if (r1 == r3) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            int r1 = r0.mo14568v()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r1 == r3) goto L_0x002b
            goto L_0x000e
        L_0x002b:
            int r1 = r0.mo14568v()
            int r1 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r1)
            r3 = 1
            if (r1 <= r3) goto L_0x004f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 37
            r9.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = "PsshAtomUtil"
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r0, r9)
            goto L_0x000e
        L_0x004f:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.mo14570x()
            long r7 = r0.mo14570x()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L_0x0067
            int r1 = r0.mo14538B()
            int r1 = r1 * 16
            r0.mo14557k(r1)
        L_0x0067:
            int r1 = r0.mo14538B()
            int r3 = r0.mo14550d()
            if (r1 == r3) goto L_0x0072
            goto L_0x000e
        L_0x0072:
            byte[] r3 = new byte[r1]
            r0.mo14559m(r3, r9, r1)
            com.google.ads.interactivemedia.v3.internal.my r9 = new com.google.ads.interactivemedia.v3.internal.my
            r9.<init>(r4)
        L_0x007c:
            if (r9 != 0) goto L_0x007f
            return r2
        L_0x007f:
            java.util.UUID r9 = r9.f23029a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7135mz.m21200c(byte[]):java.util.UUID");
    }

    /* renamed from: d */
    public static void m21201d(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: e */
    public static void m21202e(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: f */
    public static int m21203f(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static long m21204g(aee aee, int i, int i2) {
        aee.mo14554h(i);
        if (aee.mo14550d() < 5) {
            return -9223372036854775807L;
        }
        int v = aee.mo14568v();
        if ((8388608 & v) != 0 || ((v >> 8) & 8191) != i2 || (v & 32) == 0 || aee.mo14560n() < 7 || aee.mo14550d() < 7 || (aee.mo14560n() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        aee.mo14559m(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* renamed from: h */
    public static List m21205h(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m21206i(m21207j((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m21206i(m21207j(3840)));
        return arrayList;
    }

    /* renamed from: i */
    private static byte[] m21206i(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: j */
    private static long m21207j(long j) {
        return (j * 1000000000) / 48000;
    }
}
