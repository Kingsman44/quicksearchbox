package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.i */
/* compiled from: PG */
public final /* synthetic */ class C9681i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C9684l f33463a;

    /* renamed from: b */
    public final /* synthetic */ Account f33464b;

    public /* synthetic */ C9681i(C9684l lVar, Account account) {
        this.f33463a = lVar;
        this.f33464b = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        boolean z;
        C9684l lVar = this.f33463a;
        Account account = this.f33464b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return null;
        }
        ((C58970a) ((C58970a) C9684l.f33469a.mo56224b()).mo56372aa(477)).mo56389s("PR status onSyncCompleted updated to %s", optional.get());
        Boolean bool = (Boolean) lVar.f33473c.put(account.name, (Boolean) optional.get());
        lVar.f33475e = false;
        if (bool == null) {
            z = lVar.mo17958g();
        } else {
            z = bool.booleanValue();
        }
        if (((Boolean) optional.get()).booleanValue() == z) {
            return null;
        }
        lVar.mo17955d(account.name, ((Boolean) optional.get()).booleanValue());
        return null;
    }
}
