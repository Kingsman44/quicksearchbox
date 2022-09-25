package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.z */
/* compiled from: PG */
final class C132366z extends C5857f {

    /* renamed from: b */
    private final int f361323b;

    public C132366z(int i) {
        this.f361323b = i;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(Integer.toString(this.f361323b).getBytes(Charset.forName("UTF-8")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        for (int i3 = 0; i3 < bitmap.getWidth(); i3++) {
            for (int i4 = 0; i4 < bitmap.getHeight(); i4++) {
                int pixel = bitmap.getPixel(i3, i4);
                if (Color.alpha(pixel) > 0) {
                    bitmap.setPixel(i3, i4, Color.argb(Color.alpha(pixel), Color.red(this.f361323b), Color.green(this.f361323b), Color.blue(this.f361323b)));
                }
            }
        }
        return bitmap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C132366z) && ((C132366z) obj).f361323b == this.f361323b;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f361323b).hashCode();
    }
}
