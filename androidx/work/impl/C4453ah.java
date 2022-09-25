package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.ah */
/* compiled from: PG */
public final class C4453ah extends C3937a {

    /* renamed from: c */
    private final Context f14152c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4453ah(Context context) {
        super(9, 10);
        C69664n.m101061g(context, "context");
        this.f14152c = context;
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.f14152c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (true == sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            dVar2.f12902a.beginTransaction();
            try {
                dVar.mo8254m(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                dVar.mo8254m(new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                ((C4035d) dVar).f12902a.setTransactionSuccessful();
            } finally {
                dVar2.f12902a.endTransaction();
            }
        }
        Context context = this.f14152c;
        C69664n.m101061g(context, "context");
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            dVar2.f12902a.beginTransaction();
            try {
                dVar.mo8254m(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                dVar.mo8254m(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                ((C4035d) dVar).f12902a.setTransactionSuccessful();
            } finally {
                dVar2.f12902a.endTransaction();
            }
        }
    }
}
