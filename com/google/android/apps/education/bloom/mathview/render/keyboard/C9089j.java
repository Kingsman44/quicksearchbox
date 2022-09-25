package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.util.SparseIntArray;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.p3589d.p3590a.C45686c;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.j */
/* compiled from: PG */
public final class C9089j extends C9097r {

    /* renamed from: h */
    private static final SparseIntArray f31345h;

    /* renamed from: i */
    private final List f31346i = C69540x.m100947e(new C45686c("𝛼", "\\alpha", 0), new C45686c("𝛽", "\\beta", 0), new C45686c("𝛾", "\\gamma", 0), new C45686c("𝜆", "\\lambda", 0), new C45686c("𝜌", "\\varrho", 0), new C45686c("𝜎", "\\sigma", 0), new C45686c("𝜔", "\\omega", 0));

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(R.id.less, R.layout.overflow_less);
        sparseIntArray.put(R.id.greater, R.layout.overflow_greater);
        sparseIntArray.put(R.id.log, R.layout.overflow_log);
        sparseIntArray.put(R.id.abs, R.layout.overflow_abs);
        sparseIntArray.put(R.id.bin_base, R.layout.overflow_base);
        sparseIntArray.put(R.id.sin, R.layout.overflow_sin);
        sparseIntArray.put(R.id.cos, R.layout.overflow_cos);
        sparseIntArray.put(R.id.tan, R.layout.overflow_tan);
        sparseIntArray.put(R.id.integral, R.layout.overflow_integral);
        sparseIntArray.put(R.id.derivative, R.layout.overflow_derivative);
        sparseIntArray.put(R.id.limit, R.layout.overflow_lim);
        f31345h = sparseIntArray;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9089j(android.view.ViewGroup r5) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131627203(0x7f0e0cc3, float:1.8881664E38)
            r2 = 0
            android.view.View r5 = r0.inflate(r1, r5, r2)
            java.lang.String r0 = "from(parent.context).inf…board_alt, parent, false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            android.util.SparseIntArray r0 = f31345h
            r4.<init>(r5, r0)
            r5 = 7
            com.google.apps.d.a.u[] r5 = new com.google.apps.p3589d.p3590a.C45704u[r5]
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝛼"
            java.lang.String r3 = "\\alpha"
            r0.<init>(r1, r3, r2)
            r5[r2] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝛽"
            java.lang.String r3 = "\\beta"
            r0.<init>(r1, r3, r2)
            r1 = 1
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝛾"
            java.lang.String r3 = "\\gamma"
            r0.<init>(r1, r3, r2)
            r1 = 2
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝜆"
            java.lang.String r3 = "\\lambda"
            r0.<init>(r1, r3, r2)
            r1 = 3
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝜌"
            java.lang.String r3 = "\\varrho"
            r0.<init>(r1, r3, r2)
            r1 = 4
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝜎"
            java.lang.String r3 = "\\sigma"
            r0.<init>(r1, r3, r2)
            r1 = 5
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝜔"
            java.lang.String r3 = "\\omega"
            r0.<init>(r1, r3, r2)
            r1 = 6
            r5[r1] = r0
            java.util.List r5 = p5462h.p5463a.C69540x.m100947e(r5)
            r4.f31346i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.keyboard.C9089j.<init>(android.view.ViewGroup):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo17407a() {
        return R.id.greek;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo17408b() {
        return this.f31346i;
    }
}
