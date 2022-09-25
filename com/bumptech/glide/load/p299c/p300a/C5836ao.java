package com.bumptech.glide.load.p299c.p300a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p302c.C5891i;

/* renamed from: com.bumptech.glide.load.c.a.ao */
/* compiled from: PG */
public final class C5836ao implements C5962u {

    /* renamed from: a */
    private final C5891i f17432a;

    /* renamed from: b */
    private final C5642d f17433b;

    public C5836ao(C5891i iVar, C5642d dVar) {
        this.f17432a = iVar;
        this.f17433b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        C5679av c = this.f17432a.mo12340c((Uri) obj, sVar);
        if (c == null) {
            return null;
        }
        return C5822aa.m15049a(this.f17433b, (Drawable) c.mo12160c(), i, i2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
