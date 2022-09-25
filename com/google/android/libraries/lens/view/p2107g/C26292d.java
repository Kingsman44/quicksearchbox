package com.google.android.libraries.lens.view.p2107g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p300a.C5856e;
import com.google.android.libraries.lens.view.utils.C28132u;
import java.security.MessageDigest;

/* renamed from: com.google.android.libraries.lens.view.g.d */
/* compiled from: PG */
final class C26292d implements C5964w {
    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(C26293e.class.getName().getBytes(f17613a));
    }

    /* renamed from: b */
    public final C5679av mo12295b(Context context, C5679av avVar, int i, int i2) {
        C5856e f = C5856e.m15133f(C28132u.m52414a(context, (Bitmap) avVar.mo12160c(), false), C5543d.m14321a(context).f16788a);
        return f == null ? avVar : f;
    }
}
