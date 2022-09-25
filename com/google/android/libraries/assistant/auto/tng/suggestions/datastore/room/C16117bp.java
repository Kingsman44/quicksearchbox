package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bp */
/* compiled from: PG */
final class C16117bp extends C3966s {
    public C16117bp(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16115bn bnVar = (C16115bn) obj;
        if (bnVar.mo22777e() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, bnVar.mo22777e());
        }
        if (bnVar.mo22775c() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, bnVar.mo22775c());
        }
        lVar.mo8204e(3, bnVar.mo22778f() ? 1 : 0);
        int g = bnVar.mo22779g();
        int i = g - 1;
        if (g != 0) {
            lVar.mo8204e(4, (long) i);
            if (bnVar.mo22776d() == null) {
                lVar.mo8205f(5);
            } else {
                lVar.mo8206g(5, bnVar.mo22776d());
            }
            byte[] byteArray = bnVar.mo22774b().toByteArray();
            if (byteArray == null) {
                lVar.mo8205f(6);
            } else {
                lVar.mo8201c(6, byteArray);
            }
            byte[] byteArray2 = bnVar.mo22773a().toByteArray();
            if (byteArray2 == null) {
                lVar.mo8205f(7);
            } else {
                lVar.mo8201c(7, byteArray2);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `shortcut_to_display` (`id`,`display_id`,`is_displayed_now`,`status`,`display_text`,`display_metadata`,`action_fulfillment_data`) VALUES (?,?,?,?,?,?,?)";
    }
}
