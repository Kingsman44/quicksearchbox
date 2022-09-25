package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67620g;
import com.google.p5238v.p5239a.p5250f.C67604k;
import com.google.p5238v.p5239a.p5250f.C67606m;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.i */
/* compiled from: PG */
final class C67579i implements C67620g {

    /* renamed from: a */
    final C67533ad f183501a;

    public C67579i(C67533ad adVar) {
        this.f183501a = adVar;
        if (adVar.mo59911c()) {
            C67606m.f183543a.mo59941a();
            C67604k.m97773a(adVar);
        }
    }

    /* renamed from: a */
    public final byte[] mo59927a(byte[] bArr, byte[] bArr2) {
        C67531ab abVar = this.f183501a.f183450a;
        if (abVar != null) {
            try {
                byte[] c = C67886p.m98135c(abVar.mo59904a(), ((C67620g) this.f183501a.f183450a.f183443a).mo59927a(bArr, bArr2));
                int i = this.f183501a.f183450a.f183445c;
                int length = bArr.length;
                return c;
            } catch (GeneralSecurityException e) {
                throw e;
            }
        } else {
            throw new GeneralSecurityException("keyset without primary key");
        }
    }
}
