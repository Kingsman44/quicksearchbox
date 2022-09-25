package com.google.android.libraries.lens.view.gleam;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.gleam.bg */
/* compiled from: PG */
class C26475bg extends C26595fo {

    /* renamed from: a */
    public final Path f72113a = new Path();

    /* renamed from: b */
    protected float f72114b = 1.0f;

    /* renamed from: c */
    private final Paint f72115c;

    /* renamed from: d */
    private final int f72116d;

    /* renamed from: e */
    private final Map f72117e = new HashMap();

    public C26475bg(Iterable iterable, Paint paint, int i) {
        this.f72115c = paint;
        this.f72116d = i;
        RectF rectF = new RectF();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C26490bv bvVar = (C26490bv) it.next();
            String b = bvVar.mo31739b();
            Path a = bvVar.mo31738a();
            this.f72113a.op(a, Path.Op.UNION);
            a.computeBounds(rectF, true);
            this.f72117e.put(b, new C26479bk(a, rectF));
        }
    }

    /* renamed from: a */
    public final C58833ax mo31731a() {
        return C58833ax.m90834k(this.f72113a);
    }

    /* renamed from: b */
    public final C58833ax mo31732b(Point point) {
        for (Map.Entry entry : this.f72117e.entrySet()) {
            if (((C26479bk) entry.getValue()).f72128a.contains(point.x, point.y)) {
                return C58833ax.m90834k((String) entry.getKey());
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public void mo31733c(Canvas canvas, C26493by byVar) {
        if (!this.f72113a.isEmpty()) {
            int i = this.f72116d;
            Path path = this.f72113a;
            if (!path.isEmpty()) {
                this.f72115c.setColor(i);
                this.f72115c.setAlpha((int) (mo31737e() * this.f72114b * ((float) Color.alpha(i))));
                if (this.f72115c.getAlpha() > 0) {
                    canvas.drawPath(path, this.f72115c);
                }
            }
        }
    }
}
