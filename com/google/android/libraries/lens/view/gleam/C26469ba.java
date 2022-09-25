package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.ba */
/* compiled from: PG */
public final class C26469ba extends C26468b {

    /* renamed from: g */
    public final Paint f72096g;

    /* renamed from: h */
    public final Paint f72097h;

    /* renamed from: i */
    public final Paint f72098i;

    /* renamed from: j */
    public C58833ax f72099j;

    /* renamed from: k */
    public C58833ax f72100k;

    /* renamed from: l */
    public C58833ax f72101l;

    /* renamed from: m */
    public float f72102m;

    /* renamed from: n */
    public final float f72103n;

    /* renamed from: o */
    public final float f72104o;

    /* renamed from: p */
    public final float f72105p;

    /* renamed from: q */
    public final float f72106q;

    /* renamed from: r */
    public final float f72107r;

    public C26469ba(C26447af afVar, Context context) {
        super(afVar, context);
        Paint paint = new Paint(193);
        this.f72096g = paint;
        Paint paint2 = new Paint(193);
        this.f72097h = paint2;
        Paint paint3 = new Paint(193);
        this.f72098i = paint3;
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.storefront_space_size_between_overall_rating_number_and_star);
        this.f72104o = dimension;
        float dimension2 = resources.getDimension(R.dimen.storefront_space_size_between_star_and_dot);
        this.f72105p = dimension2;
        float dimension3 = resources.getDimension(R.dimen.storefront_space_size_between_dot_and_price_level);
        this.f72106q = dimension3;
        this.f72107r = resources.getDimension(R.dimen.gleam_label_box_2_3_line_spacing);
        int color = resources.getColor(R.color.google_orange500);
        paint2.setColor(color);
        paint2.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("Roboto Medium", 0));
        paint.setTextSize(this.f72094e);
        paint.setColor(color);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create("Roboto Regular", 0));
        paint3.setTextSize(this.f72094e);
        paint3.setColor(resources.getColor(R.color.google_grey600));
        C58833ax e = C26465ax.m48855e(C26465ax.m48856f(afVar), paint);
        C58833ax d = C26466ay.m48861d(C26466ay.m48862e(afVar), paint3);
        C58833ax d2 = C26467az.m48866d(C26467az.m48867e(afVar), paint3);
        this.f72099j = e;
        this.f72100k = d;
        this.f72101l = d2;
        float measureText = paint3.measureText("•");
        this.f72103n = measureText;
        float c = m48872c(1.0f, e, d, d2, measureText, dimension, dimension2, dimension3);
        this.f72092c = c;
        this.f72093d = c;
        this.f72102m = measureText;
    }

    /* renamed from: c */
    private static float m48872c(float f, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (axVar.mo56113h()) {
            float c = ((C26465ax) axVar.mo56107c()).mo31721c();
            float a = ((C26465ax) axVar.mo56107c()).mo31719a();
            f6 = c + 0.0f + (f3 * f) + a + a;
        }
        if (axVar.mo56113h() && axVar2.mo56113h()) {
            f6 = f6 + ((f4 + f5) * f) + f2;
        }
        if (axVar2.mo56113h()) {
            f6 += ((C26466ay) axVar2.mo56107c()).mo31723a();
        }
        if (!axVar3.mo56113h()) {
            return f6;
        }
        return Math.max(f6, ((C26467az) axVar3.mo56107c()).mo31726a());
    }

    /* renamed from: a */
    public final int mo31729a() {
        int i = (this.f72099j.mo56113h() || this.f72100k.mo56113h()) ? 1 : 0;
        return this.f72101l.mo56113h() ? i + 1 : i;
    }

    /* renamed from: b */
    public final float mo31730b(float f, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, float f2) {
        return m48872c(f, axVar, axVar2, axVar3, f2, this.f72104o, this.f72105p, this.f72106q);
    }
}
