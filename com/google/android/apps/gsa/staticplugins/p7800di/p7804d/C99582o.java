package com.google.android.apps.gsa.staticplugins.p7800di.p7804d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.d.o */
/* compiled from: PG */
public final /* synthetic */ class C99582o implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ File f278692a;

    public /* synthetic */ C99582o(File file) {
        this.f278692a = file;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        File file = this.f278692a;
        if (!file.exists() || file.delete()) {
            return C118826c.f331422a;
        }
        throw new IOException("Failed to delete file: ".concat(String.valueOf(file.getPath())));
    }
}
