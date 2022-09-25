package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.h */
/* compiled from: PG */
final class C30581h extends C3965r {
    public C30581h(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        String str = ((C30576c) obj).f82598a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `EducationState` WHERE `name` = ?";
    }
}
