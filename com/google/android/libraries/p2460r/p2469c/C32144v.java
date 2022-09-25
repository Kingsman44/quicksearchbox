package com.google.android.libraries.p2460r.p2469c;

import android.widget.FrameLayout;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57373ay;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.v */
/* compiled from: PG */
final class C32144v extends C32140r {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32144v(android.content.Context r4, com.google.android.libraries.p2460r.p2469c.C32127e r5) {
        /*
            r3 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32144v.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* renamed from: p */
    public final /* synthetic */ List mo37851p(Object obj) {
        return ((C57373ay) obj).f153274a;
    }

    /* renamed from: v */
    public final /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 24) {
            return (C57373ay) auVar.f153258c;
        }
        return C57373ay.f153272b;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo37853w(Object obj, C32148z zVar) {
        super.mo37952r(((C57373ay) obj).f153274a, zVar);
        for (C32138p pVar : this.f86320a) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            int i = pVar.f86308l;
            int i2 = -2;
            if (i == -3) {
                i = -2;
            }
            layoutParams.width = i;
            int i3 = pVar.f86309m;
            if (i3 != -3) {
                i2 = i3;
            }
            layoutParams.height = i2;
            pVar.mo37940f().mo37878h(this.f86298b, layoutParams);
            layoutParams.gravity = pVar.mo37938d(17);
            pVar.mo37944j(layoutParams);
        }
    }
}
