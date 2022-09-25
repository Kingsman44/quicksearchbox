package androidx.constraintlayout.motion.p084a;

import android.view.View;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import androidx.constraintlayout.p079a.p080a.p081a.C1613w;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.a.at */
/* compiled from: PG */
public abstract class C1675at extends C1613w {
    /* renamed from: d */
    public abstract boolean mo4706d(View view, float f, long j, C1597g gVar);

    /* renamed from: e */
    public final float mo4707e(float f, long j, View view, C1597g gVar) {
        char c;
        long j2 = j;
        View view2 = view;
        C1597g gVar2 = gVar;
        this.f4467a.mo4517b((double) f, this.f4473g);
        float[] fArr = this.f4473g;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f4474h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f4476j)) {
            float a = gVar2.mo4524a(view2, this.f4472f);
            this.f4476j = a;
            if (Float.isNaN(a)) {
                this.f4476j = 0.0f;
            }
        }
        long j3 = this.f4475i;
        double d = (double) this.f4476j;
        double d2 = (double) (j2 - j3);
        Double.isNaN(d2);
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f3 = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
        this.f4476j = f3;
        String str = this.f4472f;
        if (!gVar2.f4401a.containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f3});
            gVar2.f4401a.put(view2, hashMap);
            c = 0;
        } else {
            HashMap hashMap2 = (HashMap) gVar2.f4401a.get(view2);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(str)) {
                c = 0;
                hashMap2.put(str, new float[]{f3});
                gVar2.f4401a.put(view2, hashMap2);
            } else {
                c = 0;
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            }
        }
        this.f4475i = j2;
        float f4 = this.f4473g[c];
        float a2 = (mo4543a(this.f4476j) * f4) + this.f4473g[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f4474h = z;
        return a2;
    }
}
