package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.fn */
/* compiled from: PG */
final class C26594fn {

    /* renamed from: a */
    final int f72496a;

    /* renamed from: b */
    final int f72497b;

    /* renamed from: c */
    final int f72498c;

    /* renamed from: d */
    final int f72499d;

    /* renamed from: e */
    final int f72500e;

    /* renamed from: f */
    final int f72501f;

    /* renamed from: g */
    final int f72502g;

    /* renamed from: h */
    final int f72503h;

    /* renamed from: i */
    final int f72504i;

    /* renamed from: j */
    final int[] f72505j;

    /* renamed from: k */
    public final Context f72506k;

    /* renamed from: l */
    public Paint f72507l;

    /* renamed from: m */
    public Paint f72508m;

    /* renamed from: n */
    public Paint f72509n;

    /* renamed from: o */
    public Paint f72510o;

    /* renamed from: p */
    public Drawable f72511p;

    /* renamed from: q */
    private Paint f72512q;

    public C26594fn(Context context, C26244b bVar) {
        C58833ax axVar;
        this.f72506k = context;
        Resources resources = context.getResources();
        this.f72496a = resources.getDimensionPixelSize(R.dimen.dining_icon_minimum_size);
        this.f72497b = resources.getDimensionPixelSize(R.dimen.text_highlight_corner_radius);
        this.f72498c = resources.getDimensionPixelSize(R.dimen.text_highlight_horizontal_margin);
        this.f72499d = resources.getDimensionPixelSize(R.dimen.text_highlight_vertical_margin);
        resources.getDimensionPixelSize(R.dimen.text_debug_font_size);
        resources.getDimensionPixelSize(R.dimen.text_paragraph_stroke_width);
        this.f72503h = C1874w.m5111h(resources, R.color.lens_text_highlight_color);
        this.f72504i = C1874w.m5111h(resources, R.color.lens_translate_text_highlight_color);
        C1874w.m5111h(resources, R.color.lens_text_highlight_color);
        this.f72505j = resources.getIntArray(R.array.lens_dining_item_highlight_color_array);
        String f = bVar.mo31461f(C26239a.LENSVIEW_LIVE_TEXT_ACTIONABLE_HIGHLIGHT_COLOR);
        if (f.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            try {
                axVar = C58833ax.m90834k(Integer.valueOf(Color.parseColor(f)));
            } catch (IllegalArgumentException unused) {
                axVar = C58836b.f156633a;
            }
        }
        this.f72502g = ((Integer) axVar.mo56109e(Integer.valueOf(C1874w.m5111h(resources, R.color.lens_text_highlight_actionable_color)))).intValue();
        this.f72500e = resources.getDimensionPixelSize(R.dimen.lens_highlight_dynamic_opacity_min_height);
        this.f72501f = resources.getDimensionPixelSize(R.dimen.lens_highlight_dynamic_opacity_max_height);
    }

    /* renamed from: a */
    public static Paint m49092a(int i) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        return paint;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Paint mo31855b() {
        if (this.f72512q == null) {
            this.f72512q = m49092a(this.f72504i);
        }
        return this.f72512q;
    }
}
