package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* compiled from: PG */
public final class ObjectGleamLayerView extends FrameLayout {

    /* renamed from: a */
    public C26457ap f71939a;

    public ObjectGleamLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m48735a(Canvas canvas, C26493by byVar) {
        if (this.f71939a != null) {
            Trace.beginSection("drawingObjectGleamLayers");
            C26457ap apVar = this.f71939a;
            apVar.getClass();
            C58485gu guVar = apVar.f72053b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C26447af afVar = (C26447af) guVar.get(i2);
                if (afVar.mo31678v().contains(byVar)) {
                    if (afVar instanceof C26491bw) {
                        ((C26491bw) afVar).mo31743F(canvas, byVar);
                    } else {
                        afVar.mo31665m(canvas, byVar);
                    }
                }
            }
            Trace.endSection();
        }
    }

    public final void onDraw(Canvas canvas) {
        m48735a(canvas, C26493by.GLEAM_LAYER);
        m48735a(canvas, C26493by.LABEL_LAYER);
    }
}
