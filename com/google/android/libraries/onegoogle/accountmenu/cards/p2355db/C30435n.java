package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.n */
/* compiled from: PG */
final class C30435n extends C3965r {
    public C30435n(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C30432k kVar = (C30432k) obj;
        if (kVar.mo36005d() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, kVar.mo36005d());
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `StorageCardDecorationState` WHERE `accountIdentifier` = ?";
    }
}
