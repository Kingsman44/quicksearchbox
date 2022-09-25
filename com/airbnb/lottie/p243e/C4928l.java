package com.airbnb.lottie.p243e;

import android.graphics.Color;
import com.airbnb.lottie.p238c.p240b.C4860c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p245f.C4949f;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.airbnb.lottie.e.l */
/* compiled from: PG */
public final class C4928l implements C4917ah {

    /* renamed from: a */
    private int f15680a;

    public C4928l(int i) {
        this.f15680a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9858a(C4908e eVar, float f) {
        int i;
        double d;
        ArrayList arrayList = new ArrayList();
        int r = eVar.mo9855r();
        if (r == 1) {
            eVar.mo9846i();
        }
        while (eVar.mo9853p()) {
            arrayList.add(Float.valueOf((float) eVar.mo9839a()));
        }
        if (r == 1) {
            eVar.mo9848k();
        }
        int i2 = this.f15680a;
        if (i2 == -1) {
            i2 = arrayList.size() / 4;
            this.f15680a = i2;
        }
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f15680a * 4;
            if (i4 >= i) {
                break;
            }
            int i7 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i8 = i4 % 4;
            if (i8 == 0) {
                if (i7 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i7 - 1] >= f2) {
                        fArr[i7] = f2 + 0.01f;
                    }
                }
                fArr[i7] = (float) floatValue;
            } else if (i8 == 1) {
                Double.isNaN(floatValue);
                i6 = (int) (floatValue * 255.0d);
            } else if (i8 == 2) {
                Double.isNaN(floatValue);
                i5 = (int) (floatValue * 255.0d);
            } else if (i8 == 3) {
                Double.isNaN(floatValue);
                iArr[i7] = Color.argb(PrivateKeyType.INVALID, i6, i5, (int) (floatValue * 255.0d));
            }
            i4++;
        }
        C4860c cVar = new C4860c(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i9 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i9] = (double) ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i9] = (double) ((Float) arrayList.get(i)).floatValue();
                    i9++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = cVar.f15456b;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i10 = iArr2[i3];
                double d2 = (double) cVar.f15455a[i3];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (d4 >= d2) {
                        Double.isNaN(d2);
                        d = C4949f.m13707a(dArr2[i12], dArr2[i11], C4949f.m13716j((d2 - d3) / (d4 - d3)));
                        break;
                    }
                    i11++;
                }
                cVar.f15456b[i3] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
                i3++;
            }
        }
        return cVar;
    }
}
