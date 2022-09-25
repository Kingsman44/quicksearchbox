package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.d.a */
/* compiled from: PG */
public final class C105458a extends View {

    /* renamed from: a */
    final ArrayList f294081a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f294082b = new ArrayList();

    /* renamed from: c */
    private final Paint f294083c = new Paint();

    /* renamed from: d */
    private final Paint f294084d = new Paint();

    /* renamed from: e */
    private final Paint f294085e = new Paint();

    /* renamed from: f */
    private int f294086f;

    public C105458a(Context context) {
        super(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f294081a.size(); i++) {
            canvas.drawRect((Rect) this.f294081a.get(i), this.f294083c);
        }
        for (int i2 = 0; i2 < this.f294081a.size(); i2++) {
            Rect rect = (Rect) this.f294081a.get(i2);
            Integer num = (Integer) this.f294082b.get(i2);
            canvas.drawText(num.toString(), (float) (rect.left + ((int) (((float) this.f294086f) * 0.5f))), (float) (rect.top + this.f294086f), this.f294084d);
            canvas.drawText(num.toString(), (float) (rect.left + ((int) (((float) this.f294086f) * 0.5f))), (float) (rect.top + this.f294086f), this.f294085e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f294083c.setColor(-16711681);
        this.f294083c.setStyle(Paint.Style.STROKE);
        this.f294083c.setStrokeWidth(10.0f);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        this.f294086f = applyDimension;
        this.f294084d.setTextSize((float) applyDimension);
        this.f294084d.setColor(-16777216);
        this.f294085e.setTextSize((float) this.f294086f);
        this.f294085e.setStyle(Paint.Style.STROKE);
        this.f294085e.setStrokeWidth(1.0f);
        this.f294085e.setColor(-1);
    }
}
