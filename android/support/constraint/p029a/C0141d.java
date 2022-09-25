package android.support.constraint.p029a;

import java.util.ArrayList;

/* renamed from: android.support.constraint.a.d */
/* compiled from: PG */
public final class C0141d {

    /* renamed from: a */
    final ArrayList f510a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo168a(C0142e eVar) {
        C0142e eVar2 = eVar;
        this.f510a.clear();
        for (int i = 1; i < eVar2.f515d; i++) {
            C0144g gVar = eVar2.f516e.f507a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                gVar.f531e[i2] = 0.0f;
            }
            gVar.f531e[gVar.f529c] = 1.0f;
            if (gVar.f534h == 4) {
                this.f510a.add(gVar);
            }
        }
        int size = this.f510a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0144g gVar2 = (C0144g) this.f510a.get(i3);
            int i4 = gVar2.f528b;
            if (i4 != -1) {
                C0130a aVar = eVar2.f514c[i4].f505d;
                int i5 = aVar.f394a;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0144g d = aVar.mo117d(i6);
                    if (d != null) {
                        float b = aVar.mo115b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = d.f531e;
                            fArr[i7] = fArr[i7] + (gVar2.f531e[i7] * b);
                        }
                        if (!this.f510a.contains(d)) {
                            this.f510a.add(d);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    gVar2.f531e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.f510a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            C0144g gVar = (C0144g) this.f510a.get(i);
            new StringBuilder().append(gVar);
            String str2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = gVar.f531e;
                if (i2 >= 6) {
                    break;
                }
                String str3 = str2 + gVar.f531e[i2];
                float[] fArr2 = gVar.f531e;
                str2 = str3.concat(i2 < 5 ? ", " : "] ");
                i2++;
            }
            str = str.concat(str2);
        }
        return str;
    }
}
