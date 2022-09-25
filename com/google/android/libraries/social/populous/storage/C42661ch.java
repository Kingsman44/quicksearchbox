package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3920ac;
import androidx.p182p.C3926ai;
import androidx.p182p.C3927aj;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3941c;
import androidx.p182p.p185c.C3942d;
import androidx.p182p.p185c.C3945g;
import androidx.p182p.p185c.C3946h;
import androidx.p182p.p185c.C3949k;
import androidx.p182p.p185c.C3950l;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.ch */
/* compiled from: PG */
final class C42661ch extends C3926ai {

    /* renamed from: b */
    final /* synthetic */ RoomDatabaseManager_Impl f111866b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42661ch(RoomDatabaseManager_Impl roomDatabaseManager_Impl) {
        super(10);
        this.f111866b = roomDatabaseManager_Impl;
    }

    /* renamed from: a */
    public final C3927aj mo8191a(C4049d dVar) {
        C4049d dVar2 = dVar;
        HashMap hashMap = new HashMap(4);
        hashMap.put("rowid", new C3945g("rowid", "INTEGER", true, 1, (String) null, 1));
        hashMap.put("last_updated", new C3945g("last_updated", "INTEGER", true, 0, (String) null, 1));
        hashMap.put("num_contacts", new C3945g("num_contacts", "INTEGER", true, 0, "0", 1));
        hashMap.put("affinity_response_context", new C3945g("affinity_response_context", "BLOB", false, 0, (String) null, 1));
        C3950l lVar = new C3950l("CacheInfo", hashMap, new HashSet(0), new HashSet(0));
        C3950l a = C3946h.m11299a(dVar2, "CacheInfo");
        if (!lVar.equals(a)) {
            String obj = lVar.toString();
            String obj2 = a.toString();
            return new C3927aj(false, "CacheInfo(com.google.android.libraries.social.populous.storage.CacheInfoEntity).\n Expected:\n" + obj + "\n Found:\n" + obj2);
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("id", new C3945g("id", "INTEGER", true, 1, (String) null, 1));
        hashMap2.put("affinity", new C3945g("affinity", "REAL", true, 0, (String) null, 1));
        hashMap2.put("type", new C3945g("type", "TEXT", true, 0, "'PERSON'", 1));
        hashMap2.put("proto_bytes", new C3945g("proto_bytes", "BLOB", false, 0, (String) null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new C3949k("index_Contacts_type", false, Arrays.asList(new String[]{"type"}), Arrays.asList(new String[]{"ASC"})));
        C3950l lVar2 = new C3950l("Contacts", hashMap2, hashSet, hashSet2);
        C3950l a2 = C3946h.m11299a(dVar2, "Contacts");
        if (!lVar2.equals(a2)) {
            String obj3 = lVar2.toString();
            String obj4 = a2.toString();
            return new C3927aj(false, "Contacts(com.google.android.libraries.social.populous.storage.ContactEntity).\n Expected:\n" + obj3 + "\n Found:\n" + obj4);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("candidate_id", new C3945g("candidate_id", "TEXT", true, 1, (String) null, 1));
        hashMap3.put("context_id", new C3945g("context_id", "TEXT", true, 2, (String) null, 1));
        C3950l lVar3 = new C3950l("ContextualCandidateContexts", hashMap3, new HashSet(0), new HashSet(0));
        C3950l a3 = C3946h.m11299a(dVar2, "ContextualCandidateContexts");
        if (!lVar3.equals(a3)) {
            String obj5 = lVar3.toString();
            String obj6 = a3.toString();
            return new C3927aj(false, "ContextualCandidateContexts(com.google.android.libraries.social.populous.storage.ContextualCandidateContextEntity).\n Expected:\n" + obj5 + "\n Found:\n" + obj6);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("id", new C3945g("id", "TEXT", true, 1, (String) null, 1));
        hashMap4.put("proto_bytes", new C3945g("proto_bytes", "BLOB", true, 0, (String) null, 1));
        C3950l lVar4 = new C3950l("ContextualCandidates", hashMap4, new HashSet(0), new HashSet(0));
        C3950l a4 = C3946h.m11299a(dVar2, "ContextualCandidates");
        if (!lVar4.equals(a4)) {
            String obj7 = lVar4.toString();
            String obj8 = a4.toString();
            return new C3927aj(false, "ContextualCandidates(com.google.android.libraries.social.populous.storage.ContextualCandidateEntity).\n Expected:\n" + obj7 + "\n Found:\n" + obj8);
        }
        HashMap hashMap5 = new HashMap(3);
        hashMap5.put("candidate_id", new C3945g("candidate_id", "TEXT", true, 1, (String) null, 1));
        hashMap5.put("last_updated", new C3945g("last_updated", "INTEGER", true, 0, (String) null, 1));
        hashMap5.put("last_accessed", new C3945g("last_accessed", "INTEGER", true, 0, (String) null, 1));
        C3950l lVar5 = new C3950l("ContextualCandidateInfo", hashMap5, new HashSet(0), new HashSet(0));
        C3950l a5 = C3946h.m11299a(dVar2, "ContextualCandidateInfo");
        if (!lVar5.equals(a5)) {
            String obj9 = lVar5.toString();
            String obj10 = a5.toString();
            return new C3927aj(false, "ContextualCandidateInfo(com.google.android.libraries.social.populous.storage.ContextualCandidateInfoEntity).\n Expected:\n" + obj9 + "\n Found:\n" + obj10);
        }
        HashSet hashSet3 = new HashSet(3);
        hashSet3.add("candidate_id");
        hashSet3.add("value");
        hashSet3.add("source_type");
        C3942d dVar3 = new C3942d("ContextualCandidateTokens", hashSet3, C3941c.m11295a("CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)"));
        C3942d b = C3941c.m11296b(dVar2, "ContextualCandidateTokens");
        if (!dVar3.equals(b)) {
            String obj11 = dVar3.toString();
            String obj12 = b.toString();
            return new C3927aj(false, "ContextualCandidateTokens(com.google.android.libraries.social.populous.storage.ContextualCandidateTokenEntity).\n Expected:\n" + obj11 + "\n Found:\n" + obj12);
        }
        HashMap hashMap6 = new HashMap(4);
        hashMap6.put("type", new C3945g("type", "TEXT", true, 1, (String) null, 1));
        hashMap6.put("key", new C3945g("key", "TEXT", true, 2, (String) null, 1));
        hashMap6.put("timestamp", new C3945g("timestamp", "INTEGER", true, 0, (String) null, 1));
        hashMap6.put("proto_bytes", new C3945g("proto_bytes", "BLOB", false, 0, (String) null, 1));
        HashSet hashSet4 = new HashSet(0);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C3949k("index_RpcCache_type_key_timestamp", false, Arrays.asList(new String[]{"type", "key", "timestamp"}), Arrays.asList(new String[]{"ASC", "ASC", "ASC"})));
        C3950l lVar6 = new C3950l("RpcCache", hashMap6, hashSet4, hashSet5);
        C3950l a6 = C3946h.m11299a(dVar2, "RpcCache");
        if (!lVar6.equals(a6)) {
            String obj13 = lVar6.toString();
            String obj14 = a6.toString();
            return new C3927aj(false, "RpcCache(com.google.android.libraries.social.populous.storage.RpcCacheEntity).\n Expected:\n" + obj13 + "\n Found:\n" + obj14);
        }
        HashSet hashSet6 = new HashSet(4);
        hashSet6.add("contact_id");
        hashSet6.add("value");
        hashSet6.add("affinity");
        hashSet6.add("field_type");
        C3942d dVar4 = new C3942d("Tokens", hashSet6, C3941c.m11295a("CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)"));
        C3942d b2 = C3941c.m11296b(dVar2, "Tokens");
        if (dVar4.equals(b2)) {
            return new C3927aj(true, (String) null);
        }
        String obj15 = dVar4.toString();
        String obj16 = b2.toString();
        return new C3927aj(false, "Tokens(com.google.android.libraries.social.populous.storage.TokenEntity).\n Expected:\n" + obj15 + "\n Found:\n" + obj16);
    }

    /* renamed from: b */
    public final void mo8192b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `CacheInfo` (`rowid` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, `num_contacts` INTEGER NOT NULL DEFAULT 0, `affinity_response_context` BLOB, PRIMARY KEY(`rowid`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `Contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `affinity` REAL NOT NULL, `type` TEXT NOT NULL DEFAULT 'PERSON', `proto_bytes` BLOB)");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_Contacts_type` ON `Contacts` (`type`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidateContexts` (`candidate_id` TEXT NOT NULL, `context_id` TEXT NOT NULL, PRIMARY KEY(`candidate_id`, `context_id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidates` (`id` TEXT NOT NULL, `proto_bytes` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidateInfo` (`candidate_id` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`candidate_id`))");
        dVar2.f12902a.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `RpcCache` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `proto_bytes` BLOB, PRIMARY KEY(`type`, `key`))");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_RpcCache_type_key_timestamp` ON `RpcCache` (`type`, `key`, `timestamp`)");
        dVar2.f12902a.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3a08cb3f7b193f6efa0fc5d1e99b9d44')");
    }

    /* renamed from: c */
    public final void mo8193c(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `CacheInfo`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `Contacts`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `ContextualCandidateContexts`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `ContextualCandidates`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `ContextualCandidateInfo`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `ContextualCandidateTokens`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `RpcCache`");
        dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `Tokens`");
        List list = this.f111866b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f111866b.f12563g.get(i)).mo8164c();
            }
        }
    }

    /* renamed from: d */
    public final void mo8194d(C4049d dVar) {
        this.f111866b.f12557a = dVar;
        this.f111866b.mo8186u(dVar);
        List list = this.f111866b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f111866b.f12563g.get(i)).mo8162a(dVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo8195e(C4049d dVar) {
        C3940b.m11294b(dVar);
    }

    /* renamed from: f */
    public final void mo8196f() {
        List list = this.f111866b.f12563g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3920ac) this.f111866b.f12563g.get(i)).mo8163b();
            }
        }
    }
}
