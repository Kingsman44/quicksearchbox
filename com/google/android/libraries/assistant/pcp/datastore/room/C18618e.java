package com.google.android.libraries.assistant.pcp.datastore.room;

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

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.e */
/* compiled from: PG */
final class C18618e extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ ContentDatabase_Impl f52642b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18618e(ContentDatabase_Impl contentDatabase_Impl) {
        super(3);
        this.f52642b = contentDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        C4049d dVar2 = dVar;
        HashMap hashMap = new HashMap(4);
        hashMap.put("feature_type", new C3945g("feature_type", "INTEGER", true, 1, (String) null, 1));
        hashMap.put("id", new C3945g("id", "TEXT", true, 2, (String) null, 1));
        hashMap.put("stored_element", new C3945g("stored_element", "BLOB", true, 0, (String) null, 1));
        hashMap.put("structured_data_state_type", new C3945g("structured_data_state_type", "TEXT", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("stored_elements", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar2, "stored_elements");
        if (!lVar.equals(a)) {
            String obj = lVar.toString();
            String obj2 = a.toString();
            return new C3927aj(false, "stored_elements(com.google.android.libraries.assistant.pcp.datastore.room.StoredElementEntity).\n Expected:\n" + obj + "\n Found:\n" + obj2);
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("feature_type", new C3945g("feature_type", "INTEGER", true, 1, (String) null, 1));
        hashMap2.put("timestamp", new C3945g("timestamp", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar2 = new C3950l("feature_last_full_refresh", hashMap2, new HashSet(0), new HashSet(0));
        C3950l a2 = C3946h.m11299a(dVar2, "feature_last_full_refresh");
        if (lVar2.equals(a2)) {
            return new C3927aj(true, (String) null);
        }
        String obj3 = lVar2.toString();
        String obj4 = a2.toString();
        return new C3927aj(false, "feature_last_full_refresh(com.google.android.libraries.assistant.pcp.datastore.room.FeatureLastFullRefreshEntity).\n Expected:\n" + obj3 + "\n Found:\n" + obj4);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `stored_elements` (`feature_type` INTEGER NOT NULL, `id` TEXT NOT NULL, `stored_element` BLOB NOT NULL, `structured_data_state_type` TEXT NOT NULL, PRIMARY KEY(`feature_type`, `id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `feature_last_full_refresh` (`feature_type` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`feature_type`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b0c823621f157b5893516408d346bc98')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `stored_elements`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `feature_last_full_refresh`");
        List list = this.f52642b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f52642b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f52642b.f12557a = dVar;
        this.f52642b.mo8186u(dVar);
        List list = this.f52642b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f52642b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f52642b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f52642b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
