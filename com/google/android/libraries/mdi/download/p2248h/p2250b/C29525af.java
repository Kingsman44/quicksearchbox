package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.af */
/* compiled from: PG */
public final /* synthetic */ class C29525af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80011a;

    /* renamed from: b */
    public final /* synthetic */ Account f80012b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f80013c;

    /* renamed from: d */
    public final /* synthetic */ String f80014d;

    public /* synthetic */ C29525af(C29538as asVar, Account account, C65753ak akVar, String str) {
        this.f80011a = asVar;
        this.f80012b = account;
        this.f80013c = akVar;
        this.f80014d = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80011a;
        Account account = this.f80012b;
        List list = (List) obj;
        return asVar.mo34764a(asVar.f80060g.mo33118a(account), C28737bo.GDD_INVALID_AUTH_TOKEN, this.f80013c, this.f80014d);
    }
}
