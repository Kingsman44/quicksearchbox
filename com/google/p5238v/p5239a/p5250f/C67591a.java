package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.C67640i;
import com.google.p5238v.p5239a.p5251g.C67621a;
import com.google.p5238v.p5239a.p5251g.C67626e;
import com.google.p5238v.p5239a.p5251g.C67627f;
import com.google.p5238v.p5239a.p5255j.C67670b;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.p5238v.p5239a.p5255j.C67766f;
import com.google.p5238v.p5239a.p5260n.C67898a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.v.a.f.a */
/* compiled from: PG */
public final class C67591a extends C67595b {
    public C67591a(C67898a aVar, Class cls) {
        super(aVar, cls);
    }

    /* renamed from: a */
    public final C67640i mo59936a(C67616w wVar) {
        C67626e eVar;
        if (((C67614u) wVar).f183552a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C67670b bVar = (C67670b) C62942bv.parseFrom((C62942bv) C67670b.f183635d, ((C67614u) wVar).f183554c, C62921ba.f169869a);
                if (bVar.f183637a == 0) {
                    int d = bVar.f183638b.mo59031d();
                    if (d != 16) {
                        if (d != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(d * 8)}));
                        }
                    }
                    Integer valueOf = Integer.valueOf(d);
                    C67766f fVar = bVar.f183639c;
                    if (fVar == null) {
                        fVar = C67766f.f183855b;
                    }
                    int i = fVar.f183857a;
                    if (i < 10 || i > 16) {
                        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
                    }
                    Integer valueOf2 = Integer.valueOf(i);
                    C67742dr drVar = ((C67614u) wVar).f183556e;
                    C67742dr drVar2 = C67742dr.UNKNOWN_PREFIX;
                    int ordinal = drVar.ordinal();
                    if (ordinal == 1) {
                        eVar = C67626e.f183568a;
                    } else if (ordinal == 2) {
                        eVar = C67626e.f183570c;
                    } else if (ordinal == 3) {
                        eVar = C67626e.f183571d;
                    } else if (ordinal == 4) {
                        eVar = C67626e.f183569b;
                    } else {
                        int number = drVar.getNumber();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + number);
                    }
                    C67627f fVar2 = new C67627f(valueOf.intValue(), valueOf2.intValue(), eVar);
                    C67898a a = C67898a.m98152a(bVar.f183638b.mo59174N());
                    Integer num = ((C67614u) wVar).f183557f;
                    if (fVar2.f183573a == a.f184076a.length) {
                        if (fVar2.mo59957b()) {
                            if (num == null) {
                                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                            }
                        }
                        if (!fVar2.mo59957b()) {
                            if (num != null) {
                                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                            }
                        }
                        return new C67621a(fVar2, num);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (C62974ct | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
