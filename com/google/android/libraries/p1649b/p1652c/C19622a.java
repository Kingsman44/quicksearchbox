package com.google.android.libraries.p1649b.p1652c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.libraries.p1649b.p1650a.C19609f;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.b.c.a */
/* compiled from: PG */
public final class C19622a extends View {

    /* renamed from: a */
    public final Map f54602a = new HashMap();

    /* renamed from: b */
    public C19610g f54603b;

    /* renamed from: c */
    public int f54604c;

    /* renamed from: d */
    private final Paint f54605d;

    /* renamed from: e */
    private final Paint f54606e;

    /* renamed from: f */
    private final Paint f54607f;

    /* renamed from: g */
    private final Paint f54608g;

    /* renamed from: h */
    private final int f54609h;

    public C19622a(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.f54605d = paint;
        Paint paint2 = new Paint();
        this.f54606e = paint2;
        Paint paint3 = new Paint();
        this.f54607f = paint3;
        Paint paint4 = new Paint();
        this.f54608g = paint4;
        this.f54604c = 0;
        paint.setColor(-16711681);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        paint2.setColor(-65281);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(10.0f);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        this.f54609h = applyDimension;
        paint3.setTextSize((float) applyDimension);
        paint3.setColor(-16777216);
        paint4.setTextSize((float) applyDimension);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(1.0f);
        paint4.setColor(-1);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C19610g gVar = this.f54603b;
        if (gVar != null && gVar.mo24946f()) {
            canvas.drawRect(new Rect(0, 0, gVar.f54572c, gVar.f54573d), this.f54606e);
            for (Map.Entry entry : this.f54602a.entrySet()) {
                Rect rect = (Rect) entry.getValue();
                canvas.drawRect(rect, this.f54605d);
                String valueOf = String.valueOf(((C19609f) entry.getKey()).f54568e.f162918c);
                canvas.drawText(valueOf, (float) (rect.left + ((int) (((float) this.f54609h) * 0.5f))), (float) (rect.top + this.f54609h), this.f54607f);
                canvas.drawText(valueOf, (float) (rect.left + ((int) (((float) this.f54609h) * 0.5f))), (float) (rect.top + this.f54609h), this.f54608g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f54604c = iArr[1];
    }
}
