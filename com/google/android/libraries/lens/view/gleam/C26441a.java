package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.common.p4522b.C58485gu;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62488dk;

/* renamed from: com.google.android.libraries.lens.view.gleam.a */
/* compiled from: PG */
public abstract class C26441a {

    /* renamed from: a */
    public C25308ap f71963a;

    /* renamed from: b */
    public final PointF f71964b = new PointF(0.0f, 0.0f);

    /* renamed from: c */
    public PointF f71965c;

    /* renamed from: d */
    Size f71966d;

    /* renamed from: e */
    public RectF f71967e;

    /* renamed from: f */
    public SizeF f71968f;

    protected C26441a() {
    }

    /* renamed from: a */
    public final float mo31651a() {
        C62445bv bvVar = this.f71963a.f68847h;
        if (bvVar == null) {
            bvVar = C62445bv.f168618e;
        }
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        return brVar.f168615f;
    }

    /* renamed from: b */
    public final float mo31652b() {
        C62445bv bvVar = this.f71963a.f68847h;
        if (bvVar == null) {
            bvVar = C62445bv.f168618e;
        }
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        return (float) Math.toDegrees((double) brVar.f168615f);
    }

    /* renamed from: c */
    public final PointF mo31653c() {
        return new PointF(this.f71964b.x / ((float) this.f71966d.getWidth()), this.f71964b.y / ((float) this.f71966d.getHeight()));
    }

    /* renamed from: d */
    public final Rect mo31654d(float f) {
        RectF g = C24093a.m44751g(this.f71964b, this.f71968f, mo31652b(), 1, f);
        return new Rect((int) g.left, (int) g.top, (int) g.right, (int) g.bottom);
    }

    /* renamed from: e */
    public abstract C26460as mo31655e();

    /* renamed from: f */
    public abstract C58485gu mo31656f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo31657g() {
        C62445bv bvVar = this.f71963a.f68847h;
        if (bvVar == null) {
            bvVar = C62445bv.f168618e;
        }
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        C62441br g = C24095c.m44762g(brVar, this.f71966d);
        this.f71967e = C24095c.m44759d(g);
        this.f71968f = new SizeF(this.f71967e.width(), this.f71967e.height());
        this.f71965c = new PointF(this.f71967e.centerX(), this.f71967e.centerY());
        PointF pointF = this.f71964b;
        C62488dk dkVar = this.f71963a.f68846g;
        if (dkVar == null) {
            dkVar = C62488dk.f168699d;
        }
        pointF.set(C24095c.m44758c(C24095c.m44764i(dkVar, g)));
    }

    public C26441a(C25308ap apVar, int i, int i2) {
        this.f71963a = apVar;
        this.f71966d = new Size(i, i2);
    }
}
