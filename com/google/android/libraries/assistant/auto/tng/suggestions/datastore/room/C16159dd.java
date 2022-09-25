package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.dd */
/* compiled from: PG */
final class C16159dd extends C3966s {
    public C16159dd(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16157db dbVar = (C16157db) obj;
        lVar.mo8204e(1, (long) dbVar.mo22821a());
        int d = dbVar.mo22824d();
        int i = d - 1;
        if (d != 0) {
            lVar.mo8204e(2, (long) i);
            if (dbVar.mo22823c() == null) {
                lVar.mo8205f(3);
            } else {
                lVar.mo8206g(3, dbVar.mo22823c());
            }
            lVar.mo8204e(4, dbVar.mo22822b());
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `vehicle_signal_event` (`vehicle_signal_id`,`vehicle_signal_value_type`,`vehicle_signal_value`,`latest_generation_timestamp`) VALUES (?,?,?,?)";
    }
}
