package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.protos.p4895aw.p4902b.C64008br;

/* renamed from: com.google.android.libraries.ac.b.f.a */
/* compiled from: PG */
public final /* synthetic */ class C146996a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147041e f396901a;

    /* renamed from: b */
    public final /* synthetic */ C64008br f396902b;

    public /* synthetic */ C146996a(C147041e eVar, C64008br brVar) {
        this.f396901a = eVar;
        this.f396902b = brVar;
    }

    public final Object apply(Object obj) {
        Account account;
        C147041e eVar = this.f396901a;
        C64008br brVar = this.f396902b;
        Void voidR = (Void) obj;
        synchronized (eVar.f397019d) {
            account = (Account) eVar.f397016a.get(brVar);
        }
        return account;
    }
}
