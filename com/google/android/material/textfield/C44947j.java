package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;

/* renamed from: com.google.android.material.textfield.j */
/* compiled from: PG */
final class C44947j extends C44779j {

    /* renamed from: a */
    public final RectF f117412a;

    C44947j() {
        this((C44785p) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo48120R(Canvas canvas) {
        if (this.f117412a.isEmpty()) {
            super.mo48120R(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f117412a);
        super.mo48120R(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48569a(float f, float f2, float f3, float f4) {
        if (f != this.f117412a.left || f2 != this.f117412a.top || f3 != this.f117412a.right || f4 != this.f117412a.bottom) {
            this.f117412a.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44947j(C44785p pVar) {
        super(pVar == null ? new C44785p() : pVar);
        this.f117412a = new RectF();
    }
}
