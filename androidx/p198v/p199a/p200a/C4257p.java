package androidx.p198v.p199a.p200a;

import androidx.core.graphics.C1940f;
import androidx.core.graphics.C1941g;

/* renamed from: androidx.v.a.a.p */
/* compiled from: PG */
class C4257p extends C4256o {

    /* renamed from: m */
    protected C1940f[] f13729m = null;

    /* renamed from: n */
    String f13730n;

    /* renamed from: o */
    int f13731o = 0;

    /* renamed from: p */
    int f13732p;

    public C4257p() {
    }

    public C4257p(C4257p pVar) {
        this.f13730n = pVar.f13730n;
        int i = pVar.f13732p;
        this.f13732p = 0;
        this.f13729m = C1941g.m5256b(pVar.f13729m);
    }

    /* renamed from: a */
    public boolean mo9005a() {
        return false;
    }

    public C1940f[] getPathData() {
        return this.f13729m;
    }

    public String getPathName() {
        return this.f13730n;
    }

    public void setPathData(C1940f[] fVarArr) {
        C1940f[] fVarArr2 = this.f13729m;
        if (!(fVarArr2 == null || fVarArr == null || fVarArr2.length != fVarArr.length)) {
            int i = 0;
            while (i < fVarArr2.length) {
                C1940f fVar = fVarArr2[i];
                char c = fVar.f5849a;
                C1940f fVar2 = fVarArr[i];
                if (c == fVar2.f5849a && fVar.f5850b.length == fVar2.f5850b.length) {
                    i++;
                }
            }
            C1940f[] fVarArr3 = this.f13729m;
            for (int i2 = 0; i2 < fVarArr.length; i2++) {
                fVarArr3[i2].f5849a = fVarArr[i2].f5849a;
                int i3 = 0;
                while (true) {
                    float[] fArr = fVarArr[i2].f5850b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    fVarArr3[i2].f5850b[i3] = fArr[i3];
                    i3++;
                }
            }
            return;
        }
        this.f13729m = C1941g.m5256b(fVarArr);
    }
}
