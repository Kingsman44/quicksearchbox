package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.ax */
/* compiled from: PG */
public class C71716ax {

    /* renamed from: b */
    public C71717ay[] f191185b;

    /* renamed from: c */
    public final C71340c f191186c = new C71340c(0, C71343f.f190534a);

    /* renamed from: e */
    private final void m104858e(int i, int i2) {
        C71717ay[] ayVarArr = this.f191185b;
        C69664n.m101058d(ayVarArr);
        C71717ay ayVar = ayVarArr[i2];
        C69664n.m101058d(ayVar);
        C71717ay ayVar2 = ayVarArr[i];
        C69664n.m101058d(ayVar2);
        ayVarArr[i] = ayVar;
        ayVarArr[i2] = ayVar2;
        ayVar.mo62858f(i);
        ayVar2.mo62858f(i2);
    }

    /* renamed from: a */
    public final C71717ay mo62968a() {
        C71717ay[] ayVarArr = this.f191185b;
        if (ayVarArr != null) {
            return ayVarArr[0];
        }
        return null;
    }

    /* renamed from: b */
    public final C71717ay mo62969b(int i) {
        boolean z = C71600ba.f191036a;
        C71717ay[] ayVarArr = this.f191185b;
        C69664n.m101058d(ayVarArr);
        this.f191186c.f190526b--;
        if (i < this.f191186c.f190526b) {
            m104858e(i, this.f191186c.f190526b);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                C71717ay ayVar = ayVarArr[i];
                C69664n.m101058d(ayVar);
                C71717ay ayVar2 = ayVarArr[i2];
                C69664n.m101058d(ayVar2);
                if (((Comparable) ayVar).compareTo(ayVar2) < 0) {
                    m104858e(i, i2);
                    mo62970c(i2);
                }
            }
            while (true) {
                int i3 = i + i + 1;
                if (i3 >= this.f191186c.f190526b) {
                    break;
                }
                C71717ay[] ayVarArr2 = this.f191185b;
                C69664n.m101058d(ayVarArr2);
                int i4 = i3 + 1;
                if (i4 < this.f191186c.f190526b) {
                    C71717ay ayVar3 = ayVarArr2[i4];
                    C69664n.m101058d(ayVar3);
                    C71717ay ayVar4 = ayVarArr2[i3];
                    C69664n.m101058d(ayVar4);
                    if (((Comparable) ayVar3).compareTo(ayVar4) < 0) {
                        i3 = i4;
                    }
                }
                C71717ay ayVar5 = ayVarArr2[i];
                C69664n.m101058d(ayVar5);
                C71717ay ayVar6 = ayVarArr2[i3];
                C69664n.m101058d(ayVar6);
                if (((Comparable) ayVar5).compareTo(ayVar6) <= 0) {
                    break;
                }
                m104858e(i, i3);
                i = i3;
            }
        }
        C71717ay ayVar7 = ayVarArr[this.f191186c.f190526b];
        C69664n.m101058d(ayVar7);
        ayVar7.mo62857e((C71716ax) null);
        ayVar7.mo62858f(-1);
        ayVarArr[this.f191186c.f190526b] = null;
        return ayVar7;
    }

    /* renamed from: c */
    public final void mo62970c(int i) {
        while (i > 0) {
            C71717ay[] ayVarArr = this.f191185b;
            C69664n.m101058d(ayVarArr);
            int i2 = (i - 1) >> 1;
            C71717ay ayVar = ayVarArr[i2];
            C69664n.m101058d(ayVar);
            C71717ay ayVar2 = ayVarArr[i];
            C69664n.m101058d(ayVar2);
            if (((Comparable) ayVar).compareTo(ayVar2) > 0) {
                m104858e(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo62971d() {
        return this.f191186c.f190526b == 0;
    }
}
