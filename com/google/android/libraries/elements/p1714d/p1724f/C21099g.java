package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62903ak;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.libraries.elements.d.f.g */
/* compiled from: PG */
public final class C21099g {

    /* renamed from: b */
    private static final C21099g f59136b = new C21099g(C21258ba.f59581a);

    /* renamed from: a */
    public final byte[] f59137a;

    public C21099g(byte[] bArr) {
        this.f59137a = bArr;
    }

    /* renamed from: a */
    public static C21099g m39633a(C21279bv bvVar) {
        try {
            C62897ae N = C62897ae.m95111N(bvVar.f59593c.duplicate());
            if (N.mo58661D()) {
                return f59136b;
            }
            N.mo58678m();
            return new C21099g(N.mo58664G());
        } catch (IOException e) {
            throw new C21260bc("Error reading extension from model", e);
        }
    }

    /* renamed from: b */
    public final C21279bv mo26153b(int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C62903ak akVar = new C62903ak(byteArrayOutputStream, 4096);
            byte[] bArr = this.f59137a;
            akVar.mo58785B(i, bArr, bArr.length);
            akVar.mo58759X();
            return C21279bv.m40118b(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new C21260bc("Error adding extension to model", e);
        }
    }
}
