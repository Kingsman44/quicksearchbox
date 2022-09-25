package com.google.android.libraries.lens.view.gleam;

import android.graphics.Paint;
import android.graphics.PointF;
import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24097e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.gleam.as */
/* compiled from: PG */
public final class C26460as {

    /* renamed from: a */
    public final PointF f72055a = new PointF(0.0f, 0.0f);

    /* renamed from: b */
    public final PointF f72056b = new PointF(0.0f, 0.0f);

    /* renamed from: c */
    public final PointF f72057c = new PointF(0.0f, 0.0f);

    /* renamed from: d */
    public float f72058d = 0.0f;

    /* renamed from: e */
    public final Paint f72059e;

    /* renamed from: f */
    public boolean f72060f;

    /* renamed from: g */
    public final long f72061g;

    /* renamed from: h */
    public C26441a f72062h;

    /* renamed from: i */
    private final long f72063i;

    /* renamed from: j */
    private final Paint f72064j;

    /* renamed from: k */
    private final C21370a f72065k;

    static {
        C58974d.m91135i("DrawableParticle");
    }

    public C26460as(C21370a aVar) {
        Paint paint = new Paint();
        this.f72059e = paint;
        Paint paint2 = new Paint();
        this.f72064j = paint2;
        this.f72060f = false;
        float random = ((float) Math.random()) - 8.0f;
        this.f72061g = (long) ((((random + random) * 0.15f) + 1.0f) * 1000.0f);
        this.f72065k = aVar;
        this.f72063i = aVar.mo26871c();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
    }

    /* renamed from: a */
    public final long mo31706a() {
        return this.f72065k.mo26871c() - this.f72063i;
    }

    /* renamed from: b */
    public final void mo31707b(C26441a aVar) {
        this.f72062h = aVar;
        if (aVar != null) {
            PointF a = C24097e.m44767a(0.0f, 0.0f, -aVar.mo31651a(), 2, new PointF(this.f72055a.x - aVar.f71964b.x, this.f72055a.y - aVar.f71964b.y));
            SizeF sizeF = aVar.f71968f;
            this.f72057c.set(a.x / (sizeF.getWidth() / 2.0f), a.y / (sizeF.getHeight() / 2.0f));
        }
    }
}
