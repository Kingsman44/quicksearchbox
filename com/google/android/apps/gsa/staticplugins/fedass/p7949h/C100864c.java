package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.c */
/* compiled from: PG */
public final /* synthetic */ class C100864c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100872k f281845a;

    /* renamed from: b */
    public final /* synthetic */ Account f281846b;

    public /* synthetic */ C100864c(C100872k kVar, Account account) {
        this.f281845a = kVar;
        this.f281846b = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100872k kVar = this.f281845a;
        Account account = this.f281846b;
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C100872k.f281855a.mo56224b()).mo56372aa(19652)).mo56386p("disableUnifiedBitOnIneligibleDevices");
        return kVar.f281859d.mo28210j(kVar.mo92076a(account.name), "disableUnifiedBitOnIneligibleDevices", new C100867f(kVar, account));
    }
}
