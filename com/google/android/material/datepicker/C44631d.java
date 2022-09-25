package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3512i.C44694d;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: PG */
final class C44631d {

    /* renamed from: a */
    final C44630c f116279a;

    /* renamed from: b */
    final C44630c f116280b;

    /* renamed from: c */
    final C44630c f116281c;

    /* renamed from: d */
    final C44630c f116282d;

    /* renamed from: e */
    final C44630c f116283e;

    /* renamed from: f */
    final C44630c f116284f;

    /* renamed from: g */
    final C44630c f116285g;

    /* renamed from: h */
    final Paint f116286h;

    public C44631d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C44693c.m79227c(context, R.attr.materialCalendarStyle, C44649v.class.getCanonicalName()).data, C44619ao.f116261a);
        this.f116279a = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f116285g = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f116280b = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f116281c = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList b = C44694d.m79230b(context, obtainStyledAttributes, 6);
        this.f116282d = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f116283e = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f116284f = C44630c.m79089a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f116286h = paint;
        paint.setColor(b.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
