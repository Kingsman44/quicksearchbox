package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.y.bh */
/* compiled from: PG */
final class C91203bh extends C5857f {

    /* renamed from: b */
    private static final int f254586b = Color.parseColor("#66202124");

    /* renamed from: c */
    private final float f254587c;

    /* renamed from: d */
    private final float f254588d;

    /* renamed from: e */
    private final float f254589e;

    /* renamed from: f */
    private final float f254590f;

    /* renamed from: g */
    private final Paint f254591g;

    public C91203bh(RectF rectF) {
        float f = rectF.left;
        this.f254587c = f;
        float f2 = rectF.top;
        this.f254588d = f2;
        float f3 = rectF.right;
        this.f254589e = f3;
        float f4 = rectF.bottom;
        this.f254590f = f4;
        boolean z = true;
        C58838bb.m90869d(f >= 0.0f && f <= 1.0f, "Coordinates must be between 0 and 1");
        C58838bb.m90869d(f2 >= 0.0f && f2 <= 1.0f, "Coordinates must be between 0 and 1");
        C58838bb.m90869d(f3 >= 0.0f && f3 <= 1.0f, "Coordinates must be between 0 and 1");
        C58838bb.m90869d((f4 < 0.0f || f4 > 1.0f) ? false : z, "Coordinates must be between 0 and 1");
        Paint paint = new Paint();
        this.f254591g = paint;
        paint.setColor(f254586b);
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        ByteBuffer allocate = ByteBuffer.allocate(36);
        allocate.putFloat(this.f254587c);
        allocate.putFloat(this.f254588d);
        allocate.putFloat(this.f254589e);
        allocate.putFloat(this.f254590f);
        messageDigest.update("com.google.android.apps.gsa.shared.imageloader.RectangleHighlightTransformation".getBytes());
        messageDigest.update(allocate.array());
    }

    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap a = dVar.mo12113a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(a);
        float f = this.f254587c;
        int width = canvas.getWidth();
        float f2 = this.f254589e;
        int width2 = canvas.getWidth();
        float height = this.f254588d * ((float) canvas.getHeight());
        float height2 = this.f254590f * ((float) canvas.getHeight());
        RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), height);
        RectF rectF2 = new RectF(0.0f, height2, (float) canvas.getWidth(), (float) canvas.getHeight());
        RectF rectF3 = new RectF(0.0f, height, f * ((float) width), height2);
        RectF rectF4 = new RectF(f2 * ((float) width2), height, (float) canvas.getWidth(), height2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(rectF3, this.f254591g);
        canvas.drawRect(rectF, this.f254591g);
        canvas.drawRect(rectF4, this.f254591g);
        canvas.drawRect(rectF2, this.f254591g);
        canvas.setBitmap((Bitmap) null);
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C91203bh) {
            C91203bh bhVar = (C91203bh) obj;
            if (this.f254587c == bhVar.f254587c && this.f254588d == bhVar.f254588d && this.f254589e == bhVar.f254589e && this.f254590f == bhVar.f254590f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f254587c), Float.valueOf(this.f254588d), Float.valueOf(this.f254589e), Float.valueOf(this.f254590f)});
    }
}
