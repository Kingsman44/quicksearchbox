package com.google.android.libraries.glide.p1823b;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5751ac;
import com.bumptech.glide.p291h.C5630q;
import java.security.MessageDigest;

/* renamed from: com.google.android.libraries.glide.b.a */
/* compiled from: PG */
public final class C22004a implements C5955n {

    /* renamed from: b */
    public final byte[] f60716b;

    /* renamed from: c */
    private final C5750ab f60717c;

    public C22004a(String str, byte[] bArr) {
        C5630q.m14605b(str);
        C5630q.m14607d(bArr, "Argument must not be null");
        C5630q.m14604a(bArr.length > 0, "Data must not be empty.");
        this.f60717c = new C5750ab(str, C5751ac.f17327a);
        this.f60716b = bArr;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(this.f60717c.mo12252e());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22004a) {
            return this.f60717c.equals(((C22004a) obj).f60717c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60717c.hashCode();
    }

    public final String toString() {
        return this.f60717c.mo12249b();
    }
}
