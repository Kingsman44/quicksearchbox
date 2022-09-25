package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bc */
/* compiled from: PG */
final class C16104bc extends C3966s {
    public C16104bc(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16102ba baVar = (C16102ba) obj;
        lVar.mo8204e(1, (long) baVar.mo22756b().f48241f);
        lVar.mo8204e(2, baVar.mo22755a());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `drive_status_update` (`drive_status`,`update_timestamp`) VALUES (?,?)";
    }
}
