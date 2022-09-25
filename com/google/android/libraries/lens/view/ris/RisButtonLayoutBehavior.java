package com.google.android.libraries.lens.view.ris;

import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.InfoPanelView;

/* compiled from: PG */
public final class RisButtonLayoutBehavior extends C1770c {

    /* renamed from: a */
    int f75567a = 0;

    /* renamed from: b */
    private final int f75568b;

    /* renamed from: c */
    private final int f75569c;

    /* renamed from: d */
    private final int f75570d;

    /* renamed from: e */
    private final boolean f75571e;

    public RisButtonLayoutBehavior(int i, int i2, int i3, boolean z) {
        this.f75568b = i;
        this.f75569c = i2;
        this.f75570d = i3;
        this.f75571e = z;
    }

    /* renamed from: e */
    public final boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        float f;
        int i;
        View findViewById = view.findViewById(R.id.ris_button);
        int top = view2.getTop();
        if (view2 instanceof InfoPanelView) {
            InfoPanelView infoPanelView = (InfoPanelView) view2;
            this.f75567a = (infoPanelView.mo32355e() - infoPanelView.mo32354d()) - infoPanelView.f73500n;
        }
        float f2 = 1.0f;
        if (!this.f75571e || view2.getTop() >= (i = this.f75567a) || this.f75570d <= 0) {
            f = 1.0f;
        } else {
            f = Math.max(0.0f, 1.0f - (((float) (i - view2.getTop())) / ((float) this.f75570d)));
            top = i;
        }
        int min = Math.min(0, (top - coordinatorLayout.getTop()) - coordinatorLayout.getHeight());
        int top2 = view2.getTop();
        int bottom = coordinatorLayout.getBottom();
        int i2 = this.f75569c;
        if (top2 < bottom - i2) {
            findViewById.setTranslationY((float) (i2 + min));
        } else {
            findViewById.setTranslationY(0.0f);
        }
        if (!this.f75571e) {
            float height = (-((float) min)) / ((float) coordinatorLayout.getHeight());
            if (height > 0.5f) {
                f2 = 1.0f - ((height - 8.0f) / 0.5f);
            }
        } else {
            f2 = f;
        }
        findViewById.setAlpha(f2);
        return true;
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
        return view2.getId() == this.f75568b;
    }
}
