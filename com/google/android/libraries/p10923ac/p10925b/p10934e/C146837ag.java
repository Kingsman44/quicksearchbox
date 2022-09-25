package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146790c;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.e.ag */
/* compiled from: PG */
public final class C146837ag implements C146790c {

    /* renamed from: a */
    final Map f396405a;

    public C146837ag(Map map) {
        this.f396405a = map;
    }

    /* renamed from: a */
    public final boolean mo123634a(C64098p pVar, Account account) {
        C63979ap apVar;
        Map map = this.f396405a;
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        C63978ao a = C63978ao.m96329a(apVar.f173031d);
        if (a == null) {
            a = C63978ao.UNKNOWN;
        }
        C146852av avVar = (C146852av) map.get(a);
        if (avVar == null) {
            return false;
        }
        return avVar.mo123764c(pVar, account).f396417d;
    }
}
