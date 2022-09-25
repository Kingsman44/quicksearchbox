package com.google.android.libraries.elements.p1714d;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import com.facebook.litho.widget.C6528ef;

/* renamed from: com.google.android.libraries.elements.d.do */
/* compiled from: PG */
public final class C20919do extends C20905da {

    /* renamed from: a */
    private final float f58649a;

    /* renamed from: b */
    private final float f58650b;

    /* renamed from: c */
    private final Paint f58651c = new Paint();

    /* renamed from: d */
    private final boolean f58652d;

    /* renamed from: e */
    private RectF f58653e;

    public C20919do(boolean z, float f, float f2) {
        this.f58652d = z;
        this.f58649a = f;
        this.f58650b = f2;
    }

    /* renamed from: a */
    public final void mo26041a(Canvas canvas) {
        if (!this.f58653e.isEmpty()) {
            canvas.drawRect(this.f58653e, this.f58651c);
        }
    }

    /* renamed from: b */
    public final void mo26042b(Canvas canvas) {
    }

    /* renamed from: c */
    public final void mo26043c(Layout layout, CharSequence charSequence) {
        int length;
        int i;
        float f;
        float f2;
        LinearGradient linearGradient;
        Layout layout2 = layout;
        CharSequence charSequence2 = charSequence;
        this.f58653e = new RectF();
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (layout.getLineCount() != 0 && (length = spanned.length()) != 0) {
                int i2 = length - 1;
                if (((C6528ef[]) spanned.getSpans(i2, i2, C6528ef.class)).length > 0 || (layout.getLineCount() > 0 && layout2.getEllipsisCount(layout.getLineCount() - 1) > 0)) {
                    C6528ef[] efVarArr = (C6528ef[]) spanned.getSpans(0, spanned.length(), C6528ef.class);
                    if (efVarArr.length > 0) {
                        i = spanned.getSpanStart(efVarArr[0]);
                    } else {
                        i = layout2.getLineStart(layout.getLineCount() - 1) + layout2.getEllipsisStart(layout.getLineCount() - 1);
                    }
                    int lineForOffset = layout2.getLineForOffset(i);
                    float lineTop = (float) layout2.getLineTop(lineForOffset);
                    float lineBottom = (float) layout2.getLineBottom(lineForOffset);
                    int min = Math.min(layout2.getLineEnd(layout.getLineCount() - 1) - 1, i);
                    if (!this.f58652d) {
                        f2 = layout2.getPrimaryHorizontal(min);
                        f = (f2 - this.f58650b) - this.f58649a;
                    } else {
                        f = layout2.getPrimaryHorizontal(min);
                        f2 = this.f58650b + f + this.f58649a;
                    }
                    this.f58653e = new RectF(f, lineTop, f2, lineBottom);
                    float f3 = this.f58649a;
                    float f4 = f3 / (this.f58650b + f3);
                    if (!this.f58652d) {
                        linearGradient = new LinearGradient(0.0f, 0.0f, f4, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                    } else {
                        linearGradient = new LinearGradient(1.0f, 0.0f, 1.0f - f4, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                    }
                    this.f58651c.setShader(linearGradient);
                    this.f58651c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    Matrix matrix = new Matrix();
                    matrix.setScale(this.f58649a + this.f58650b, 1.0f);
                    matrix.postTranslate(this.f58653e.left, 0.0f);
                    linearGradient.setLocalMatrix(matrix);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo26044d() {
        this.f58653e = new RectF();
    }

    /* renamed from: e */
    public final boolean mo26045e(int i, int i2) {
        return !this.f58653e.isEmpty() && this.f58653e.contains((float) i, (float) i2);
    }

    /* renamed from: f */
    public final boolean mo26046f() {
        return true;
    }
}
