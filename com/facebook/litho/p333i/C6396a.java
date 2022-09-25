package com.facebook.litho.p333i;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.facebook.litho.C6276fs;

/* renamed from: com.facebook.litho.i.a */
/* compiled from: PG */
public final class C6396a {
    /* renamed from: a */
    public static int m17149a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), LinearLayoutManager.INVALID_OFFSET);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    /* renamed from: b */
    public static void m17150b(int i, int i2, float f, C6276fs fsVar) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil((double) (((float) size) / f));
        int ceil2 = (int) Math.ceil((double) (((float) size2) * f));
        if (mode == 0) {
            mode = 0;
            if (mode2 == 0) {
                fsVar.f18535a = 0;
                fsVar.f18536b = 0;
                return;
            }
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (ceil > size2) {
                fsVar.f18535a = ceil2;
                fsVar.f18536b = size2;
                return;
            }
            fsVar.f18535a = size;
            fsVar.f18536b = ceil;
        } else if (mode == 1073741824) {
            fsVar.f18535a = size;
            if (mode2 == 0 || ceil <= size2) {
                fsVar.f18536b = ceil;
            } else {
                fsVar.f18536b = size2;
            }
        } else if (mode2 == 1073741824) {
            fsVar.f18536b = size2;
            if (mode == 0 || ceil2 <= size) {
                fsVar.f18535a = ceil2;
            } else {
                fsVar.f18535a = size;
            }
        } else if (mode == Integer.MIN_VALUE) {
            fsVar.f18535a = size;
            fsVar.f18536b = ceil;
        } else if (mode2 == Integer.MIN_VALUE) {
            fsVar.f18535a = ceil2;
            fsVar.f18536b = size2;
        }
    }
}
