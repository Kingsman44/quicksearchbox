package com.google.android.libraries.assistant.pcp.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.i */
/* compiled from: PG */
final class C18622i extends C3966s {
    public C18622i(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        String str;
        C18628o oVar = (C18628o) obj;
        lVar.mo8204e(1, (long) oVar.mo24079a());
        if (oVar.mo24081c() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, oVar.mo24081c());
        }
        byte[] byteArray = oVar.mo24080b().toByteArray();
        if (byteArray == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8201c(3, byteArray);
        }
        if (oVar.mo24082d() == 0) {
            lVar.mo8205f(4);
            return;
        }
        int d = oVar.mo24082d();
        if (d == 0) {
            str = null;
        } else {
            int i = d - 1;
            str = i != 0 ? i != 1 ? i != 2 ? "INVALID" : "VALID" : "PENDING" : "UNKNOWN";
        }
        lVar.mo8206g(4, str);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `stored_elements` (`feature_type`,`id`,`stored_element`,`structured_data_state_type`) VALUES (?,?,?,?)";
    }
}
