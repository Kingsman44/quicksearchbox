package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ct */
/* compiled from: PG */
final class C16148ct extends C3966s {
    public C16148ct(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16143co coVar = (C16143co) obj;
        if (coVar.mo22804h() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, coVar.mo22804h());
        }
        if (coVar.mo22800d() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, coVar.mo22800d());
        }
        if (coVar.mo22802f() == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8206g(3, coVar.mo22802f());
        }
        lVar.mo8204e(4, coVar.mo22805i() ? 1 : 0);
        if (coVar.mo22803g() == null) {
            lVar.mo8205f(5);
        } else {
            lVar.mo8206g(5, coVar.mo22803g());
        }
        if (coVar.mo22801e() == null) {
            lVar.mo8205f(6);
        } else {
            lVar.mo8206g(6, coVar.mo22801e());
        }
        byte[] byteArray = coVar.mo22799c().toByteArray();
        if (byteArray == null) {
            lVar.mo8205f(7);
        } else {
            lVar.mo8201c(7, byteArray);
        }
        lVar.mo8204e(8, (long) coVar.mo22797a().f47720e);
        byte[] byteArray2 = coVar.mo22798b().toByteArray();
        if (byteArray2 == null) {
            lVar.mo8205f(9);
        } else {
            lVar.mo8201c(9, byteArray2);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `suggestion_to_display` (`id`,`candidate_suggestion_id`,`display_id`,`is_displayed_now`,`display_text`,`description`,`display_metadata`,`source`,`action_fulfillment_data`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}
