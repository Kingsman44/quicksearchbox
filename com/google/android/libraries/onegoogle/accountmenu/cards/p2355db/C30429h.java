package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.h */
/* compiled from: PG */
final class C30429h extends C3965r {
    public C30429h(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C30426e eVar = (C30426e) obj;
        if (eVar.mo35997c() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, eVar.mo35997c());
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `BackupSyncCardDecorationState` WHERE `accountIdentifier` = ?";
    }
}
