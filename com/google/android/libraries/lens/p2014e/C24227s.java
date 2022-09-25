package com.google.android.libraries.lens.p2014e;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.aae;

/* renamed from: com.google.android.libraries.lens.e.s */
/* compiled from: PG */
public abstract class C24227s {

    /* renamed from: a */
    public static final RectF f66272a = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: o */
    public static C24225q m45178o() {
        C24181a aVar = new C24181a();
        aVar.mo29653f(0);
        aVar.mo29651d(-1);
        aVar.mo29650c(C26733ab.f72862a);
        aVar.mo29654g(1);
        aVar.f66098i = 1;
        aae aae = aae.f158088c;
        if (aae != null) {
            aVar.f66094e = aae;
            RectF rectF = f66272a;
            if (rectF != null) {
                aVar.f66092c = rectF;
                return aVar;
            }
            throw new NullPointerException("Null userVisibleRegion");
        }
        throw new NullPointerException("Null frameSelectionMetadata");
    }

    /* renamed from: a */
    public abstract int mo29705a();

    /* renamed from: b */
    public abstract long mo29706b();

    /* renamed from: c */
    public abstract Bitmap mo29707c();

    /* renamed from: d */
    public abstract RectF mo29708d();

    /* renamed from: e */
    public abstract C24226r mo29709e();

    /* renamed from: f */
    public abstract C26733ab mo29711f();

    /* renamed from: g */
    public abstract C58833ax mo29712g();

    /* renamed from: h */
    public abstract C58833ax mo29713h();

    /* renamed from: i */
    public abstract C58833ax mo29715i();

    /* renamed from: j */
    public abstract aae mo29716j();

    /* renamed from: k */
    public abstract int mo29717k();

    /* renamed from: l */
    public abstract int mo29718l();

    /* renamed from: m */
    public abstract int mo29719m();

    /* renamed from: n */
    public final Size mo29792n() {
        return new Size(mo29707c().getWidth(), mo29707c().getHeight());
    }
}
