package com.bumptech.glide.p290g;

import com.bumptech.glide.load.C5955n;
import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.g.d */
/* compiled from: PG */
public final class C5601d implements C5955n {

    /* renamed from: b */
    private final String f16938b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private final long f16939c;

    public C5601d(long j) {
        this.f16939c = j;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f16939c).putInt(0).array());
        messageDigest.update(this.f16938b.getBytes(f17613a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5601d dVar = (C5601d) obj;
        return this.f16939c == dVar.f16939c && this.f16938b.equals(dVar.f16938b);
    }

    public final int hashCode() {
        int hashCode = this.f16938b.hashCode();
        long j = this.f16939c;
        return ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
    }
}
