package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146906bi;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146947cw;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.u */
/* compiled from: PG */
public final /* synthetic */ class C147295u implements C147179m {

    /* renamed from: a */
    public final /* synthetic */ C147299y f397576a;

    /* renamed from: b */
    public final /* synthetic */ Account f397577b;

    /* renamed from: c */
    public final /* synthetic */ C64098p f397578c;

    public /* synthetic */ C147295u(C147299y yVar, Account account, C64098p pVar) {
        this.f397576a = yVar;
        this.f397577b = account;
        this.f397578c = pVar;
    }

    /* renamed from: a */
    public final Object mo124004a() {
        C63979ap apVar;
        C63979ap apVar2;
        C147299y yVar = this.f397576a;
        Account account = this.f397577b;
        C64098p pVar = this.f397578c;
        C146906bi biVar = yVar.f397582a;
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        int i = apVar.f173029b;
        if (pVar.f173294a == 2) {
            apVar2 = (C63979ap) pVar.f173295b;
        } else {
            apVar2 = C63979ap.f173026e;
        }
        return new C146947cw(biVar.mo123794a(account, i, apVar2.f173030c));
    }
}
