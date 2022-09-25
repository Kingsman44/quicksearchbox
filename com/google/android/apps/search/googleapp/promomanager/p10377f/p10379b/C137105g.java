package com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b;

import android.content.Context;
import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47753cr;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.b.g */
/* compiled from: PG */
public final class C137105g {

    /* renamed from: a */
    public static final C59071e f373086a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.b.g");

    /* renamed from: b */
    public final C47770dh f373087b;

    /* renamed from: c */
    public final View f373088c;

    /* renamed from: d */
    public View f373089d;

    /* renamed from: e */
    public GestureDetector f373090e;

    /* renamed from: f */
    public View.OnClickListener f373091f;

    /* renamed from: g */
    public View.OnClickListener f373092g;

    /* renamed from: h */
    private final Context f373093h;

    /* renamed from: i */
    private final String f373094i;

    /* renamed from: j */
    private final C63932bs f373095j;

    /* renamed from: k */
    private CoordinatorLayout f373096k;

    /* renamed from: l */
    private PopupWindow.OnDismissListener f373097l;

    public C137105g(C47770dh dhVar, Fragment fragment, View view, String str, C63932bs bsVar) {
        this.f373087b = dhVar;
        this.f373093h = fragment.getContext();
        this.f373088c = view;
        this.f373094i = str;
        this.f373095j = bsVar;
    }

    /* renamed from: a */
    public static Rect m222808a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.offset(iArr[0], iArr[1]);
        return rect;
    }

    /* renamed from: b */
    public final void mo113524b() {
        CoordinatorLayout coordinatorLayout;
        ((C59052c) ((C59052c) f373086a.mo56224b()).mo56372aa(40926)).mo56386p("Dismiss tooltip");
        View view = this.f373089d;
        if (view != null && (coordinatorLayout = this.f373096k) != null) {
            coordinatorLayout.removeView(view);
            PopupWindow.OnDismissListener onDismissListener = this.f373097l;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }
    }

    /* renamed from: c */
    public final void mo113525c(PopupWindow.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.f373097l = new C47753cr(this.f373087b, onDismissListener);
        } else {
            this.f373097l = null;
        }
    }

    /* renamed from: d */
    public final void mo113526d() {
        CoordinatorLayout coordinatorLayout;
        View view = this.f373089d;
        if (!(view == null || (coordinatorLayout = this.f373096k) == null || coordinatorLayout.findViewById(view.getId()) == null)) {
            mo113524b();
        }
        try {
            View view2 = this.f373088c;
            view2.getClass();
            View view3 = view2;
            while (view2 != null) {
                if (true == (view2 instanceof CoordinatorLayout)) {
                    view3 = view2;
                }
                view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            }
            this.f373096k = (CoordinatorLayout) view3;
            LayoutInflater from = LayoutInflater.from(this.f373093h);
            C63932bs bsVar = this.f373095j;
            View inflate = from.inflate(bsVar == C63932bs.ABOVE ? R.layout.googleapp_tooltip_above : R.layout.googleapp_tooltip_below, this.f373096k, false);
            this.f373089d = inflate;
            View findViewById = this.f373089d.findViewById(R.id.googleapp_tooltip_promo_arrow);
            ((TextView) inflate.findViewById(R.id.googleapp_tooltip_text)).setText(this.f373094i);
            ((C1773f) this.f373089d.getLayoutParams()).mo4974a(new C137103e(this, findViewById, this.f373095j, this.f373093h.getResources().getDimensionPixelOffset(R.dimen.googleapp_tooltip_margin_side)));
            findViewById.setOutlineProvider(new C137104f());
            View findViewById2 = this.f373089d.findViewById(R.id.googleapp_tooltip_close);
            View.OnClickListener onClickListener = this.f373091f;
            if (onClickListener == null) {
                findViewById2.setOnClickListener(new C47591co(this.f373087b, "tooltipView clicked", new C137101c(this)));
            } else {
                findViewById2.setOnClickListener(onClickListener);
            }
            this.f373090e = new GestureDetector(this.f373093h, new C137102d(this));
        } catch (ClassCastException unused) {
            ((C59052c) ((C59052c) f373086a.mo56225c()).mo56372aa(40927)).mo56386p("Tooltip failed to find any CoordinatorLayout in the view hierarchy, unable to anchor tooltip.");
        }
        ((C59052c) ((C59052c) f373086a.mo56224b()).mo56372aa(40928)).mo56386p("Show tooltip");
        View view4 = this.f373089d;
        if (view4 != null && this.f373096k != null) {
            view4.setVisibility(4);
            this.f373096k.addView(this.f373089d);
        }
    }
}
