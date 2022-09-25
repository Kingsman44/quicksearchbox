package com.google.android.libraries.assistant.assistantactions.rendering.p641d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5841at;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import java.security.MessageDigest;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.d.c */
/* compiled from: PG */
public final class C11305c extends C5857f {

    /* renamed from: b */
    private final int f36744b;

    /* renamed from: c */
    private final int f36745c;

    /* renamed from: d */
    private final Paint f36746d;

    /* renamed from: e */
    private final Paint f36747e;

    public C11305c(int i, int i2) {
        Paint paint = new Paint(7);
        this.f36746d = paint;
        Paint paint2 = new Paint(paint);
        this.f36747e = paint2;
        this.f36744b = i;
        this.f36745c = i2;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    /* renamed from: d */
    private final String m26898d() {
        return String.format("%s.%s.borderWidth=%s,color=%s", new Object[]{"com.google.android.libraries.assistant.assistantactions.rendering.utils.CircleCropWithBorder", 1, Integer.valueOf(this.f36744b), Integer.valueOf(this.f36745c)});
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(m26898d().getBytes(f17613a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int min = Math.min(i, i2);
        int i3 = this.f36744b;
        float f = ((float) min) / 2.0f;
        float f2 = (float) i3;
        float f3 = (float) (i3 + (min - (i3 + i3)));
        RectF rectF = new RectF(f2, f2, f3, f3);
        int i4 = this.f36744b;
        int i5 = i4 + i4;
        Bitmap e = C5841at.m15103e(dVar, bitmap, i - i5, i2 - i5);
        if (Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.RGBA_F16;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap a = dVar.mo12113a(min, min, config);
        a.setHasAlpha(true);
        Canvas canvas = new Canvas(a);
        canvas.drawCircle(f, f, f, this.f36746d);
        canvas.drawBitmap(e, (Rect) null, rectF, this.f36747e);
        canvas.setBitmap((Bitmap) null);
        dVar.mo12116d(e);
        return a;
    }

    public final int hashCode() {
        return m26898d().hashCode();
    }
}
