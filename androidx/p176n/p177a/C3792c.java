package androidx.p176n.p177a;

import android.graphics.Color;
import androidx.core.graphics.C1924a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: androidx.n.a.c */
/* compiled from: PG */
final class C3792c {

    /* renamed from: e */
    private static final Comparator f12226e = new C3790a();

    /* renamed from: a */
    final int[] f12227a;

    /* renamed from: b */
    final int[] f12228b;

    /* renamed from: c */
    final List f12229c;

    /* renamed from: d */
    final C3793d[] f12230d;

    /* renamed from: f */
    private final float[] f12231f = new float[3];

    public C3792c(int[] iArr, int i, C3793d[] dVarArr) {
        C3791b bVar;
        int i2;
        this.f12230d = dVarArr;
        int[] iArr2 = new int[32768];
        this.f12228b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int f = m10965f(Color.blue(i4), 8, 5) | (m10965f(Color.red(i4), 8, 5) << 10) | (m10965f(Color.green(i4), 8, 5) << 5);
            iArr[i3] = f;
            iArr2[f] = iArr2[f] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                C1924a.m5191j(m10964e(i6), this.f12231f);
                if (m10966g(this.f12231f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f12227a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.f12229c = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                this.f12229c.add(new C3797h(m10964e(i10), iArr2[i10]));
            }
            return;
        }
        PriorityQueue<C3791b> priorityQueue = new PriorityQueue<>(i, f12226e);
        priorityQueue.offer(new C3791b(this, 0, this.f12227a.length - 1));
        while (priorityQueue.size() < i && (bVar = (C3791b) priorityQueue.poll()) != null && bVar.mo8020c()) {
            if (bVar.mo8020c()) {
                int i11 = bVar.f12220e - bVar.f12219d;
                int i12 = bVar.f12222g - bVar.f12221f;
                int i13 = bVar.f12224i - bVar.f12223h;
                int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
                C3792c cVar = bVar.f12225j;
                int[] iArr4 = cVar.f12227a;
                int[] iArr5 = cVar.f12228b;
                m10963d(iArr4, i14, bVar.f12216a, bVar.f12217b);
                Arrays.sort(iArr4, bVar.f12216a, bVar.f12217b + 1);
                m10963d(iArr4, i14, bVar.f12216a, bVar.f12217b);
                int i15 = bVar.f12218c / 2;
                int i16 = bVar.f12216a;
                int i17 = 0;
                while (true) {
                    int i18 = bVar.f12217b;
                    if (i16 > i18) {
                        i2 = bVar.f12216a;
                        break;
                    }
                    i17 += iArr5[iArr4[i16]];
                    if (i17 >= i15) {
                        i2 = Math.min(i18 - 1, i16);
                        break;
                    }
                    i16++;
                }
                C3791b bVar2 = new C3791b(bVar.f12225j, i2 + 1, bVar.f12217b);
                bVar.f12217b = i2;
                bVar.mo8019b();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (C3791b bVar3 : priorityQueue) {
            C3792c cVar2 = bVar3.f12225j;
            int[] iArr6 = cVar2.f12227a;
            int[] iArr7 = cVar2.f12228b;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = bVar3.f12216a; i23 <= bVar3.f12217b; i23++) {
                int i24 = iArr6[i23];
                int i25 = iArr7[i24];
                i19 += i25;
                i20 += m10962c(i24) * i25;
                i21 += m10961b(i24) * i25;
                i22 += i25 * (i24 & 31);
            }
            float f2 = (float) i19;
            C3797h hVar = new C3797h(m10960a(Math.round(((float) i20) / f2), Math.round(((float) i21) / f2), Math.round(((float) i22) / f2)), i19);
            if (!m10966g(hVar.mo8026a())) {
                arrayList.add(hVar);
            }
        }
        this.f12229c = arrayList;
    }

    /* renamed from: a */
    static int m10960a(int i, int i2, int i3) {
        return Color.rgb(m10965f(i, 5, 8), m10965f(i2, 5, 8), m10965f(i3, 5, 8));
    }

    /* renamed from: b */
    static int m10961b(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: c */
    static int m10962c(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: d */
    static void m10963d(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (m10961b(i4) << 10) | (m10962c(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m10962c(i5) | ((i5 & 31) << 10) | (m10961b(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: e */
    private static int m10964e(int i) {
        return m10960a(m10962c(i), m10961b(i), i & 31);
    }

    /* renamed from: f */
    private static int m10965f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    private final boolean m10966g(float[] fArr) {
        int length;
        C3793d[] dVarArr = this.f12230d;
        if (dVarArr != null && (length = dVarArr.length) > 0) {
            int i = 0;
            while (i < length) {
                C3793d dVar = this.f12230d[i];
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
