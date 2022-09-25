package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67552d;
import com.google.p5238v.p5239a.C67909y;
import com.google.p5238v.p5239a.p5250f.C67604k;
import com.google.p5238v.p5239a.p5250f.C67606m;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.v.a.g.n */
/* compiled from: PG */
final class C67635n implements C67909y {

    /* renamed from: a */
    private final C67533ad f183581a;

    public C67635n(C67533ad adVar) {
        this.f183581a = adVar;
        if (adVar.mo59911c()) {
            C67606m.f183543a.mo59941a();
            C67604k.m97773a(adVar);
        }
    }

    /* renamed from: a */
    public final void mo59961a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C67531ab abVar : this.f183581a.mo59910b(copyOf)) {
                if (abVar.f183444b.equals(C67742dr.LEGACY)) {
                    bArr3 = C67886p.m98135c(bArr2, C67636o.f183583b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((C67909y) abVar.f183443a).mo59961a(copyOfRange, bArr3);
                    int i = abVar.f183445c;
                    return;
                } catch (GeneralSecurityException e) {
                    C67636o.f183582a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (C67531ab abVar2 : this.f183581a.mo59910b(C67552d.f183465a)) {
                try {
                    ((C67909y) abVar2.f183443a).mo59961a(bArr, bArr2);
                    int i2 = abVar2.f183445c;
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    /* renamed from: b */
    public final byte[] mo59962b(byte[] bArr) {
        if (this.f183581a.f183450a.f183444b.equals(C67742dr.LEGACY)) {
            bArr = C67886p.m98135c(bArr, C67636o.f183583b);
        }
        try {
            byte[] c = C67886p.m98135c(this.f183581a.f183450a.mo59904a(), ((C67909y) this.f183581a.f183450a.f183443a).mo59962b(bArr));
            int i = this.f183581a.f183450a.f183445c;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
