package com.bumptech.glide.load.p299c.p302c;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.p291h.C5616c;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.c.c.c */
/* compiled from: PG */
public final class C5885c implements C5962u {

    /* renamed from: a */
    private final C5886d f17500a;

    public C5885c(C5886d dVar) {
        this.f17500a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        return C5886d.m15217a(ImageDecoder.createSource(C5616c.m14582c((InputStream) obj)), i, i2, sVar);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        C5886d dVar = this.f17500a;
        return C5886d.m15218b(C5954m.m15367d(dVar.f17501a, (InputStream) obj, dVar.f17502b));
    }
}
