package com.facebook.litho.widget;

import android.view.View;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6393hr;
import com.facebook.litho.C6394hs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;

/* renamed from: com.facebook.litho.widget.el */
/* compiled from: PG */
public final class C6534el {
    /* renamed from: a */
    public static void m17781a(C6411u uVar, int i, int i2, C6276fs fsVar, ComponentTree componentTree, C6407q qVar, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            C6393hr b = C6394hs.m17136b(uVar);
            b.mo13404d(qVar);
            b.mo13433Q(View.MeasureSpec.getSize(i2));
            qVar = b.mo13259a();
        }
        componentTree.mo12721p(qVar, i, View.MeasureSpec.makeMeasureSpec(0, 0), fsVar);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            fsVar.f18536b = Math.min(View.MeasureSpec.getSize(i2), fsVar.f18536b);
        } else if (mode == 1073741824) {
            fsVar.f18536b = View.MeasureSpec.getSize(i2);
        }
    }
}
