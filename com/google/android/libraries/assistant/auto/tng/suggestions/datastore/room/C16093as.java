package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.as */
/* compiled from: PG */
final class C16093as extends C3966s {
    public C16093as(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C16091aq aqVar = (C16091aq) obj;
        if (aqVar.mo22735i() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, aqVar.mo22735i());
        }
        lVar.mo8204e(2, (long) aqVar.mo22733g().ordinal());
        lVar.mo8204e(3, (long) aqVar.mo22731e());
        lVar.mo8203d(4, (double) aqVar.mo22727a());
        lVar.mo8203d(5, (double) aqVar.mo22728b());
        lVar.mo8204e(6, (long) aqVar.mo22729c());
        lVar.mo8204e(7, (long) aqVar.mo22730d());
        lVar.mo8204e(8, aqVar.mo22732f());
        byte[] byteArray = aqVar.mo22734h().toByteArray();
        if (byteArray == null) {
            lVar.mo8205f(9);
        } else {
            lVar.mo8201c(9, byteArray);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `display_info` (`id`,`display_type`,`num_suggestions`,`length`,`width`,`font_size`,`max_display_text_length`,`generation_timestamp`,`display_metadata`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}
