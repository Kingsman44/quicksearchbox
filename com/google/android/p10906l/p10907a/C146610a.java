package com.google.android.p10906l.p10907a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.google.android.l.a.a */
/* compiled from: PG */
public final class C146610a extends LinearLayout implements C146611b {

    /* renamed from: a */
    public static final C146612c f395982a = new C146614e();

    /* renamed from: b */
    private final Rect f395983b;

    /* renamed from: c */
    private final Rect f395984c = new Rect();

    static {
        C146616g.f395988l = new C146613d();
    }

    public C146610a(Context context) {
        super(context);
        Rect rect = new Rect();
        this.f395983b = rect;
        Resources resources = getResources();
        int i = C146615f.f395985a;
        float a = C146615f.m238856a(2.0f, resources);
        float a2 = C146615f.m238856a(2.0f, resources);
        float a3 = C146615f.m238856a(2.0f, resources);
        int a4 = (int) C146615f.m238856a(0.0f, resources);
        rect.left = a4;
        rect.top = a4;
        rect.right = a4;
        rect.bottom = a4;
        float f = a2 > a3 ? a2 : a3;
        C146612c cVar = f395982a;
        setBackgroundDrawable(new C146616g(context.getResources(), i, a, a2, f));
        cVar.mo123411b(this);
    }

    /* renamed from: a */
    public final void mo123404a(int i, int i2, int i3, int i4) {
        this.f395984c.set(i, i2, i3, i4);
        super.setPadding(i + this.f395983b.left, i2 + this.f395983b.top, i3 + this.f395983b.right, i4 + this.f395983b.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f395982a.mo123410a(this).mo123413b()), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f395982a.mo123410a(this).mo123412a()), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
