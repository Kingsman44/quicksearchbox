package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146855ay;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146913bp;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C147283i implements C147179m {

    /* renamed from: a */
    public final /* synthetic */ C147287m f397539a;

    /* renamed from: b */
    public final /* synthetic */ Account f397540b;

    /* renamed from: c */
    public final /* synthetic */ C64098p f397541c;

    public /* synthetic */ C147283i(C147287m mVar, Account account, C64098p pVar) {
        this.f397539a = mVar;
        this.f397540b = account;
        this.f397541c = pVar;
    }

    /* renamed from: a */
    public final Object mo124004a() {
        C63979ap apVar;
        C63979ap apVar2;
        C147287m mVar = this.f397539a;
        Account account = this.f397540b;
        C64098p pVar = this.f397541c;
        C146855ay ayVar = mVar.f397545a;
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
        return new C146913bp(ayVar.mo123776a(account, i, apVar2.f173030c));
    }
}
