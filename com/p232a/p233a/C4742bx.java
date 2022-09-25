package com.p232a.p233a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.a.a.bx */
/* compiled from: PG */
final class C4742bx extends C4743by {

    /* renamed from: a */
    float f14895a;

    /* renamed from: b */
    final float f14896b;

    /* renamed from: c */
    final RectF f14897c = new RectF();

    /* renamed from: d */
    final /* synthetic */ C4746ca f14898d;

    public C4742bx(C4746ca caVar, float f, float f2) {
        this.f14898d = caVar;
        this.f14895a = f;
        this.f14896b = f2;
    }

    /* renamed from: a */
    public final void mo9628a(String str) {
        if (this.f14898d.mo9636i()) {
            Rect rect = new Rect();
            this.f14898d.f14916d.f14889d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f14895a, this.f14896b);
            this.f14897c.union(rectF);
        }
        this.f14895a += this.f14898d.f14916d.f14889d.measureText(str);
    }

    /* renamed from: b */
    public final boolean mo9629b(C4727bi biVar) {
        if (!(biVar instanceof C4728bj)) {
            return true;
        }
        C4728bj bjVar = (C4728bj) biVar;
        C4715ax c = biVar.f14833t.mo9620c(bjVar.f14846a);
        if (c == null) {
            C4746ca.m13180e("TextPath path reference '%s' not found", bjVar.f14846a);
            return false;
        }
        C4697af afVar = (C4697af) c;
        Path path = new C4737bs(afVar.f14749a).f14874a;
        Matrix matrix = afVar.f15125e;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f14897c.union(rectF);
        return false;
    }
}
