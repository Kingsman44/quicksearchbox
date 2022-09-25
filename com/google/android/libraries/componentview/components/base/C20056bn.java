package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.google.android.libraries.componentview.components.base.p1687a.C19968co;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20566at;

/* renamed from: com.google.android.libraries.componentview.components.base.bn */
/* compiled from: PG */
final class C20056bn extends MetricAffectingSpan {

    /* renamed from: a */
    final /* synthetic */ C20058bp f56232a;

    public C20056bn(C20058bp bpVar) {
        this.f56232a = bpVar;
    }

    public final void updateDrawState(TextPaint textPaint) {
        C20058bp bpVar = this.f56232a;
        C19968co coVar = bpVar.f56238e;
        if (coVar != null) {
            Context context = bpVar.f56234a;
            if ((coVar.f55920a & 64) != 0) {
                C19995r rVar = coVar.f55927h;
                if (rVar == null) {
                    rVar = C19995r.f56032g;
                }
                textPaint.setColor(C20566at.m38590a(rVar));
            }
            if (coVar.f55928i) {
                textPaint.setUnderlineText(true);
            }
            if (coVar.f55918A) {
                textPaint.setStrikeThruText(true);
            }
            boolean z = coVar.f55922c;
            if (coVar.f55923d) {
                z |= true;
            }
            if (!C20482m.m38447o(coVar.f55929j)) {
                textPaint.setTypeface(Typeface.create(coVar.f55929j, z));
            } else if (z) {
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, z ? 1 : 0));
            }
            float f = coVar.f55930k;
            if (f != 0.0f) {
                textPaint.setTextSize((float) ((int) (C20482m.m38434b(context) * f)));
            }
            float f2 = coVar.f55931l;
            if (f2 != 0.0f) {
                textPaint.baselineShift = (int) (C20482m.m38433a(context) * f2);
            }
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        updateDrawState(textPaint);
    }
}
