package com.facebook.litho;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;

/* renamed from: com.facebook.litho.ft */
/* compiled from: PG */
public final class C6277ft {
    /* renamed from: a */
    public static int m16837a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i), i2);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i);
        throw new IllegalStateException("Unexpected size mode: " + mode2);
    }

    /* renamed from: b */
    public static int m16838b(float f, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (i2 != 1) {
            return View.MeasureSpec.makeMeasureSpec(C6159cg.m16231a(f), LinearLayoutManager.INVALID_OFFSET);
        }
        return View.MeasureSpec.makeMeasureSpec(C6159cg.m16231a(f), 1073741824);
    }
}
