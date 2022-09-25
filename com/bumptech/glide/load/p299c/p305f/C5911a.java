package com.bumptech.glide.load.p299c.p305f;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p301b.C5881c;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.c.f.a */
/* compiled from: PG */
public final class C5911a implements C5915e {

    /* renamed from: a */
    private final Bitmap.CompressFormat f17555a = Bitmap.CompressFormat.JPEG;

    /* renamed from: a */
    public final C5679av mo12371a(C5679av avVar, C5960s sVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) avVar.mo12160c()).compress(this.f17555a, 100, byteArrayOutputStream);
        avVar.mo12162e();
        return new C5881c(byteArrayOutputStream.toByteArray());
    }
}
