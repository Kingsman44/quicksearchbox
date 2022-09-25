package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Set;

/* renamed from: com.google.common.f.b.aa */
/* compiled from: PG */
final class C59006aa extends C59008ac {

    /* renamed from: a */
    public final int[] f156895a;

    /* renamed from: b */
    public final int f156896b;

    /* renamed from: c */
    private final C59037l f156897c;

    /* renamed from: d */
    private final C59037l f156898d;

    public C59006aa(C59037l lVar, C59037l lVar2) {
        int h;
        C59081b.m91349a(lVar, "scope metadata");
        this.f156897c = lVar;
        C59081b.m91349a(lVar2, "logged metadata");
        this.f156898d = lVar2;
        int b = lVar.mo56310b() + lVar2.mo56310b();
        int i = 0;
        C59081b.m91350b(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.f156895a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            C58976aa e = mo56275e(i);
            long j2 = e.f156830d | j;
            if (j2 != j || (h = m91203h(e, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[h] = e.f156829c ? iArr[h] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.f156896b = i2;
    }

    /* renamed from: h */
    private final int m91203h(C58976aa aaVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (aaVar.equals(mo56275e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo56271a() {
        return this.f156896b;
    }

    /* renamed from: b */
    public final Object mo56272b(C58976aa aaVar) {
        C59081b.m91350b(!aaVar.f156829c, "key must be single valued");
        int h = m91203h(aaVar, this.f156895a, this.f156896b);
        if (h < 0) {
            return null;
        }
        return aaVar.f156828b.cast(mo56276f(this.f156895a[h]));
    }

    /* renamed from: c */
    public final Set mo56273c() {
        return new C59050y(this);
    }

    /* renamed from: d */
    public final void mo56274d(C59044s sVar, Object obj) {
        for (int i = 0; i < this.f156896b; i++) {
            int i2 = this.f156895a[i];
            C58976aa e = mo56275e(i2 & 31);
            if (!e.f156829c) {
                sVar.mo56316a(e, e.f156828b.cast(mo56276f(i2)), obj);
            } else {
                sVar.mo56317b(e, new C59051z(this, e, i2), obj);
            }
        }
    }

    /* renamed from: e */
    public final C58976aa mo56275e(int i) {
        C59037l lVar = this.f156897c;
        int b = lVar.mo56310b();
        if (i >= b) {
            lVar = this.f156898d;
            i -= b;
        }
        return lVar.mo56311c(i);
    }

    /* renamed from: f */
    public final Object mo56276f(int i) {
        C59037l lVar = this.f156897c;
        int b = lVar.mo56310b();
        if (i >= b) {
            lVar = this.f156898d;
            i -= b;
        }
        return lVar.mo56313e(i);
    }
}
