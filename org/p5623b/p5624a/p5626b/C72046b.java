package org.p5623b.p5624a.p5626b;

import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.C72113z;

/* renamed from: org.b.a.b.b */
/* compiled from: PG */
public final class C72046b extends C72101n {

    /* renamed from: a */
    public final C72113z f191840a;

    public C72046b(C72113z zVar) {
        this.f191840a = zVar;
    }

    /* renamed from: a */
    public final C72042a mo63245a() {
        C72092e[] eVarArr = this.f191840a.f191942a;
        if (eVarArr.length == 0) {
            return null;
        }
        return C72042a.m105404a(eVarArr[0]);
    }

    /* renamed from: b */
    public final boolean mo63246b() {
        return this.f191840a.f191942a.length > 1;
    }

    /* renamed from: c */
    public final C72042a[] mo63247c() {
        int length = this.f191840a.f191942a.length;
        C72042a[] aVarArr = new C72042a[length];
        for (int i = 0; i != length; i++) {
            aVarArr[i] = C72042a.m105404a(this.f191840a.f191942a[i]);
        }
        return aVarArr;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        return this.f191840a;
    }
}
