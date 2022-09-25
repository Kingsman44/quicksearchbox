package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

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

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.j */
/* compiled from: PG */
final class C30431j extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ CardsDatabase_Impl f82232b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30431j(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4);
        this.f82232b = cardsDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        C4049d dVar2 = dVar;
        HashMap hashMap = new HashMap(4);
        hashMap.put("accountIdentifier", new C3945g("accountIdentifier", "TEXT", true, 1, (String) null, 1));
        hashMap.put("storageState", new C3945g("storageState", "TEXT", true, 0, (String) null, 1));
        hashMap.put("lastDecorationConsumedTime", new C3945g("lastDecorationConsumedTime", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("totalTimesConsumed", new C3945g("totalTimesConsumed", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("StorageCardDecorationState", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar2, "StorageCardDecorationState");
        if (!lVar.equals(a)) {
            String obj = lVar.toString();
            String obj2 = a.toString();
            return new C3927aj(false, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n" + obj + "\n Found:\n" + obj2);
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("accountIdentifier", new C3945g("accountIdentifier", "TEXT", true, 1, (String) null, 1));
        hashMap2.put("backupSyncState", new C3945g("backupSyncState", "TEXT", true, 0, (String) null, 1));
        hashMap2.put("lastDecorationConsumedTime", new C3945g("lastDecorationConsumedTime", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("totalTimesConsumed", new C3945g("totalTimesConsumed", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar2 = new C3950l("BackupSyncCardDecorationState", hashMap2, new HashSet(0), new HashSet(0));
        C3950l a2 = C3946h.m11299a(dVar2, "BackupSyncCardDecorationState");
        if (lVar2.equals(a2)) {
            return new C3927aj(true, (String) null);
        }
        String obj3 = lVar2.toString();
        String obj4 = a2.toString();
        return new C3927aj(false, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n" + obj3 + "\n Found:\n" + obj4);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `StorageCardDecorationState`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
        List list = this.f82232b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82232b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f82232b.f12557a = dVar;
        this.f82232b.mo8186u(dVar);
        List list = this.f82232b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82232b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f82232b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82232b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
