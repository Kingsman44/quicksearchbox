package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.C5593j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.h */
/* compiled from: PG */
public final class C42031h {

    /* renamed from: a */
    public final Context f109809a;

    /* renamed from: b */
    public int f109810b;

    /* renamed from: c */
    public int f109811c;

    /* renamed from: d */
    public final Paint f109812d = new Paint(1);

    /* renamed from: e */
    public C5593j f109813e;

    /* renamed from: f */
    public int f109814f;

    /* renamed from: g */
    public Bitmap f109815g;

    /* renamed from: h */
    public C5592i f109816h;

    /* renamed from: i */
    public final Paint[] f109817i = {new Paint(1), new Paint(1), new Paint(1), new Paint(1)};

    /* renamed from: j */
    public final Bitmap[] f109818j = new Bitmap[4];

    /* renamed from: k */
    public final List f109819k = new ArrayList(4);

    /* renamed from: l */
    public C42028e f109820l;

    public C42031h(Context context) {
        this.f109809a = context;
    }

    /* renamed from: a */
    public final Matrix mo44514a(float f, float f2, float f3, float f4, int i) {
        float f5 = f / f2;
        float f6 = f3 / f4;
        float f7 = f6 <= f5 ? f3 : f4 * f5;
        float f8 = f6 >= f5 ? f4 : f3 / f5;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-((f3 - f7) / 2.0f), -((f4 - f8) / 2.0f));
        matrix.postScale(f / f7, f2 / f8);
        C42028e eVar = this.f109820l;
        if (eVar != null) {
            if (i == 1) {
                matrix.postTranslate(f, 0.0f);
            } else if (i == 2) {
                if (eVar.f109803a.f109761b.size() != 3) {
                    f = 0.0f;
                }
                matrix.postTranslate(f, f2);
            } else if (i == 3) {
                matrix.postTranslate(f, f2);
            }
        }
        return matrix;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.libraries.glide.fife.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44515b(com.google.android.libraries.social.peoplekit.common.dataservice.Channel r15, int r16, int r17, int r18, com.google.android.libraries.social.peoplekit.configs.C42141b r19) {
        /*
            r14 = this;
            r7 = r14
            r5 = r16
            r6 = r17
            r8 = r18
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            com.google.common.base.C58838bb.m90868c(r2)
            if (r6 <= 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            com.google.common.base.C58838bb.m90868c(r2)
            r9 = 4
            if (r8 >= r9) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            com.google.common.base.C58838bb.m90868c(r2)
            java.lang.String r10 = r15.mo44638s()
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x00bc
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r5, r6, r2)
            android.content.Context r3 = r7.f109809a
            r4 = r15
            java.lang.String r9 = r15.mo44631l(r3)
            r10 = r19
            int r3 = com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42025b.m73580b(r3, r9, r10)
            r2.eraseColor(r3)
            java.lang.String r3 = r15.mo44634o()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00b4
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r2)
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>(r0)
            android.content.Context r0 = r7.f109809a
            r10 = 2131103781(0x7f061025, float:1.7820038E38)
            int r0 = androidx.core.content.C1878d.m5128a(r0, r10)
            r9.setColor(r0)
            android.content.Context r0 = r7.f109809a
            float r0 = com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42025b.m73579a(r0, r3, r5)
            double r10 = (double) r0
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            float r0 = (float) r10
            r9.setTextSize(r0)
            java.lang.String r0 = "google-sans"
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r9.setTypeface(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r10 = r3.length()
            r9.getTextBounds(r3, r1, r10, r0)
            int r1 = r2.getWidth()
            int r10 = r0.width()
            int r11 = r2.getHeight()
            int r0 = r0.height()
            android.content.Context r12 = r7.f109809a
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r1 = r1 - r10
            int r1 = r1 / 6
            float r1 = (float) r1
            float r1 = r1 * r12
            int r11 = r11 + r0
            int r11 = r11 / 5
            float r0 = (float) r11
            float r0 = r0 * r12
            r4.drawText(r3, r1, r0, r9)
        L_0x00b4:
            android.graphics.Bitmap[] r0 = r7.f109818j
            r0[r8] = r2
            r14.mo44516c(r5, r6, r8)
            return
        L_0x00bc:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.f r11 = new com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.f
            r0 = r11
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.List r0 = r7.f109819k
            int r0 = r0.size()
            int r0 = r0 + -1
            if (r8 <= r0) goto L_0x00dd
            java.util.List r0 = r7.f109819k
            r0.add(r11)
            goto L_0x00e2
        L_0x00dd:
            java.util.List r0 = r7.f109819k
            r0.set(r8, r11)
        L_0x00e2:
            boolean r0 = com.google.android.libraries.social.p3267c.p3268a.C41921c.m73452a(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0101
            com.google.android.libraries.glide.fife.g r0 = new com.google.android.libraries.glide.fife.g
            r0.<init>()
            r0.mo27321b(r9)
            r2 = 16
            r0.mo27321b(r2)
            r2 = 32
            r0.mo27321b(r2)
            com.google.android.libraries.glide.fife.b r2 = new com.google.android.libraries.glide.fife.b
            r2.<init>(r10, r0)
            goto L_0x0102
        L_0x0101:
            r2 = r1
        L_0x0102:
            android.content.Context r0 = r7.f109809a
            com.bumptech.glide.manager.r r3 = com.bumptech.glide.C5543d.m14323c(r0)
            com.bumptech.glide.ad r0 = r3.mo12423b(r0)
            com.bumptech.glide.z r0 = r0.mo11864b()
            com.bumptech.glide.f.j r3 = r7.f109813e
            com.bumptech.glide.z r0 = r0.mo11982o(r3)
            if (r2 != 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r10 = r2
        L_0x011a:
            com.bumptech.glide.z r0 = r0.mo12447i(r10)
            com.bumptech.glide.f.i r2 = r7.f109816h
            com.bumptech.glide.z r0 = r0.mo12442d(r2)
            java.util.concurrent.Executor r2 = com.bumptech.glide.p291h.C5622i.f16959a
            r0.mo12455s(r11, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42031h.mo44515b(com.google.android.libraries.social.peoplekit.common.dataservice.Channel, int, int, int, com.google.android.libraries.social.peoplekit.configs.b):void");
    }

    /* renamed from: c */
    public final void mo44516c(int i, int i2, int i3) {
        Bitmap bitmap = this.f109818j[i3];
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        bitmapShader.setLocalMatrix(mo44514a((float) i, (float) i2, (float) bitmap.getWidth(), (float) bitmap.getHeight(), i3));
        this.f109817i[i3].setShader(bitmapShader);
        C42028e eVar = this.f109820l;
        if (eVar != null) {
            eVar.f109803a.invalidate();
        }
    }
}
