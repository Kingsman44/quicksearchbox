package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bg */
/* compiled from: PG */
final class C16108bg extends C3966s {
    public C16108bg(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16106be beVar = (C16106be) obj;
        if (beVar.mo22758b() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, beVar.mo22758b());
        }
        lVar.mo8204e(2, (long) C16088an.m32968e(beVar.mo22759c()));
        lVar.mo8204e(3, beVar.mo22757a());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `partner_app_signal` (`signal_value`,`signal_type`,`generation_timestamp`) VALUES (?,?,?)";
    }
}
