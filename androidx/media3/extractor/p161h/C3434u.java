package androidx.media3.extractor.p161h;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: androidx.media3.extractor.h.u */
/* compiled from: PG */
public final class C3434u {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID m9955a(byte[] r9) {
        /*
            androidx.media3.common.b.ac r0 = new androidx.media3.common.b.ac
            r0.<init>((byte[]) r9)
            int r9 = r0.f7236c
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto L_0x000e
        L_0x000c:
            r9 = r2
            goto L_0x007a
        L_0x000e:
            r9 = 0
            r0.mo6131A(r9)
            int r1 = r0.mo6134b()
            int r3 = r0.f7236c
            int r4 = r0.f7235b
            int r3 = r3 - r4
            int r3 = r3 + 4
            if (r1 == r3) goto L_0x0020
            goto L_0x000c
        L_0x0020:
            int r1 = r0.mo6134b()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r1 == r3) goto L_0x002a
            goto L_0x000c
        L_0x002a:
            int r1 = r0.mo6134b()
            int r1 = androidx.media3.extractor.p161h.C3416c.m9893e(r1)
            r3 = 1
            if (r1 <= r3) goto L_0x0049
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported pssh version: "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = "PsshAtomUtil"
            java.lang.String r9 = r9.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r0, r9)
            goto L_0x000c
        L_0x0049:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.mo6145m()
            long r7 = r0.mo6145m()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L_0x0064
            int r1 = r0.mo6141i()
            int r3 = r0.f7235b
            int r1 = r1 * 16
            int r3 = r3 + r1
            r0.mo6131A(r3)
        L_0x0064:
            int r1 = r0.mo6141i()
            int r3 = r0.f7236c
            int r5 = r0.f7235b
            int r3 = r3 - r5
            if (r1 == r3) goto L_0x0070
            goto L_0x000c
        L_0x0070:
            byte[] r3 = new byte[r1]
            r0.mo6155w(r3, r9, r1)
            androidx.media3.extractor.h.t r9 = new androidx.media3.extractor.h.t
            r9.<init>(r4)
        L_0x007a:
            if (r9 != 0) goto L_0x007d
            return r2
        L_0x007d:
            java.util.UUID r9 = r9.f10573a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3434u.m9955a(byte[]):java.util.UUID");
    }

    /* renamed from: b */
    public static byte[] m9956b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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
}
