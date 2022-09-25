package com.google.android.libraries.storage.p3315b;

import com.google.common.util.concurrent.C60845bz;
import java.io.File;

/* renamed from: com.google.android.libraries.storage.b.ab */
/* compiled from: PG */
final class C42816ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42823ai f112081a;

    public C42816ab(C42823ai aiVar) {
        this.f112081a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        File file;
        String str = (String) obj;
        C42823ai aiVar = this.f112081a;
        String str2 = aiVar.f112092i;
        if (str2 == null) {
            file = aiVar.f112085b.getDatabasePath(str);
        } else {
            file = new File(str2, str);
        }
        new File(file.getPath().concat(".bak")).delete();
    }
}
