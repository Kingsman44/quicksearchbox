package com.google.android.apps.gsa.staticplugins.p7765da.p7769d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.d.e */
/* compiled from: PG */
public final /* synthetic */ class C99290e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99291f f277742a;

    public /* synthetic */ C99290e(C99291f fVar) {
        this.f277742a = fVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        File file = new File(this.f277742a.f277743a.getFilesDir(), "savev2cache");
        if (!file.exists()) {
            return C118826c.f331422a;
        }
        String[] list = file.list();
        if (list != null) {
            for (String file2 : list) {
                new File(file, file2).delete();
            }
        }
        return C118826c.f331422a;
    }
}
