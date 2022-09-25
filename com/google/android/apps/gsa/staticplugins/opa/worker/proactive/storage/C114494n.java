package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.n */
/* compiled from: PG */
final class C114494n extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ NotificationsDatabase_Impl f317464b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114494n(NotificationsDatabase_Impl notificationsDatabase_Impl) {
        super(1);
        this.f317464b = notificationsDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("groupingKey", new C3945g("groupingKey", "TEXT", true, 1, (String) null, 1));
        hashMap.put("notificationArgs", new C3945g("notificationArgs", "BLOB", true, 0, (String) null, 1));
        hashMap.put("uniqueId", new C3945g("uniqueId", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("opa_delayed_notification", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar, "opa_delayed_notification");
        if (lVar.equals(a)) {
            return new C3927aj(true, (String) null);
        }
        String obj = lVar.toString();
        String obj2 = a.toString();
        return new C3927aj(false, "opa_delayed_notification(com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.DelayedNotificationEntity).\n Expected:\n" + obj + "\n Found:\n" + obj2);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `opa_delayed_notification` (`groupingKey` TEXT NOT NULL, `notificationArgs` BLOB NOT NULL, `uniqueId` INTEGER NOT NULL, PRIMARY KEY(`groupingKey`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ed1b6e318977d6d859fe4767649f5a2b')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("DROP TABLE IF EXISTS `opa_delayed_notification`");
        List list = this.f317464b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f317464b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f317464b.f12557a = dVar;
        this.f317464b.mo8186u(dVar);
        List list = this.f317464b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f317464b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f317464b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f317464b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
