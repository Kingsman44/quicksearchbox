package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.p097i.C1974i;
import androidx.core.p098j.C2043bi;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: PG */
final class C44630c {

    /* renamed from: a */
    public final Rect f116273a;

    /* renamed from: b */
    private final ColorStateList f116274b;

    /* renamed from: c */
    private final ColorStateList f116275c;

    /* renamed from: d */
    private final ColorStateList f116276d;

    /* renamed from: e */
    private final int f116277e;

    /* renamed from: f */
    private final C44785p f116278f;

    private C44630c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C44785p pVar, Rect rect) {
        C1974i.m5317e(rect.left);
        C1974i.m5317e(rect.top);
        C1974i.m5317e(rect.right);
        C1974i.m5317e(rect.bottom);
        this.f116273a = rect;
        this.f116274b = colorStateList2;
        this.f116275c = colorStateList;
        this.f116276d = colorStateList3;
        this.f116277e = i;
        this.f116278f = pVar;
    }

    /* renamed from: a */
    static C44630c m79089a(Context context, int i) {
        C1974i.m5314b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C44619ao.f116262b);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList b = C44694d.m79230b(context, obtainStyledAttributes, 4);
        ColorStateList b2 = C44694d.m79230b(context, obtainStyledAttributes, 9);
        ColorStateList b3 = C44694d.m79230b(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C44785p pVar = new C44785p(C44785p.m79427d(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new C44630c(b, b2, b3, dimensionPixelSize, pVar, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47866b(TextView textView) {
        C44779j jVar = new C44779j();
        C44779j jVar2 = new C44779j();
        jVar.mo47555l(this.f116278f);
        jVar2.mo47555l(this.f116278f);
        jVar.mo48124V(this.f116275c);
        int i = this.f116277e;
        ColorStateList colorStateList = this.f116276d;
        jVar.mo48129aa((float) i);
        jVar.mo48128Z(colorStateList);
        textView.setTextColor(this.f116274b);
        C2043bi.m5530X(textView, new InsetDrawable(new RippleDrawable(this.f116274b.withAlpha(30), jVar, jVar2), this.f116273a.left, this.f116273a.top, this.f116273a.right, this.f116273a.bottom));
    }
}
