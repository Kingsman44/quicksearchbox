package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cd */
/* compiled from: PG */
final class C16132cd extends C3937a {
    public C16132cd() {
        super(2, 3);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `vehicle_signal_event` (`vehicle_signal_id` INTEGER NOT NULL, `vehicle_signal_value_type` INTEGER NOT NULL, `vehicle_signal_value` TEXT NOT NULL, `latest_generation_timestamp` INTEGER NOT NULL, PRIMARY KEY(`vehicle_signal_id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `drive_status_update` (`drive_status` INTEGER NOT NULL, `update_timestamp` INTEGER NOT NULL, PRIMARY KEY(`drive_status`))");
        dVar2.f12902a.setTransactionSuccessful();
        dVar2.f12902a.endTransaction();
    }
}
