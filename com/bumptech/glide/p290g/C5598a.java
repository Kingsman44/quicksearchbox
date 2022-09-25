package com.bumptech.glide.p290g;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5632s;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.g.a */
/* compiled from: PG */
public final class C5598a implements C5955n {

    /* renamed from: b */
    public static final /* synthetic */ int f16933b = 0;

    /* renamed from: c */
    private final int f16934c;

    /* renamed from: d */
    private final C5955n f16935d;

    public C5598a(int i, C5955n nVar) {
        this.f16934c = i;
        this.f16935d = nVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        this.f16935d.mo12041a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f16934c).array());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5598a) {
            C5598a aVar = (C5598a) obj;
            if (this.f16934c != aVar.f16934c || !this.f16935d.equals(aVar.f16935d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C5632s.m14612e(this.f16935d, this.f16934c);
    }
}
