package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.common.base.C58838bb;
import com.google.common.p4573p.C60713c;

/* renamed from: com.google.android.libraries.lens.view.filters.t */
/* compiled from: PG */
final class C26023t extends C1770c {

    /* renamed from: a */
    private final C26244b f70736a;

    /* renamed from: b */
    private final int f70737b;

    public C26023t(Context context, C26244b bVar, int i) {
        super(context, (AttributeSet) null);
        this.f70736a = bVar;
        this.f70737b = i;
    }

    /* renamed from: s */
    private static boolean m48049s(View view, View view2) {
        View findViewById = view.findViewById(R.id.frozen_filter_guidance);
        if (!(findViewById instanceof ViewStub) && findViewById.getVisibility() != 8) {
            int height = view.getHeight();
            float f = 0.0f;
            do {
                f += view2.getY();
                ViewParent parent = view2.getParent();
                C58838bb.m90866a(parent, "Ran out of parents to traverse while finding absolute view position.");
                view2 = (View) parent;
            } while (!view2.equals(view));
            float min = (float) (Math.min(height, (int) f) - view.getHeight());
            if (findViewById.getTranslationY() != min) {
                findViewById.setTranslationY(min);
                float height2 = (-min) / ((float) view.getHeight());
                float f2 = 1.0f;
                if (height2 > 0.5f) {
                    f2 = 1.0f - ((height2 - 8.0f) / 0.5f);
                }
                findViewById.setAlpha(f2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z = false;
        if (view2.getId() == R.id.selection_state_view) {
            View findViewById = view.findViewById(R.id.filter_carousel_view);
            if (findViewById != null) {
                float y = (findViewById.getY() + ((float) findViewById.findViewById(R.id.filter_carousel_corners_container).getBottom())) - ((float) view2.getHeight());
                z = !C60713c.m92641c((double) view2.getTranslationY(), (double) y, 1.0E-5d);
                if (z) {
                    view2.setTranslationY(y);
                    return z;
                }
            }
            return z;
        } else if (view2.getId() != R.id.lens_info_panel) {
            return false;
        } else {
            View findViewById2 = view.findViewById(R.id.filter_carousel_view);
            if (findViewById2 != null) {
                float height = (-((float) Math.min(0, ((view2.getTop() - coordinatorLayout.getTop()) - coordinatorLayout.getHeight()) + this.f70737b))) / ((float) coordinatorLayout.getHeight());
                float f = 0.0f;
                if (height > 0.5f) {
                    f = 0.0f + (((height - 8.0f) / 0.5f) * ((float) findViewById2.getHeight()));
                }
                findViewById2.setTranslationY(f);
                if (this.f70736a.mo31462g(C26239a.PARTIAL_TRANSLATE_GUIDANCE_ENABLED)) {
                    m48049s(coordinatorLayout, view2);
                }
                return true;
            } else if (this.f70736a.mo31462g(C26239a.PARTIAL_TRANSLATE_GUIDANCE_ENABLED)) {
                return m48049s(coordinatorLayout, view2);
            } else {
                return false;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        for (View view2 : coordinatorLayout.mo4914b(view)) {
            if (mo4964l(view, view2)) {
                mo4957e(coordinatorLayout, view, view2);
                return false;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo4964l(View view, View view2) {
        return view2.getId() == R.id.lens_info_panel || view2.getId() == R.id.selection_state_view;
    }
}
