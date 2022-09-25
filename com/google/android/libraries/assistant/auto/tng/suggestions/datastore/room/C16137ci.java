package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ci */
/* compiled from: PG */
final class C16137ci extends C3937a {
    public C16137ci() {
        super(7, 8);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        String arrays = Arrays.toString(C16335ai.f48090k.toByteArray());
        dVar2.f12902a.execSQL("ALTER TABLE suggestion_to_display ADD COLUMN display_metadata BLOB NOT NULL DEFAULT '" + arrays + "'");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
