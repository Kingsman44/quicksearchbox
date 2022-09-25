package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bz */
/* compiled from: PG */
final class C16127bz extends C3937a {
    public C16127bz() {
        super(13, 14);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `cache_fulfillment_result` (`text_search_query` TEXT NOT NULL, `create_time` INTEGER NOT NULL,`valid_time` INTEGER NOT NULL, `contextual_vertical` INTEGER NOT NULL, `supported_locale` TEXT NOT NULL, `cache_result` BLOB NOT NULL, PRIMARY KEY(`text_search_query`))");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
