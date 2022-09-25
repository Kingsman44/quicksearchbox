package androidx.work.impl;

import androidx.p182p.C3920ac;
import androidx.p182p.C3926ai;
import androidx.p182p.C3927aj;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3945g;
import androidx.p182p.p185c.C3946h;
import androidx.p182p.p185c.C3947i;
import androidx.p182p.p185c.C3949k;
import androidx.p182p.p185c.C3950l;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.work.impl.ae */
/* compiled from: PG */
final class C4450ae extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ WorkDatabase_Impl f14136b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4450ae(WorkDatabase_Impl workDatabase_Impl) {
        super(16);
        this.f14136b = workDatabase_Impl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        C4049d dVar2 = dVar;
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C3945g("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap.put("prerequisite_id", new C3945g("prerequisite_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        hashSet.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C3949k("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        hashSet2.add(new C3949k("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar = new C3950l("Dependency", hashMap, hashSet, hashSet2);
        C3950l a = C3946h.m11299a(dVar2, "Dependency");
        if (!lVar.equals(a)) {
            return new C3927aj(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + lVar + "\n Found:\n" + a);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new C3945g("id", "TEXT", true, 1, (String) null, 1));
        hashMap2.put("state", new C3945g("state", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("worker_class_name", new C3945g("worker_class_name", "TEXT", true, 0, (String) null, 1));
        hashMap2.put("input_merger_class_name", new C3945g("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
        hashMap2.put("input", new C3945g("input", "BLOB", true, 0, (String) null, 1));
        hashMap2.put("output", new C3945g("output", "BLOB", true, 0, (String) null, 1));
        hashMap2.put("initial_delay", new C3945g("initial_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("interval_duration", new C3945g("interval_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("flex_duration", new C3945g("flex_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("run_attempt_count", new C3945g("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("backoff_policy", new C3945g("backoff_policy", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("backoff_delay_duration", new C3945g("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("last_enqueue_time", new C3945g("last_enqueue_time", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("minimum_retention_duration", new C3945g("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("schedule_requested_at", new C3945g("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("run_in_foreground", new C3945g("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("out_of_quota_policy", new C3945g("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("period_count", new C3945g("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new C3945g("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new C3945g("required_network_type", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_charging", new C3945g("requires_charging", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_device_idle", new C3945g("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_battery_not_low", new C3945g("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_storage_not_low", new C3945g("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("trigger_content_update_delay", new C3945g("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("trigger_max_content_delay", new C3945g("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("content_uri_triggers", new C3945g("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C3949k("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new C3949k("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar2 = new C3950l("WorkSpec", hashMap2, hashSet3, hashSet4);
        C3950l a2 = C3946h.m11299a(dVar2, "WorkSpec");
        if (!lVar2.equals(a2)) {
            return new C3927aj(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + lVar2 + "\n Found:\n" + a2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C3945g("tag", "TEXT", true, 1, (String) null, 1));
        hashMap3.put("work_spec_id", new C3945g("work_spec_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C3949k("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar3 = new C3950l("WorkTag", hashMap3, hashSet5, hashSet6);
        C3950l a3 = C3946h.m11299a(dVar2, "WorkTag");
        if (!lVar3.equals(a3)) {
            return new C3927aj(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + lVar3 + "\n Found:\n" + a3);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C3945g("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap4.put("generation", new C3945g("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new C3945g("system_id", "INTEGER", true, 0, (String) null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        C3950l lVar4 = new C3950l("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C3950l a4 = C3946h.m11299a(dVar2, "SystemIdInfo");
        if (!lVar4.equals(a4)) {
            return new C3927aj(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + lVar4 + "\n Found:\n" + a4);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C3945g("name", "TEXT", true, 1, (String) null, 1));
        hashMap5.put("work_spec_id", new C3945g("work_spec_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C3949k("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar5 = new C3950l("WorkName", hashMap5, hashSet8, hashSet9);
        C3950l a5 = C3946h.m11299a(dVar2, "WorkName");
        if (!lVar5.equals(a5)) {
            return new C3927aj(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + lVar5 + "\n Found:\n" + a5);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C3945g("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap6.put("progress", new C3945g("progress", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C3947i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        C3950l lVar6 = new C3950l("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C3950l a6 = C3946h.m11299a(dVar2, "WorkProgress");
        if (!lVar6.equals(a6)) {
            return new C3927aj(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + lVar6 + "\n Found:\n" + a6);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C3945g("key", "TEXT", true, 1, (String) null, 1));
        hashMap7.put("long_value", new C3945g("long_value", "INTEGER", false, 0, (String) null, 1));
        C3950l lVar7 = new C3950l("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C3950l a7 = C3946h.m11299a(dVar2, "Preference");
        if (lVar7.equals(a7)) {
            return new C3927aj(true, (String) null);
        }
        return new C3927aj(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + lVar7 + "\n Found:\n" + a7);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `Dependency`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `WorkTag`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `WorkName`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `Preference`");
        List list = this.f14136b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f14136b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f14136b.f12557a = dVar;
        ((C4035d) dVar).f12902a.execSQL("PRAGMA foreign_keys = ON");
        this.f14136b.mo8186u(dVar);
        List list = this.f14136b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f14136b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f14136b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f14136b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
