package com.google.apps.tiktok.cache;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.apps.tiktok.cache.ad */
/* compiled from: PG */
public final /* synthetic */ class C46366ad implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ C46367ae f121378a;

    public /* synthetic */ C46366ad(C46367ae aeVar) {
        this.f121378a = aeVar;
    }

    public final boolean accept(File file, String str) {
        C46367ae aeVar = this.f121378a;
        if (str.endsWith("-wal") || str.endsWith("-shm")) {
            str = str.substring(0, str.length() - 4);
        } else if (str.endsWith("-journal")) {
            str = str.substring(0, str.length() - 8);
        }
        if (!str.startsWith("SqliteKeyValueCache:") || !str.endsWith(":Singleton.db") || aeVar.f121381c.keySet().contains(str)) {
            return false;
        }
        return true;
    }
}
