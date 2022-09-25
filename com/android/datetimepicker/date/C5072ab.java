package com.android.datetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.android.datetimepicker.C5104e;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: com.android.datetimepicker.date.ab */
/* compiled from: PG */
public abstract class C5072ab extends View {

    /* renamed from: A */
    public final Calendar f16153A;

    /* renamed from: B */
    protected final Calendar f16154B;

    /* renamed from: C */
    protected final C5102y f16155C;

    /* renamed from: D */
    protected int f16156D = 6;

    /* renamed from: E */
    protected C5071aa f16157E;

    /* renamed from: F */
    protected final int f16158F;

    /* renamed from: G */
    protected final int f16159G;

    /* renamed from: H */
    protected final int f16160H;

    /* renamed from: I */
    protected final int f16161I;

    /* renamed from: J */
    public boolean f16162J = false;

    /* renamed from: K */
    public int f16163K = 0;

    /* renamed from: L */
    private final String f16164L;

    /* renamed from: M */
    private final String f16165M;

    /* renamed from: N */
    private final Formatter f16166N;

    /* renamed from: O */
    private final StringBuilder f16167O;

    /* renamed from: P */
    private final boolean f16168P;

    /* renamed from: Q */
    private final GestureDetector f16169Q;

    /* renamed from: a */
    protected final int f16170a;

    /* renamed from: b */
    protected final int f16171b;

    /* renamed from: c */
    protected final int f16172c;

    /* renamed from: d */
    protected final int f16173d;

    /* renamed from: e */
    protected final int f16174e;

    /* renamed from: f */
    protected C5086i f16175f;

    /* renamed from: g */
    protected final Paint f16176g;

    /* renamed from: h */
    protected final Paint f16177h;

    /* renamed from: i */
    protected final Paint f16178i;

    /* renamed from: j */
    protected final Paint f16179j;

    /* renamed from: k */
    protected final Paint f16180k;

    /* renamed from: l */
    protected final Paint f16181l;

    /* renamed from: m */
    public final Rect f16182m = new Rect();

    /* renamed from: n */
    protected final int f16183n = -1;

    /* renamed from: o */
    protected int f16184o;

    /* renamed from: p */
    protected int f16185p;

    /* renamed from: q */
    protected int f16186q;

    /* renamed from: r */
    protected final int f16187r;

    /* renamed from: s */
    protected int f16188s = 32;

    /* renamed from: t */
    protected boolean f16189t = false;

    /* renamed from: u */
    protected int f16190u = -1;

    /* renamed from: v */
    protected int f16191v = -1;

    /* renamed from: w */
    protected int f16192w = 1;

    /* renamed from: x */
    protected final int f16193x = 7;

    /* renamed from: y */
    protected int f16194y = 7;

    /* renamed from: z */
    protected boolean f16195z;

