package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.t */
/* compiled from: PG */
final class C16176t extends C3965r {
    public C16176t(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C16170n nVar = (C16170n) obj;
        if (nVar.mo22752f() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, nVar.mo22752f());
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `candidate_suggestion` WHERE `id` = ?";
    }
}
