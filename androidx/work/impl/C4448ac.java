package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.ac */
/* compiled from: PG */
final class C4448ac extends C3937a {
    public C4448ac() {
        super(13, 14);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("INSERT INTO `_new_WorkSpec` (`interval_duration`,`content_uri_triggers`,`minimum_retention_duration`,`requires_storage_not_low`,`trigger_content_update_delay`,`run_attempt_count`,`schedule_requested_at`,`output`,`period_start_time`,`out_of_quota_policy`,`input_merger_class_name`,`requires_charging`,`id`,`state`,`trigger_max_content_delay`,`backoff_policy`,`required_network_type`,`worker_class_name`,`requires_device_idle`,`flex_duration`,`initial_delay`,`requires_battery_not_low`,`input`,`run_in_foreground`,`backoff_delay_duration`) SELECT `interval_duration`,`content_uri_triggers`,`minimum_retention_duration`,`requires_storage_not_low`,`trigger_content_update_delay`,`run_attempt_count`,`schedule_requested_at`,`output`,`period_start_time`,`out_of_quota_policy`,`input_merger_class_name`,`requires_charging`,`id`,`state`,`trigger_max_content_delay`,`backoff_policy`,`required_network_type`,`worker_class_name`,`requires_device_idle`,`flex_duration`,`initial_delay`,`requires_battery_not_low`,`input`,`run_in_foreground`,`backoff_delay_duration` FROM `WorkSpec`");
        dVar2.f12902a.execSQL("DROP TABLE `WorkSpec`");
        dVar2.f12902a.execSQL("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
    }
}
