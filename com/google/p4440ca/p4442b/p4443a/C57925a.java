package com.google.p4440ca.p4442b.p4443a;

/* renamed from: com.google.ca.b.a.a */
/* compiled from: PG */
public final class C57925a {

    /* renamed from: a */
    public int f154934a;

    /* renamed from: b */
    public int f154935b;

    public C57925a(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b == 3) {
            this.f154934a = 3;
        } else if (b == 4) {
            this.f154934a = 4;
        } else {
            throw new IllegalArgumentException("The address type is illegal. Value:" + b);
        }
        if (b2 == 2) {
            this.f154935b = 2;
        } else if (b2 == 3) {
            this.f154935b = 3;
        } else if (b2 == 4) {
            this.f154935b = 4;
        } else {
            throw new IllegalArgumentException("The score type is illegal. Value:" + b2);
        }
    }
}
