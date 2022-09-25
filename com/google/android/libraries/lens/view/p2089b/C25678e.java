package com.google.android.libraries.lens.view.p2089b;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.b.e */
/* compiled from: PG */
public final class C25678e {
    /* renamed from: a */
    public static C58833ax m47348a(View view) {
        C58838bb.m90883r(view.isAttachedToWindow());
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return C58836b.f156633a;
        }
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        if (displayCutout == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(new Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()));
    }
}
