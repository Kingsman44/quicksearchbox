package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.y.bi */
/* compiled from: PG */
public final class C91204bi extends C5857f {

    /* renamed from: b */
    private final int f254592b;

    public C91204bi(int i) {
        this.f254592b = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update("removedTransparency".getBytes());
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f254592b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getConfig() == Bitmap.Config.RGB_565) {
            return bitmap;
        }
        Canvas canvas = new Canvas(dVar.mo12113a(i, i2, bitmap.getConfig()));
        canvas.drawColor(this.f254592b);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i2), (Paint) null);
        return bitmap;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C91204bi) && this.f254592b == ((C91204bi) obj).f254592b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"com.google.android.apps.gsa.shared.imageloader.RemoveTransparencyTransform", Integer.valueOf(this.f254592b)});
    }
}
