package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.h */
/* compiled from: PG */
public final /* synthetic */ class C100182h implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ C100184j f280204a;

    public /* synthetic */ C100182h(C100184j jVar) {
        this.f280204a = jVar;
    }

    public final boolean accept(File file) {
        return file.getName().startsWith(this.f280204a.f280207b) && file.getName().endsWith(".bin");
    }
}
