package com.google.android.apps.gsa.shared.p7148ui;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.ui.am */
/* compiled from: PG */
final class C90637am {

    /* renamed from: a */
    public final View f253464a;

    /* renamed from: b */
    public final View f253465b;

    /* renamed from: c */
    public final View f253466c;

    /* renamed from: d */
    public final List f253467d;

    /* renamed from: e */
    public final Rect f253468e = new Rect();

    /* renamed from: f */
    public boolean f253469f;

    /* renamed from: g */
    private final Resources f253470g;

    /* renamed from: h */
    private boolean f253471h;

    public C90637am(View view, Resources resources, boolean z) {
        boolean z2 = false;
        this.f253471h = false;
        this.f253469f = true;
        view.getClass();
        this.f253464a = view;
        this.f253465b = null;
        this.f253466c = null;
        this.f253470g = resources;
        this.f253469f = z;
        this.f253471h = view.getTag(R.id.suggestion_grid_layout_full_bleed) != null ? true : z2;
        view.setTag(R.id.suggestion_grid_layout_grid_item, this);
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(view);
        this.f253467d = e.mo55394f();
    }

    /* renamed from: d */
    public static int m147968d(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (i2 == 0 || mode == 0) ? i : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) + i2, mode);
    }

    /* renamed from: e */
    public static C90637am m147969e(View view) {
        return (C90637am) view.getTag(R.id.suggestion_grid_layout_grid_item);
    }

    /* renamed from: a */
    public final int mo84922a() {
        int i = 0;
        if (this.f253469f && !this.f253471h) {
            int dimensionPixelSize = this.f253470g.getDimensionPixelSize(R.dimen.lotic_card_side_margin);
            i = dimensionPixelSize + dimensionPixelSize;
        }
        return (this.f253468e.left + this.f253468e.right) - i;
    }

    /* renamed from: b */
    public final int mo84923b() {
        return this.f253464a.getMeasuredHeight() - (this.f253468e.top + this.f253468e.bottom);
    }

    /* renamed from: c */
    public final int mo84924c() {
        return this.f253464a.getMeasuredWidth() - mo84922a();
    }

    /* renamed from: f */
    public final void mo84925f(int i) {
        C58801sm G = ((C58485gu) this.f253467d).listIterator(0);
        while (G.hasNext()) {
            SuggestionGridLayout.m147912d((View) G.next(), i);
        }
    }

    /* renamed from: g */
    public final boolean mo84926g() {
        return this.f253464a.getVisibility() == 8;
    }

    /* renamed from: h */
    public final void mo84927h(int i, int i2, int i3) {
        int dimensionPixelSize = this.f253470g.getDimensionPixelSize(R.dimen.lotic_card_side_margin);
        boolean z = this.f253469f;
        int i4 = 0;
        int i5 = (!z || this.f253471h) ? 0 : dimensionPixelSize;
        if (z && !this.f253471h) {
            i4 = -dimensionPixelSize;
        }
        int i6 = i2 - this.f253468e.top;
        this.f253464a.layout((i - this.f253468e.left) + i5, i6, i3 + this.f253468e.right + i4, this.f253464a.getMeasuredHeight() + i6);
    }
}
