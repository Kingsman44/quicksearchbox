package androidx.constraintlayout.motion.p084a;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.p079a.p080a.p081a.C1594d;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import androidx.constraintlayout.widget.C1742a;
import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;

/* renamed from: androidx.constraintlayout.motion.a.ah */
/* compiled from: PG */
public final class C1663ah extends C1675at {

    /* renamed from: k */
    final String f4802k;

    /* renamed from: l */
    public final SparseArray f4803l;

    /* renamed from: m */
    public final SparseArray f4804m = new SparseArray();

    /* renamed from: n */
    float[] f4805n;

    /* renamed from: o */
    float[] f4806o;

    public C1663ah(String str, SparseArray sparseArray) {
        this.f4802k = str.split(",")[1];
        this.f4803l = sparseArray;
    }

    /* renamed from: b */
    public final void mo4544b(int i, float f, float f2, int i2, float f3) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }

    /* renamed from: c */
    public final void mo4545c(int i) {
        int size = this.f4803l.size();
        int b = ((C1742a) this.f4803l.valueAt(0)).mo4849b();
        double[] dArr = new double[size];
        int i2 = b + 2;
        this.f4805n = new float[i2];
        this.f4806o = new float[b];
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = size;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = this.f4803l.keyAt(i3);
            float[] fArr = (float[]) this.f4804m.valueAt(i3);
            double d = (double) keyAt;
            Double.isNaN(d);
            dArr[i3] = d * 0.01d;
            ((C1742a) this.f4803l.valueAt(i3)).mo4850c(this.f4805n);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f4805n;
                if (i4 >= fArr2.length) {
                    break;
                }
                dArr2[i3][i4] = (double) fArr2[i4];
                i4++;
            }
            double[] dArr3 = dArr2[i3];
            dArr3[b] = (double) fArr[0];
            dArr3[b + 1] = (double) fArr[1];
        }
        this.f4467a = C1594d.m4236f(i, dArr, dArr2);
    }

    /* renamed from: d */
    public final boolean mo4706d(View view, float f, long j, C1597g gVar) {
        View view2 = view;
        long j2 = j;
        this.f4467a.mo4517b((double) f, this.f4805n);
        float[] fArr = this.f4805n;
        int length = fArr.length;
        float f2 = fArr[length - 2];
        float f3 = fArr[length - 1];
        long j3 = j2 - this.f4475i;
        if (Float.isNaN(this.f4476j)) {
            float a = gVar.mo4524a(view2, this.f4802k);
            this.f4476j = a;
            if (Float.isNaN(a)) {
                this.f4476j = 0.0f;
            }
        }
        double d = (double) this.f4476j;
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f4 = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
        this.f4476j = f4;
        this.f4475i = j2;
        float a2 = mo4543a(f4);
        this.f4474h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f4806o;
            boolean z = true;
            if (i >= fArr2.length) {
                break;
            }
            boolean z2 = this.f4474h;
            float f5 = this.f4805n[i];
            if (((double) f5) == C59203do.f157270a) {
                z = false;
            }
            this.f4474h = z2 | z;
            fArr2[i] = (f5 * a2) + f3;
            i++;
        }
        C1655a.m4531a((C1742a) this.f4803l.valueAt(0), view2, this.f4806o);
        if (f2 != 0.0f) {
            this.f4474h = true;
        }
        return this.f4474h;
    }
}
