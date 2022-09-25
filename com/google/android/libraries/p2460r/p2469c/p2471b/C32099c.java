package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57454dy;

/* renamed from: com.google.android.libraries.r.c.b.c */
/* compiled from: PG */
public final class C32099c extends ShapeDrawable {

    /* renamed from: a */
    private final int f86191a;

    /* renamed from: b */
    private final int f86192b;

    /* renamed from: c */
    private final int f86193c;

    /* renamed from: d */
    private final int f86194d;

    /* renamed from: e */
    private final int f86195e;

    public C32099c(Context context, C57454dy dyVar, float[] fArr, boolean z) {
        super(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        int a = (int) C32056a.m59733a((float) dyVar.f153474c, context);
        this.f86195e = a;
        int i = dyVar.f153472a;
        int i2 = 0;
        if (i == 0 || i == 15) {
            this.f86191a = 0;
            this.f86192b = 0;
            this.f86193c = 0;
            this.f86194d = 0;
        } else {
            int i3 = 4;
            int i4 = z ? 4 : 1;
            int i5 = i & (true == z ? 1 : i3);
            int i6 = i & 2;
            int i7 = i & 8;
            this.f86191a = (i & i4) != 0 ? 0 : -a;
            this.f86192b = i5 != 0 ? 0 : a;
            this.f86193c = i6 != 0 ? 0 : -a;
            this.f86194d = i7 == 0 ? a : i2;
        }
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth((float) (a + a));
        getPaint().setColor(dyVar.f153473b);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i + this.f86191a, i2 + this.f86193c, i3 + this.f86192b, i4 + this.f86194d);
    }

    public final void setBounds(Rect rect) {
        setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
