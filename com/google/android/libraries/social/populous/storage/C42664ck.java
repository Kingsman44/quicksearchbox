package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.ck */
/* compiled from: PG */
final class C42664ck extends C3965r {
    public C42664ck(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C42674cu cuVar = (C42674cu) obj;
        lVar.mo8206g(1, cuVar.f111874a);
        lVar.mo8206g(2, cuVar.f111875b);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `RpcCache` WHERE `type` = ? AND `key` = ?";
    }
}
