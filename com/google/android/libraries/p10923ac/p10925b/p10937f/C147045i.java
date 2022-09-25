package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.protos.p4895aw.p4902b.C64008br;
import com.google.protos.p4895aw.p4902b.C64019cb;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C147045i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C64008br f397034a;

    /* renamed from: b */
    public final /* synthetic */ C64019cb f397035b;

    public /* synthetic */ C147045i(C64008br brVar, C64019cb cbVar) {
        this.f397034a = brVar;
        this.f397035b = cbVar;
    }

    public final Object apply(Object obj) {
        C64008br brVar = this.f397034a;
        C64019cb cbVar = this.f397035b;
        Account account = (Account) obj;
        C64098p pVar = cbVar.f173115a;
        if (pVar == null) {
            pVar = C64098p.f173292c;
        }
        return new C147043g(brVar, pVar, account, cbVar.f173118d, cbVar.f173119e);
    }
}
