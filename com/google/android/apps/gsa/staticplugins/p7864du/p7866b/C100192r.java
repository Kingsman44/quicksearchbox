package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.r */
/* compiled from: PG */
public final /* synthetic */ class C100192r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280219a;

    /* renamed from: b */
    public final /* synthetic */ String f280220b;

    public /* synthetic */ C100192r(C100125ad adVar, String str) {
        this.f280219a = adVar;
        this.f280220b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        File[] listFiles;
        File databasePath = this.f280219a.f279972h.getDatabasePath(this.f280220b);
        File parentFile = databasePath.getParentFile();
        long j = 0;
        if (!(parentFile == null || (listFiles = parentFile.listFiles(new C100194t(databasePath.getName()))) == null)) {
            for (File length : listFiles) {
                j += length.length();
            }
        }
        return Long.valueOf(j);
    }
}
