package androidx.media3.extractor;

import androidx.media3.common.C2599az;
import java.io.EOFException;

/* renamed from: androidx.media3.extractor.ae */
/* compiled from: PG */
public final class C3330ae {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[LOOP:0: B:1:0x0001->B:11:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[EDGE_INSN: B:14:0x003d->B:12:0x003d ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m9644a(androidx.media3.extractor.C3327ab r10, byte[] r11, int r12, int r13) {
        /*
            r0 = 0
        L_0x0001:
            if (r0 >= r13) goto L_0x003d
            int r1 = r12 + r0
            int r5 = r13 - r0
            r8 = r10
            androidx.media3.extractor.q r8 = (androidx.media3.extractor.C3627q) r8
            r8.mo7638i(r5)
            int r2 = r8.f11569f
            int r4 = r8.f11568e
            int r2 = r2 - r4
            r9 = -1
            if (r2 != 0) goto L_0x0028
            byte[] r3 = r8.f11567d
            r6 = 0
            r7 = 1
            r2 = r8
            int r2 = r2.mo7635b(r3, r4, r5, r6, r7)
            if (r2 != r9) goto L_0x0022
            r2 = -1
            goto L_0x0038
        L_0x0022:
            int r3 = r8.f11569f
            int r3 = r3 + r2
            r8.f11569f = r3
            goto L_0x002c
        L_0x0028:
            int r2 = java.lang.Math.min(r5, r2)
        L_0x002c:
            byte[] r3 = r8.f11567d
            int r4 = r8.f11568e
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)
            int r1 = r8.f11568e
            int r1 = r1 + r2
            r8.f11568e = r1
        L_0x0038:
            if (r2 != r9) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            int r0 = r0 + r2
            goto L_0x0001
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3330ae.m9644a(androidx.media3.extractor.ab, byte[], int, int):int");
    }

    /* renamed from: b */
    public static void m9645b(boolean z, String str) {
        if (!z) {
            throw C2599az.m6819a(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m9646c(C3327ab abVar, byte[] bArr, int i, int i2) {
        try {
            ((C3627q) abVar).mo7321p(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m9647d(C3327ab abVar, int i) {
        try {
            ((C3627q) abVar).mo7639q(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m9648e(C3327ab abVar, byte[] bArr, int i, boolean z) {
        try {
            return abVar.mo7320o(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
