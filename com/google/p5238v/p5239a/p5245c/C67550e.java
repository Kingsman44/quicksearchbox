package com.google.p5238v.p5239a.p5245c;

import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67583e;
import com.google.p5238v.p5239a.p5250f.C67604k;
import com.google.p5238v.p5239a.p5250f.C67606m;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.c.e */
/* compiled from: PG */
final class C67550e implements C67583e {

    /* renamed from: a */
    private final C67533ad f183464a;

    public C67550e(C67533ad adVar) {
        this.f183464a = adVar;
        if (adVar.mo59911c()) {
            C67606m.f183543a.mo59941a();
            C67604k.m97773a(adVar);
        }
    }

    /* renamed from: a */
    public final byte[] mo59916a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] c = C67886p.m98135c(this.f183464a.f183450a.mo59904a(), ((C67583e) this.f183464a.f183450a.f183443a).mo59916a(bArr, bArr2));
            int i = this.f183464a.f183450a.f183445c;
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
