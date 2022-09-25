package com.google.apps.tiktok.cache;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.apps.tiktok.cache.ab */
/* compiled from: PG */
public final /* synthetic */ class C46364ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46367ae f121375a;

    public /* synthetic */ C46364ab(C46367ae aeVar) {
        this.f121375a = aeVar;
    }

    public final void run() {
        C46367ae aeVar = this.f121375a;
        for (String str : aeVar.f121380b.databaseList()) {
            if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton") && !str.endsWith("-wal") && !str.endsWith("-shm")) {
                if (aeVar.f121380b.deleteDatabase(str)) {
                    ((C59052c) ((C59052c) C46367ae.f121379a.mo56224b()).mo56372aa(54721)).mo56389s("Removed orphaned cache file: %s", str);
                } else {
                    ((C59052c) ((C59052c) C46367ae.f121379a.mo56225c()).mo56372aa(54720)).mo56389s("Failed to remove orphaned cache file: %s", str);
                }
            }
        }
    }
}
