package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* compiled from: PG */
public final class HomographyTrackedTextContainerView extends View {

    /* renamed from: b */
    private static final C58485gu f71934b = C58485gu.m89847o(C26493by.SHADOW_LAYER, C26493by.TRANSLATION_INPAINTING_BOX_LAYER);

    /* renamed from: c */
    private static final C58485gu f71935c = C58485gu.m89848p(C26493by.TRANSLATION_TEXT_LAYER, C26493by.GLEAM_LAYER, C26493by.LABEL_LAYER);

    /* renamed from: a */
    public C26571er f71936a;

    /* renamed from: d */
    private C58485gu f71937d;

    /* renamed from: e */
    private boolean f71938e;

    public HomographyTrackedTextContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C26578ey.f72449a, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.f71938e = z;
            if (z) {
                this.f71937d = f71934b;
            } else {
                this.f71937d = f71935c;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f71936a != null) {
            try {
                Trace.beginSection(String.format("drawingHomographyTrackedTextContainerView(drawBelowScrim:%b)", new Object[]{Boolean.valueOf(this.f71938e)}));
                C58801sm G = this.f71936a.f72430b.listIterator(0);
                while (G.hasNext()) {
                    C26491bw bwVar = (C26491bw) G.next();
                    C58801sm G2 = this.f71937d.listIterator(0);
                    while (G2.hasNext()) {
                        C26493by byVar = (C26493by) G2.next();
                        if (bwVar.mo31678v().contains(byVar)) {
                            bwVar.mo31665m(canvas, byVar);
                        }
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
    }
}
