package com.google.android.libraries.geller.p1817e;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.geller.e.a */
/* compiled from: PG */
final class C21776a extends C21777b {

    /* renamed from: a */
    private final byte[] f60085a;

    public C21776a(byte[] bArr) {
        if (bArr != null) {
            this.f60085a = bArr;
            return;
        }
        throw new NullPointerException("Null keyMaterial");
    }

    /* renamed from: a */
    public final int mo27108a() {
        return -1;
    }

    /* renamed from: b */
    public final byte[] mo27109b() {
        return this.f60085a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21777b) {
            C21777b bVar = (C21777b) obj;
            if (bVar.mo27108a() == -1) {
                if (Arrays.equals(this.f60085a, bVar instanceof C21776a ? ((C21776a) bVar).f60085a : bVar.mo27109b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f60085a) ^ 720379956;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f60085a);
        return "EncryptionKey{keyVersion=-1, keyMaterial=" + arrays + "}";
    }
}
