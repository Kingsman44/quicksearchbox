package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5841at;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import com.google.common.p4575r.C60752i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.apps.gsa.shared.y.bj */
/* compiled from: PG */
public final class C91205bj extends C5857f {

    /* renamed from: b */
    private static final Paint f254593b = new Paint(6);

    /* renamed from: c */
    private final RectF f254594c;

    public C91205bj(RectF rectF) {
        this.f254594c = rectF;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(getClass().getName().getBytes());
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f254594c.left).putFloat(this.f254594c.top).putFloat(this.f254594c.right).putFloat(this.f254594c.bottom));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        RectF rectF = this.f254594c;
        Matrix matrix = new Matrix();
        if (!(i == 0 || i2 == 0 || width == 0 || height == 0)) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) width;
            float f4 = (float) height;
            if (f / f2 > f3 / f4) {
                float f5 = f / f3;
                float f6 = f4 * f5;
                float a = C60752i.m92727a((f2 * 0.5f) - (((rectF.top + rectF.bottom) / 2.0f) * f6), Math.min(f2 - f6, 0.0f), 0.0f);
                matrix.setScale(f5, f5);
                matrix.postTranslate(0.0f, a);
            } else {
                float f7 = f2 / f4;
                float f8 = f3 * f7;
                float a2 = C60752i.m92727a((f * 0.5f) - (((rectF.left + rectF.right) / 2.0f) * f8), Math.min(f - f8, 0.0f), 0.0f);
                matrix.setScale(f7, f7);
                matrix.postTranslate(a2, 0.0f);
            }
        }
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap a3 = dVar.mo12113a(i, i2, config);
        C5841at.m15107i(bitmap, a3);
        Canvas canvas = new Canvas(a3);
        canvas.drawBitmap(bitmap, matrix, f254593b);
        canvas.setBitmap((Bitmap) null);
        return a3;
    }
}
