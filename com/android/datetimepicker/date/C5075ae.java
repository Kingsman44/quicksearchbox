package com.android.datetimepicker.date;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.android.datetimepicker.date.ae */
/* compiled from: PG */
public final class C5075ae extends C5072ab {
    public C5075ae(Context context) {
        super(context);
    }

    /* renamed from: h */
    public final void mo10063h(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        if (this.f16190u == i3) {
            canvas.drawCircle((float) i4, (float) (i5 - (this.f16170a / 3)), (float) this.f16174e, this.f16179j);
        }
        if (mo10062g(new C5097t(i, i2, i3))) {
            this.f16176g.setColor(this.f16160H);
        } else if (!this.f16189t || this.f16191v != i3) {
            this.f16176g.setColor(this.f16158F);
        } else {
            this.f16176g.setColor(this.f16159G);
        }
        canvas.drawText(String.format("%d", new Object[]{Integer.valueOf(i3)}), (float) i4, (float) i5, this.f16176g);
    }
}
