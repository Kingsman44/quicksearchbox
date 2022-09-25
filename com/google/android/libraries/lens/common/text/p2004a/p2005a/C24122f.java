package com.google.android.libraries.lens.common.text.p2004a.p2005a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.Size;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.text.C24127c;
import com.google.android.libraries.lens.common.text.C24128d;
import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.lens.p4699e.C62218bd;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62473cw;

/* renamed from: com.google.android.libraries.lens.common.text.a.a.f */
/* compiled from: PG */
public final class C24122f {

    /* renamed from: a */
    public final C24137m f65858a;

    /* renamed from: b */
    public final Paint f65859b;

    /* renamed from: c */
    public final Paint f65860c;

    /* renamed from: d */
    public final Xfermode f65861d;

    /* renamed from: e */
    public final Xfermode f65862e;

    /* renamed from: f */
    public final Paint f65863f;

    /* renamed from: g */
    public final Path f65864g;

    /* renamed from: h */
    public final Size f65865h;

    /* renamed from: i */
    public final C24121e f65866i;

    /* renamed from: j */
    public final int f65867j;

    /* renamed from: k */
    private final Paint f65868k;

    public C24122f(C24137m mVar, Size size, C24121e eVar) {
        this.f65858a = mVar;
        this.f65865h = size;
        int b = C62473cw.m94780b(mVar.f65901b);
        this.f65867j = b == 0 ? 1 : b;
        this.f65866i = eVar;
        Paint paint = new Paint(1);
        this.f65859b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        Paint paint2 = new Paint(1);
        this.f65860c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(-1);
        this.f65861d = new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN);
        this.f65862e = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        Paint paint3 = new Paint(1);
        this.f65868k = paint3;
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        this.f65863f = new Paint(2);
        this.f65864g = new Path();
    }

    /* renamed from: c */
    public static void m44817c(RectF rectF, float f, float f2) {
        rectF.left -= f;
        rectF.top -= f2;
        rectF.right += f;
        rectF.bottom += f2;
    }

    /* renamed from: e */
    public static Paint.Align m44818e(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? Paint.Align.LEFT : Paint.Align.CENTER : Paint.Align.RIGHT;
    }

    /* renamed from: f */
    public static final void m44819f(Paint paint) {
        paint.setAlpha((int) ((float) Color.alpha(paint.getColor())));
    }

    /* renamed from: a */
    public final void mo29537a(Canvas canvas, C62441br brVar, int i) {
        canvas.save();
        this.f65868k.setColor(i);
        m44819f(this.f65868k);
        C62441br g = C24095c.m44762g(brVar, this.f65865h);
        canvas.rotate((float) Math.toDegrees((double) g.f168615f), g.f168611b, g.f168612c);
        RectF d = C24095c.m44759d(g);
        C24118b bVar = (C24118b) this.f65866i;
        m44817c(d, bVar.f65851a, bVar.f65852b);
        float f = ((C24118b) this.f65866i).f65853c;
        canvas.drawRoundRect(d, f, f, this.f65868k);
        canvas.restore();
    }

    /* renamed from: b */
    public final void mo29538b(Canvas canvas, C24135k kVar, Paint paint) {
        if (!kVar.f65894a.isEmpty()) {
            canvas.save();
            C24128d dVar = kVar.f65897d;
            if (dVar == null) {
                dVar = C24128d.f65875i;
            }
            C62441br brVar = dVar.f65878b;
            if (brVar == null) {
                brVar = C62441br.f168608h;
            }
            C62441br g = C24095c.m44762g(brVar, this.f65865h);
            canvas.rotate((float) Math.toDegrees((double) g.f168615f), g.f168611b, g.f168612c);
            RectF d = C24095c.m44759d(g);
            float f = d.left;
            C24127c cVar = dVar.f65881e;
            if (cVar == null) {
                cVar = C24127c.f65871c;
            }
            float f2 = f + cVar.f65873a;
            float f3 = d.top;
            C24127c cVar2 = dVar.f65881e;
            if (cVar2 == null) {
                cVar2 = C24127c.f65871c;
            }
            canvas.drawText(kVar.f65894a, f2, f3 + cVar2.f65874b, paint);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public final boolean mo29539d(C24135k kVar) {
        C24128d dVar = kVar.f65897d;
        if (dVar == null) {
            dVar = C24128d.f65875i;
        }
        if (dVar.f65882f.mo59173M()) {
            C24128d dVar2 = kVar.f65897d;
            if (dVar2 == null) {
                dVar2 = C24128d.f65875i;
            }
            C62218bd bdVar = dVar2.f65879c;
            if (bdVar == null) {
                bdVar = C62218bd.f167980e;
            }
            int i = bdVar.f167982a;
            if (!((i & 2) == 0 || (i & 4) == 0 || bdVar.f167984c == bdVar.f167985d)) {
                C24128d dVar3 = kVar.f65897d;
                if (dVar3 == null) {
                    dVar3 = C24128d.f65875i;
                }
                C62441br brVar = dVar3.f65878b;
                if (brVar == null) {
                    brVar = C62441br.f168608h;
                }
                C62441br g = C24095c.m44762g(brVar, this.f65865h);
                C62441br brVar2 = kVar.f65895b;
                if (brVar2 == null) {
                    brVar2 = C62441br.f168608h;
                }
                C62441br g2 = C24095c.m44762g(brVar2, this.f65865h);
                float radians = (float) Math.toRadians(1.0d);
                if (Math.abs(g.f168611b - g2.f168611b) >= 2.0f || Math.abs(g.f168612c - g2.f168612c) >= 2.0f || Math.abs(g.f168613d - g2.f168613d) >= 2.0f || Math.abs(g.f168614e - g2.f168614e) >= 2.0f || Math.abs(g.f168615f - g2.f168615f) >= radians) {
                    return true;
                }
            }
        }
        return false;
    }
}
