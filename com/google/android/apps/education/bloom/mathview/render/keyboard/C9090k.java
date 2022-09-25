package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.util.SparseIntArray;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.p3589d.p3590a.C45686c;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.k */
/* compiled from: PG */
public final class C9090k extends C9097r {

    /* renamed from: h */
    private static final SparseIntArray f31347h;

    /* renamed from: i */
    private final List f31348i = C69540x.m100947e(new C45686c("𝑥", "x", 0), new C45686c("𝑦", "y", 0), new C45686c("𝑧", "z", 0));

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(R.id.fraction, R.layout.overflow_fraction);
        sparseIntArray.put(R.id.exponent, R.layout.overflow_power);
        sparseIntArray.put(R.id.root, R.layout.overflow_root);
        sparseIntArray.put(R.id.function, R.layout.overflow_function);
        sparseIntArray.put(R.id.pi, R.layout.overflow_pi);
        f31347h = sparseIntArray;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9090k(android.view.ViewGroup r5) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131627204(0x7f0e0cc4, float:1.8881666E38)
            r2 = 0
            android.view.View r5 = r0.inflate(r1, r5, r2)
            java.lang.String r0 = "from(parent.context).inf…oard_home, parent, false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            android.util.SparseIntArray r0 = f31347h
            r4.<init>(r5, r0)
            r5 = 3
            com.google.apps.d.a.u[] r5 = new com.google.apps.p3589d.p3590a.C45704u[r5]
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝑥"
            java.lang.String r3 = "x"
            r0.<init>(r1, r3, r2)
            r5[r2] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝑦"
            java.lang.String r3 = "y"
            r0.<init>(r1, r3, r2)
            r1 = 1
            r5[r1] = r0
            com.google.apps.d.a.c r0 = new com.google.apps.d.a.c
            java.lang.String r1 = "𝑧"
            java.lang.String r3 = "z"
            r0.<init>(r1, r3, r2)
            r1 = 2
            r5[r1] = r0
            java.util.List r5 = p5462h.p5463a.C69540x.m100947e(r5)
            r4.f31348i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.keyboard.C9090k.<init>(android.view.ViewGroup):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo17407a() {
        return R.id.variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo17408b() {
        return this.f31348i;
    }
}
