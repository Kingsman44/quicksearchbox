package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.protos.p4895aw.p4902b.C64008br;

/* renamed from: com.google.android.libraries.ac.b.f.d */
/* compiled from: PG */
public final /* synthetic */ class C147040d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147041e f397014a;

    /* renamed from: b */
    public final /* synthetic */ Account f397015b;

    public /* synthetic */ C147040d(C147041e eVar, Account account) {
        this.f397014a = eVar;
        this.f397015b = account;
    }

    public final Object apply(Object obj) {
        C64008br brVar;
        C147041e eVar = this.f397014a;
        Account account = this.f397015b;
        Void voidR = (Void) obj;
        synchronized (eVar.f397019d) {
            brVar = (C64008br) eVar.f397017b.get(account);
        }
        return brVar;
    }
}
