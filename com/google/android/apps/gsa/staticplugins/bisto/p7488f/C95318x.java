package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.x */
/* compiled from: PG */
public final class C95318x {

    /* renamed from: a */
    final int f266700a;

    /* renamed from: b */
    final C95319y f266701b;

    /* renamed from: c */
    final C95291ac[] f266702c;

    /* renamed from: d */
    final /* synthetic */ C95293ae f266703d;

    public C95318x(C95293ae aeVar, int i, C95319y yVar, C95291ac... acVarArr) {
        this.f266703d = aeVar;
        this.f266700a = i;
        this.f266701b = yVar;
        this.f266702c = acVarArr;
    }

    /* renamed from: a */
    public final Integer mo89249a(int i) {
        if (i >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                C95291ac[] acVarArr = this.f266702c;
                if (i2 >= acVarArr.length) {
                    break;
                }
                C95291ac acVar = acVarArr[i2];
                if (!acVar.mo89210b()) {
                    return Integer.valueOf(i2 + 1);
                }
                i3 += acVar.mo89209a();
                if (i3 > i) {
                    return Integer.valueOf(i2 + 1);
                }
                i2++;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Integer mo89250b() {
        C96628d dVar = this.f266703d.f266622d;
        if (dVar == null || !this.f266701b.mo89211a(this.f266700a, dVar)) {
            return null;
        }
        Integer a = mo89249a(this.f266703d.mo89212c(this.f266700a));
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        return a;
    }
}
