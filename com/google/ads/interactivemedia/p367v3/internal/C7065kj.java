package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kj */
/* compiled from: PG */
public final class C7065kj {

    /* renamed from: a */
    private final aee f22619a = new aee(10);

    /* renamed from: a */
    public final C7243qz mo16125a(C7050jv jvVar, C7269ry ryVar) {
        C7243qz qzVar = null;
        int i = 0;
        while (true) {
            try {
                jvVar.mo16094g(this.f22619a.mo14555i(), 0, 10);
                this.f22619a.mo14554h(0);
                if (this.f22619a.mo14564r() != 4801587) {
                    break;
                }
                this.f22619a.mo14557k(3);
                int A = this.f22619a.mo14537A();
                int i2 = A + 10;
                if (qzVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f22619a.mo14555i(), 0, bArr, 0, 10);
                    jvVar.mo16094g(bArr, 10, A);
                    qzVar = new C7272sa(ryVar).mo16424c(bArr, i2);
                } else {
                    jvVar.mo16096i(A);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        jvVar.mo16097j();
        jvVar.mo16096i(i);
        return qzVar;
    }
}
