package com.google.android.libraries.lens.view.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.InfoPanelView;
import com.google.android.libraries.lens.view.p2069am.C25325bf;
import com.google.android.libraries.lens.view.p2069am.C25326bg;
import com.google.android.libraries.lens.view.p2074ap.C25464d;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25517aw;
import com.google.common.p4575r.C60757n;

/* compiled from: PG */
public final class LensUnderlayCoordinatorBehavior extends C1770c {

    /* renamed from: a */
    public C25517aw f74641a = C27290ag.f74694a;

    /* renamed from: b */
    public boolean f74642b;

    /* renamed from: c */
    private final Context f74643c;

    /* renamed from: d */
    private final WindowManager f74644d;

    /* renamed from: e */
    private final int f74645e;

    /* renamed from: f */
    private final int f74646f;

    /* renamed from: g */
    private final int f74647g;

    /* renamed from: h */
    private final C25466f f74648h;

    /* renamed from: i */
    private final int[] f74649i = new int[2];

    public LensUnderlayCoordinatorBehavior(Context context, C25466f fVar, boolean z) {
        this.f74643c = context;
        this.f74648h = fVar;
        Resources resources = context.getResources();
        this.f74645e = resources.getDimensionPixelSize(R.dimen.lens_transformation_limits_header_offset);
        if (z) {
            this.f74646f = resources.getDimensionPixelSize(R.dimen.lens_transformation_limits_settings_overlay_offset) + resources.getDimensionPixelSize(R.dimen.lens_transformation_limits_settings_overlay_options_height);
        } else {
            this.f74646f = resources.getDimensionPixelSize(R.dimen.lens_transformation_limits_settings_overlay_offset);
        }
        this.f74647g = resources.getDimensionPixelSize(R.dimen.lens_transformation_limits_panel_header_height);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f74644d = windowManager;
    }

    /* renamed from: s */
    private final int m50811s(View view, int i) {
        view.getLocationInWindow(this.f74649i);
        return C60757n.m92742c(this.f74649i[1], 0, i);
    }

    /* renamed from: t */
    private final void m50812t(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        LensOverlayLayout lensOverlayLayout = (LensOverlayLayout) view.findViewById(R.id.lens_overlay_layout);
        lensOverlayLayout.getClass();
        int d = view2 instanceof InfoPanelView ? ((InfoPanelView) view2).mo32354d() : 0;
        int i2 = this.f74643c.getResources().getDisplayMetrics().heightPixels;
        int s = m50811s(view2, i2);
        View findViewById = coordinatorLayout.findViewById(R.id.selection_state_view);
        if (findViewById == null || findViewById.getHeight() <= 0 || findViewById.getY() <= 0.0f) {
            i = i2;
        } else {
            i = m50811s(findViewById, i2);
            if (i < s) {
                s = i;
            }
        }
        Display defaultDisplay = this.f74644d.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i3 = point.y;
        C25325bf bfVar = (C25325bf) C25326bg.f68902l.createBuilder();
        int s2 = m50811s(view, i2);
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68904a = s2;
        int i4 = this.f74645e;
        int a = ((C25464d) this.f74648h.f69401a.mo3842a()).mo30499a();
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68905b = i4 + a;
        int i5 = this.f74646f;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68906c = i5;
        int i6 = lensOverlayLayout.mo32814c().y;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68907d = i6;
        int a2 = lensOverlayLayout.mo32812a();
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68908e = a2;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68910g = s;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68911h = i;
        int i7 = this.f74647g;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68909f = i7;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68912i = i2;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68913j = i3;
        bfVar.copyOnWrite();
        ((C25326bg) bfVar.instance).f68914k = d;
        C25326bg bgVar = (C25326bg) bfVar.build();
        if (bgVar.f68908e > 0) {
            this.f74641a.mo30545a(bgVar);
        }
    }

    /* renamed from: e */
    public final boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2.getId() != R.id.lens_info_panel) {
            return false;
        }
        m50812t(coordinatorLayout, view, view2);
        return false;
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        for (View view2 : coordinatorLayout.mo4914b(view)) {
            if (mo4964l(view, view2)) {
                int i2 = this.f74643c.getResources().getDisplayMetrics().heightPixels;
                if (m50811s(view2, i2) < i2) {
                    return false;
                }
                m50812t(coordinatorLayout, view, view2);
                return false;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo4964l(View view, View view2) {
        return this.f74642b && view2.getId() == R.id.lens_info_panel;
    }
}
