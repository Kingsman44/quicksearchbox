package com.google.android.apps.gsa.shared.p7195y;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.y.q */
/* compiled from: PG */
final class C91225q extends C5857f {

    /* renamed from: b */
    private final Context f254636b;

    /* renamed from: c */
    private final float f254637c;

    /* renamed from: d */
    private final float f254638d;

    public C91225q(Context context, float f, float f2) {
        boolean z = false;
        if (f >= 0.0f && f <= 25.0f) {
            z = true;
        }
        C58838bb.m90869d(z, "Blur radius must be between 0 and 25!");
        context.getClass();
        this.f254636b = context;
        this.f254637c = f;
        this.f254638d = f2;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update("blurred".getBytes());
        messageDigest.update((byte) ((int) (this.f254637c * 10.0f)));
        messageDigest.update((byte) ((int) (this.f254638d * 10.0f)));
    }

    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * this.f254638d), Math.round(((float) bitmap.getHeight()) * this.f254638d), false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        RenderScript create = RenderScript.create(this.f254636b);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(this.f254637c);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C91225q)) {
            return false;
        }
        C91225q qVar = (C91225q) obj;
        if (!C58832aw.m90831a(Float.valueOf(this.f254637c), Float.valueOf(qVar.f254637c)) || !C58832aw.m90831a(Float.valueOf(this.f254638d), Float.valueOf(qVar.f254638d))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"com.google.android.apps.gsa.shared.imageloader.BlurTransformation", Float.valueOf(this.f254637c), Float.valueOf(this.f254638d)});
    }
}
