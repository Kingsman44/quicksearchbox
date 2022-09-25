package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.m */
/* compiled from: PG */
final class C30434m extends C3966s {
    public C30434m(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C30432k kVar = (C30432k) obj;
        if (kVar.mo36005d() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, kVar.mo36005d());
        }
        String name = kVar.mo36004c().name();
        if (name == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, name);
        }
        lVar.mo8204e(3, kVar.mo36003b());
        lVar.mo8204e(4, (long) kVar.mo36002a());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `StorageCardDecorationState` (`accountIdentifier`,`storageState`,`lastDecorationConsumedTime`,`totalTimesConsumed`) VALUES (?,?,?,?)";
    }
}
