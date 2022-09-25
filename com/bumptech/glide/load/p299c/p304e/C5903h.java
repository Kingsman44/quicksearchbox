package com.bumptech.glide.load.p299c.p304e;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p300a.C5856e;
import com.bumptech.glide.p291h.C5630q;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.e.h */
/* compiled from: PG */
public final class C5903h implements C5964w {

    /* renamed from: b */
    private final C5964w f17527b;

    public C5903h(C5964w wVar) {
        C5630q.m14607d(wVar, "Argument must not be null");
        this.f17527b = wVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        this.f17527b.mo12041a(messageDigest);
    }

    /* renamed from: b */
    public final C5679av mo12295b(Context context, C5679av avVar, int i, int i2) {
        C5900e eVar = (C5900e) avVar.mo12160c();
        C5856e eVar2 = new C5856e(eVar.mo12350a(), C5543d.m14321a(context).f16788a);
        C5679av b = this.f17527b.mo12295b(context, eVar2, i, i2);
        if (!eVar2.equals(b)) {
            eVar2.mo12162e();
        }
        C5964w wVar = this.f17527b;
        eVar.f17517a.f17516a.mo12370e(wVar, (Bitmap) b.mo12160c());
        return avVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5903h) {
            return this.f17527b.equals(((C5903h) obj).f17527b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17527b.hashCode();
    }
}
