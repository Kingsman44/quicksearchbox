package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.s */
/* compiled from: PG */
final class C16175s extends C3966s {
    public C16175s(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16170n nVar = (C16170n) obj;
        if (nVar.mo22752f() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, nVar.mo22752f());
        }
        if (nVar.mo22750e() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, nVar.mo22750e());
        }
        if (nVar.mo22749d() == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8206g(3, nVar.mo22749d());
        }
        if (nVar.mo22753g() == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8206g(4, nVar.mo22753g());
        }
        lVar.mo8204e(5, (long) nVar.mo22746a().f47720e);
        if (nVar.mo22748c() == null) {
            lVar.mo8205f(6);
        } else {
            lVar.mo8204e(6, nVar.mo22748c().longValue());
        }
        byte[] byteArray = nVar.mo22747b().toByteArray();
        if (byteArray == null) {
            lVar.mo8205f(7);
        } else {
            lVar.mo8201c(7, byteArray);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR IGNORE INTO `candidate_suggestion` (`id`,`display_text`,`description`,`locale`,`source`,`created_time_ms`,`metadata`) VALUES (?,?,?,?,?,?,?)";
    }
}
