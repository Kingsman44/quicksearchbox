package androidx.media3.exoplayer.p140d;

import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.d.i */
/* compiled from: PG */
public final class C2907i {
    /* renamed from: a */
    public static long[] m8180a(List list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            double floatValue = (double) ((Float) list.get(i2)).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                Double.isNaN(floatValue);
                jArr[i] = Math.round(floatValue * 1000000.0d);
                i++;
            }
        }
        Arrays.sort(jArr, 0, i);
        return jArr;
    }
}
