package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.common.i.z */
/* compiled from: PG */
final class C59301z extends C59270a {

    /* renamed from: a */
    private final MessageDigest f157432a;

    /* renamed from: b */
    private final int f157433b;

    /* renamed from: c */
    private boolean f157434c;

    public C59301z(MessageDigest messageDigest, int i) {
        this.f157432a = messageDigest;
        this.f157433b = i;
    }

    /* renamed from: k */
    private final void m92145k() {
        C58838bb.m90884s(!this.f157434c, "Cannot re-use a Hasher after calling hash() on it");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56740a(byte b) {
        m92145k();
        this.f157432a.update(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo56747h(byte[] bArr, int i) {
        m92145k();
        this.f157432a.update(bArr, 0, i);
    }

    /* renamed from: p */
    public final C59289n mo56758p() {
        m92145k();
        this.f157434c = true;
        if (this.f157433b == this.f157432a.getDigestLength()) {
            return C59289n.m92110g(this.f157432a.digest());
        }
        return C59289n.m92110g(Arrays.copyOf(this.f157432a.digest(), this.f157433b));
    }
}
