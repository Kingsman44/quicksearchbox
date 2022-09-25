package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* compiled from: PG */
public final class TranslationLayerView extends FrameLayout {

    /* renamed from: a */
    public C26457ap f71961a;

    /* renamed from: b */
    private final C26493by f71962b;

    public TranslationLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C26493by byVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C26578ey.f72450b, 0, 0);
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                byVar = C26493by.TRANSLATION_INPAINTING_BOX_LAYER;
            } else {
                byVar = C26493by.TRANSLATION_TEXT_LAYER;
            }
            this.f71962b = byVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.f71961a != null) {
            Trace.beginSection("drawingTranslationLayers");
            C26457ap apVar = this.f71961a;
            apVar.getClass();
            C58485gu guVar = apVar.f72053b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C26447af afVar = (C26447af) guVar.get(i2);
                if (afVar.mo31678v().contains(this.f71962b)) {
                    if (afVar instanceof C26491bw) {
                        ((C26491bw) afVar).mo31743F(canvas, this.f71962b);
                    } else {
                        afVar.mo31665m(canvas, this.f71962b);
                    }
                }
            }
            Trace.endSection();
        }
    }
}
