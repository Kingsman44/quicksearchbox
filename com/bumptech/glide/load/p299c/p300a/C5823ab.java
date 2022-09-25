package com.bumptech.glide.load.p299c.p300a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.c.a.ab */
/* compiled from: PG */
public final class C5823ab implements C5964w {

    /* renamed from: b */
    private final C5964w f17405b;

    /* renamed from: c */
    private final boolean f17406c;

    public C5823ab(C5964w wVar, boolean z) {
        this.f17405b = wVar;
        this.f17406c = z;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        this.f17405b.mo12041a(messageDigest);
    }

    /* renamed from: b */
    public final C5679av mo12295b(Context context, C5679av avVar, int i, int i2) {
        C5642d dVar = C5543d.m14321a(context).f16788a;
        Drawable drawable = (Drawable) avVar.mo12160c();
        C5679av a = C5822aa.m15049a(dVar, drawable, i, i2);
        if (a != null) {
            C5679av b = this.f17405b.mo12295b(context, a, i, i2);
            if (!b.equals(a)) {
                return C5832ak.m15079f(context.getResources(), b);
            }
            b.mo12162e();
            return avVar;
        } else if (!this.f17406c) {
            return avVar;
        } else {
            String valueOf = String.valueOf(drawable);
            throw new IllegalArgumentException("Unable to convert " + valueOf + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5823ab) {
            return this.f17405b.equals(((C5823ab) obj).f17405b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17405b.hashCode();
    }
}
