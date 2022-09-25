package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import androidx.p182p.C3920ac;
import androidx.p182p.C3926ai;
import androidx.p182p.C3927aj;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3945g;
import androidx.p182p.p185c.C3946h;
import androidx.p182p.p185c.C3947i;
import androidx.p182p.p185c.C3950l;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.b */
/* compiled from: PG */
final class C30575b extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ EducationDatabase_Impl f82597b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30575b(EducationDatabase_Impl educationDatabase_Impl) {
        super(2);
        this.f82597b = educationDatabase_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("name", new C3945g("name", "TEXT", true, 1, (String) null, 1));
        hashMap.put("enabled", new C3945g("enabled", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("numEducationImpressions", new C3945g("numEducationImpressions", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("numEducationInteractions", new C3945g("numEducationInteractions", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("activatedTimestampMs", new C3945g("activatedTimestampMs", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("lastImpressionTimestampMs", new C3945g("lastImpressionTimestampMs", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("lastInteractionTimestampMs", new C3945g("lastInteractionTimestampMs", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("educationCompleted", new C3945g("educationCompleted", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar = new C3950l("EducationState", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar, "EducationState");
        if (!lVar.equals(a)) {
            String obj = lVar.toString();
            String obj2 = a.toString();
            return new C3927aj(false, "EducationState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationState).\n Expected:\n" + obj + "\n Found:\n" + obj2);
        }
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("educationName", new C3945g("educationName", "TEXT", true, 1, (String) null, 1));
        hashMap2.put("highlightId", new C3945g("highlightId", "TEXT", true, 2, (String) null, 1));
        hashMap2.put("numHighlightImpressions", new C3945g("numHighlightImpressions", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("numHighlightInteractions", new C3945g("numHighlightInteractions", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("highlightCompleted", new C3945g("highlightCompleted", "INTEGER", true, 0, (String) null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new C3947i("EducationState", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"educationName"}), Arrays.asList(new String[]{"name"})));
        C3950l lVar2 = new C3950l("HighlightState", hashMap2, hashSet, new HashSet(0));
        C3950l a2 = C3946h.m11299a(dVar, "HighlightState");
        if (lVar2.equals(a2)) {
            return new C3927aj(true, (String) null);
        }
        String obj3 = lVar2.toString();
        String obj4 = a2.toString();
        return new C3927aj(false, "HighlightState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.HighlightState).\n Expected:\n" + obj3 + "\n Found:\n" + obj4);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `EducationState` (`name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `numEducationImpressions` INTEGER NOT NULL, `numEducationInteractions` INTEGER NOT NULL, `activatedTimestampMs` INTEGER NOT NULL, `lastImpressionTimestampMs` INTEGER NOT NULL, `lastInteractionTimestampMs` INTEGER NOT NULL, `educationCompleted` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `HighlightState` (`educationName` TEXT NOT NULL, `highlightId` TEXT NOT NULL, `numHighlightImpressions` INTEGER NOT NULL, `numHighlightInteractions` INTEGER NOT NULL, `highlightCompleted` INTEGER NOT NULL, PRIMARY KEY(`educationName`, `highlightId`), FOREIGN KEY(`educationName`) REFERENCES `EducationState`(`name`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eeffbce3bfbd69ea1ae982695ce17aa1')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `EducationState`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `HighlightState`");
        List list = this.f82597b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82597b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f82597b.f12557a = dVar;
        ((C4035d) dVar).f12902a.execSQL("PRAGMA foreign_keys = ON");
        this.f82597b.mo8186u(dVar);
        List list = this.f82597b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82597b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f82597b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f82597b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
