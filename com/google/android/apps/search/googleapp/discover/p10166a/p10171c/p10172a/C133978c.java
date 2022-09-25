package com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.a.c */
/* compiled from: PG */
public final class C133978c extends View {

    /* renamed from: a */
    public final List f364930a = new ArrayList();

    /* renamed from: b */
    private final Paint f364931b;

    /* renamed from: c */
    private final Paint f364932c;

    /* renamed from: d */
    private final float f364933d;

    /* renamed from: e */
    private final Paint f364934e;

    /* renamed from: f */
    private final Paint f364935f;

    /* renamed from: g */
    private final int[] f364936g = new int[2];

    /* renamed from: h */
    private final Rect f364937h = new Rect();

    /* renamed from: i */
    private final int[] f364938i = new int[2];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133978c(Context context) {
        super(context);
        C69664n.m101061g(context, "context");
        Paint paint = new Paint();
        paint.setColor(-65281);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        this.f364931b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16711936);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(10.0f);
        this.f364932c = paint2;
        float applyDimension = TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        this.f364933d = applyDimension;
        Paint paint3 = new Paint();
        paint3.setTextSize(applyDimension);
        paint3.setColor(-16777216);
        this.f364934e = paint3;
        Paint paint4 = new Paint();
        paint4.setTextSize(applyDimension);
        paint4.setColor(-1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(1.0f);
        this.f364935f = paint4;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        C69664n.m101061g(canvas, "canvas");
        for (C133976a aVar : this.f364930a) {
            View view = aVar.f364925a;
            view.getLocationOnScreen(this.f364936g);
            Rect rect = this.f364937h;
            int[] iArr = this.f364936g;
            int i = iArr[0];
            rect.set(i, iArr[1] - this.f364938i[1], view.getWidth() + i, (this.f364936g[1] + view.getHeight()) - this.f364938i[1]);
            Rect rect2 = this.f364937h;
            if (aVar.f364927c) {
                paint = this.f364932c;
            } else {
                paint = this.f364931b;
            }
            canvas.drawRect(rect2, paint);
            String duration = aVar.f364928d.toString();
            C69664n.m101060f(duration, "trackedView.viewDuration.toString()");
            String format = String.format("%s - %s", Arrays.copyOf(new Object[]{aVar.f364926b, C69764m.m101198r(duration, "PT")}, 2));
            C69664n.m101060f(format, "format(this, *args)");
            float f = ((float) this.f364937h.left) + (this.f364933d / 2.0f);
            float f2 = ((float) this.f364937h.top) + this.f364933d;
            canvas.drawText(format, f, f2, this.f364934e);
            canvas.drawText(format, f, f2, this.f364935f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f364938i);
    }
}
