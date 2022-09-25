package com.google.android.libraries.onegoogle.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.q */
/* compiled from: PG */
final class C31081q extends View {

    /* renamed from: a */
    public final Paint f83721a;

    /* renamed from: b */
    public boolean f83722b;

    /* renamed from: c */
    private final C31067c f83723c;

    /* renamed from: d */
    private final Runnable f83724d;

    /* renamed from: e */
    private final Rect f83725e = new Rect();

    /* renamed from: f */
    private final Path f83726f = new Path();

    public C31081q(Context context, C31067c cVar, Runnable runnable) {
        super(context);
        Paint paint = new Paint();
        this.f83721a = paint;
        this.f83723c = cVar;
        this.f83724d = runnable;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f83722b) {
            canvas.drawPath(this.f83726f, this.f83721a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f83726f.rewind();
        this.f83726f.addRect(0.0f, 0.0f, (float) (i3 - i), (float) (i4 - i2), Path.Direction.CW);
        C31067c cVar = this.f83723c;
        Path path = this.f83726f;
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) cVar;
        Rect b = selectedAccountDisc.mo35804b();
        float width = ((float) b.width()) * 0.6f;
        float exactCenterX = b.exactCenterX();
        float exactCenterY = b.exactCenterY();
        path.addCircle(exactCenterX, exactCenterY, width, Path.Direction.CCW);
        selectedAccountDisc.f81902c.getGlobalVisibleRect(selectedAccountDisc.f81900a);
        float f = exactCenterY - width;
        if (((float) selectedAccountDisc.f81900a.top) > f) {
            path.addRect(exactCenterX - width, f, exactCenterX + width, (float) selectedAccountDisc.f81900a.top, Path.Direction.CW);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getRawX()
            int r0 = java.lang.Math.round(r0)
            float r1 = r5.getRawY()
            int r1 = java.lang.Math.round(r1)
            int r5 = r5.getAction()
            r2 = 1
            if (r5 != 0) goto L_0x004a
            com.google.android.libraries.onegoogle.tooltip.c r5 = r4.f83723c
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r5 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r5
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r5 = r5.f81902c
            android.graphics.Rect r3 = r4.f83725e
            r5.getGlobalVisibleRect(r3)
            android.graphics.Rect r5 = r4.f83725e
            boolean r5 = r5.contains(r0, r1)
            r0 = 0
            if (r5 != 0) goto L_0x0035
            r4.performClick()
            boolean r5 = r4.f83722b
            if (r5 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 != 0) goto L_0x003d
            r4.f83722b = r0
            r4.invalidate()
        L_0x003d:
            java.lang.Runnable r1 = r4.f83724d
            com.google.android.libraries.onegoogle.tooltip.r r1 = (com.google.android.libraries.onegoogle.tooltip.C31082r) r1
            com.google.android.libraries.onegoogle.tooltip.x r1 = r1.f83727a
            r1.dismiss()
            if (r5 != 0) goto L_0x0049
            return r2
        L_0x0049:
            return r0
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.tooltip.C31081q.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
