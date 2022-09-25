package androidx.constraintlayout.motion.p084a;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.p079a.p080a.p081a.C1594d;
import androidx.constraintlayout.widget.C1742a;
import java.lang.reflect.Array;

/* renamed from: androidx.constraintlayout.motion.a.r */
/* compiled from: PG */
public final class C1692r extends C1661af {

    /* renamed from: e */
    public final SparseArray f4814e;

    /* renamed from: f */
    float[] f4815f;

    public C1692r(String str, SparseArray sparseArray) {
        String str2 = str.split(",")[1];
        this.f4814e = sparseArray;
    }

    /* renamed from: b */
    public final void mo4535b(int i, float f) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    /* renamed from: c */
    public final void mo4536c(int i) {
        int size = this.f4814e.size();
        int b = ((C1742a) this.f4814e.valueAt(0)).mo4849b();
        double[] dArr = new double[size];
        this.f4815f = new float[b];
        int[] iArr = new int[2];
        iArr[1] = b;
        iArr[0] = size;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        for (int i2 = 0; i2 < size; i2++) {
            double keyAt = (double) this.f4814e.keyAt(i2);
            Double.isNaN(keyAt);
            dArr[i2] = keyAt * 0.01d;
            ((C1742a) this.f4814e.valueAt(i2)).mo4850c(this.f4815f);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f4815f;
                if (i3 >= fArr.length) {
                    break;
                }
                dArr2[i2][i3] = (double) fArr[i3];
                i3++;
            }
        }
        this.f4439a = C1594d.m4236f(i, dArr, dArr2);
    }

    /* renamed from: d */
    public final void mo4705d(View view, float f) {
        this.f4439a.mo4517b((double) f, this.f4815f);
        C1655a.m4531a((C1742a) this.f4814e.valueAt(0), view, this.f4815f);
    }
}