    public C5072ab(Context context) {
        super(context, (AttributeSet) null);
        Resources resources = context.getResources();
        this.f16154B = Calendar.getInstance();
        this.f16153A = Calendar.getInstance();
        String string = resources.getString(R.string.day_of_week_label_typeface);
        this.f16164L = string;
        String string2 = resources.getString(R.string.sans_serif);
        this.f16165M = string2;
        int color = resources.getColor(R.color.date_picker_text_normal);
        this.f16158F = color;
        int color2 = resources.getColor(R.color.date_picker_blue);
        this.f16159G = color2;
        this.f16160H = resources.getColor(R.color.date_picker_text_disabled);
        resources.getColor(17170443);
        int color3 = resources.getColor(R.color.circle_background);
        this.f16161I = color3;
        StringBuilder sb = new StringBuilder(50);
        this.f16167O = sb;
        this.f16166N = new Formatter(sb, Locale.getDefault());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.day_number_size);
        this.f16170a = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.month_label_size);
        this.f16171b = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.month_day_label_text_size);
        this.f16172c = dimensionPixelSize3;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.month_list_item_header_height);
        this.f16173d = dimensionPixelOffset;
        this.f16174e = resources.getDimensionPixelSize(R.dimen.day_number_select_circle_radius);
        this.f16187r = resources.getDimensionPixelSize(R.dimen.date_picker_week_number_column_width);
        this.f16188s = (resources.getDimensionPixelOffset(R.dimen.date_picker_view_animator_height) - dimensionPixelOffset) / 6;
        C5102y yVar = new C5102y(this, this);
        this.f16155C = yVar;
        C2043bi.m5526T(this, yVar);
        C2043bi.m5551ae(this, 1);
        this.f16168P = true;
        getContext().getResources().getConfiguration().getLayoutDirection();
        this.f16169Q = new GestureDetector(context, new C5101x(this));
        Paint paint = new Paint();
        this.f16177h = paint;
        paint.setFakeBoldText(true);
        paint.setAntiAlias(true);
        paint.setTextSize((float) dimensionPixelSize2);
        paint.setTypeface(Typeface.create(string2, 1));
        paint.setColor(color);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f16178i = paint2;
        paint2.setFakeBoldText(true);
        paint2.setAntiAlias(true);
        paint2.setColor(color3);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f16179j = paint3;
        paint3.setFakeBoldText(true);
        paint3.setAntiAlias(true);
        paint3.setColor(color2);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(60);
        Paint paint4 = new Paint();
        this.f16180k = paint4;
        paint4.setAntiAlias(true);
        paint4.setTextSize((float) dimensionPixelSize3);
        paint4.setColor(color);
        paint4.setTypeface(Typeface.create(string, 0));
        paint4.setStyle(Paint.Style.FILL);
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setFakeBoldText(true);
        Paint paint5 = new Paint();
        this.f16176g = paint5;
        paint5.setAntiAlias(true);
        paint5.setTextSize((float) dimensionPixelSize);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setFakeBoldText(false);
        Paint paint6 = new Paint();
        this.f16181l = paint6;
        paint6.setAntiAlias(true);
        paint6.setTextSize((float) dimensionPixelSize);
        paint6.setStyle(Paint.Style.FILL);
        paint6.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: i */
    public static final String m13935i() {
        if (TextUtils.isEmpty((CharSequence) null)) {
            return Time.getCurrentTimezone();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10055a() {
        int i = this.f16163K;
        int i2 = this.f16192w;
        if (i < i2) {
            i += this.f16193x;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo10056b() {
        if (this.f16195z) {
            return this.f16187r;
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo10058d(C5097t tVar) {
        if (!mo10062g(tVar)) {
            C5071aa aaVar = this.f16157E;
            if (aaVar != null) {
                aaVar.mo10054b(tVar);
            }
            this.f16155C.sendEventForVirtualView$ar$ds(tVar.f16265c, 1);
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f16155C.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo10060e(C5097t tVar) {
        if (!mo10062g(tVar)) {
            this.f16155C.sendEventForVirtualView$ar$ds(tVar.f16265c, 2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10061f(float f, float f2, C5103z zVar) {
        if (this.f16182m.isEmpty()) {
            return false;
        }
        if (!this.f16182m.contains((int) f, (int) f2)) {
            this.f16182m.setEmpty();
            return false;
        }
        C5097t c = mo10057c(f, f2);
        if (c == null) {
            return false;
        }
        zVar.mo10118a(c);
        return true;
    }

    /* renamed from: h */
    public abstract void mo10063h(Canvas canvas, int i, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo10064j(int i) {
        if (i < 0 || i >= this.f16193x) {
            Log.wtf("MonthView", String.format("Unexpected column index %d. Expected index in range of 0 <= x < %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f16193x)}));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        int i2 = this.f16186q;
        int b = mo10056b();
        int i3 = this.f16173d;
        int i4 = this.f16172c;
        int i5 = this.f16171b;
        int i6 = 0;
        this.f16167O.setLength(0);
        long timeInMillis = this.f16153A.getTimeInMillis();
        canvas2.drawText(DateUtils.formatDateRange(getContext(), this.f16166N, timeInMillis, timeInMillis, 52, m13935i()).toString(), (float) ((i2 + b) / 2), (float) (((i3 - i4) / 2) + (i5 / 3)), this.f16177h);
        int i7 = this.f16173d - (this.f16172c / 2);
        int i8 = this.f16186q;
        int b2 = mo10056b();
        int i9 = this.f16193x;
        int i10 = (i8 - b2) / (i9 + i9);
        int i11 = 0;
        while (true) {
            i = this.f16193x;
            if (i11 >= i) {
                break;
            }
            mo10064j(i11);
            int i12 = (this.f16192w + i11) % this.f16193x;
            int b3 = mo10056b();
            this.f16154B.set(7, i12);
            canvas2.drawText(this.f16154B.getDisplayName(7, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()), (float) (((i11 + i11 + 1) * i10) + b3), (float) i7, this.f16180k);
            i11++;
        }
        int i13 = (((this.f16188s + this.f16170a) / 2) - 1) + this.f16173d;
        float f = (float) i;
        float b4 = ((float) (this.f16186q - mo10056b())) / (f + f);
        int i14 = i13;
        int a = mo10055a();
        for (int i15 = 1; i15 <= this.f16194y; i15++) {
            mo10064j(a);
            mo10063h(canvas, this.f16185p, this.f16184o, i15, (int) ((((float) (a + a + 1)) * b4) + ((float) mo10056b())), i14);
            a++;
            if (a == this.f16193x) {
                i14 += this.f16188s;
                a = 0;
            }
        }
        if (this.f16195z) {
            int i16 = ((this.f16188s + this.f16170a) / 2) - 1;
            int i17 = this.f16173d + i16;
            int i18 = this.f16187r;
            int c = C5104e.m13982c(this.f16183n, C5104e.m13980a(this.f16192w));
            while (true) {
                int i19 = this.f16156D;
                if (i6 < i19) {
                    int i20 = this.f16184o;
                    if (i20 != 11) {
                        if (i20 == 0 && i6 == 1) {
                            i6 = 1;
                        }
                        int i21 = this.f16188s + i17;
                        canvas2.drawText(String.valueOf(c), (float) (i18 / 2), (float) (((i17 - i16) + (i17 + i16)) / 2), this.f16181l);
                        c++;
                        i6++;
                        i17 = i21;
                    } else if (i6 != i19 - 1) {
                        int i212 = this.f16188s + i17;
                        canvas2.drawText(String.valueOf(c), (float) (i18 / 2), (float) (((i17 - i16) + (i17 + i16)) / 2), this.f16181l);
                        c++;
                        i6++;
                        i17 = i212;
                    }
                    c = C5104e.m13982c(this.f16183n + (i6 * 7), C5104e.m13980a(this.f16192w));
                    int i2122 = this.f16188s + i17;
                    canvas2.drawText(String.valueOf(c), (float) (i18 / 2), (float) (((i17 - i16) + (i17 + i16)) / 2), this.f16181l);
                    c++;
                    i6++;
                    i17 = i2122;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f16188s * this.f16156D) + this.f16173d);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f16186q = i;
        this.f16155C.invalidateRoot();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f16169Q.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (!this.f16168P) {
            super.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == null || super.verifyDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = ((com.android.datetimepicker.date.C5081d) r0).f16225r;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10062g(com.android.datetimepicker.date.C5097t r3) {
        /*
            r2 = this;
            com.android.datetimepicker.date.i r0 = r2.f16175f
            if (r0 != 0) goto L_0x0005
            goto L_0x0017
        L_0x0005:
            com.android.datetimepicker.date.d r0 = (com.android.datetimepicker.date.C5081d) r0
            java.util.Calendar r0 = r0.f16224q
            if (r0 == 0) goto L_0x0017
            com.android.datetimepicker.date.t r1 = new com.android.datetimepicker.date.t
            r1.<init>((java.util.Calendar) r0)
            int r0 = r3.compareTo(r1)
            if (r0 >= 0) goto L_0x0017
            goto L_0x002d
        L_0x0017:
            com.android.datetimepicker.date.i r0 = r2.f16175f
            if (r0 != 0) goto L_0x001c
            goto L_0x002f
        L_0x001c:
            com.android.datetimepicker.date.d r0 = (com.android.datetimepicker.date.C5081d) r0
            java.util.Calendar r0 = r0.f16225r
            if (r0 == 0) goto L_0x002f
            com.android.datetimepicker.date.t r1 = new com.android.datetimepicker.date.t
            r1.<init>((java.util.Calendar) r0)
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L_0x002f
        L_0x002d:
            r3 = 1
            return r3
        L_0x002f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.datetimepicker.date.C5072ab.mo10062g(com.android.datetimepicker.date.t):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.datetimepicker.date.C5097t mo10057c(float r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.mo10056b()
            float r1 = (float) r0
            r2 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0038
            int r3 = r6.f16186q
            float r4 = (float) r3
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0012
            goto L_0x0038
        L_0x0012:
            int r4 = r6.f16173d
            int r5 = r6.f16188s
            float r4 = (float) r4
            float r8 = r8 - r4
            int r8 = (int) r8
            int r8 = r8 / r5
            float r7 = r7 - r1
            int r1 = r6.f16193x
            float r1 = (float) r1
            float r7 = r7 * r1
            int r3 = r3 - r0
            float r0 = (float) r3
            float r7 = r7 / r0
            int r7 = (int) r7
            r6.mo10064j(r7)
            int r0 = r6.mo10055a()
            int r7 = r7 - r0
            int r7 = r7 + 1
            int r0 = r6.f16193x
            int r8 = r8 * r0
            int r7 = r7 + r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0039
        L_0x0038:
            r7 = r2
        L_0x0039:
            if (r7 == 0) goto L_0x0058
            int r8 = r7.intValue()
            if (r8 <= 0) goto L_0x0058
            int r8 = r7.intValue()
            int r0 = r6.f16194y
            if (r8 <= r0) goto L_0x004a
            goto L_0x0058
        L_0x004a:
            com.android.datetimepicker.date.t r8 = new com.android.datetimepicker.date.t
            int r0 = r6.f16185p
            int r1 = r6.f16184o
            int r7 = r7.intValue()
            r8.<init>(r0, r1, r7)
            return r8
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.datetimepicker.date.C5072ab.mo10057c(float, float):com.android.datetimepicker.date.t");
    }
}
