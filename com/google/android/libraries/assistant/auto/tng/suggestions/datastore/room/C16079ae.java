package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ae */
/* compiled from: PG */
final class C16079ae extends C3966s {
    public C16079ae(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16077ac acVar = (C16077ac) obj;
        if (acVar.mo22705i() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, acVar.mo22705i());
        }
        lVar.mo8204e(2, acVar.mo22697a());
        lVar.mo8204e(3, acVar.mo22703g());
        lVar.mo8204e(4, acVar.mo22700d());
        lVar.mo8204e(5, acVar.mo22702f());
        lVar.mo8204e(6, acVar.mo22699c());
        lVar.mo8204e(7, acVar.mo22698b());
        lVar.mo8204e(8, acVar.mo22701e());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `candidate_suggestion_metrics` (`candidate_suggestion_id`,`click_count`,`show_count`,`last_click_timestamp`,`last_show_timestamp`,`last_cleared_timestamp`,`dismissal_count`,`last_dismissal_timestamp`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
