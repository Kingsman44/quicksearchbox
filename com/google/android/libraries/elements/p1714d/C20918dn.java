package com.google.android.libraries.elements.p1714d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ImageSpan;
import com.facebook.litho.widget.C6528ef;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.common.p4575r.C60752i;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.d.dn */
/* compiled from: PG */
public final class C20918dn extends C20905da {

    /* renamed from: a */
    private final float f58644a;

    /* renamed from: b */
    private final RectF f58645b;

    /* renamed from: c */
    private final Paint f58646c;

    /* renamed from: d */
    private final C21259bb f58647d;

    /* renamed from: e */
    private Path f58648e;

    public C20918dn(int i, float f, RectF rectF, C21259bb bbVar) {
        this.f58644a = f;
        this.f58645b = rectF;
        Paint paint = new Paint();
        this.f58646c = paint;
        this.f58647d = bbVar;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    /* renamed from: g */
    public static float[] m39329g(float f) {
        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    /* renamed from: h */
    public static float[] m39330h(float f) {
        return new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
    }

    /* renamed from: i */
    private final Path m39331i(Layout layout) {
        Path path;
        float f;
        float[] fArr;
        float[] fArr2;
        Layout layout2 = layout;
        if (layout.getLineCount() == 0) {
            return null;
        }
        CharSequence text = layout.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) text;
        int i = -1;
        int lineEnd = layout2.getLineEnd(layout.getLineCount() - 1);
        int spanStart = spanned.getSpanStart(this);
        if (spanStart == -1 || spanStart >= lineEnd) {
            return null;
        }
        int spanEnd = spanned.getSpanEnd(this);
        if (spanEnd == -1) {
            spanEnd = lineEnd;
        }
        int lineForOffset = layout2.getLineForOffset(spanStart);
        int min = Math.min(layout.getLineCount() - 1, layout2.getLineForOffset(spanEnd));
        boolean isRtlCharAt = layout2.isRtlCharAt(spanStart);
        Path path2 = new Path();
        int i2 = lineForOffset;
        while (i2 <= min) {
            try {
                if (i2 == layout.getLineCount() + i) {
                    f = 0.0f;
                } else {
                    f = layout.getSpacingAdd();
                }
                RectF rectF = new RectF(layout2.getLineLeft(i2), (float) (layout2.getLineTop(i2) + 1), layout2.getLineRight(i2), ((float) layout2.getLineBottom(i2)) - f);
                float c = C60752i.m92729c(rectF.height() / 2.0f, rectF.width() / 2.0f, this.f58644a);
                if (i2 == lineForOffset) {
                    float primaryHorizontal = layout2.getPrimaryHorizontal(spanStart);
                    if (isRtlCharAt) {
                        rectF.right = primaryHorizontal;
                    } else {
                        rectF.left = primaryHorizontal;
                    }
                }
                if (i2 == min && spanEnd < layout2.getLineEnd(min)) {
                    int length = spanned.length();
                    if (length != 0) {
                        int i3 = length - 1;
                        C6528ef[] efVarArr = (C6528ef[]) spanned.getSpans(i3, i3, C6528ef.class);
                        int length2 = efVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                if (spanEnd >= spanned.getSpanStart(efVarArr[i4])) {
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                    }
                    float primaryHorizontal2 = layout2.getPrimaryHorizontal(spanEnd);
                    if (isRtlCharAt) {
                        rectF.left = primaryHorizontal2;
                    } else {
                        rectF.right = primaryHorizontal2;
                    }
                }
                RectF rectF2 = new RectF();
                RectF rectF3 = this.f58645b;
                if (rectF3 == null) {
                    rectF2.left = i2 == lineForOffset ? c : 0.0f;
                    rectF2.top = 0.0f;
                    rectF2.right = i2 == min ? c : 0.0f;
                    rectF2.bottom = 0.0f;
                    if (isRtlCharAt) {
                        float f2 = rectF2.left;
                        rectF2.left = rectF2.right;
                        rectF2.right = f2;
                    }
                } else {
                    rectF2 = rectF3;
                }
                rectF.set(rectF.left - rectF2.left, rectF.top - rectF2.top, rectF.right + rectF2.right, rectF.bottom + rectF2.bottom);
                if (i2 == lineForOffset && lineForOffset == min) {
                    path2.addRoundRect(rectF, new float[]{c, c, c, c, c, c, c, c}, Path.Direction.CW);
                } else if (i2 == lineForOffset) {
                    if (isRtlCharAt) {
                        fArr2 = m39330h(c);
                    } else {
                        fArr2 = m39329g(c);
                    }
                    path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                } else if (i2 == min) {
                    if (isRtlCharAt) {
                        fArr = m39329g(c);
                    } else {
                        fArr = m39330h(c);
                    }
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                } else {
                    path2.addRect(rectF, Path.Direction.CW);
                }
                path = path2;
            } catch (IndexOutOfBoundsException e) {
                path = path2;
                this.f58647d.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "IOOBDiagnostics: line:" + i2 + " tl:" + spanned.length() + " lc:" + layout.getLineCount() + " so:" + spanStart + " eo:" + spanEnd + " fl:" + lineForOffset + " ll:" + min + " rtl:" + isRtlCharAt + " sp:" + spanned.getSpans(0, spanned.length(), Object.class).length + " isp:" + ((ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class)).length + " esp:" + ((C20905da[]) spanned.getSpans(0, spanned.length(), C20905da.class)).length, C21319z.f59680u, e);
            }
            i2++;
            layout2 = layout;
            path2 = path;
            i = -1;
        }
        return path2;
    }

    /* renamed from: a */
    public final void mo26041a(Canvas canvas) {
    }

    /* renamed from: b */
    public final void mo26042b(Canvas canvas) {
        Path path = this.f58648e;
        if (path != null) {
            canvas.drawPath(path, this.f58646c);
        }
    }

    /* renamed from: c */
    public final void mo26043c(Layout layout, CharSequence charSequence) {
        this.f58648e = m39331i(layout);
    }

    /* renamed from: d */
    public final void mo26044d() {
        this.f58648e = null;
    }
}
