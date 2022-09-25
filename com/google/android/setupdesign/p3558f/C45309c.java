package com.google.android.setupdesign.p3558f;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;

/* renamed from: com.google.android.setupdesign.f.c */
/* compiled from: PG */
public final class C45309c {
    /* renamed from: a */
    public static void m80756a(View view) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            Context context = view.getContext();
            boolean l = C45240c.m80574e(context).mo49107l(C45238a.CONFIG_LAYOUT_MARGIN_START);
            boolean l2 = C45240c.m80574e(context).mo49107l(C45238a.CONFIG_LAYOUT_MARGIN_END);
            if (C45312f.m80763c(view)) {
                if (!l) {
                    if (l2) {
                        l2 = true;
                    } else {
                        return;
                    }
                }
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                obtainStyledAttributes.recycle();
                if (l) {
                    i = ((int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_LAYOUT_MARGIN_START, 0.0f)) - dimensionPixelSize;
                } else {
                    i = view.getPaddingStart();
                }
                if (l2) {
                    i2 = ((int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_LAYOUT_MARGIN_END, 0.0f)) - dimensionPixelSize2;
                    if (view.getId() == R.id.sud_layout_content) {
                        i2 = ((int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_LAYOUT_MARGIN_START, 0.0f)) - dimensionPixelSize2;
                    }
                } else {
                    i2 = view.getPaddingEnd();
                    if (view.getId() == R.id.sud_layout_content) {
                        i2 = view.getPaddingStart();
                    }
                }
                if (i != view.getPaddingStart() || i2 != view.getPaddingEnd()) {
                    if (view.getId() == R.id.sud_layout_content) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
                        }
                        marginLayoutParams.setMargins(i, view.getPaddingTop(), i2, view.getPaddingBottom());
                        return;
                    }
                    view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
                }
            }
        }
    }
}
