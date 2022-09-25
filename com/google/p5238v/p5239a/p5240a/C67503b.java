package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67552d;
import com.google.p5238v.p5239a.p5250f.C67604k;
import com.google.p5238v.p5239a.p5250f.C67606m;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.v.a.a.b */
/* compiled from: PG */
final class C67503b implements C67486a {

    /* renamed from: a */
    private final C67533ad f183432a;

    public C67503b(C67533ad adVar) {
        this.f183432a = adVar;
        if (adVar.mo59911c()) {
            C67606m.f183543a.mo59941a();
            C67604k.m97773a(adVar);
        }
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C67531ab abVar : this.f183432a.mo59910b(copyOf)) {
                try {
                    byte[] a = ((C67486a) abVar.f183443a).mo59877a(copyOfRange, bArr2);
                    int i = abVar.f183445c;
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C67506c.f183435a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (C67531ab abVar2 : this.f183432a.mo59910b(C67552d.f183465a)) {
            try {
                byte[] a2 = ((C67486a) abVar2.f183443a).mo59877a(bArr, bArr2);
                int i2 = abVar2.f183445c;
                int length3 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        try {
            byte[] c = C67886p.m98135c(this.f183432a.f183450a.mo59904a(), ((C67486a) this.f183432a.f183450a.f183443a).mo59878b(bArr, bArr2));
            int i = this.f183432a.f183450a.f183445c;
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
