package com.google.apps.tiktok.cache;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.apps.tiktok.cache.z */
/* compiled from: PG */
public final /* synthetic */ class C46411z implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ C46363aa f121466a;

    public /* synthetic */ C46411z(C46363aa aaVar) {
        this.f121466a = aaVar;
    }

    public final boolean accept(File file, String str) {
        C46363aa aaVar = this.f121466a;
        if (str.endsWith("-wal") || str.endsWith("-shm")) {
            str = str.substring(0, str.length() - 4);
        } else if (str.endsWith("-journal")) {
            str = str.substring(0, str.length() - 8);
        }
        if (!str.startsWith("SqliteKeyValueCache:") || !str.endsWith(".db") || aaVar.f121372b.keySet().contains(str)) {
            return false;
        }
        return true;
    }
}
