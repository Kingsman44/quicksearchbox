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

/* renamed from: com.google.android.libraries.elements.d.ej */
/* compiled from: PG */
public final class C21074ej extends C20905da {

    /* renamed from: a */
    private float f59074a;

    /* renamed from: b */
    private final float f59075b;

    /* renamed from: c */
    private final Paint f59076c = new Paint();

    /* renamed from: d */
    private RectF f59077d;

    public C21074ej(float f, float f2) {
        this.f59074a = f;
        this.f59075b = f2;
    }

    /* renamed from: a */
    public final void mo26041a(Canvas canvas) {
        if (!this.f59077d.isEmpty()) {
            canvas.drawRect(this.f59077d, this.f59076c);
        }
    }

    /* renamed from: b */
    public final void mo26042b(Canvas canvas) {
    }

    /* renamed from: c */
    public final void mo26043c(Layout layout, CharSequence charSequence) {
        int length;
        this.f59077d = new RectF();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (layout.getLineCount() != 0 && this.f59074a > 0.0f && (length = spanned.length()) != 0) {
                int i = length - 1;
                if (((C6528ef[]) spanned.getSpans(i, i, C6528ef.class)).length > 0 || (layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0)) {
                    this.f59074a = Math.min(this.f59074a, (float) layout.getLineCount());
                    int lineCount = layout.getLineCount() - ((int) this.f59074a);
                    float lineTop = (float) layout.getLineTop(lineCount);
                    float f = this.f59074a;
                    float f2 = (float) ((int) f);
                    if (f != f2 && f > 0.0f) {
                        int i2 = lineCount - 1;
                        lineTop -= ((float) (layout.getLineTop(lineCount) - layout.getLineTop(i2))) - ((1.0f - (f - f2)) * ((float) (layout.getLineBottom(i2) - layout.getLineTop(i2))));
                    }
                    float lineLeft = layout.getLineLeft(0);
                    int width = layout.getWidth();
                    int lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
                    float f3 = this.f59075b;
                    this.f59077d = new RectF(lineLeft, lineTop - f3, (float) width, ((float) lineBottom) - f3);
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setScale(1.0f, this.f59077d.height());
                    matrix.postTranslate(0.0f, this.f59077d.top);
                    linearGradient.setLocalMatrix(matrix);
                    this.f59076c.setShader(linearGradient);
                    this.f59076c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo26044d() {
        this.f59077d = new RectF();
    }

    /* renamed from: e */
    public final boolean mo26045e(int i, int i2) {
        return !this.f59077d.isEmpty() && this.f59077d.contains((float) i, (float) i2);
    }

    /* renamed from: f */
    public final boolean mo26046f() {
        return true;
    }
}
