package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cc */
/* compiled from: PG */
final class C16131cc extends C3937a {
    public C16131cc() {
        super(1, 2);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("DELETE FROM suggestion_to_display");
        String arrays = Arrays.toString(C16330ad.f48065f.toByteArray());
        dVar2.f12902a.execSQL("ALTER TABLE suggestion_to_display ADD COLUMN action_fulfillment_data BLOB NOT NULL DEFAULT '" + arrays + "'");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
