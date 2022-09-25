package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24094b;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.p1730f.C21370a;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.gleam.aq */
/* compiled from: PG */
final class C26458aq extends C26461at {

    /* renamed from: g */
    private final C25989d f72054g;

    public C26458aq(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar, C25989d dVar) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
        this.f72054g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final float mo31701C() {
        return C28134w.m52424a(8.0f, this.f71998i);
    }

    /* renamed from: D */
    public final float mo31702D() {
        if (this.f71999j.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED)) {
            return this.f71998i.getResources().getDimension(R.dimen.planar_gleam_math_stroke_width) / Math.max(1.0f, this.f71997h.mo31819a());
        }
        return super.mo31702D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo31703E() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo31704F() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo31705G(Canvas canvas, C62491dn dnVar, Path path) {
        if (this.f72001l) {
            return;
        }
        if (this.f72054g.f70642a.f70649b != C25980d.EDUCATION || this.f71999j.mo31456b(C26239a.EDUCATION_MATH_GLEAMS_TYPE) == 1) {
            canvas.drawPath(path, this.f72070t.mo31834a(mo31702D()));
            if (this.f72054g.f70642a.f70649b == C25980d.EDUCATION) {
                canvas.drawPath(path, this.f72070t.mo31835b());
            }
        }
    }

    /* renamed from: U */
    public final float mo31663U(PointF pointF) {
        return C24094b.m44753b(mo31677u(pointF), this.f71967e) * this.f71997h.mo31819a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo31662l() {
        return false;
    }
}
