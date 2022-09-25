package com.bumptech.glide.load.p299c.p302c;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.c.b */
/* compiled from: PG */
public final class C5884b implements C5962u {

    /* renamed from: a */
    private final C5886d f17499a;

    public C5884b(C5886d dVar) {
        this.f17499a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        return C5886d.m15217a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, sVar);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return C5886d.m15218b(C5954m.m15366c(this.f17499a.f17501a, (ByteBuffer) obj));
    }
}
