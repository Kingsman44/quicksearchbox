package androidx.media3.extractor;

import androidx.media3.common.p136b.C2604ac;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.e */
/* compiled from: PG */
public final class C3387e {

    /* renamed from: a */
    public static final /* synthetic */ int f10256a = 0;

    /* renamed from: b */
    private static final int[] f10257b = {2002, SimpleSnackbar.LENGTH_SHORT, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r9 != 11) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r9 != 11) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r9 != 8) goto L_0x0095;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.C3380d m9794a(androidx.media3.common.p136b.C2603ab r9) {
        /*
            r0 = 16
            int r1 = r9.mo6119d(r0)
            int r0 = r9.mo6119d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.mo6119d(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = 4
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.mo6119d(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.mo6119d(r1)
            boolean r2 = r9.mo6128m()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.mo6119d(r2)
            boolean r5 = r9.mo6128m()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.mo6119d(r4)
            if (r5 <= 0) goto L_0x0047
            r9.mo6126k(r1)
        L_0x0047:
            boolean r5 = r9.mo6128m()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L_0x0058
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L_0x005b
        L_0x0058:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L_0x005b:
            int r9 = r9.mo6119d(r3)
            if (r5 != r6) goto L_0x006a
            r6 = 13
            if (r9 != r6) goto L_0x006a
            int[] r9 = f10257b
            r9 = r9[r6]
            goto L_0x009b
        L_0x006a:
            r6 = 0
            if (r5 != r7) goto L_0x009a
            r7 = 14
            if (r9 >= r7) goto L_0x009a
            int[] r6 = f10257b
            r6 = r6[r9]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L_0x0090
            r8 = 11
            if (r2 == r1) goto L_0x008b
            if (r2 == r4) goto L_0x0090
            if (r2 == r3) goto L_0x0084
            goto L_0x0095
        L_0x0084:
            if (r9 == r4) goto L_0x0097
            if (r9 == r7) goto L_0x0097
            if (r9 != r8) goto L_0x0095
            goto L_0x0097
        L_0x008b:
            if (r9 == r7) goto L_0x0097
            if (r9 != r8) goto L_0x0095
            goto L_0x0097
        L_0x0090:
            if (r9 == r4) goto L_0x0097
            if (r9 != r7) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r9 = r6
            goto L_0x009b
        L_0x0097:
            int r9 = r6 + 1
            goto L_0x009b
        L_0x009a:
            r9 = 0
        L_0x009b:
            androidx.media3.extractor.d r1 = new androidx.media3.extractor.d
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3387e.m9794a(androidx.media3.common.b.ab):androidx.media3.extractor.d");
    }

    /* renamed from: b */
    public static void m9795b(int i, C2604ac acVar) {
        acVar.mo6156x(7);
        byte[] bArr = acVar.f7234a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
        bArr[5] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
        bArr[6] = (byte) (i & PrivateKeyType.INVALID);
    }
}
