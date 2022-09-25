package com.google.android.libraries.lens.view.gleam;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.p2069am.C25298af;
import com.google.android.libraries.lens.view.p2069am.C25305am;
import com.google.android.libraries.lens.view.p2069am.C25317ay;
import com.google.android.libraries.lens.view.p2069am.C25318az;

/* renamed from: com.google.android.libraries.lens.view.gleam.bi */
/* compiled from: PG */
final class C26477bi extends C26475bg {

    /* renamed from: d */
    public static final /* synthetic */ int f72119d = 0;

    /* renamed from: c */
    final /* synthetic */ C26491bw f72120c;

    /* renamed from: e */
    private final Iterable f72121e;

    /* renamed from: f */
    private final int f72122f;

    /* renamed from: g */
    private final int f72123g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26477bi(com.google.android.libraries.lens.view.gleam.C26491bw r5, java.lang.Iterable r6, int r7, int r8) {
        /*
            r4 = this;
            r4.f72120c = r5
            com.google.android.libraries.lens.view.gleam.bh r0 = new com.google.android.libraries.lens.view.gleam.bh
            r0.<init>(r5)
            java.lang.Iterable r0 = com.google.common.p4522b.C58557jl.m90127h(r6, r0)
            com.google.android.libraries.lens.view.gleam.fn r1 = r5.f72166g
            android.graphics.Paint r2 = r1.f72508m
            if (r2 != 0) goto L_0x0029
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.f72508m = r2
            android.graphics.Paint r2 = r1.f72508m
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.Paint r2 = r1.f72508m
            int[] r3 = r1.f72505j
            r3 = r3[r8]
            r2.setColor(r3)
        L_0x0029:
            android.graphics.Paint r1 = r1.f72508m
            com.google.android.libraries.lens.view.gleam.fn r5 = r5.f72166g
            int[] r5 = r5.f72505j
            r5 = r5[r8]
            r4.<init>(r0, r1, r5)
            r4.f72121e = r6
            r4.f72123g = r7
            r4.f72122f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26477bi.<init>(com.google.android.libraries.lens.view.gleam.bw, java.lang.Iterable, int, int):void");
    }

    /* renamed from: c */
    public final void mo31733c(Canvas canvas, C26493by byVar) {
        int i;
        float f;
        Rect rect;
        Canvas canvas2 = canvas;
        super.mo31733c(canvas, byVar);
        if (this.f72122f <= 0) {
            boolean z = this.f72123g == 4;
            for (C25298af afVar : this.f72121e) {
                canvas.save();
                C24195n nVar = (C24195n) afVar.f68809c.get(0);
                float width = nVar.f66129a * ((float) this.f72120c.f71966d.getWidth());
                float height = nVar.f66130b * ((float) this.f72120c.f71966d.getHeight());
                float width2 = ((nVar.f66129a + nVar.f66131c) / 2.0f) * ((float) this.f72120c.f71966d.getWidth());
                float height2 = ((nVar.f66130b + nVar.f66132d) / 2.0f) * ((float) this.f72120c.f71966d.getHeight());
                C26491bw bwVar = this.f72120c;
                float f2 = (float) bwVar.f72166g.f72496a;
                C25305am amVar = bwVar.f71963a.f68854o;
                if (amVar == null) {
                    amVar = C25305am.f68828d;
                }
                C25318az azVar = amVar.f68830a;
                if (azVar == null) {
                    azVar = C25318az.f68885b;
                }
                C25317ay ayVar = azVar.f68887a;
                float f3 = f2 / (ayVar != null ? ayVar.f68884d : 1.0f);
                if (z) {
                    f = nVar.f66131c - nVar.f66129a;
                    i = this.f72120c.f71966d.getWidth();
                } else {
                    f = nVar.f66132d - nVar.f66130b;
                    i = this.f72120c.f71966d.getHeight();
                }
                float max = Math.max(f3, f * ((float) i));
                int round = Math.round((max / 4.0f) + ((float) this.f72120c.f72166g.f72498c));
                if (z) {
                    float f4 = max / 2.0f;
                    rect = new Rect((int) (width2 - f4), (int) (height - max), (int) (f4 + width2), (int) height);
                } else {
                    float f5 = max / 2.0f;
                    rect = new Rect((int) (width - max), (int) (height2 - f5), (int) width, (int) (f5 + height2));
                }
                if (z) {
                    rect.offset(0, -round);
                } else {
                    rect.offset(-round, 0);
                }
                canvas2.rotate(nVar.f66133e, width2, height2);
                float centerX = (float) rect.centerX();
                float centerY = (float) rect.centerY();
                float f6 = max / 2.0f;
                C26594fn fnVar = this.f72120c.f72166g;
                if (fnVar.f72510o == null) {
                    fnVar.f72510o = new Paint(1);
                    int h = C1874w.m5111h(fnVar.f72506k.getResources(), R.color.quantum_orange);
                    fnVar.f72510o.setStyle(Paint.Style.FILL);
                    fnVar.f72510o.setColor(h);
                }
                canvas2.drawCircle(centerX, centerY, f6, fnVar.f72510o);
                int round2 = Math.round((max * 0.21052629f) / 2.0f);
                rect.inset(round2, round2);
                C26594fn fnVar2 = this.f72120c.f72166g;
                if (fnVar2.f72511p == null) {
                    Drawable f7 = C1874w.m5109f(fnVar2.f72506k.getResources(), R.drawable.quantum_ic_star_white_24, (Resources.Theme) null);
                    f7.getClass();
                    fnVar2.f72511p = f7;
                }
                Drawable drawable = fnVar2.f72511p;
                drawable.setBounds(rect);
                drawable.draw(canvas2);
                canvas.restore();
            }
        }
    }
}
