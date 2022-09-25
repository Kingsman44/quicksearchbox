package com.google.android.libraries.componentview.components.base.p1688b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.componentview.components.base.p1687a.C19935bi;
import com.google.android.libraries.componentview.components.base.p1687a.C19991n;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.base.b.k */
/* compiled from: PG */
public final class C20041k extends ImageView implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final Context f56180a;

    /* renamed from: b */
    public final C20601ca f56181b;

    /* renamed from: c */
    public float[] f56182c;

    /* renamed from: d */
    public boolean f56183d = false;

    /* renamed from: e */
    public C19991n f56184e = null;

    /* renamed from: f */
    public C19935bi f56185f;

    /* renamed from: g */
    public boolean f56186g;

    /* renamed from: h */
    public boolean f56187h;

    /* renamed from: i */
    public float f56188i;

    /* renamed from: j */
    private final Executor f56189j;

    /* renamed from: k */
    private final C60887da f56190k;

    /* renamed from: l */
    private boolean f56191l;

    public C20041k(Context context, C20601ca caVar, Executor executor, C60887da daVar) {
        super(context);
        this.f56180a = context;
        this.f56181b = caVar;
        this.f56189j = executor;
        this.f56190k = daVar;
        setOnFocusChangeListener(this);
    }

    /* renamed from: c */
    private static int m37869c(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(Math.min(i, size), i2);
        }
        if (mode != 0) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, i2);
    }

    /* renamed from: d */
    private final RectF m37870d() {
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(0, getTop());
        int min2 = Math.min(0, getLeft());
        if (getParent() instanceof View) {
            View view = (View) getParent();
            width = Math.min(width, view.getWidth() - min2);
            height = Math.min(height, view.getHeight() - min);
        }
        RectF rectF = new RectF((float) (-min2), (float) (-min), (float) width, (float) height);
        C19991n nVar = this.f56184e;
        if (nVar != null) {
            Context context = this.f56180a;
            float a = (float) ((int) (C20482m.m38433a(context) * nVar.f56022b));
            rectF.inset(a, a);
        }
        return rectF;
    }

    /* renamed from: e */
    private final void m37871e(Bitmap bitmap) {
        C60856cj.m92911t(this.f56190k.mo19399b(new C20039i(this, bitmap)), new C20040j(this, bitmap), this.f56189j);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Path path = new Path();
        if (this.f56183d) {
            path.addOval(m37870d(), Path.Direction.CW);
        } else if (this.f56182c != null) {
            path.addRoundRect(m37870d(), this.f56182c, Path.Direction.CW);
        }
        canvas.clipPath(path);
        if (this.f56186g && this.f56191l && getBackground() != null) {
            float a = C20482m.m38433a(this.f56180a);
            int i = (int) (a + a);
            int i2 = i + i;
            if (getWidth() > i2 && getHeight() > i2) {
                float f = (float) i;
                canvas.clipRect(new RectF(f, f, (float) (getWidth() - i), (float) (getHeight() - i)));
            }
        }
        super.onDraw(canvas);
    }

    public final void onFocusChange(View view, boolean z) {
        this.f56191l = z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            super.onMeasure(r14, r15)
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r1 = android.view.View.MeasureSpec.getMode(r15)
            r2 = 1
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 == r4) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r1 == r4) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            float r4 = r13.f56188i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x008b
            if (r0 != 0) goto L_0x0025
            if (r1 == 0) goto L_0x008b
            r1 = 1
        L_0x0025:
            int r4 = r13.getMeasuredHeight()
            int r5 = r13.getMeasuredWidth()
            int r6 = r13.getPaddingLeft()
            int r7 = r13.getPaddingRight()
            int r8 = r13.getPaddingTop()
            int r9 = r13.getPaddingBottom()
            int r10 = r4 - r8
            int r10 = r10 - r9
            float r10 = (float) r10
            int r11 = r5 - r6
            int r11 = r11 - r7
            float r11 = (float) r11
            float r11 = r11 / r10
            float r12 = r13.f56188i
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            r12 = 869711765(0x33d6bf95, float:1.0E-7)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0088
            if (r0 == 0) goto L_0x006c
            float r11 = r13.f56188i
            float r11 = r11 * r10
            int r10 = (int) r11
            int r10 = r10 + r6
            int r10 = r10 + r7
            if (r1 != 0) goto L_0x0067
            int r5 = r13.getMaxWidth()
            int r5 = m37869c(r10, r5, r14)
        L_0x0067:
            if (r10 > r5) goto L_0x006c
            r5 = r10
            r14 = 1
            goto L_0x006d
        L_0x006c:
            r14 = 0
        L_0x006d:
            if (r14 != 0) goto L_0x0088
            if (r1 == 0) goto L_0x0088
            int r14 = r5 - r6
            int r14 = r14 - r7
            float r14 = (float) r14
            float r1 = r13.f56188i
            float r14 = r14 / r1
            int r14 = (int) r14
            int r14 = r14 + r8
            int r14 = r14 + r9
            if (r0 != 0) goto L_0x0085
            int r0 = r13.getMaxHeight()
            int r4 = m37869c(r14, r0, r15)
        L_0x0085:
            if (r14 > r4) goto L_0x0088
            r4 = r14
        L_0x0088:
            r13.setMeasuredDimension(r5, r4)
        L_0x008b:
            boolean r14 = r13.f56183d
            if (r14 == 0) goto L_0x00c6
            int r14 = r13.getMeasuredHeight()
            int r15 = r13.getMeasuredWidth()
            android.graphics.drawable.Drawable r0 = r13.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x00c6
            float r15 = (float) r15
            r1 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r1
            float r14 = (float) r14
            float r14 = r14 * r1
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r1 = 8
            float[] r1 = new float[r1]
            r1[r3] = r15
            r1[r2] = r14
            r2 = 2
            r1[r2] = r15
            r2 = 3
            r1[r2] = r14
            r2 = 4
            r1[r2] = r15
            r2 = 5
            r1[r2] = r14
            r2 = 6
            r1[r2] = r15
            r15 = 7
            r1[r15] = r14
            r0.setCornerRadii(r1)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.base.p1688b.C20041k.onMeasure(int, int):void");
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.f56187h && drawable != null) {
            drawable.setAutoMirrored(true);
        }
        if (this.f56185f == null || !(drawable instanceof BitmapDrawable)) {
            super.setImageDrawable(drawable);
        } else {
            m37871e(((BitmapDrawable) drawable).getBitmap());
        }
    }

    public final void setImageResource(int i) {
        if (this.f56185f != null) {
            m37871e(BitmapFactory.decodeResource(getContext().getResources(), i));
        } else {
            super.setImageResource(i);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        if (this.f56185f == null || bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            m37871e(bitmap);
        }
    }
}
