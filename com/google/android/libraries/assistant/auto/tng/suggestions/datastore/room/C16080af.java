package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.af */
/* compiled from: PG */
final class C16080af extends C3965r {
    public C16080af(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C16077ac acVar = (C16077ac) obj;
        if (acVar.mo22705i() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, acVar.mo22705i());
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM `candidate_suggestion_metrics` WHERE `candidate_suggestion_id` = ?";
    }
}
