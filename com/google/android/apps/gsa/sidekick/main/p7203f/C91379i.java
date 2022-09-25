package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.content.Context;
import com.google.common.base.C58881cr;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.i */
/* compiled from: PG */
public final class C91379i implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ Context f254952a;

    /* renamed from: b */
    private File f254953b;

    public C91379i(Context context) {
        this.f254952a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        File file = this.f254953b;
        if (file != null) {
            return file;
        }
        File cacheDir = this.f254952a.getCacheDir();
        this.f254953b = cacheDir;
        return cacheDir;
    }
}
