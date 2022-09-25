package com.google.apps.tiktok.cache;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.io.File;

/* renamed from: com.google.apps.tiktok.cache.y */
/* compiled from: PG */
public final /* synthetic */ class C46410y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46363aa f121465a;

    public /* synthetic */ C46410y(C46363aa aaVar) {
        this.f121465a = aaVar;
    }

    public final Object apply(Object obj) {
        File[] listFiles = ((File) obj).listFiles(new C46411z(this.f121465a));
        if (listFiles == null) {
            return null;
        }
        for (File file : listFiles) {
            if (file.delete()) {
                ((C59052c) ((C59052c) C46363aa.f121371a.mo56224b()).mo56372aa(54717)).mo56389s("Removed orphaned cache file: %s", file);
            } else {
                ((C59052c) ((C59052c) C46363aa.f121371a.mo56225c()).mo56372aa(54716)).mo56389s("Failed to remove orphaned cache file: %s", file);
            }
        }
        return null;
    }
}
