package com.bumptech.glide.p290g;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5630q;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.g.e */
/* compiled from: PG */
public final class C5602e implements C5955n {

    /* renamed from: b */
    private final Object f16940b;

    public C5602e(Object obj) {
        C5630q.m14607d(obj, "Argument must not be null");
        this.f16940b = obj;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(this.f16940b.toString().getBytes(f17613a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5602e) {
            return this.f16940b.equals(((C5602e) obj).f16940b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16940b.hashCode();
    }

    public final String toString() {
        String obj = this.f16940b.toString();
        return "ObjectKey{object=" + obj + "}";
    }
}
