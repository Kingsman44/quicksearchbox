package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.livingsurfaces.C27233a;
import com.google.android.libraries.lens.view.livingsurfaces.C27259r;
import com.google.android.libraries.lens.view.livingsurfaces.C27260s;
import com.google.android.libraries.lens.view.livingsurfaces.C27262u;
import com.google.android.libraries.lens.view.livingsurfaces.p2150ui.PlanarGleamAttributionView;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4699e.C62191ad;
import com.google.lens.p4699e.C62221bg;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.gleam.bx */
/* compiled from: PG */
public final class C26492bx extends C26461at implements C27262u {

    /* renamed from: y */
    private static final DecelerateInterpolator f72172y = new DecelerateInterpolator();

    /* renamed from: g */
    public C27259r f72173g = C27259r.f74562d;

    /* renamed from: w */
    public float f72174w;

    /* renamed from: x */
    public float f72175x;

    /* renamed from: z */
    private PlanarGleamAttributionView f72176z;

    public C26492bx(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo31705G(Canvas canvas, C62491dn dnVar, Path path) {
        Paint a = this.f72070t.mo31834a(mo31702D());
        if (!this.f72173g.mo32775o()) {
            a.setAlpha(C27212a.m50467c(f72172y.getInterpolation(Math.min(((float) mo31676t()) / 248.0f, 1.0f))));
            canvas.drawPath(path, a);
        } else {
            a.setAlpha(C27212a.m50467c(this.f72175x * f72172y.getInterpolation(1.0f - Math.min((((float) mo31676t()) - this.f72174w) / 248.0f, 1.0f))));
            canvas.drawPath(path, a);
        }
        this.f72173g.mo32766f(canvas, dnVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo31712L() {
        mo31713M(1.0f, 0, 0);
        mo31710J();
    }

    /* renamed from: j */
    public final void mo31660j() {
        C62221bg bgVar;
        C58833ax axVar;
        C62221bg bgVar2;
        C62221bg bgVar3;
        C62221bg bgVar4;
        super.mo31660j();
        C27260s sVar = ((C26559ej) this.f71997h).f72407m;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 21) {
            C62191ad adVar = (C62191ad) apVar.f68844e;
            if (adVar.f167919b == 2 && sVar != null) {
                String str = adVar.f167923f;
                String str2 = ((C62221bg) adVar.f167920c).f168001b;
                int i = adVar.f167919b;
                if (i == 2) {
                    bgVar = (C62221bg) adVar.f167920c;
                } else {
                    bgVar = C62221bg.f167998f;
                }
                if ((bgVar.f168000a & 16) != 0) {
                    if (i == 2) {
                        bgVar4 = (C62221bg) adVar.f167920c;
                    } else {
                        bgVar4 = C62221bg.f167998f;
                    }
                    axVar = C58833ax.m90834k(bgVar4.f168004e);
                } else {
                    axVar = C58836b.f156633a;
                }
                C58833ax axVar2 = axVar;
                if (adVar.f167919b == 2) {
                    bgVar2 = (C62221bg) adVar.f167920c;
                } else {
                    bgVar2 = C62221bg.f167998f;
                }
                float f = bgVar2.f168002c;
                C62445bv bvVar = this.f71963a.f68847h;
                if (bvVar == null) {
                    bvVar = C62445bv.f168618e;
                }
                float f2 = bvVar.f168623d;
                if (adVar.f167919b == 2) {
                    bgVar3 = (C62221bg) adVar.f167920c;
                } else {
                    bgVar3 = C62221bg.f167998f;
                }
                boolean z = bgVar3.f168003d;
                Context context = this.f71998i;
                if (context == null) {
                    throw new NullPointerException("Null context");
                } else if (str == null) {
                    throw new NullPointerException("Null sourceUrl");
                } else if (str2 != null) {
                    C27259r a = sVar.mo32753a(new C27233a(context, str, str2, axVar2, f, f2, z, this));
                    this.f72173g = a;
                    a.mo32763c(((C26559ej) this.f71997h).f72403i);
                    if ((adVar.f167918a & 8) != 0) {
                        String str3 = adVar.f167921d;
                        String str4 = adVar.f167922e;
                        C26559ej ejVar = (C26559ej) this.f71997h;
                        LayoutInflater layoutInflater = ejVar.f72406l;
                        if (layoutInflater != null) {
                            PlanarGleamAttributionView planarGleamAttributionView = (PlanarGleamAttributionView) layoutInflater.inflate(R.layout.planar_gleam_attribution_view, ejVar.f72403i, false);
                            planarGleamAttributionView.mo17754z().mo32792a(((C26559ej) this.f71997h).f72403i.getRootWindowInsets());
                            planarGleamAttributionView.mo17754z().mo32794c(str3, str4);
                            ((C26559ej) this.f71997h).f72403i.addView(planarGleamAttributionView);
                            this.f72176z = planarGleamAttributionView;
                            return;
                        }
                        throw new IllegalStateException("Attempt to access GleamingView's LayoutInflater before set");
                    }
                } else {
                    throw new NullPointerException("Null videoUrl");
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo31679w() {
        if (this.f72173g.mo32774n()) {
            this.f72173g.mo32765e();
        }
        this.f72173g = C27259r.f74562d;
        PlanarGleamAttributionView planarGleamAttributionView = this.f72176z;
        if (planarGleamAttributionView != null) {
            ((C26559ej) this.f71997h).f72403i.removeView(planarGleamAttributionView);
            this.f72176z = null;
        }
        super.mo31679w();
    }
}
