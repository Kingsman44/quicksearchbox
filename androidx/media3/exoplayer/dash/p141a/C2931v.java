package androidx.media3.exoplayer.dash.p141a;

import java.util.Locale;

/* renamed from: androidx.media3.exoplayer.dash.a.v */
/* compiled from: PG */
public final class C2931v {

    /* renamed from: a */
    private final String[] f8394a;

    /* renamed from: b */
    private final int[] f8395b;

    /* renamed from: c */
    private final String[] f8396c;

    /* renamed from: d */
    private final int f8397d;

    public C2931v(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f8394a = strArr;
        this.f8395b = iArr;
        this.f8396c = strArr2;
        this.f8397d = i;
    }

    /* renamed from: a */
    public final String mo6803a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f8397d;
            if (i2 < i3) {
                sb.append(this.f8394a[i2]);
                int i4 = this.f8395b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.f8396c[i2], new Object[]{Long.valueOf(j)}));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.f8396c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.f8396c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f8394a[i3]);
                return sb.toString();
            }
        }
    }
}
