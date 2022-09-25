package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67540ak;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.l.i */
/* compiled from: PG */
final class C67823i implements C67540ak {

    /* renamed from: a */
    C67533ad f183914a;

    public C67823i(C67533ad adVar) {
        if (adVar.f183450a != null) {
            this.f183914a = adVar;
            return;
        }
        throw new GeneralSecurityException("Missing primary primitive.");
    }

    /* renamed from: a */
    public final InputStream mo59913a(InputStream inputStream, byte[] bArr) {
        return new C67821g(this.f183914a, inputStream, bArr);
    }

    /* renamed from: b */
    public final OutputStream mo59914b(OutputStream outputStream, byte[] bArr) {
        return ((C67540ak) this.f183914a.f183450a.f183443a).mo59914b(outputStream, bArr);
    }
}
