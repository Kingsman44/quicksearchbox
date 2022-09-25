package com.google.android.libraries.notifications.data.impl.room;

import androidx.p182p.C3920ac;
import androidx.p182p.C3926ai;
import androidx.p182p.C3927aj;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3945g;
import androidx.p182p.p185c.C3946h;
import androidx.p182p.p185c.C3950l;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.data.impl.room.a */
/* compiled from: PG */
final class C29813a extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl f80830b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29813a(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(1);
        this.f80830b = chimePerAccountRoomDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("id", new C3945g("id", "INTEGER", true, 1, (String) null, 1));
        hashMap.put("thread_id", new C3945g("thread_id", "TEXT", false, 0, (String) null, 1));
        hashMap.put("last_updated_version", new C3945g("last_updated_version", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("read_state", new C3945g("read_state", "INTEGER", false, 0, (String) null, 1));
        hashMap.put("deletion_status", new C3945g("deletion_status", "INTEGER", false, 0, (String) null, 1));
        hashMap.put("count_behavior", new C3945g("count_behavior", "INTEGER", false, 0, (String) null, 1));
        hashMap.put("system_tray_behavior", new C3945g("system_tray_behavior", "INTEGER", false, 0, (String) null, 1));
        hashMap.put("modified_timestamp", new C3945g("modified_timestamp", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("chime_thread_states", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar, "chime_thread_states");
        if (lVar.equals(a)) {
            return new C3927aj(true, (String) null);
        }
        String obj = lVar.toString();
        String obj2 = a.toString();
        return new C3927aj(false, "chime_thread_states(com.google.android.libraries.notifications.data.ChimeThreadState).\n Expected:\n" + obj + "\n Found:\n" + obj2);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER, `deletion_status` INTEGER, `count_behavior` INTEGER, `system_tray_behavior` INTEGER, `modified_timestamp` INTEGER NOT NULL)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ea4ce6093b9d29b56181718d906e0024')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("DROP TABLE IF EXISTS `chime_thread_states`");
        List list = this.f80830b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f80830b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f80830b.f12557a = dVar;
        this.f80830b.mo8186u(dVar);
        List list = this.f80830b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f80830b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f80830b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f80830b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
