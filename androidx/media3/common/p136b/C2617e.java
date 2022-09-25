package androidx.media3.common.p136b;

import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.media3.common.b.e */
/* compiled from: PG */
public final class C2617e {

    /* renamed from: a */
    public static final byte[] f7267a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f7268b = {BuildConfig.FLAVOR, "A", "B", "C"};

    /* renamed from: a */
    public static String m7013a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static String m7014b(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f7268b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(C2612ak.m6928K("hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i7])}));
        }
        return sb.toString();
    }
}
