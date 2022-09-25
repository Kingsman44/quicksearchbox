package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.C67552d;
import com.google.p5238v.p5239a.p5250f.C67604k;
import com.google.p5238v.p5239a.p5250f.C67606m;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.v.a.k.m */
/* compiled from: PG */
final class C67801m implements C67537ah {

    /* renamed from: a */
    private final C67533ad f183904a;

    public C67801m(C67533ad adVar) {
        this.f183904a = adVar;
        if (adVar.mo59911c()) {
            C67606m.f183543a.mo59941a();
            C67604k.m97773a(adVar);
        }
    }

    /* renamed from: a */
    public final void mo59912a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C67531ab abVar : this.f183904a.mo59910b(copyOf)) {
                if (abVar.f183444b.equals(C67742dr.LEGACY)) {
                    bArr3 = C67886p.m98135c(bArr2, C67802n.f183906b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((C67537ah) abVar.f183443a).mo59912a(copyOfRange, bArr3);
                    int i = abVar.f183445c;
                    int length2 = bArr3.length;
                    return;
                } catch (GeneralSecurityException e) {
                    C67802n.f183905a.logp(Level.INFO, "com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify", "verify", "signature prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (C67531ab abVar2 : this.f183904a.mo59910b(C67552d.f183465a)) {
                try {
                    ((C67537ah) abVar2.f183443a).mo59912a(bArr, bArr2);
                    int i2 = abVar2.f183445c;
                    int length3 = bArr2.length;
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid signature");
        }
        throw new GeneralSecurityException("signature too short");
    }
}
