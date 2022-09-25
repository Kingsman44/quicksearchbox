package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.c.a.a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.speech.audio.a */
/* compiled from: PG */
public final class C92138a {

    /* renamed from: a */
    private static final C59071e f256882a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.a");

    /* renamed from: a */
    public static boolean m151256a(a aVar) {
        double d;
        a aVar2 = aVar;
        System.currentTimeMillis();
        if (aVar2.b == 1) {
            ByteBuffer wrap = ByteBuffer.wrap(aVar2.c);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            ShortBuffer asShortBuffer = wrap.asShortBuffer();
            int length = aVar2.c.length >> 1;
            short[] sArr = new short[length];
            asShortBuffer.get(sArr);
            int i = aVar2.a;
            if (length == 0) {
                d = Double.NEGATIVE_INFINITY;
            } else {
                double[] dArr = new double[length];
                for (int i2 = 0; i2 < length; i2++) {
                    double d2 = (double) sArr[i2];
                    Double.isNaN(d2);
                    dArr[i2] = d2 / 32768.0d;
                }
                int intValue = BigInteger.valueOf((long) i).gcd(BigInteger.valueOf(48000)).intValue();
                int i3 = 48000 / intValue;
                int i4 = i / intValue;
                int i5 = length - 1;
                double d3 = (double) i3;
                double d4 = (double) i5;
                Double.isNaN(d4);
                Double.isNaN(d3);
                double d5 = (double) i4;
                Double.isNaN(d5);
                int ceil = (int) (Math.ceil((d4 * d3) / d5) + 1.0d);
                double[] dArr2 = new double[ceil];
                int i6 = i5 * i3;
                int i7 = i3;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i6) {
                    while (i8 < i7) {
                        double d6 = (double) (i7 - i8);
                        double d7 = dArr[i9 / i3];
                        Double.isNaN(d6);
                        int i10 = i6;
                        double d8 = (double) (i8 - i9);
                        double d9 = dArr[i7 / i3];
                        Double.isNaN(d8);
                        Double.isNaN(d3);
                        dArr2[i8 / i4] = ((d6 * d7) + (d8 * d9)) / d3;
                        i8 += i4;
                        i6 = i10;
                        ceil = ceil;
                    }
                    int i11 = i6;
                    int i12 = ceil;
                    i9 = i7;
                    i7 += i3;
                }
                int i13 = ceil;
                if (i7 > i6) {
                    i9 -= i3;
                    i7 -= i3;
                }
                int i14 = i8 / i4;
                double d10 = (double) (i7 - i8);
                double d11 = dArr[i9 / i3];
                Double.isNaN(d10);
                double d12 = d10 * d11;
                double d13 = (double) (i8 - i9);
                double d14 = dArr[i7 / i3];
                Double.isNaN(d13);
                Double.isNaN(d3);
                dArr2[i14] = (d12 + (d13 * d14)) / d3;
                C92213x.m151417b(dArr2, C92213x.f257089a);
                C92213x.m151417b(dArr2, C92213x.f257090b);
                ArrayList arrayList = new ArrayList();
                int i15 = i13;
                int min = Math.min(19200, i15);
                double d15 = C59203do.f157270a;
                for (int i16 = 0; i16 < min; i16++) {
                    double d16 = dArr2[i16];
                    d15 += d16 * d16;
                }
                double d17 = (double) min;
                Double.isNaN(d17);
                arrayList.add(Double.valueOf(d15 / d17));
                int i17 = 0;
                while (min < i15) {
                    double d18 = dArr2[i17];
                    double d19 = dArr2[min];
                    d15 = (d15 - (d18 * d18)) + (d19 * d19);
                    min++;
                    if (min % 4800 == 0) {
                        arrayList.add(Double.valueOf(d15 / 19200.0d));
                    }
                    i17++;
                }
                double[] dArr3 = new double[arrayList.size()];
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    dArr3[i18] = ((Double) arrayList.get(i18)).doubleValue();
                }
                d = C92213x.m151416a(dArr3, C92213x.m151416a(dArr3, -70.0d) - 0.4375d);
            }
            double sqrt = Math.sqrt(Math.pow(10.0d, (-19.0d - d) / 10.0d));
            asShortBuffer.rewind();
            int i19 = 0;
            while (asShortBuffer.hasRemaining()) {
                double d20 = (double) asShortBuffer.get();
                Double.isNaN(d20);
                asShortBuffer.put(i19, (short) ((int) Math.max(-32768.0d, Math.min(32767.0d, d20 * sqrt))));
                i19++;
            }
            return true;
        }
        ((C59052c) ((C59052c) f256882a.mo56225c()).mo56372aa(12027)).mo56386p("amplifyAudioRecording() only supports single channel audio.");
        return false;
    }
}
