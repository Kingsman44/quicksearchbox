package com.google.common.p4535g;

import java.math.BigDecimal;

/* renamed from: com.google.common.g.bn */
/* compiled from: PG */
public final class C59148bn {

    /* renamed from: a */
    public static final /* synthetic */ int f157198a = 0;

    static {
        double d = C59222p.f157309a;
        C59219m.m91873d(2.0d - C59222p.f157310b);
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    /* renamed from: a */
    public static int m91712a(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        return C59147bm.m91711b(bbVar, bbVar2, bbVar3);
    }

    /* renamed from: b */
    public static boolean m91713b(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59136bb bbVar4) {
        int i = C59147bm.m91711b(bbVar2, bbVar4, bbVar) >= 0 ? 1 : 0;
        if (C59147bm.m91711b(bbVar3, bbVar4, bbVar2) >= 0) {
            i++;
        }
        if (C59147bm.m91711b(bbVar, bbVar4, bbVar3) > 0) {
            i++;
        }
        return i >= 2;
    }
}
