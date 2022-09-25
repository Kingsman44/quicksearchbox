package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cm */
/* compiled from: PG */
final class C16141cm extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ SuggestionDatabase_Impl f47632b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16141cm(SuggestionDatabase_Impl suggestionDatabase_Impl) {
        super(16);
        this.f47632b = suggestionDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        C4049d dVar2 = dVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("id", new C3945g("id", "TEXT", true, 1, (String) null, 1));
        hashMap.put("display_text", new C3945g("display_text", "TEXT", true, 0, (String) null, 1));
        hashMap.put("description", new C3945g("description", "TEXT", false, 0, (String) null, 1));
        hashMap.put("locale", new C3945g("locale", "TEXT", true, 0, (String) null, 1));
        hashMap.put("source", new C3945g("source", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("created_time_ms", new C3945g("created_time_ms", "INTEGER", false, 0, (String) null, 1));
        hashMap.put("metadata", new C3945g("metadata", "BLOB", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("candidate_suggestion", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar2, "candidate_suggestion");
        if (!lVar.equals(a)) {
            String obj = lVar.toString();
            String obj2 = a.toString();
            return new C3927aj(false, "candidate_suggestion(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.CandidateSuggestion).\n Expected:\n" + obj + "\n Found:\n" + obj2);
        }
        HashMap hashMap2 = new HashMap(9);
        C3945g gVar = r10;
        C3945g gVar2 = new C3945g("id", "TEXT", true, 1, (String) null, 1);
        hashMap2.put("id", gVar);
        hashMap2.put("display_type", new C3945g("display_type", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("num_suggestions", new C3945g("num_suggestions", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("length", new C3945g("length", "REAL", true, 0, (String) null, 1));
        hashMap2.put("width", new C3945g("width", "REAL", true, 0, (String) null, 1));
        hashMap2.put("font_size", new C3945g("font_size", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("max_display_text_length", new C3945g("max_display_text_length", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("generation_timestamp", new C3945g("generation_timestamp", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("display_metadata", new C3945g("display_metadata", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new C3949k("index_display_info_display_type", true, Arrays.asList(new String[]{"display_type"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar2 = new C3950l("display_info", hashMap2, hashSet, hashSet2);
        C3950l a2 = C3946h.m11299a(dVar2, "display_info");
        if (!lVar2.equals(a2)) {
            String obj3 = lVar2.toString();
            String obj4 = a2.toString();
            return new C3927aj(false, "display_info(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.DisplayInfo).\n Expected:\n" + obj3 + "\n Found:\n" + obj4);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("drive_status", new C3945g("drive_status", "INTEGER", true, 1, (String) null, 1));
        hashMap3.put("update_timestamp", new C3945g("update_timestamp", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar3 = new C3950l("drive_status_update", hashMap3, new HashSet(0), new HashSet(0));
        C3950l a3 = C3946h.m11299a(dVar2, "drive_status_update");
        if (!lVar3.equals(a3)) {
            String obj5 = lVar3.toString();
            String obj6 = a3.toString();
            return new C3927aj(false, "drive_status_update(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.DriveStatusUpdate).\n Expected:\n" + obj5 + "\n Found:\n" + obj6);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("signal_value", new C3945g("signal_value", "TEXT", true, 0, (String) null, 1));
        hashMap4.put("signal_type", new C3945g("signal_type", "INTEGER", true, 1, (String) null, 1));
        hashMap4.put("generation_timestamp", new C3945g("generation_timestamp", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar4 = new C3950l("partner_app_signal", hashMap4, new HashSet(0), new HashSet(0));
        C3950l a4 = C3946h.m11299a(dVar2, "partner_app_signal");
        if (!lVar4.equals(a4)) {
            String obj7 = lVar4.toString();
            String obj8 = a4.toString();
            return new C3927aj(false, "partner_app_signal(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.PartnerAppSignal).\n Expected:\n" + obj7 + "\n Found:\n" + obj8);
        }
        HashMap hashMap5 = new HashMap(9);
        hashMap5.put("id", new C3945g("id", "TEXT", true, 1, (String) null, 1));
        hashMap5.put("candidate_suggestion_id", new C3945g("candidate_suggestion_id", "TEXT", true, 0, (String) null, 1));
        hashMap5.put("display_id", new C3945g("display_id", "TEXT", true, 0, (String) null, 1));
        hashMap5.put("is_displayed_now", new C3945g("is_displayed_now", "INTEGER", true, 0, (String) null, 1));
        hashMap5.put("display_text", new C3945g("display_text", "TEXT", true, 0, (String) null, 1));
        hashMap5.put("description", new C3945g("description", "TEXT", false, 0, (String) null, 1));
        hashMap5.put("display_metadata", new C3945g("display_metadata", "BLOB", true, 0, (String) null, 1));
        hashMap5.put("source", new C3945g("source", "INTEGER", true, 0, (String) null, 1));
        hashMap5.put("action_fulfillment_data", new C3945g("action_fulfillment_data", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new C3947i("display_info", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"display_id"}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet4 = new HashSet(2);
        Object obj9 = "action_fulfillment_data";
        hashSet4.add(new C3949k("index_suggestion_to_display_candidate_suggestion_id", false, Arrays.asList(new String[]{"candidate_suggestion_id"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new C3949k("index_suggestion_to_display_display_id", false, Arrays.asList(new String[]{"display_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar5 = new C3950l("suggestion_to_display", hashMap5, hashSet3, hashSet4);
        C3950l a5 = C3946h.m11299a(dVar2, "suggestion_to_display");
        if (!lVar5.equals(a5)) {
            String obj10 = lVar5.toString();
            String obj11 = a5.toString();
            return new C3927aj(false, "suggestion_to_display(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.SuggestionToDisplay).\n Expected:\n" + obj10 + "\n Found:\n" + obj11);
        }
        HashMap hashMap6 = new HashMap(8);
        hashMap6.put("candidate_suggestion_id", new C3945g("candidate_suggestion_id", "TEXT", true, 1, (String) null, 1));
        hashMap6.put("click_count", new C3945g("click_count", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("show_count", new C3945g("show_count", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("last_click_timestamp", new C3945g("last_click_timestamp", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("last_show_timestamp", new C3945g("last_show_timestamp", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("last_cleared_timestamp", new C3945g("last_cleared_timestamp", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("dismissal_count", new C3945g("dismissal_count", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("last_dismissal_timestamp", new C3945g("last_dismissal_timestamp", "INTEGER", true, 0, (String) null, 1));
        HashSet hashSet5 = new HashSet(0);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C3949k("index_candidate_suggestion_metrics_candidate_suggestion_id", false, Arrays.asList(new String[]{"candidate_suggestion_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar6 = new C3950l("candidate_suggestion_metrics", hashMap6, hashSet5, hashSet6);
        C3950l a6 = C3946h.m11299a(dVar2, "candidate_suggestion_metrics");
        if (!lVar6.equals(a6)) {
            String obj12 = lVar6.toString();
            String obj13 = a6.toString();
            return new C3927aj(false, "candidate_suggestion_metrics(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.CandidateSuggestionMetrics).\n Expected:\n" + obj12 + "\n Found:\n" + obj13);
        }
        HashMap hashMap7 = new HashMap(4);
        hashMap7.put("vehicle_signal_id", new C3945g("vehicle_signal_id", "INTEGER", true, 1, (String) null, 1));
        hashMap7.put("vehicle_signal_value_type", new C3945g("vehicle_signal_value_type", "INTEGER", true, 0, (String) null, 1));
        hashMap7.put("vehicle_signal_value", new C3945g("vehicle_signal_value", "TEXT", true, 0, (String) null, 1));
        hashMap7.put("latest_generation_timestamp", new C3945g("latest_generation_timestamp", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar7 = new C3950l("vehicle_signal_event", hashMap7, new HashSet(0), new HashSet(0));
        C3950l a7 = C3946h.m11299a(dVar2, "vehicle_signal_event");
        if (!lVar7.equals(a7)) {
            String obj14 = lVar7.toString();
            String obj15 = a7.toString();
            return new C3927aj(false, "vehicle_signal_event(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.VehicleSignalEvent).\n Expected:\n" + obj14 + "\n Found:\n" + obj15);
        }
        HashMap hashMap8 = new HashMap(7);
        hashMap8.put("id", new C3945g("id", "TEXT", true, 1, (String) null, 1));
        hashMap8.put("display_id", new C3945g("display_id", "TEXT", true, 0, (String) null, 1));
        hashMap8.put("is_displayed_now", new C3945g("is_displayed_now", "INTEGER", true, 0, (String) null, 1));
        hashMap8.put("status", new C3945g("status", "INTEGER", true, 0, (String) null, 1));
        hashMap8.put("display_text", new C3945g("display_text", "TEXT", true, 0, (String) null, 1));
        hashMap8.put("display_metadata", new C3945g("display_metadata", "BLOB", true, 0, (String) null, 1));
        hashMap8.put(obj9, new C3945g("action_fulfillment_data", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C3947i("display_info", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"display_id"}), Arrays.asList(new String[]{"id"})));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C3949k("index_shortcut_to_display_display_id", false, Arrays.asList(new String[]{"display_id"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar8 = new C3950l("shortcut_to_display", hashMap8, hashSet7, hashSet8);
        C3950l a8 = C3946h.m11299a(dVar2, "shortcut_to_display");
        if (lVar8.equals(a8)) {
            return new C3927aj(true, (String) null);
        }
        String obj16 = lVar8.toString();
        String obj17 = a8.toString();
        return new C3927aj(false, "shortcut_to_display(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ShortcutToDisplay).\n Expected:\n" + obj16 + "\n Found:\n" + obj17);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `candidate_suggestion` (`id` TEXT NOT NULL, `display_text` TEXT NOT NULL, `description` TEXT, `locale` TEXT NOT NULL, `source` INTEGER NOT NULL, `created_time_ms` INTEGER, `metadata` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `display_info` (`id` TEXT NOT NULL, `display_type` INTEGER NOT NULL, `num_suggestions` INTEGER NOT NULL, `length` REAL NOT NULL, `width` REAL NOT NULL, `font_size` INTEGER NOT NULL, `max_display_text_length` INTEGER NOT NULL, `generation_timestamp` INTEGER NOT NULL, `display_metadata` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_display_info_display_type` ON `display_info` (`display_type`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `drive_status_update` (`drive_status` INTEGER NOT NULL, `update_timestamp` INTEGER NOT NULL, PRIMARY KEY(`drive_status`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `partner_app_signal` (`signal_value` TEXT NOT NULL, `signal_type` INTEGER NOT NULL, `generation_timestamp` INTEGER NOT NULL, PRIMARY KEY(`signal_type`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `suggestion_to_display` (`id` TEXT NOT NULL, `candidate_suggestion_id` TEXT NOT NULL, `display_id` TEXT NOT NULL, `is_displayed_now` INTEGER NOT NULL, `display_text` TEXT NOT NULL, `description` TEXT, `display_metadata` BLOB NOT NULL, `source` INTEGER NOT NULL, `action_fulfillment_data` BLOB NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`display_id`) REFERENCES `display_info`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_suggestion_to_display_candidate_suggestion_id` ON `suggestion_to_display` (`candidate_suggestion_id`)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_suggestion_to_display_display_id` ON `suggestion_to_display` (`display_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `candidate_suggestion_metrics` (`candidate_suggestion_id` TEXT NOT NULL, `click_count` INTEGER NOT NULL, `show_count` INTEGER NOT NULL, `last_click_timestamp` INTEGER NOT NULL, `last_show_timestamp` INTEGER NOT NULL, `last_cleared_timestamp` INTEGER NOT NULL, `dismissal_count` INTEGER NOT NULL, `last_dismissal_timestamp` INTEGER NOT NULL, PRIMARY KEY(`candidate_suggestion_id`))");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_candidate_suggestion_metrics_candidate_suggestion_id` ON `candidate_suggestion_metrics` (`candidate_suggestion_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `vehicle_signal_event` (`vehicle_signal_id` INTEGER NOT NULL, `vehicle_signal_value_type` INTEGER NOT NULL, `vehicle_signal_value` TEXT NOT NULL, `latest_generation_timestamp` INTEGER NOT NULL, PRIMARY KEY(`vehicle_signal_id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `shortcut_to_display` (`id` TEXT NOT NULL, `display_id` TEXT NOT NULL, `is_displayed_now` INTEGER NOT NULL, `status` INTEGER NOT NULL, `display_text` TEXT NOT NULL, `display_metadata` BLOB NOT NULL, `action_fulfillment_data` BLOB NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`display_id`) REFERENCES `display_info`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_shortcut_to_display_display_id` ON `shortcut_to_display` (`display_id`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7e1adad3e65b26b32237b405daef7b5c')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `candidate_suggestion`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `display_info`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `drive_status_update`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `partner_app_signal`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `suggestion_to_display`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `candidate_suggestion_metrics`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `vehicle_signal_event`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `shortcut_to_display`");
        List list = this.f47632b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f47632b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f47632b.f12557a = dVar;
        ((C4035d) dVar).f12902a.execSQL("PRAGMA foreign_keys = ON");
        this.f47632b.mo8186u(dVar);
        List list = this.f47632b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f47632b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f47632b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f47632b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
