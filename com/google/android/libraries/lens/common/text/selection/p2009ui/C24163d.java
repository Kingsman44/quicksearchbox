package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.d */
/* compiled from: PG */
public final class C24163d extends View {

    /* renamed from: a */
    C24168i f66023a;

    /* renamed from: b */
    C24168i f66024b;

    /* renamed from: c */
    final ArrayList f66025c = new ArrayList();

    /* renamed from: d */
    public boolean f66026d;

    /* renamed from: e */
    private final Paint f66027e;

    /* renamed from: f */
    private final Paint f66028f;

    /* renamed from: g */
    private final Paint f66029g;

    /* renamed from: h */
    private final Paint f66030h = new Paint();

    /* renamed from: i */
    private final Point f66031i = new Point();

    /* renamed from: j */
    private final Point f66032j = new Point();

    /* renamed from: k */
    private float f66033k;

    public C24163d(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f66027e = paint;
        Paint paint2 = new Paint();
        this.f66028f = paint2;
        Paint paint3 = new Paint();
        this.f66029g = paint3;
        Resources resources = context.getResources();
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setColor(-65536);
        paint2.setStyle(Paint.Style.STROKE);
        paint3.setColor(resources.getColor(R.color.lens_teardrop_color));
        paint3.setStyle(Paint.Style.STROKE);
        mo29599b(1.0f);
    }

    /* renamed from: c */
    private final void m44910c(Canvas canvas, C24168i iVar, Paint paint) {
        C24168i iVar2 = iVar;
        float g = ((float) (iVar2.f66045b - iVar.mo29615g())) / iVar2.f66044a;
        float a = iVar.mo29609a();
        float h = ((float) (iVar.mo29616h() - iVar2.f66045b)) / iVar2.f66044a;
        float d = iVar.mo29612d();
        canvas.drawLine(g, 0.0f, g, (float) getHeight(), paint);
        Paint paint2 = paint;
        canvas.drawLine(a, 0.0f, a, (float) getHeight(), paint2);
        canvas.drawLine(h, 0.0f, h, (float) getHeight(), paint);
        canvas.drawLine(d, 0.0f, d, (float) getHeight(), paint2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29598a(int i, int i2, Point point) {
        this.f66031i.set(i, i2);
        this.f66032j.set(point.x, point.y);
        this.f66026d = true;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29599b(float f) {
        this.f66033k = ((float) getContext().getResources().getDimensionPixelSize(R.dimen.lens_debug_hotspot_dot_size)) / f;
        this.f66027e.setStrokeWidth(1.0f / f);
        float f2 = 2.0f / f;
        this.f66029g.setStrokeWidth(f2);
        this.f66028f.setStrokeWidth(f2);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList = this.f66025c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C24162c cVar = (C24162c) arrayList.get(i);
            this.f66030h.setColor(cVar.mo29571b());
            canvas.save();
            canvas.rotate(cVar.mo29570a(), cVar.mo29572c().exactCenterX(), cVar.mo29572c().exactCenterY());
            canvas.drawRect(cVar.mo29572c(), this.f66030h);
            canvas.restore();
        }
        C24168i iVar = this.f66023a;
        if (iVar != null) {
            m44910c(canvas, iVar, this.f66029g);
        }
        C24168i iVar2 = this.f66024b;
        if (iVar2 != null) {
            m44910c(canvas, iVar2, this.f66028f);
        }
        if (this.f66026d) {
            canvas.drawLine((float) this.f66031i.x, (float) this.f66031i.y, (float) this.f66032j.x, (float) this.f66032j.y, this.f66027e);
            canvas.drawCircle((float) this.f66031i.x, (float) this.f66031i.y, this.f66033k, this.f66027e);
            canvas.drawCircle((float) this.f66032j.x, (float) this.f66032j.y, this.f66033k, this.f66027e);
        }
    }
}
