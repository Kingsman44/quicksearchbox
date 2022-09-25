package androidx.media3.p174ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: androidx.media3.ui.r */
/* compiled from: PG */
final class C3654r {

    /* renamed from: A */
    public StaticLayout f11752A;

    /* renamed from: B */
    public int f11753B;

    /* renamed from: C */
    public int f11754C;

    /* renamed from: D */
    public int f11755D;

    /* renamed from: E */
    public Rect f11756E;

    /* renamed from: F */
    private final float f11757F;

    /* renamed from: G */
    private final float f11758G;

    /* renamed from: H */
    private final float f11759H;

    /* renamed from: I */
    private final Paint f11760I;

    /* renamed from: J */
    private final Paint f11761J;

    /* renamed from: a */
    public final float f11762a;

    /* renamed from: b */
    public final float f11763b;

    /* renamed from: c */
    public final TextPaint f11764c;

    /* renamed from: d */
    public CharSequence f11765d;

    /* renamed from: e */
    public Layout.Alignment f11766e;

    /* renamed from: f */
    public Bitmap f11767f;

    /* renamed from: g */
    public float f11768g;

    /* renamed from: h */
    public int f11769h;

    /* renamed from: i */
    public int f11770i;

    /* renamed from: j */
    public float f11771j;

    /* renamed from: k */
    public int f11772k;

    /* renamed from: l */
    public float f11773l;

    /* renamed from: m */
    public float f11774m;

    /* renamed from: n */
    public int f11775n;

    /* renamed from: o */
    public int f11776o;

    /* renamed from: p */
    public int f11777p;

    /* renamed from: q */
    public int f11778q;

    /* renamed from: r */
    public int f11779r;

    /* renamed from: s */
    public float f11780s;

    /* renamed from: t */
    public float f11781t;

    /* renamed from: u */
    public float f11782u;

    /* renamed from: v */
    public int f11783v;

    /* renamed from: w */
    public int f11784w;

    /* renamed from: x */
    public int f11785x;

    /* renamed from: y */
    public int f11786y;

    /* renamed from: z */
    public StaticLayout f11787z;

    public C3654r(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f11763b = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11762a = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float f = (float) context.getResources().getDisplayMetrics().densityDpi;
        float round = (float) Math.round((f + f) / 160.0f);
        this.f11757F = round;
        this.f11758G = round;
        this.f11759H = round;
        TextPaint textPaint = new TextPaint();
        this.f11764c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11760I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11761J = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r2 == 4) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r2 == 3) goto L_0x0080;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7706a(android.graphics.Canvas r10, boolean r11) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x00cb
            android.text.StaticLayout r11 = r9.f11787z
            android.text.StaticLayout r0 = r9.f11752A
            if (r11 == 0) goto L_0x00ca
            if (r0 != 0) goto L_0x000c
            goto L_0x00ca
        L_0x000c:
            int r1 = r10.save()
            int r2 = r9.f11753B
            float r2 = (float) r2
            int r3 = r9.f11754C
            float r3 = (float) r3
            r10.translate(r2, r3)
            int r2 = r9.f11777p
            int r2 = android.graphics.Color.alpha(r2)
            if (r2 <= 0) goto L_0x0040
            android.graphics.Paint r2 = r9.f11760I
            int r3 = r9.f11777p
            r2.setColor(r3)
            int r2 = r9.f11755D
            int r2 = -r2
            float r4 = (float) r2
            r5 = 0
            int r2 = r11.getWidth()
            int r3 = r9.f11755D
            int r2 = r2 + r3
            float r6 = (float) r2
            int r2 = r11.getHeight()
            float r7 = (float) r2
            android.graphics.Paint r8 = r9.f11760I
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0040:
            int r2 = r9.f11779r
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x0066
            android.text.TextPaint r2 = r9.f11764c
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r3)
            android.text.TextPaint r2 = r9.f11764c
            float r3 = r9.f11757F
            r2.setStrokeWidth(r3)
            android.text.TextPaint r2 = r9.f11764c
            int r3 = r9.f11778q
            r2.setColor(r3)
            android.text.TextPaint r2 = r9.f11764c
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            r0.draw(r10)
            goto L_0x00b0
        L_0x0066:
            r5 = 2
            if (r2 != r5) goto L_0x0075
            android.text.TextPaint r0 = r9.f11764c
            float r2 = r9.f11758G
            float r3 = r9.f11759H
            int r5 = r9.f11778q
            r0.setShadowLayer(r2, r3, r3, r5)
            goto L_0x00b0
        L_0x0075:
            r5 = 3
            if (r2 == r5) goto L_0x007c
            r3 = 4
            if (r2 != r3) goto L_0x00b0
            goto L_0x007f
        L_0x007c:
            if (r2 != r5) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            r2 = -1
            if (r3 == 0) goto L_0x0085
            r5 = -1
            goto L_0x0087
        L_0x0085:
            int r5 = r9.f11778q
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            int r2 = r9.f11778q
        L_0x008b:
            float r3 = r9.f11758G
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            android.text.TextPaint r6 = r9.f11764c
            int r7 = r9.f11775n
            r6.setColor(r7)
            android.text.TextPaint r6 = r9.f11764c
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r6.setStyle(r7)
            float r6 = -r3
            android.text.TextPaint r7 = r9.f11764c
            float r8 = r9.f11758G
            r7.setShadowLayer(r8, r6, r6, r5)
            r0.draw(r10)
            android.text.TextPaint r0 = r9.f11764c
            float r5 = r9.f11758G
            r0.setShadowLayer(r5, r3, r3, r2)
        L_0x00b0:
            android.text.TextPaint r0 = r9.f11764c
            int r2 = r9.f11775n
            r0.setColor(r2)
            android.text.TextPaint r0 = r9.f11764c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            r11.draw(r10)
            android.text.TextPaint r11 = r9.f11764c
            r0 = 0
            r11.setShadowLayer(r0, r0, r0, r4)
            r10.restoreToCount(r1)
        L_0x00ca:
            return
        L_0x00cb:
            android.graphics.Rect r11 = r9.f11756E
            r11.getClass()
            android.graphics.Bitmap r0 = r9.f11767f
            r0.getClass()
            r1 = 0
            android.graphics.Paint r2 = r9.f11761J
            r10.drawBitmap(r0, r1, r11, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p174ui.C3654r.mo7706a(android.graphics.Canvas, boolean):void");
    }
}
