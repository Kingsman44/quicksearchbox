package com.google.android.apps.search.soundsearch.homescreen;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class AudioVisualizerView extends View {

    /* renamed from: a */
    public static final C59071e f384649a = C59071e.m91332i("com.google.android.apps.search.soundsearch.homescreen.AudioVisualizerView");

    /* renamed from: b */
    public C141726i f384650b;

    /* renamed from: c */
    public final TimeAnimator f384651c;

    /* renamed from: d */
    private final float[] f384652d;

    /* renamed from: e */
    private final int[] f384653e;

    /* renamed from: f */
    private Point[] f384654f;

    /* renamed from: g */
    private Point[] f384655g;

    /* renamed from: h */
    private final Point[] f384656h;

    /* renamed from: i */
    private int f384657i;

    /* renamed from: j */
    private final Drawable f384658j;

    /* renamed from: k */
    private final int f384659k;

    /* renamed from: l */
    private final int f384660l;

    /* renamed from: m */
    private final int f384661m;

    /* renamed from: n */
    private long f384662n;

    /* renamed from: o */
    private C21370a f384663o;

    /* renamed from: p */
    private final Paint f384664p;

    /* renamed from: q */
    private final Path f384665q;

    /* renamed from: r */
    private long f384666r;

    public AudioVisualizerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo116671a(C21370a aVar) {
        ((C59052c) ((C59052c) f384649a.mo56224b()).mo56372aa(41776)).mo56386p("Start animation");
        this.f384663o = aVar;
        this.f384662n = aVar.mo26874f();
        if (!this.f384651c.isStarted()) {
            this.f384666r = 0;
            this.f384657i = 0;
            this.f384654f = null;
            this.f384655g = null;
            Arrays.fill(this.f384653e, 0);
            this.f384651c.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f384651c.setTimeListener(new C141718a(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f384651c.cancel();
        this.f384651c.setTimeListener((TimeAnimator.TimeListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        List list;
        int i;
        float f;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        C141726i iVar = this.f384650b;
        if (iVar != null && (list = iVar.f384693a) != null && list.size() == 15) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f384652d[i2] = ((Float) list.get(i2)).floatValue();
            }
            int height = getHeight();
            int width = getWidth();
            long f2 = this.f384663o.mo26874f();
            int i3 = (int) (f2 - this.f384662n);
            if (this.f384666r == 0 || i3 > 200) {
                Point[] pointArr = this.f384654f;
                if (pointArr != null) {
                    if (this.f384655g == null) {
                        this.f384655g = new Point[8];
                    }
                    System.arraycopy(pointArr, 0, this.f384655g, 0, 8);
                } else {
                    this.f384654f = new Point[8];
                }
                if (this.f384652d != null) {
                    float f3 = 0.0f;
                    for (int i4 = 0; i4 < 4; i4++) {
                        f3 += this.f384652d[(8 - i4) - 1];
                    }
                    f = f3 / 4.0f;
                } else {
                    f = 0.0f;
                }
                int i5 = 0;
                for (int i6 = 8; i5 < i6; i6 = 8) {
                    Point[] pointArr2 = this.f384654f;
                    int i7 = ((i5 % 8) + i6) % i6;
                    int i8 = this.f384657i;
                    double d = (double) i7;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    double d2 = (((d + d) * 3.141592653589793d) / 8.0d) + 1.5707963267948966d;
                    double d3 = (double) this.f384652d[(((i7 + i8) % i6) + i6) % i6];
                    Double.isNaN(d3);
                    double d4 = (double) f;
                    Double.isNaN(d4);
                    double min = Math.min((d3 * 0.45d) + (d4 * 0.45d), 0.9d);
                    int i9 = i5;
                    double d5 = (double) width;
                    Double.isNaN(d5);
                    double d6 = (double) height;
                    Double.isNaN(d6);
                    pointArr2[i9] = new Point((int) (d5 * 0.5d * ((Math.sin(d2) * min) + 1.0d)), (int) (d6 * 0.5d * ((Math.cos(d2) * min) + 1.0d)));
                    i5 = i9 + 1;
                    f = f;
                }
                if (this.f384655g == null) {
                    i = 8;
                    Point[] pointArr3 = new Point[8];
                    this.f384655g = pointArr3;
                    System.arraycopy(this.f384654f, 0, pointArr3, 0, 8);
                } else {
                    i = 8;
                }
                this.f384662n = f2;
                this.f384657i = (((this.f384657i + 5) & 7) + i) & 7;
                i3 = 0;
            } else {
                i = 8;
            }
            this.f384666r++;
            int i10 = 0;
            while (i10 < i) {
                float f4 = ((float) i3) / 200.0f;
                Point point = this.f384655g[i10];
                Point point2 = this.f384654f[i10];
                float f5 = 1.0f - f4;
                this.f384656h[i10] = new Point((int) ((((float) point.x) * f5) + (((float) point2.x) * f4)), (int) ((((float) point.y) * f5) + (((float) point2.y) * f4)));
                i10++;
                i = 8;
            }
            this.f384665q.reset();
            this.f384665q.moveTo((float) this.f384656h[0].x, (float) this.f384656h[0].y);
            int i11 = 1;
            for (int i12 = 8; i11 <= i12; i12 = 8) {
                Point[] pointArr4 = this.f384656h;
                Point point3 = pointArr4[(((i11 - 2) % i12) + i12) % i12];
                Point point4 = pointArr4[(((i11 - 1) % i12) + i12) % i12];
                Point point5 = pointArr4[((i11 % 8) + i12) % i12];
                i11++;
                Point point6 = pointArr4[((i11 % 8) + i12) % i12];
                double d7 = (double) (point5.y - point3.y);
                double d8 = (double) (point5.x - point3.x);
                double atan2 = Math.atan2(d7, d8);
                double hypot = Math.hypot(d7, d8) * 0.2d;
                double d9 = (double) (point4.y - point6.y);
                double d10 = (double) (point4.x - point6.x);
                double atan22 = Math.atan2(d9, d10);
                double d11 = (double) point4.x;
                Double.isNaN(d11);
                double hypot2 = Math.hypot(d9, d10) * 0.2d;
                double d12 = (double) point4.y;
                Double.isNaN(d12);
                Point point7 = new Point((int) (d11 + (Math.cos(atan2) * hypot)), (int) (d12 + (Math.sin(atan2) * hypot)));
                double d13 = (double) point5.x;
                Double.isNaN(d13);
                double d14 = (double) point5.y;
                Double.isNaN(d14);
                Point point8 = new Point((int) (d13 + (Math.cos(atan22) * hypot2)), (int) (d14 + (Math.sin(atan22) * hypot2)));
                this.f384665q.cubicTo((float) point7.x, (float) point7.y, (float) point8.x, (float) point8.y, (float) point5.x, (float) point5.y);
            }
            canvas2.drawPath(this.f384665q, this.f384664p);
            int height2 = getHeight();
            int i13 = this.f384659k + this.f384660l;
            int i14 = 0;
            while (true) {
                int length = this.f384653e.length;
                if (i14 < 15) {
                    float f6 = (float) height2;
                    float max = Math.max(0.0f, Math.min(f6, this.f384652d[i14] * f6));
                    int[] iArr = this.f384653e;
                    double d15 = (double) iArr[i14];
                    Double.isNaN(d15);
                    double d16 = (double) max;
                    Double.isNaN(d16);
                    iArr[i14] = (int) Math.max((double) this.f384661m, (d15 * 0.88d) + (d16 * 0.12d));
                    Drawable drawable = this.f384658j;
                    int i15 = i14 * i13;
                    int i16 = this.f384653e[i14];
                    int i17 = (height2 - i16) / 2;
                    drawable.setBounds(i15, i17, this.f384659k + i15, i16 + i17);
                    this.f384658j.draw(canvas2);
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    public AudioVisualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioVisualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f384652d = new float[15];
        this.f384653e = new int[15];
        this.f384656h = new Point[8];
        this.f384657i = 0;
        this.f384665q = new Path();
        this.f384658j = getResources().getDrawable(R.drawable.soundsearch_bg_audio_progress_vertical_bar);
        this.f384659k = getResources().getDimensionPixelSize(R.dimen.soundsearch_audio_progress_bar_width);
        this.f384660l = getResources().getDimensionPixelSize(R.dimen.soundsearch_audio_progress_bar_margin);
        this.f384661m = getResources().getDimensionPixelSize(R.dimen.soundsearch_audio_progress_bar_height_empty);
        this.f384651c = new TimeAnimator();
        Paint paint = new Paint();
        this.f384664p = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.soundsearch_audio_progress_blob_color));
    }
}
