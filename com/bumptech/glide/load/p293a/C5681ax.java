package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5627n;
import com.bumptech.glide.p291h.C5632s;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.a.ax */
/* compiled from: PG */
final class C5681ax implements C5955n {

    /* renamed from: b */
    private static final C5627n f17139b = new C5627n(50);

    /* renamed from: c */
    private final C5640b f17140c;

    /* renamed from: d */
    private final C5955n f17141d;

    /* renamed from: e */
    private final C5955n f17142e;

    /* renamed from: f */
    private final int f17143f;

    /* renamed from: g */
    private final int f17144g;

    /* renamed from: h */
    private final Class f17145h;

    /* renamed from: i */
    private final C5960s f17146i;

    /* renamed from: j */
    private final C5964w f17147j;

    public C5681ax(C5640b bVar, C5955n nVar, C5955n nVar2, int i, int i2, C5964w wVar, Class cls, C5960s sVar) {
        this.f17140c = bVar;
        this.f17141d = nVar;
        this.f17142e = nVar2;
        this.f17143f = i;
        this.f17144g = i2;
        this.f17147j = wVar;
        this.f17145h = cls;
        this.f17146i = sVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f17140c.mo12109e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f17143f).putInt(this.f17144g).array();
        this.f17142e.mo12041a(messageDigest);
        this.f17141d.mo12041a(messageDigest);
        messageDigest.update(bArr);
        C5964w wVar = this.f17147j;
        if (wVar != null) {
            wVar.mo12041a(messageDigest);
        }
        this.f17146i.mo12041a(messageDigest);
        C5627n nVar = f17139b;
        byte[] bArr2 = (byte[]) nVar.mo12078f(this.f17145h);
        if (bArr2 == null) {
            bArr2 = this.f17145h.getName().getBytes(f17613a);
            nVar.mo12079g(this.f17145h, bArr2);
        }
        messageDigest.update(bArr2);
        this.f17140c.mo12107c(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5681ax) {
            C5681ax axVar = (C5681ax) obj;
            if (this.f17144g != axVar.f17144g || this.f17143f != axVar.f17143f || !C5632s.m14619l(this.f17147j, axVar.f17147j) || !this.f17145h.equals(axVar.f17145h) || !this.f17141d.equals(axVar.f17141d) || !this.f17142e.equals(axVar.f17142e) || !this.f17146i.equals(axVar.f17146i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f17141d.hashCode() * 31) + this.f17142e.hashCode()) * 31) + this.f17143f) * 31) + this.f17144g;
        C5964w wVar = this.f17147j;
        if (wVar != null) {
            hashCode = (hashCode * 31) + wVar.hashCode();
        }
        return (((hashCode * 31) + this.f17145h.hashCode()) * 31) + this.f17146i.f17620b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17141d);
        String valueOf2 = String.valueOf(this.f17142e);
        int i = this.f17143f;
        int i2 = this.f17144g;
        String valueOf3 = String.valueOf(this.f17145h);
        String valueOf4 = String.valueOf(this.f17147j);
        String valueOf5 = String.valueOf(this.f17146i);
        return "ResourceCacheKey{sourceKey=" + valueOf + ", signature=" + valueOf2 + ", width=" + i + ", height=" + i2 + ", decodedResourceClass=" + valueOf3 + ", transformation='" + valueOf4 + "', options=" + valueOf5 + "}";
    }
}
