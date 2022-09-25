package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.r.c.b.b */
/* compiled from: PG */
final class C32098b extends C32105i {

    /* renamed from: a */
    private final Paint f86180a;

    /* renamed from: b */
    private final Paint f86181b;

    /* renamed from: c */
    private final C32109m f86182c;

    /* renamed from: d */
    private final int f86183d;

    /* renamed from: e */
    private final Canvas f86184e;

    /* renamed from: f */
    private Bitmap f86185f = null;

    /* renamed from: g */
    private Bitmap f86186g = null;

    /* renamed from: h */
    private Bitmap f86187h = null;

    /* renamed from: i */
    private Bitmap f86188i = null;

    /* renamed from: j */
    private int f86189j = -1;

    /* renamed from: k */
    private boolean f86190k;

    public C32098b(C32109m mVar, int i, boolean z) {
        Canvas canvas = new Canvas();
        this.f86182c = mVar;
        this.f86184e = canvas;
        this.f86190k = !z;
        this.f86183d = i;
        this.f86180a = mVar.f86212b;
        this.f86181b = mVar.f86213c;
    }

    /* renamed from: a */
    public final void mo37886a(C32112p pVar, Canvas canvas) {
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        if (width == 0 || height == 0) {
            pVar.mo37909b(canvas);
            return;
        }
        int a = pVar.mo37908a(width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f86184e.setBitmap(createBitmap);
        pVar.mo37909b(this.f86184e);
        Canvas canvas2 = this.f86184e;
        Bitmap bitmap = this.f86185f;
        if (bitmap != null) {
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, this.f86181b);
        }
        Bitmap bitmap2 = this.f86186g;
        if (bitmap2 != null) {
            canvas2.drawBitmap(bitmap2, (float) (width - a), 0.0f, this.f86181b);
        }
        Bitmap bitmap3 = this.f86187h;
        if (bitmap3 != null) {
            canvas2.drawBitmap(bitmap3, 0.0f, (float) (height - a), this.f86181b);
        }
        Bitmap bitmap4 = this.f86188i;
        if (bitmap4 != null) {
            canvas2.drawBitmap(bitmap4, (float) (width - a), (float) (height - a), this.f86181b);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.f86180a);
    }

    /* renamed from: b */
    public final void mo37887b(ViewGroup viewGroup) {
        viewGroup.setClipToOutline(false);
        viewGroup.setClipChildren(false);
    }

    /* renamed from: c */
    public final void mo37888c(View view, Rect rect) {
        view.invalidate(rect);
    }

    /* renamed from: d */
    public final void mo37889d(View view, View view2) {
        Rect rect = new Rect();
        view2.getDrawingRect(rect);
        view.invalidate(rect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r12 != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37890e(int r11, boolean r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.f86189j
            if (r11 != r0) goto L_0x000d
            boolean r0 = r10.f86190k
            if (r12 == r0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            if (r11 > 0) goto L_0x0011
            goto L_0x00ac
        L_0x0011:
            com.google.android.libraries.r.c.b.m r0 = r10.f86182c
            android.util.LruCache r1 = r0.f86214d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.libraries.r.c.b.l r1 = (com.google.android.libraries.p2460r.p2469c.p2471b.C32108l) r1
            if (r1 != 0) goto L_0x002f
            com.google.android.libraries.r.c.b.l r1 = new com.google.android.libraries.r.c.b.l
            android.graphics.Canvas r3 = r0.f86211a
            android.graphics.Paint r4 = r0.f86213c
            r1.<init>(r11, r3, r4)
            android.util.LruCache r0 = r0.f86214d
            r0.put(r2, r1)
        L_0x002f:
            int r0 = r10.f86183d
            r2 = 2
            boolean r3 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r2, r0)
            r4 = 0
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x003d
            if (r12 == 0) goto L_0x0045
        L_0x003d:
            boolean r0 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r5, r0)
            if (r0 == 0) goto L_0x004d
            if (r12 == 0) goto L_0x004e
        L_0x0045:
            android.graphics.Bitmap r0 = r1.mo37906a(r4)
            r10.f86185f = r0
            r4 = r12
            goto L_0x0050
        L_0x004d:
            r4 = r12
        L_0x004e:
            r10.f86185f = r6
        L_0x0050:
            int r0 = r10.f86183d
            boolean r3 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r5, r0)
            r7 = 1
            if (r3 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x0066
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            boolean r0 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r2, r0)
            if (r0 == 0) goto L_0x006d
            if (r3 == 0) goto L_0x006d
        L_0x0066:
            android.graphics.Bitmap r0 = r1.mo37906a(r7)
            r10.f86186g = r0
            goto L_0x006f
        L_0x006d:
            r10.f86186g = r6
        L_0x006f:
            int r0 = r10.f86183d
            r3 = 9
            boolean r8 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r3, r0)
            r9 = 5
            if (r8 == 0) goto L_0x007e
            if (r4 == 0) goto L_0x0087
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = r4
        L_0x007f:
            boolean r0 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r9, r0)
            if (r0 == 0) goto L_0x008e
            if (r8 == 0) goto L_0x008e
        L_0x0087:
            android.graphics.Bitmap r0 = r1.mo37906a(r2)
            r10.f86187h = r0
            goto L_0x0090
        L_0x008e:
            r10.f86187h = r6
        L_0x0090:
            int r0 = r10.f86183d
            boolean r2 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r9, r0)
            if (r2 == 0) goto L_0x009b
            if (r4 == 0) goto L_0x00a3
            r4 = 1
        L_0x009b:
            boolean r0 = com.google.android.libraries.p2460r.p2469c.p2471b.C32110n.m59820d(r3, r0)
            if (r0 == 0) goto L_0x00aa
            if (r4 == 0) goto L_0x00aa
        L_0x00a3:
            android.graphics.Bitmap r0 = r1.mo37906a(r5)
            r10.f86188i = r0
            goto L_0x00ac
        L_0x00aa:
            r10.f86188i = r6
        L_0x00ac:
            r10.f86189j = r11
            r10.f86190k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.p2471b.C32098b.mo37890e(int, boolean):void");
    }
}
