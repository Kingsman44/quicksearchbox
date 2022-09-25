package com.google.android.apps.gsa.staticplugins.opa.soundsearch;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.googlequicksearchbox.R;
import java.util.Arrays;
import java.util.Random;

/* compiled from: PG */
public class AudioVisualizerView extends View {

    /* renamed from: a */
    public final TimeAnimator f309037a;

    /* renamed from: b */
    public C90740ax f309038b;

    /* renamed from: c */
    private final float[] f309039c;

    /* renamed from: d */
    private final int[] f309040d;

    /* renamed from: e */
    private Point[] f309041e;

    /* renamed from: f */
    private Point[] f309042f;

    /* renamed from: g */
    private final Point[] f309043g;

    /* renamed from: h */
    private int f309044h;

    /* renamed from: i */
    private final Drawable f309045i;

    /* renamed from: j */
    private final int f309046j;

    /* renamed from: k */
    private final int f309047k;

    /* renamed from: l */
    private final int f309048l;

    /* renamed from: m */
    private final Paint f309049m;

    /* renamed from: n */
    private final Path f309050n;

    /* renamed from: o */
    private long f309051o;

    /* renamed from: p */
    private long f309052p;

    public AudioVisualizerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo98941a() {
        this.f309052p = SystemClock.uptimeMillis();
        if (!this.f309037a.isStarted()) {
            this.f309051o = 0;
            this.f309044h = 0;
            this.f309041e = null;
            this.f309042f = null;
            Arrays.fill(this.f309040d, 0);
            this.f309037a.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f309037a.setTimeListener(new C110935a(this));
        mo98941a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f309037a.cancel();
        this.f309037a.setTimeListener((TimeAnimator.TimeListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f309038b != null) {
            Random random = new Random();
            int i2 = ((C107619d) this.f309038b).f299387a;
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = (random.nextFloat() * ((float) Math.max(i2 - 30, 0))) / 75.0f;
            }
            Arrays.sort(fArr);
            for (int i4 = 0; i4 < 8; i4++) {
                float[] fArr2 = this.f309039c;
                fArr2[i4] = fArr[i4];
                fArr2[14 - i4] = fArr[i4];
            }
            int height = getHeight();
            int width = getWidth();
            long uptimeMillis = SystemClock.uptimeMillis();
            int i5 = (int) (uptimeMillis - this.f309052p);
            if (this.f309051o == 0 || i5 > 200) {
                Point[] pointArr = this.f309041e;
                if (pointArr != null) {
                    if (this.f309042f == null) {
                        this.f309042f = new Point[8];
                    }
                    System.arraycopy(pointArr, 0, this.f309042f, 0, 8);
                } else {
                    this.f309041e = new Point[8];
                }
                if (this.f309039c != null) {
                    float f2 = 0.0f;
                    for (int i6 = 0; i6 < 4; i6++) {
                        f2 += this.f309039c[(8 - i6) - 1];
                    }
                    f = f2 / 4.0f;
                } else {
                    f = 0.0f;
                }
                int i7 = 0;
                for (int i8 = 8; i7 < i8; i8 = 8) {
                    Point[] pointArr2 = this.f309041e;
                    int i9 = ((i7 % 8) + i8) % i8;
                    int i10 = this.f309044h;
                    double d = (double) i9;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    double d2 = (((d + d) * 3.141592653589793d) / 8.0d) + 1.5707963267948966d;
                    double d3 = (double) this.f309039c[(((i9 + i10) % i8) + i8) % i8];
                    Double.isNaN(d3);
                    double d4 = (double) f;
                    Double.isNaN(d4);
                    double min = Math.min((d3 * 0.45d) + (d4 * 0.45d), 0.9d);
                    double d5 = (double) width;
                    Double.isNaN(d5);
                    int i11 = i7;
                    double d6 = (double) height;
                    Double.isNaN(d6);
                    pointArr2[i11] = new Point((int) (d5 * 0.5d * ((Math.sin(d2) * min) + 1.0d)), (int) (d6 * 0.5d * ((Math.cos(d2) * min) + 1.0d)));
                    i7 = i11 + 1;
                    uptimeMillis = uptimeMillis;
                }
                long j = uptimeMillis;
                if (this.f309042f == null) {
                    i = 8;
                    Point[] pointArr3 = new Point[8];
                    this.f309042f = pointArr3;
                    System.arraycopy(this.f309041e, 0, pointArr3, 0, 8);
                } else {
                    i = 8;
                }
                this.f309052p = j;
                this.f309044h = (((this.f309044h + 5) & 7) + i) & 7;
                i5 = 0;
            } else {
                i = 8;
            }
            this.f309051o++;
            int i12 = 0;
            while (i12 < i) {
                float f3 = ((float) i5) / 200.0f;
                Point point = this.f309042f[i12];
                Point point2 = this.f309041e[i12];
                float f4 = 1.0f - f3;
                this.f309043g[i12] = new Point((int) ((((float) point.x) * f4) + (((float) point2.x) * f3)), (int) ((((float) point.y) * f4) + (((float) point2.y) * f3)));
                i12++;
                i = 8;
            }
            this.f309050n.reset();
            this.f309050n.moveTo((float) this.f309043g[0].x, (float) this.f309043g[0].y);
            int i13 = 1;
            for (int i14 = 8; i13 <= i14; i14 = 8) {
                Point[] pointArr4 = this.f309043g;
                Point point3 = pointArr4[(((i13 - 2) % i14) + i14) % i14];
                Point point4 = pointArr4[(((i13 - 1) % i14) + i14) % i14];
                Point point5 = pointArr4[((i13 % 8) + i14) % i14];
                i13++;
                Point point6 = pointArr4[((i13 % 8) + i14) % i14];
                double d7 = (double) (point5.y - point3.y);
                double d8 = (double) (point5.x - point3.x);
                double atan2 = Math.atan2(d7, d8);
                double hypot = Math.hypot(d7, d8) * 0.2d;
                double d9 = (double) (point4.y - point6.y);
                double d10 = (double) (point4.x - point6.x);
                double atan22 = Math.atan2(d9, d10);
                double hypot2 = Math.hypot(d9, d10) * 0.2d;
                double d11 = (double) point4.x;
                Double.isNaN(d11);
                int cos = (int) (d11 + (Math.cos(atan2) * hypot));
                double d12 = (double) point4.y;
                Double.isNaN(d12);
                Point point7 = new Point(cos, (int) (d12 + (Math.sin(atan2) * hypot)));
                double d13 = (double) point5.x;
                Double.isNaN(d13);
                int cos2 = (int) (d13 + (Math.cos(atan22) * hypot2));
                double d14 = (double) point5.y;
                Double.isNaN(d14);
                Point point8 = new Point(cos2, (int) (d14 + (Math.sin(atan22) * hypot2)));
                this.f309050n.cubicTo((float) point7.x, (float) point7.y, (float) point8.x, (float) point8.y, (float) point5.x, (float) point5.y);
            }
            canvas2.drawPath(this.f309050n, this.f309049m);
            int height2 = getHeight();
            int i15 = this.f309046j + this.f309047k;
            int i16 = 0;
            while (true) {
                int length = this.f309040d.length;
                if (i16 < 15) {
                    float f5 = (float) height2;
                    float max = Math.max(0.0f, Math.min(f5, this.f309039c[i16] * f5));
                    int[] iArr = this.f309040d;
                    double d15 = (double) iArr[i16];
                    Double.isNaN(d15);
                    double d16 = (double) max;
                    Double.isNaN(d16);
                    iArr[i16] = (int) Math.max((double) this.f309048l, (d15 * 0.88d) + (d16 * 0.12d));
                    Drawable drawable = this.f309045i;
                    int i17 = i16 * i15;
                    int i18 = this.f309040d[i16];
                    int i19 = (height2 - i18) / 2;
                    drawable.setBounds(i17, i19, this.f309046j + i17, i18 + i19);
                    this.f309045i.draw(canvas2);
                    i16++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.f309037a.cancel();
        }
    }

    public AudioVisualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioVisualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309039c = new float[15];
        this.f309040d = new int[15];
        this.f309043g = new Point[8];
        this.f309044h = 0;
        this.f309050n = new Path();
        this.f309045i = getResources().getDrawable(R.drawable.opa_soundsearch_bg_audio_progress_vertical_bar, context.getTheme());
        this.f309046j = getResources().getDimensionPixelSize(R.dimen.opa_soundsearch_audio_progress_bar_width);
        this.f309047k = getResources().getDimensionPixelSize(R.dimen.opa_soundsearch_audio_progress_bar_margin);
        this.f309048l = getResources().getDimensionPixelSize(R.dimen.opa_soundsearch_audio_progress_bar_height_empty);
        this.f309037a = new TimeAnimator();
        Paint paint = new Paint();
        this.f309049m = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Context context2 = getContext();
        TypedValue typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(R.attr.opa_soundsearch_audio_progress_blob_color, typedValue, true);
        paint.setColor(C1878d.m5128a(context2, typedValue.resourceId != 0 ? typedValue.resourceId : typedValue.data));
    }
}
